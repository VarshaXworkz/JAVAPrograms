package wrapper;

import java.util.Random;

public class MathClass {
	public static void main(String[] args) {
		 // abs() returns the absolute number

			System.out.println("Absolute number is:"+ Math.abs(-80));

			//min() returns the minimum of two numbers
			System.out.println("Minimum number is: "+ Math.min(10, 70));

			// max() returns the maximum of two numbers
			System.out.println("Maximum number is: "+ Math.max(10, 12));

			// sqrt(), returns the square root of given number 
			System.out.println("Square root of y is: "+ Math.sqrt(2));

			// pow() returns 10 power of 4 i.e. 10 10 10 10
			System.out.println("Power of x and zis: "+ Math.pow(10, 4));

			// random() returns a random number
			System.out.println("One digit Random number = "+(int) (Math.random()*10));

			// Generating 4 digit random number
            Random rand= new Random();
            System.out.println("Random 4 digit numbers="+ (rand.nextInt((9999100)+1)+10));
	}

}
