package loop;

import java.util.Scanner;

public class FindMax {
	public static void findMax(int arr[]) {
		int size=arr.length;
		int max=arr[0];
		for(int i=0;i<size;i++) {
			if(max<arr[i]) {
				max=arr[i];
				
			}
			
		}
		System.out.println("Maximum value in the array"+max);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array Value");
		int value=scanner.nextInt();
		int array[]=new int[value];
		 System.out.println("Enter the array elements:");
	        for (int i = 0; i < value; i++) {
	            array[i] = scanner.nextInt();
	        }

	        findMax(array);
		
		
	}

}
