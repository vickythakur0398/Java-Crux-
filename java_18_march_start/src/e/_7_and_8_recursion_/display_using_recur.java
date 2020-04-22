package e._7_and_8_recursion_;
import java.util.*;
public class display_using_recur
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40};
		display(arr, 0);
		int j = arr.length-1;
		arrl(arr, j);
		
	}
		public static void display(int[] arr, int vidx)
		{
			if(vidx == arr.length)
			{
				return;
			}
			
			System.out.println(arr[vidx]);
			display(arr, vidx+1);
			System.out.println(arr[vidx]);
		}
		public static void arrl(int[] arr, int j)
		{
			if(j<0)
			{
				return;
			}
			
			arrl(arr, j-1);
			System.out.println(arr[j]);
			
		}
		
		
		
}
