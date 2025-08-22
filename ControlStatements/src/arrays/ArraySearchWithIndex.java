package arrays;

import java.util.Scanner;

public class ArraySearchWithIndex {
	public static int findIndex(int[] arr, int target, int index) {
		if (index >= arr.length) {
			return -1;
		}
		if (arr[index] == target) {
			return index;
		}

		return findIndex(arr, target, index + 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };

		while (true) {
			System.out.print("Enter the element to search: ");
			int target = scanner.nextInt();

			int index = findIndex(arr, target, 0);

			if (index != -1) {
				System.out.println("Element " + target + " is present at index: " + index);
			} else {
				System.out.println("Element " + target + " is not present.");
			}

			System.out.print("Want to continue your search (Y/N): ");
			char continueSearch = scanner.next().charAt(0);

			if (continueSearch != 'Y' && continueSearch != 'y') {
				break;
			}
		}

	}
}
