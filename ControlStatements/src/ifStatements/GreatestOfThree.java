package ifStatements;

import java.util.Scanner;

public class GreatestOfThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The First Value");
		int value1 = scanner.nextInt();
		
		System.out.println("Enter The Second Value");
		int value2 = scanner.nextInt();
		
		System.out.println("Enter The Third Value");
		int value3 = scanner.nextInt();
		
		if (value1 > value2) {
			System.out.println("Value1 is Greater than Value2 and Value3");
		} else if (value2 > value3) {
			System.out.println("Value2 is Greater than Value3 and Value1");
		} else {
			System.out.println("Value3 is Greater than Value1 and Value2");

		}
	}

}
