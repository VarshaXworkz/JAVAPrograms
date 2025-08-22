package operator;

import java.util.Scanner;
/**
 * 
 * @author admin
 *
 */

public class UnarayOperator {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		

		System.out.println("Enter the numeric value :");
		int value = scanner.nextInt();

		// unary plus
		//System.out.println("Unary Plus " + (+value));
		// unary minus
		//System.out.println("Unary Minus" + (-value));

		System.out.println("Post Increment is" + (value++));
		//System.out.println("The value is "+(value));

		System.out.println("Pre Increment is" + (++value));
		//System.out.println("The value is "+(value));


		System.out.println("Post Decrement is" + (value--));
		//System.out.println("The value is "+(value));

		System.out.println("Pre Decrement is" + (--value));
		//System.out.println("The value is "+(value));


	}

}
