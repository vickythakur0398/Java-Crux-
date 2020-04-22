package basic_array_searching;
import java.util.*;
public class max_in_bitonic {
	static Scanner scn = new Scanner(System.in);

	public static void main (String[] args){
	    int tc = scn.nextInt();
	    for(int k = 1; k<= tc; k++){
	        int size = scn.nextInt();
	        int [] arr = new int[size];
	        for(int i = 0 ; i< arr.length; i++){
	            arr[i] = scn.nextInt();
	        }
	        System.out.println(max_search(arr));
	        
	    }
	    
	}public static int max_search(int[] arr){
	    int max = arr[0];
	    for(int i = 0; i< arr.length ; i++){
	        if(arr[i] > max){
	            max = arr[i];
	        }
	    }
	    
	    return max;
	    
	}
}




/*
 * Given an array of elements which is first increasing and then may be decreasing, find the maximum element in the array.
Note: If the array is increasing then just print then last element will be the maximum value.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N, the size of array, the second line of each test case contains N integers which are the array elements.

Output:
Print the maximum element in the array.

Constraints:
1 ≤ T ≤ 50
3 ≤ N ≤ 106
1 ≤ Ai ≤ 106

Example:
Input:
2
9
1 15 25 45 42 21 17 12 11
5
1 45 47 50 5

Output:
45
50


 */
