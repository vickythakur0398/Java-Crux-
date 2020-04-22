package e._1_two_d_array_2_d;
import java.util.*;
public class matrix_multiplication 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,20,20,20,20,};
		
		System.out.println(l_s(arr, 0, scn.nextInt()));
	}
	public static int l_s(int[] arr, int vidx, int item)
	{
		if(vidx == arr.length)
		{
			return -1;
		}
		
		int rr = l_s(arr, vidx+1, item );
		if(arr[vidx] == item && rr == -1)
		{
			return vidx;
			
		}
		return rr;
		
	}
}
