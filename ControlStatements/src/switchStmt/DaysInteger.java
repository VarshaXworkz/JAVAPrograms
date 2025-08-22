package switchStmt;

import java.util.Scanner;

public class DaysInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value");
		int value = scanner.nextInt();
		switch (value) {
		case 1:
			System.out.println("The day" + value + " is Monday");
			break; 
		case 2:
			System.out.println("The day " + value + " is Tuesday");
			break;
		case 3:
			System.out.println("The day " + value + " is Wednesday");
			break;
		case 4:
			System.out.println("The day " + value + " is Thursday");
			break;
		case 5:
			System.out.println("The day " + value + " is Friday");
			break;
		case 6:
			System.out.println("The day " + value + " is Saturday");
			break;
		case 7:
			System.out.println("The day " + value + " is Sunday");
			break;

		default:
			System.out.println("We dont have This Day");

		}
	}

}
