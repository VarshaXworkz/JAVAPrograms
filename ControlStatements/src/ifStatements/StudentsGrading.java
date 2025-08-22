package ifStatements;

import java.util.Scanner;

public class StudentsGrading {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Percentage of the Student");
		int percentage = scanner.nextInt();

		if (percentage >= 95) {
			System.out.println("The result is Amazing");
		} else if (percentage >= 85) {
			System.out.println("The result is Outstanding");
		} else if (percentage >= 75) {
			System.out.println("The result is VeryGood");
		} else if (percentage >= 65) {
			System.out.println("The result is Good");
		} else if (percentage >= 55) {
			System.out.println("The result is Average");
		} else if (percentage >= 40) {
			System.out.println("The result is Satisfactory");
		} else {
			System.out.println("The Student has failed in Exam");
		}
	}

}
