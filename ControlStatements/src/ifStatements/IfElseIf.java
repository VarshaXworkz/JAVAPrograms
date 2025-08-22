package ifStatements;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value");
		int value = scanner.nextInt();
		if (value > 70) {
			System.out.println("The value Is Greater than 70");
		} else if (value > 50) {
			System.out.println("The Value is greater than 50");
		} else if (value > 30) {
			System.out.println("Entered value is greater than 30");
		} else {
			System.out.println("The Number is negative");
		}

	}

}
