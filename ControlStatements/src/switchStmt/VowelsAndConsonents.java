package switchStmt;

import java.util.Scanner;

public class VowelsAndConsonents {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The Alphabet");
		char alphabet=scanner.next().charAt(0);
		
		switch (alphabet) {
		case 'a':
			System.out.println("It is a Vowel");
			break;
		case 'e':
			System.out.println("It is a Vowel");
			break;
		case 'i':
			System.out.println("It is a Vowel");
			break;
		case 'o':
			System.out.println("It is a Vowel");
			break;
		case 'u':
			System.out.println("It is a Vowel");
			break;
		case 'A':
			System.out.println("It is a Vowel");
			break;
		case 'E':
			System.out.println("It is a Vowel");
			break;
		case 'I':
			System.out.println("It is a Vowel");
			break;
		case 'O':
			System.out.println("It is a Vowel");
			break;
		case 'U':
			System.out.println("It is a Vowel");
			break;
		
		
		default:
			System.out.println("It is a Consonent");
			
			break;
		}
	}

}
