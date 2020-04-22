package d_rotation_inverse_reverse_sub_arrays;

import java.util.*;

public class rotation_method_2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		// int low = 0;
		// int high = arr.length - 1;
		int rot = 4;
	//	reverse(arr);
		display(arr);
		System.out.println("------------------");
		rotate(arr, rot);
		display(arr);
		System.out.println("-----------------");

	}

	public static void reverse(int[] arr) 
	{
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;

			low = low + 1;
			high = high - 1;

		}
	}

	public static void rev_2(int[] arr, int low, int high)

	{
		while (low <= high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;

			low = low + 1;
			high = high - 1;

		}

	}

	public static void rotate(int[] arr, int rot) {
		int low = 0;
		int high = arr.length - rot;
		rev_2(arr, low, high - 1);
		//System.out.println("--------------");
		display(arr);
		System.out.println("______");
		rev_2(arr, high, arr.length - 1);
		display(arr);
		System.out.println("-------------");
		rev_2(arr, 0, arr.length-1);

	}

	public static void display(int[] arr)

	{
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
