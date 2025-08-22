package arrays;

import java.util.Scanner;

	public class ArrayRotation {
	    
	    public void rotateLeftByOne(int[] arr) {
	        int first = arr[0];
	        for (int i = 0; i < arr.length - 1; i++) {
	            arr[i] = arr[i + 1];
	        }
	        arr[arr.length - 1] = first;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	    
	        System.out.print("Enter the array size: ");
	        int size = sc.nextInt();

	        int[] arr = new int[size];

	       
	        System.out.print("Enter the values: ");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }

	      
	        System.out.print("Enter the number of rotation: ");
	        int rotations = sc.nextInt();

	        ArrayRotation obj = new ArrayRotation();

	        for (int i = 1; i <= rotations; i++) {
	            obj.rotateLeftByOne(arr);
	            System.out.print("Values after " + getOrdinal(i) + " rotation:");
	            for (int val : arr) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }

	    private static String getOrdinal(int number) {
	        switch (number) {
	            case 1: return "first";
	            case 2: return "second";
	            case 3: return "third";
	            default: return number + "th";
	        }
	    }
	}
