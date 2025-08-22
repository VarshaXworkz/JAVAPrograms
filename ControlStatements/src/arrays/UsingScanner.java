package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args, String col) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int rowsSize = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int colsSize = scanner.nextInt();

      
        int[][] arr = new int[rowsSize][colsSize];

      
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rowsSize; i++) {
            for (int j = 0; j < colsSize; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

     
        System.out.println("Printing the Elements of The Array:");
		/*
		 * for(int[] row:arr) { for(int col:row) { System.out.print(col+""); }
		 * System.out.println(); }
		 */
		
		  for (int i = 0; i < rowsSize; i++) {
			  for (int j = 0; j < colsSize; j++) {
		  System.out.print(arr[i][j] + " ");
		  
			  } 
			  System.out.println(); }


    
//        System.out.println("Printing array Statement:");
//        System.out.println(Arrays.deepToString(arr));

       
    }
}

