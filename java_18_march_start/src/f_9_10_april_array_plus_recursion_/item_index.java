package f_9_10_april_array_plus_recursion_;
import java.util.*;
public class item_index 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] arr = {10,20,50,20,80,20,5, 20};
		int [] r=  all_indx(arr, 0, 20, 0 );
		for(int i:r)
		{
			System.out.println(i);
		}
		

	}
	public static int[] all_indx(int [] arr, int vidx, int  item , int count)
	{
		if(vidx == arr.length)
		{
			int [] a = new int[count];
			return a;
			
		}
		
		int[] rr ;
		
		//all_indx(arr, vidx+1, item, count);
		if(arr[ vidx] == item) 
		{
			 
			rr = all_indx(arr, vidx+1, item, count+1);
			rr[count] = vidx;
			
			
		}else
		{
			rr =all_indx(arr, vidx+1, item, count);
			
			
		}
		return rr;
		
	}

}
