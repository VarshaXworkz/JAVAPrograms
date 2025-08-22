package file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AllOperations {

	private static final String FILE_PATH = "C:\\File Handling\\files";

	public static void main(String[] args) {
		
		createFile();
		writeToFile("The Sun above the Sky is Very Hot In The Morning");
		readFromFile();
		getFileInfo();
		
	}

	public static void createFile() {
		File file = new File(FILE_PATH);
		try {
			if (file.createNewFile()) {
				System.out.println("File created successfully");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("Error creating file:");
			e.printStackTrace();
		}
	}

	public static void writeToFile(String content) {
		try (FileWriter fileWrite = new FileWriter(FILE_PATH)) {
			fileWrite.write(content);
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("Error writing to file:");
			e.printStackTrace();
		}
	}

	public static void readFromFile() {
		try (Scanner dataReader = new Scanner(new File(FILE_PATH))) {
			System.out.println("\nFile content:");
			while (dataReader.hasNextLine()) {
				System.out.println(dataReader.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error reading file - file not found:");
			e.printStackTrace();
		}
	}

	public static void getFileInfo() {
		File file = new File(FILE_PATH);
		if (file.exists()) {
			System.out.println("\nFile information:");
			System.out.println("Name: " + file.getName());
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Size (bytes): " + file.length());
			System.out.println("Readable: " + file.canRead());
			System.out.println("Writable: " + file.canWrite());
		} else {
			System.out.println("File does not exist");
		}
	}

	public static void deleteFile() {
		File file = new File(FILE_PATH);
		if (file.delete()) {
			System.out.println(file.getName() + " successfully deleted");
		} else {
			System.out.println("Failed to delete file (might not exist)");
		}
	}
}