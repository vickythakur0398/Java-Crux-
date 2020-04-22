package f_9_10_april_array_plus_recursion_;
import java.util.*;
public class max_in_an_array 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] arr = {1000,20,50, 80, 100, 70};
		System.out.println(max_ls(arr,0));
		
	}
		public static int max_ls(int[] arr, int vidx)
		{
			if(vidx == arr.length-1) {
				return arr[vidx] ;
			}
			
			
			int sp = max_ls(arr, vidx+1);
			
			if(sp>arr[vidx])
			{
				return sp;
			}
			return arr[vidx];
			
		}

}