package loop;

import java.util.Scanner;

public class ForEach {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Size of the  First Arrary=");
		int size1=scanner.nextInt();
		
	
	System.out.println("Enter the Size of the Second Arrary=");
	int size2=scanner.nextInt();	
	
	System.out.println("Enter the Size of the Third Arrary=");
	int size3=scanner.nextInt();	
	int sum=0;
	
	int arr[]=new int[size1];
	System.out.println("Enter The values for array 1");
	int arr1[]=new int[size2];
	
	System.out.println("Enter The values for array 2");
	int arr2[]=new int[size3];
	System.out.println("Enter The values for array 3");
	
	for (int i=0;i<arr1.length;i++) {
		arr[i]=scanner.nextInt();
	}
	for (int i=0;i<arr2.length;i++) {
		arr[i]=scanner.nextInt();
	}
	for(int j=0;j<size1;j++) {
		sum+=arr[j];
		
	}
	for(int j=0;j<size2;j++) {
		sum+=arr[j];
		
	}
	for(int j=0;j<size3;j++) {
		sum+=arr[j];
		
	}
	
	System.out.println("Sum of The array Values "+sum);
	
	
	
	
	
	
	
	}
}

