package operator;

import java.util.Scanner;

public class RelationalOperators {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("The First Relational Operator is");
		int num1=scanner.nextInt();
		System.out.println("The Second Relational Operator is");
		int num2=scanner.nextInt();
		
		System.out.println("The relational operator of"+num1+"=="+num2+ " is ="+(num1==num2));
		
		System.out.println("The relational operator of"+num1+"!="+num2+ " is ="+(num1!=num2));
		
		System.out.println("The relational operator of"+num1+"<="+num2+ " is ="+(num1<=num2));
		
		System.out.println("The relational operator of"+num1+">="+num2+ " is ="+(num1>=num2));
		
		System.out.println("The relational operator of"+num1+">"+num2+ " is ="+(num1>num2));
		
		System.out.println("The relational operator of"+num1+"<"+num2+ " is ="+(num1<num2));
	}
}

