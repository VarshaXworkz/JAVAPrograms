package file;

import java.io.IOException;
import java.io.File;

public class FileCreation {
	public static void main(String[] args) {

		File file =new File("C:\\File Handling\\files");
		try{

		if(file.createNewFile()) {

		System.out.println("File got created Successfully");

		}else{

		System.out.println("File already exist");}

		} catch (IOException e) {
		
		e.printStackTrace();
		}
		
		
	}}
