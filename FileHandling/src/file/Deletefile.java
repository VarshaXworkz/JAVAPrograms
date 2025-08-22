package file;

import java.io.File;

public class Deletefile {
	public static void main(String[] args) {
	File file =new File("C:\\File Handling\\files");
	if(file.delete()) {
		System.out.println(file.getName()+" :This File Is Successfully Deleted");
	}else {
		System.out.println("The File is not present in the Folder");
	}
	}
}
