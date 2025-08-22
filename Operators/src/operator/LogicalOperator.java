package operator;

import java.util.Scanner;

public class LogicalOperator {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the first boolean value");
	boolean value1=scanner.nextBoolean();
	System.out.println("Enter the Second Boolean Value");
	boolean value2=scanner.nextBoolean();
	System.out.println("The Logical AND"+(value1&&value2));
	
	
	System.out.println("The Logical OR"+(value1||value2));
	System.out.println("The Logical NOT"+(!value1));
}
}
