package operator;

import java.util.Scanner;

public class AssignmentOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("The Assignment Operator is = ");
		int number = scanner.nextInt();

		System.out.println("The Addition of Assignment operator is =" + (number += 4));
		
		System.out.println("The Subtraction of Assignment operator is =" + (number -= 5));
		
		System.out.println("The Multiplication of Assignment operator is =" + (number *= 62));
		
		System.out.println("The Division of Assignment operator is =" + (number /= 4));
		
		System.out.println("The Modulo of Assignment operator is =" + (number %= 4));
	}

}
