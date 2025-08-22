package arrays;

import java.util.Arrays;

public class ArrayDeletion {
	public void deletion(int arr[],int value) {
		for(int i=2;i<arr.length-1;i++) {
//			arr[i]=arr[i+1];
//		}
			if(i==(arr.length-1)) {
				arr[arr.length-1]=0;
			}else {
			arr[i]=arr[i+1];
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		ArrayDeletion obj=new ArrayDeletion();
		obj.deletion(arr, 2);
		System.out.println(Arrays.toString(arr));

	}

}
