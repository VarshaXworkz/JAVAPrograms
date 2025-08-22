package arrays;

import java.util.Arrays;

public class MultiDimensionArr {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{3,4,5},{6,7,8},{2,4,8}};
		int arr1[][]=new int[2][2];
		arr1[0][0]=1;
		arr1[0][0]=2;
		arr1[0][0]=3;
		arr1[0][0]=4;
		System.out.println("Printing the Elements of 2d Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){	
				System.out.print(arr[i][j]+" ");
			}
				 System.out.println();
			}
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(arr1));	
		}
	}


