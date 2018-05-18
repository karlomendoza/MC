package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.FilenameUtils;

/**
 * One timer for renaming enovia files It reads from an txt with the format OldFileName newFileName
 * 
 * And from a folder where all the files are, it crawls into each folder from that folder and finds where they are. output is from console, in the
 * format of, new file name \t filePath
 * 
 * @author Karlo Mendoza
 *
 */
public class FileRenameMC4 {

	public static File fileWithNames = new File("C:\\Users\\Karlo Mendoza\\Desktop\\masterControl\\renameFile4.txt");
	public static File log = new File("C:\\Users\\Karlo Mendoza\\Desktop\\masterControl\\logRenameFile4.txt");
	public static String pathToMainFolder = "Z:\\";

	public static final boolean onlyCheck = true;

	private static final String BREAK_LINE = "\n";

	public static void main(String... strings) throws IOException {

		try (BufferedWriter write = new BufferedWriter(new FileWriter(log))) {

			try (BufferedReader br = new BufferedReader(new FileReader(fileWithNames))) {
				String line;
				while ((line = br.readLine()) != null) {

					String[] split = line.split("_AA_AA_AA_");
					String file_name = split[0].trim();

					String path = split[1].trim();
					String extension = FilenameUtils.getExtension(file_name);

					String hashName = split[2].trim();
					String hashNameWithExtension = hashName + "." + extension;

					if (hashName == null || hashName.equals("") || hashName.equals("#NA")) {
						System.out.println("Error old file name is bad: " + hashName);
					}
					try {
						File f = null;
						if (onlyCheck) {
							f = new File(pathToMainFolder + path + "\\" + hashNameWithExtension);
						} else {
							f = new File(pathToMainFolder + path + "\\" + hashName);
						}

						String folderPath = pathToMainFolder + path;
						if (f.exists()) {
							if (!onlyCheck) {
								Files.move(Paths.get(folderPath + "\\" + hashName), Paths.get(folderPath + "\\" + hashNameWithExtension));
							}
							write.write(hashNameWithExtension + "	" + hashName + "	" + folderPath + BREAK_LINE);
							System.out.println(hashNameWithExtension + "	" + hashName + "	" + folderPath);
						} else {
							write.write("Error file does not exists : " + hashNameWithExtension + " " + hashName + "	" + folderPath + BREAK_LINE);
							System.out.println("Error file does not exists : " + hashNameWithExtension + " " + hashName + "	" + folderPath);
						}

					} catch (Exception ex) {
						write.write("Error on file: " + hashNameWithExtension.trim() + "oldFile Name: " + hashName + ex.getMessage() + BREAK_LINE);
						System.out.println("Error on file: " + hashNameWithExtension.trim() + "oldFile Name: " + hashName + ex.getMessage());
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
