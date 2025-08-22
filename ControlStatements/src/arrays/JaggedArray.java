package arrays;

import java.util.Arrays;

public class JaggedArray {
	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[4];
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}
		for (int[] row : arr) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(arr));

	}
}
