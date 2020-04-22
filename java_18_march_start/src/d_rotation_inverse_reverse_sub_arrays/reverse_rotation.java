package d_rotation_inverse_reverse_sub_arrays;

import java.util.*;

//import com.sun.tools.sjavac.server.SysInfo;

public class reverse_rotation {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int low = 0;
		int high = arr.length - 1;
		reverse_array(arr, low, high);
		 display(arr);
		 System.out.println("123478901234567890234567890");
		int ror = 4;
		 Rotate_array(arr, ror);
		 display(arr);
		 System.out.println(" -------------------------");
		
	}

	public static void reverse_array(int[] arr, int low, int high) {

		while (low <= high) {

			swap(arr, low, high);
			low = low + 1;
			high = high - 1;

		}

	}

	public static void swap(int[] arr, int low, int high) {
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;

	}

	public static void display(int[] arr) {
		for (int i : arr) {
			System.out.println(i + " ");
		}
	}

	public static void Rotate_array(int[] arr, int ror) {

		for (int i = 1; i <= ror; i++) {
			int temp = arr[arr.length - 1];
			for (int l = arr.length - 1; l >= 1; l--) {
				arr[l] = arr[l - 1];
//				arr[0] = temp;
			}
			arr[0] = temp;
		}

	}

}