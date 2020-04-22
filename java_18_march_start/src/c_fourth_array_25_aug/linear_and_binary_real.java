package c_fourth_array_25_aug;

import java.util.Scanner;

public class linear_and_binary_real {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		int [] arr = new int[num];
		for(int i = 0; i< arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int item = scn.nextInt();
		System.out.println(Linear_search(arr, item));
		//System.out.println(Binary_search(arr, item));
		
	}

	public static int Linear_search(int[] arr, int item) {
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] == item) {
				return i;
			}
		}

		return -1;

	}public static int Binary_search(int[] arr, int item) {
		
		int low = 0;
		int high = arr.length-1;
		
		while(low<= high) {
			int mid = (low + high)/2;
			if(arr[mid]> item) {
				low = mid+1;
			}else if(arr[mid] < low) {
				high = mid-1;
			}else {
				return mid;
			}
			
			
			
			
		}
		
		
		return -1;
		
		
		
	}

}
