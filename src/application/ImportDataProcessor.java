package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.agile.api.APIException;

public class ImportDataProcessor {

	private static final String CREATION_PATH = "\\results\\";
	private static final String CREATION_PATH_FOR_FILES = CREATION_PATH + "documents\\";
	private static final String INDEX_FILE_NAME = "indexFile.txt";
	private static final String BREAK_LINE = "\n";

	private static String excelType;
	private static int numberColumnNumber = -1;
	private static String prependTestingText = "";

	@SuppressWarnings("resource")
	public static void processData(FormData formData) throws InvalidFormatException, IOException, APIException {
		String name = formData.getMetaDataFile().getName();
		String extension = FilenameUtils.getExtension(name);
		int splitEachNRows = 0;
		try {
			splitEachNRows = Integer.valueOf(formData.getSplitMetaDataEachRows());
		} catch (Exception e) {
			splitEachNRows = 0;
		}

		if (formData.isForTesting()) {
			prependTestingText = String.valueOf(System.currentTimeMillis()) + "_";
		}

		excelType = extension;

		try (Workbook wb = getWorkBook(formData.getMetaDataFile())) {
			Sheet sheet = wb.getSheetAt(0);
			Row row;
			Row headerRow;
			Cell cell;

			// Load HeaderRow
			headerRow = sheet.getRow(0);

			int rows; // No of rows
			rows = sheet.getPhysicalNumberOfRows();

			int cols = 0; // No of columns
			int tmp = 0;

			// This trick ensures that we get the data properly even if it doesn't start
			// from first few rows
			for (int i = 0; i < 10 || i < rows; i++) {
				row = sheet.getRow(i);
				if (row != null) {
					tmp = sheet.getRow(i).getPhysicalNumberOfCells();
					if (tmp > cols)
						cols = tmp;
				}
			}

			Path resultsPath = Paths.get(formData.getDirectoryWithFile().getAbsolutePath() + CREATION_PATH);
			if (!Files.exists(resultsPath)) {
				Files.createDirectory(Paths.get(formData.getDirectoryWithFile().getAbsolutePath() + CREATION_PATH));
			}
			resultsPath = Paths.get(formData.getDirectoryWithFile().getAbsolutePath() + CREATION_PATH_FOR_FILES);
			if (!Files.exists(resultsPath)) {
				Files.createDirectory(
						Paths.get(formData.getDirectoryWithFile().getAbsolutePath() + CREATION_PATH_FOR_FILES));
			}

			int workBooksCreated = 1;
			try (BufferedWriter indexFile = new BufferedWriter(new FileWriter(
					formData.getDirectoryWithFile().getAbsolutePath() + CREATION_PATH + "\\" + INDEX_FILE_NAME))) {

				Workbook writeBook = getWorkBook();

				Sheet writeSheet = writeBook.createSheet("new sheet");

				int fileNameColumnNumber = -1;
				int fileExtensionColumNumber = -1;
				numberColumnNumber = -1;
				int revisionColumnNumber = -1;
				int descriptionColumnNumber = -1;

				int rowsCreated = 0;
				for (int r = 0; r < rows; r++) {
					row = sheet.getRow(r);
					if (row != null) {
						// if it's not the header
						if (r > 0) {
							String fileName = returnCellValueAsString(row.getCell((int) fileNameColumnNumber));
							String fileType = "";
							if (fileExtensionColumNumber >= 0) {
								fileType = returnCellValueAsString(row.getCell((int) fileExtensionColumNumber));
							}

							String fullFileName = formatFileName(fileName, fileType);

							File f = new File(formData.getDirectoryWithFile().getAbsolutePath() + "\\" + fullFileName);
							if ((f.exists() && !f.isDirectory())) {

								if (formData.isForTesting()) {
									Files.copy(
											Paths.get(formData.getDirectoryWithFile().getAbsolutePath() + "\\"
													+ fullFileName),
											Paths.get(formData.getDirectoryWithFile().getAbsolutePath()
													+ CREATION_PATH_FOR_FILES + fullFileName));
								} else {
									Files.move(
											Paths.get(formData.getDirectoryWithFile().getAbsolutePath() + "\\"
													+ fullFileName),
											Paths.get(formData.getDirectoryWithFile().getAbsolutePath()
													+ CREATION_PATH_FOR_FILES + fullFileName));
								}
								Row createRow = writeSheet.createRow((int) rowsCreated);

								row = sheet.getRow(r);
								setCellsValuesToRow(createRow, row, cols);
								rowsCreated++;

								if (splitEachNRows != 0 && rowsCreated > splitEachNRows) {
									rowsCreated = 0;

									FileOutputStream outputStream = new FileOutputStream(
											formData.getDirectoryWithFile().getAbsolutePath() + CREATION_PATH
													+ workBooksCreated + formData.getMetaDataFile().getName());
									writeBook.write(outputStream);
									writeBook = getWorkBook();
									writeSheet = writeBook.createSheet("new sheet");

									createRow = writeSheet.createRow((int) rowsCreated);
									rowsCreated++;
									setCellsValuesToRow(createRow, headerRow, cols);
									workBooksCreated++;

								}
								if (formData.isCreateIndexFile()) {
									String TITLEBLOCK_NUMBER = prependTestingText
											+ returnCellValueAsString(row.getCell((int) numberColumnNumber));
									String REVISION = returnCellValueAsString(row.getCell((int) revisionColumnNumber));
									String FILEPATH = formData.getPathToFileFromFileVault() + "\\" + fullFileName;
									String IMPORT_TYPE = formData.getImportType();
									String DESCRIPTION = returnCellValueAsString(
											row.getCell((int) descriptionColumnNumber));
									indexFile.write(formData.getObjecType() + "|" + TITLEBLOCK_NUMBER + "|" + REVISION
											+ "|" + FILEPATH + "|" + IMPORT_TYPE + "|" + DESCRIPTION + BREAK_LINE);
								}

							}
						} else if (r == 0) {
							Row createRow = writeSheet.createRow((int) rowsCreated);
							rowsCreated++;
							setCellsValuesToRow(createRow, row, cols);
							// get the column number of the fileName and extension
							for (int c = 0; c < cols; c++) {
								cell = row.getCell((int) c);
								if (cell != null) {
									String valueString = returnCellValueAsString(cell);
									// Set the number of the column //TODO we may be able to remove this
									if (valueString.equals(formData.getFileNameColumn()))
										fileNameColumnNumber = c;
									if (valueString.equals(formData.getFileExtensionColumn()))
										fileExtensionColumNumber = c;
									if (valueString.equals(formData.getNumberColumn()))
										numberColumnNumber = c;
									if (valueString.equals(formData.getRevisionColumn()))
										revisionColumnNumber = c;
									if (valueString.equals(formData.getDescriptionColumn()))
										descriptionColumnNumber = c;
									if (formData.isCreateIndexFile()) {
										if (valueString.equals(formData.getRevisionColumn()))
											revisionColumnNumber = c;
										if (valueString.equals(formData.getDescriptionColumn()))
											descriptionColumnNumber = c;
									}
								}
							}
						}
					}
				}

				FileOutputStream outputStream = new FileOutputStream(formData.getDirectoryWithFile().getAbsolutePath()
						+ CREATION_PATH + workBooksCreated + formData.getMetaDataFile().getName());
				writeBook.write(outputStream);
				writeBook.close();

				// Create the change orders this is done after everything so we don't have to
				// wait multiple times for the agile connections
				List<String> changeOrdersNames = new ArrayList<>();
				if (formData.isCreateChangeOrders()) {

					changeOrdersNames = AgileConnect.getChangeOrders(formData.getUserId(), formData.getPassword(),
							formData.getUrl(), formData.getWorkflowName(), workBooksCreated);

					// Rename the files to have it's changeOrder prepended in the name
					for (int i = 1; i <= changeOrdersNames.size(); i++) {
						Files.move(
								Paths.get(formData.getDirectoryWithFile().getAbsolutePath() + CREATION_PATH + i
										+ formData.getMetaDataFile().getName()),
								Paths.get(formData.getDirectoryWithFile().getAbsolutePath() + CREATION_PATH
										+ changeOrdersNames.get(i - 1) + "_" + i
										+ formData.getMetaDataFile().getName()));
					}
				}

			} catch (Exception ioe) {
				ioe.printStackTrace();
			}
		}
	}

	/**
	 * Returns a full file name given the fileName and the file Extension, file
	 * extension can be empty, can contain a "." as .txt of not
	 * 
	 * @param fileName
	 * @param fileType
	 * @return
	 */
	private static String formatFileName(String fileName, String fileType) {
		if (!fileType.equals("")) {
			if (!fileType.contains(".")) {
				fileType = "." + fileType;
			}
		}
		return fileName + fileType;
	}

	/**
	 * Gets all the cells from dataRow and copys them in writeToRow, basically it
	 * copies the whole row
	 * 
	 * @param writeToRow
	 * @param dataRow
	 * @param colsNumber
	 *            number of columns to copy
	 */
	private static void setCellsValuesToRow(Row writeToRow, Row dataRow, int colsNumber) {
		for (int c = 0; c < colsNumber; c++) {
			Cell cell = dataRow.getCell((int) c);
			if (cell != null) {
				Cell createCell = writeToRow.createCell(c);
				String value = returnCellValueAsString(cell);

				// when testing is activaded prepend the testing Text to the title block number
				// values, but not to the header
				if (numberColumnNumber == c && writeToRow.getRowNum() != 0) {
					value = prependTestingText + value;
				}
				createCell.setCellValue(value);
			}
		}
	}

	private static Workbook getWorkBook() throws InvalidFormatException, IOException {
		return getWorkBook(null);
	}

	/**
	 * Returns a workbook of the same type as the file that gets passed as a
	 * parameter, works for both xlsx and xls file types
	 * 
	 * @param workBookName
	 * @return
	 * @throws IOException
	 * @throws InvalidFormatException
	 */
	private static Workbook getWorkBook(File workBookName) throws IOException, InvalidFormatException {
		if (excelType.equals("xlsx")) {
			if (workBookName == null)
				return new XSSFWorkbook();
			else
				return new XSSFWorkbook(workBookName);
		} else if (excelType.equals("xls")) {
			if (workBookName == null)
				return new HSSFWorkbook();
			else {
				InputStream fileToRead = new FileInputStream(workBookName.getAbsolutePath());
				return new HSSFWorkbook(fileToRead);
			}
		}
		return null;
	}

	/**
	 * reads the value from a cell and returns it's value as a String
	 * 
	 * @param cell
	 * @return
	 */
	private static String returnCellValueAsString(Cell cell) {
		if (cell != null) {
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_NUMERIC:
				return String.valueOf(cell.getNumericCellValue());
			case Cell.CELL_TYPE_STRING:
				return cell.getStringCellValue();
			}
		}
		return "";
	}
}
