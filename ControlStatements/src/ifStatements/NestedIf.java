package ifStatements;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter The Age of The Person");
		int age=scanner.nextInt();
		
		if(age>=0) {
			if(age>=20) {
				if(age>=30) {
					if(age>=60) {
						System.out.println("The Person Is Old");
					}else{
						System.out.println("The Person is an adult");}
					}else {
						System.out.println("The Person is a Teen Ager");}
					}else {
						System.out.println("The Person is a Child");
					}
				}
			}
		}
	


