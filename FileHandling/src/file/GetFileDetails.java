package file;

import java.io.File;

public class GetFileDetails { 
	public static void main(String[] args) {
		File file =new File("C:\\File Handling\\files1");
		if(file.exists()) {
			System.out.println("Enter The Name of The File:"+file.getName());
			System.out.println("Enter The Absolute Path of The File:"+file.getAbsolutePath());
			System.out.println("Enter The Length of The File:"+file.length());
			System.out.println("Can We Read the File:"+file.canRead());
			System.out.println("Can we Write The File:"+file.canWrite());
		}else {
			System.out.println("The Following File Does Not Exists");
			
			
			
			
		}
	}

}
