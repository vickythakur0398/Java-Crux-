package c_fourth_array_25_aug;

import java.util.*;

public class binary_search {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
	//	System.out.println("item");
		int item = scn.nextInt();
		System.out.println(binary_search(arr, item));
	}

	public static int binary_search(int[] arr, int item) {
		
		int low = 0;
		int high = arr.length - 1;
		
		for (int i = 0; i < arr.length; i++) {
			int mid = low + high / 2;
			if (item == arr[mid]) {
				return mid;
			} else if (item > arr[mid]) {
				low = mid+1;
				high = high;
				

			} else {
				low = low;
				high = mid+1;

			}

		}return -1;
	}
}
