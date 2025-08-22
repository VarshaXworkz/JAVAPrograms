package ifStatements;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Integer value");
		int num=scanner.nextInt();
		if(num>5) {
			System.out.println("Number is Greater than 5");
		}
	}

}
