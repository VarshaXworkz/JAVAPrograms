package methodCall;

import java.util.Scanner;

public class InstanceMethod {

	int number1;
	int number2;
	int sum;
	public void sum(int num1,int num2) {
		number1=num1;
		number2=num2;
		sum=number1+number2;
		
	}
	public void print() {
		System.out.println(number1+"+"+number2+"="+sum);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First Number =");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter the Second Number =");
		int secondNumber=scanner.nextInt();
		
		InstanceMethod ref=new InstanceMethod();
		ref.sum(firstNumber,secondNumber);
		ref.print();
	
}
}
