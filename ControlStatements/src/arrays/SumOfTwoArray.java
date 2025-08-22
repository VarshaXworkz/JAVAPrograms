package arrays;

public class SumOfTwoArray {
	public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {3, 4, 5}};
        int[][] b = {{3, 4, 5}, {1, 2, 3}};
        
        int rows = a.length;
        int cols = a[0].length;

      
        int[][] result = new int[rows][cols];

     
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
                System.out.println("The Addition of "+a[i][j]+" and "+b[i][j]+"is");
            }
        }

       
        System.out.println("Resulting 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); 
        }
    }



}
