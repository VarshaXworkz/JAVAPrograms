package methodCall;

import java.util.Scanner;

public class ThisKeyword {
	float value1;
	float value2;
	
	public float add(float value1,float value2) {
		this.value1=value1;
		this.value2=value2;
		return this.value1+this.value2;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First Value");
		float firstNumber=scanner.nextFloat();
		System.out.println("Enter the Second Value");
		float secondNumber=scanner.nextFloat();
		
		ThisKeyword ref=new ThisKeyword();
		System.out.println("The Value is= "+(ref.add(firstNumber, secondNumber)));
	}
		
	}


