package ifStatements;

import java.util.Scanner;

public class IfElseStmt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first boolean Value");
		boolean value1=scanner.nextBoolean();
		System.out.println("Enter the second boolean Value");
		boolean value2=scanner.nextBoolean();
		
		if(value1&&value2) {
			System.out.println("Entered Value is True");
		}else {
			System.out.println("Entered Value is False");
		}
	}

}
