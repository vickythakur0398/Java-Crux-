package e._1_two_d_array_2_d;
import java.util.*;
public class taking_input_in_2_d_arr {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("rows");
		int row = scn.nextInt();
		int [][] arr = new int [row][];
		for(int r = 0; r< arr.length; r++) {
			
			System.out.println("col in "+ r + "row" );
			arr[r] = new int[scn.nextInt()];
			for(int k = 0 ; k< arr[r].length; k++) {
				System.out.println("[" + r+ "-"+ k + " ]");
				arr[r][k] = scn.nextInt();
				
			}
		}
		display(arr);
		
		
	}public static void display(int[][] arr ) {
		for(int i =0; i<arr.length; i++)
		{
			for(int k = 0; k< arr[i].length; k++) 
			{
				System.out.print(arr[i][k] + " ");
			}
			System.out.println();
		}
	}

}
