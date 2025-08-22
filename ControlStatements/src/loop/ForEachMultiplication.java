package loop;

import java.util.Scanner;

public class ForEachMultiplication {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of  Array");
		int size=scanner.nextInt();
		int resultArray[] = new int[size];
		
		int arr[]=new int[size];
		System.out.println("Enter the values for First Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		int arr1[]=new int[size];
		System.out.println("Enter the values for Second Array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scanner.nextInt();
		}
		for(int i=0;i<size;i++) {
			resultArray[i]=arr[i]*arr1[i];
			
		}
		System.out.println("The Multiplication of Array 1 and Array 2 is");
		for(int i=0;i<size;i++) {
			System.out.println(resultArray[i]);
		}
		
		
	}

}
