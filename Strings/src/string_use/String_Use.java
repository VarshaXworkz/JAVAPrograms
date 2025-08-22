package string_use;

import java.util.Scanner;

public class String_Use {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Full Name");
		String fullName=  scanner.nextLine();
		System.out.println("Enter the First Name");
		String str1=  scanner.nextLine();
		System.out.println("Enter the Initial");
		char str2=  scanner.next().charAt(0);
		System.out.println("fullName="+str1+" "+str2);
		
	}

}
