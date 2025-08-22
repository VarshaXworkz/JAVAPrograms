package operator;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value");
		int value=scanner.nextInt();
		String result=(value>50)?"Value is Greater than 50":"Value is Lesser than 50";
		System.out.println(result);
	}

}
