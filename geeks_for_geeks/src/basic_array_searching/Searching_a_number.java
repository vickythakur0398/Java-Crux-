package basic_array_searching;

import java.util.*;

public class Searching_a_number {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int tc = scn.nextInt();
	    for(int i  = 1; i<= tc; i++  ){
	        int n = scn.nextInt();
	        int search = scn.nextInt();
	         int [] arr = take_input(n);
	         System.out.println(linear_search(arr, search));
	    }
	   
	   
	}public static int[] take_input(int n ){
	    int [] arr = new int[n];
	    for(int i = 0; i<arr.length ; i++ ){
	        arr[i] = scn.nextInt();
	    }
	    return arr; 
	}

	public static int linear_search(int[] arr, int search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return i+1;
			}
		}
		return -1;
	}
}


// time limit more that 2.92 to hua nhi 
//https://practice.geeksforgeeks.org/problems/searching-a-number/0 link
