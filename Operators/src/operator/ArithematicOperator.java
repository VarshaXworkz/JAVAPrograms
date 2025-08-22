package operator;

import java.util.Scanner;

public class ArithematicOperator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the First Number =" );
		int num1=scanner.nextInt();
		
		System.out.print("Enter the Second Number =");
		int num2=scanner.nextInt();
		
	     System.out.println("The Addition of "+num1+" and "+num2+" is "+(num1+num2) );
	     
	     System.out.println("The Subraction of "+num1+" and "+num2+" is "+(num1-num2));
	     
	     System.out.println("The Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
	     
	     System.out.println("The Division of "+num1+" and "+num2+" is "+(num1/num2));
	     
	     System.out.println("The Modulo of "+num1+" and "+num2+" is "+(num1%num2));
	
	}

}
