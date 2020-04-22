package c_fourth_array_25_aug;

import java.util.*;

public class max_in_an_array {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i =0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
			
		}
		System.out.println(max_num(arr));
			
	}public static int max_num(int[] arr) {
		int max = arr[0]; // or can be used both 
	//	int max = Integer.MIN_VALUE; // negative value 
		for(int i = 1;i<arr.length; i++) {
			if(arr[i] >  max) {
				max = arr[i];
			}
		}
		return max;
	}

}
