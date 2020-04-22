package f_9_10_april_array_plus_recursion_;
import java.util.*;
public class first_occurance 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int [] arr = {20,40,50,50,90,78};
		System.out.println(l_s(arr,0, scn.nextInt()));
		
		

	}
	public static int l_s(int[] arr, int vidx, int item)
	{
		if(vidx == arr.length)
		{
			return -1;
		}
		
		
		int rr = l_s(arr,vidx+1, item);
		
		if(arr[vidx] == item)
		{
			return vidx;
		}
		return rr;
		
		
		
		
		
	}

}
