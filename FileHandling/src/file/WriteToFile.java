package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		File file =new File("C:\\File Handling\\files1");
	try {
		if(file.exists()) {
		FileWriter fileWrite=new FileWriter(file);
		fileWrite.write("The Sun above the Sky is Very Hot In The Morning"+"We are all Having some "
				+ "Ice cream for the wonderful day in the Summer");
		System.out.println("The Info Is added To The File");
		fileWrite.close();
		}else {
			System.out.println("The File Is Not There!!");
		}
	} catch (IOException e) {
		System.out.println("The Unexpected Error Occured");
		e.printStackTrace();
		
	}
	}
}
