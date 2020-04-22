package c_fourth_array_25_aug;
import java.util.*;
public class taking_input {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = take_input();
		
		display(arr);
		
	}public static int[] take_input() {
		System.out.println(" sizs = ");
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i< arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
		
	}public static void display(int[] arr) {
	for(int val: arr) {
		System.out.println(val);
	}
		
		
		
	}
	
}
