package basic_array_searching;
import java.util.*;

public class rotate {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tc = scn.nextInt();
		for(int t =0; t<= tc-1; t++ ) {
			int num = scn.nextInt();
			int [] arr = new int[num];
			for(int i =0; i< arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			leadear_array(arr);
		}
	}public static void leadear_array(int[] arr) {
		for(int i = 0; i <= arr.length-1; i++) {
			 
			boolean leader = true;
			for(int k = i+1; k<=arr.length-1; k++) {
				if(arr[k] > arr[i]) {
					leader = false;
					break;
				}
				
			}
			if(leader) {
				System.out.print(arr[i] + " ");
			}
			//System.out.println();
			
			
			
		}
		System.out.println();
			
	}

}




/*
 * Output:
17 5 2
4 0
7 7 3
 */






















/*
Input:
	The first line of the input contains T denoting the number of testcases. 
	First line of each test case contains two space separated elements, 
	N denoting the size of the array and an integer D denoting the number size of the rotation. 
	Subsequent line will be the N space separated array elements.

	Output:
	For each testcase, in a new line, output the rotated array.

	Constraints:
	1 <= T <= 200
	1 <= N <= 107
	1 <= D <= N
	0 <= arr[i] <= 105

	Example:
	Input:
	2
	5 2
	1 2 3 4 5 
	10 3
	2 4 6 8 10 12 14 16 18 20

	Output:
	3 4 5 1 2
	8 10 12 14 16 18 20 2 4 6

	Explanation :
*/