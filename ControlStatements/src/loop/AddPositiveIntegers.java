package loop;

import java.util.Scanner;

public class AddPositiveIntegers {
	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//	
//		
//		
//			System.out.println("Enter The First Positive Integer");
//			int num1=scanner.nextInt();
//			 System.out.println("Enter The First Positive Integer");
//			 int num2=scanner.nextInt();
//			 if(num1>0) {
//				if(num2>0) {
//					System.out.println("The result is "+(num1+num2));
//				}else {
//					System.out.println("The Number is Negative");
//				}
//			 }
//			
//		}
		Scanner scanner=new Scanner(System.in);
//		
		  int sum = 0;

	        while (true) {
	            System.out.print("Enter a positive integer : ");
	            int number = scanner.nextInt();

	            if (number < 0) {
	                break; 
	            }

	           sum =sum+ number; 
	        }

	        System.out.println("Sum of positive integers: " + sum);
	       
	    }
	}			
		
		



