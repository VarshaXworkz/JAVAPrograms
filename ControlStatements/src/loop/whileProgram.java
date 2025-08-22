package loop;

import java.util.Scanner;

public class whileProgram {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int rollNo;
		int mark;
		System.out.println("Enter The roll Number");
		rollNo=scanner.nextInt();
		while(rollNo<30){
			System.out.println("Enter The Mark");
			mark=scanner.nextInt();
			System.out.println("Enter The roll Number");
			rollNo=scanner.nextInt();
			
			
		}
	}

}
