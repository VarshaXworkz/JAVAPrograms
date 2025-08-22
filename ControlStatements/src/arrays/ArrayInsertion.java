package arrays;


	import java.util.Arrays;
	import java.util.Scanner;

	public class ArrayInsertion {
	    
	    public void insertion(int[] arr, int index, int value) {
	        for (int i = arr.length - 2; i >= index; i--) {
	            arr[i + 1] = arr[i];
	        }
	        arr[index] = value;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	      
	        System.out.print("Enter the array size: ");
	        int size = sc.nextInt();

	        int[] arr = new int[size];

	      
	        System.out.print("Enter the values: ");
	        for (int i = 0; i < size - 1; i++) {
	            arr[i] = sc.nextInt();
	        }

	   
	        System.out.print("In which index you want to insert: ");
	        int index = sc.nextInt();

	     
	        System.out.print("Enter the value for " + index + " index: ");
	        int value = sc.nextInt();

	        if (index < 0 || index >= size) {
	            System.out.println("Invalid index.");
	            return;
	        }

	        ArrayInsertion obj = new ArrayInsertion();
	        obj.insertion(arr, index, value);

	        System.out.println("Updated array: " + Arrays.toString(arr));
	       
	    }
	}


