package basic;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Full Name =");
		String fullName = scanner.nextLine();

		/*
		 * System.out.println("Enter the Name ="); String name=scanner.next();
		 * System.out.println(name);
		 */

		System.out.println("Enter the Integer Value =");
		int integerValue = scanner.nextInt();

		System.out.println("Enter the Byte Value =");
		byte byteValue = scanner.nextByte();

		System.out.println("Enter the Float Value =");
		float floatValue = scanner.nextFloat();

		System.out.println("Enter the Double Value =");
		double doubleValue = scanner.nextDouble();

		System.out.println("Enter the Long Number is =");
		long longValue = scanner.nextLong();

		System.out.println("Enter The Short Number =");
		short shortvalue = scanner.nextShort();

	}

}
