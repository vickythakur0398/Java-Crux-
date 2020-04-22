package f_9_10_april_array_plus_recursion_;
import java.util.*;
public class last_occurance 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {10,20,20,90,20,80,20};
		System.out.println(l_s(arr, -1, 20));
 	}
	public static int l_s(int[] arr, int vidx, int item)
	{
		if(vidx == arr.length-1)
		{
			return -1;
		}
		
		
		int rr = l_s(arr, vidx+1, item);
		if(arr[vidx+1] == item)
		{
			return rr;
		}
		return -1;
		
		
		
		
	}
}
