package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class masterFilesRenameToolSplits {

	private static final String RENAME_FILE_NAME = "checkMasterFile";
	private static final String BREAK_LINE = "\n";

	private static final File file = new File(
			"C:\\Users\\Karlo Mendoza\\Box Sync\\Clients\\ICU Medical\\ICU Medical PLM Implementation\\Workstreams\\Program Data Migration\\Data Files\\MasterControl\\PreparationForRelease\\document master for agile migration master files.xlsx");
	private static final String attachmentsPath = "Z:\\Prod\\alwaysrep\\V1\\unencrypted\\";

	public static void main(String... strings) throws InvalidFormatException, IOException {

		try (Workbook wb = Utils.getWorkBook(file)) {
			Sheet readSheet = wb.getSheetAt(0);
			Row row;
			int rows = readSheet.getPhysicalNumberOfRows(); // No of rows
			int cols = 0; // No of columns
			int tmp = 0;

			// This trick ensures that we get the data properly even if it doesn't start
			// from first few rows
			for (int i = 0; i < 10 || i < rows; i++) {
				row = readSheet.getRow(i);
				if (row != null) {
					tmp = readSheet.getRow(i).getPhysicalNumberOfCells();
					if (tmp > cols)
						cols = tmp;
				}
			}

			int i = 1;
			long j = 0;
			BufferedWriter indexFile = new BufferedWriter(new FileWriter(file.getParentFile().getPath() + "\\" + RENAME_FILE_NAME + i + ".txt"));

			for (int r = 0; r < rows; r++) {
				row = readSheet.getRow(r);
				if (row != null) {
					// if it's not the header
					if (r > 0) {

						String name = Utils.returnCellValueAsString(row.getCell((int) 4));

						if (name == null || name.isEmpty() || name.equals(""))
							continue;

						j++;
						indexFile.write(attachmentsPath + name + BREAK_LINE);
						if (j % 5000 == 0) {
							indexFile.flush();
							indexFile.close();
							i++;
							indexFile = new BufferedWriter(new FileWriter(file.getParentFile().getPath() + "\\" + RENAME_FILE_NAME + i + ".txt"));
						}

					}
				}
			}

			indexFile.flush();
			indexFile.close();
		}
	}
}
