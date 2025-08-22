package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadToFile {
	public static void main(String[] args) {
		try {
			File file =new File("C:\\File Handling\\files1");
			Scanner dataReader = new Scanner(file);
			while(dataReader.hasNextLine()) {
				String fileData=dataReader.nextLine();
				System.out.println(fileData);
			}
			dataReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Unexpected error Occured");
			e.printStackTrace();
		}
	}	

}
