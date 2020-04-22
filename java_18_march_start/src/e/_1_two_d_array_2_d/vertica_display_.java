package e._1_two_d_array_2_d;
import java.util.*;

public class vertica_display_ {
    static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] arr = { 
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
		
				
		};
		
		
		for(int i =0; i< arr[0].length; i++)
		{
			//System.out.print(arr[i] + " " );
			int start = 0;
			int end = arr.length-1;
			while(start <= end) 
			{
				System.out.print(arr[start][i]);
				start++;
				System.out.println();
			}
		}
		//or 
		/*for(int coloumn =0; coloumn< arr[0].length; coloumn++)
		{
			for(int row =0; row< arr.length; row++)
			{
				System.out.println(arr[row][coloumn]);
			}
		}*/
	}

}
