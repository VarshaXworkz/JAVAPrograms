package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
	//Ascending order sorting
	public void ascendingSort(String arr[]) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	//Descending order sorting
	public void descendingSort(Integer arr[]) {
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
	}
	//Sorting specific sorting
	public void sortingSpecificIndex(int arr[]) {
		Arrays.sort(arr, 2, 5);
		System.out.println(Arrays.toString(arr));
	}
	//Parallel sorting
	public void parallelSorting(int arr[]) {
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		
		
		ArraySorting obj=new ArraySorting();
		String strArr[]= {"Manu","Anu","Dhanu"};
		obj.ascendingSort(strArr);
		
		int arr[]= {2,9,8,7,5,4};
		obj.sortingSpecificIndex(arr);
		
		Integer array[]= {4,5,6,3,2,5,8};
		obj.descendingSort(array);
		
		int array1[]= {99,98,97,96,95,94,93,67,87,78,56,65,45,33,32,78,55,67,45,21,12,13,32,43,23};
		obj.parallelSorting(array1);
		
	}

}
