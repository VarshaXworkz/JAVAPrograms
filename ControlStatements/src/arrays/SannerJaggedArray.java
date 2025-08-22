package arrays;

import java.util.Scanner;

public class SannerJaggedArray {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();

	       
	        int[][] arr = new int[rows][];

	        for (int i = 0; i < rows; i++) {
	            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
	            int cols = scanner.nextInt();
	            arr[i] = new int[cols];

	            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ":");
	            for (int j = 0; j < cols; j++) {
	                arr[i][j] = scanner.nextInt();
	            }
	        }

	      
	        System.out.println("The Jagged Array is:");
	        for (int[] row : arr) {
	            for (int col : row) {
	                System.out.print(col + " ");
	            }
	            System.out.println();
	        }

	       
	        scanner.close();
	    }
	}



