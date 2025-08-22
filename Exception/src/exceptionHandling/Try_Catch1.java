package exceptionHandling;

public class Try_Catch1 {
	public static void main(String[] args) {
		
	System.out.println("Unchecked Exception Coding: ");

	try {

	System.out.println("try block");

	// Null pointer Exception
    String str= null;
    System.out.println(str.length());

	int value= 5/ 0;

	} catch (ArithmeticException e) {

	System.out.println(e);

	System.out.println("catch block");

	}finally {
		System.out.println("Out of try catch block");
	}

}

}
