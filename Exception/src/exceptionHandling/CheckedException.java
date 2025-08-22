package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	public static void main(String[] args) {


		File file = new File("D:/");

		try {

		FileInputStream fis = new FileInputStream(file);

		} catch (FileNotFoundException e) {

		e.printStackTrace();

		}



		}


}
