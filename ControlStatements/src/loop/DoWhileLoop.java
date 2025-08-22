package loop;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int rollNo;
		int mark;
		
		do{
			System.out.println("Enter The roll Number");
			rollNo=scanner.nextInt();
			
			System.out.println("Enter The Mark");
			mark=scanner.nextInt();
			
			
		}
		while(rollNo<30);
			
		
	}

}
