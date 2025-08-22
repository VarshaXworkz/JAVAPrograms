package wrapper;

import java.util.Scanner;

public class AddingStringValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the String Value: ");
		String input = scanner.nextLine();

		int sum = 0;
		StringBuilder expression = new StringBuilder();

		System.out.print("Spliting the values: ");
		for (int i = 0; i < input.length(); i++) {
			String s = input.substring(i, i + 1);
			System.out.print(s + " ");

			int num = Integer.parseInt(s);
			sum += num;

			expression.append(s);
			if (i < input.length() - 1) {
				expression.append("+");
			}
		}

		System.out.println("\nSum of the entered numeric String " + expression + "=" + sum);

	}
}
