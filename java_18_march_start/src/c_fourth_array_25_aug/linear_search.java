package c_fourth_array_25_aug;

import java.util.*;

public class linear_search {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = tke_input();
		System.out.println("to search");
		int num = scn.nextInt();
		System.out.println(linear_search(arr, num));

	}

	public static int[] tke_input() {
		System.out.println("Size");
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}
		return arr;

	}public static int linear_search(int[] arr, int num) {
		for(int i = 0; i< arr.length; i++ ) {
			if(arr[i] == num) {
				return i; 
			}
			
		}
		return -1;
	}

}
