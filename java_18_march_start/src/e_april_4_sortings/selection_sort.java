package e_april_4_sortings;
import java.util.*;
public class selection_sort 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [] arr = {80, 84 , 74, 2, 9, 88};
		sel_sort(arr);
		display(arr);

	}
		public static int[] sel_sort(int[] arr) 
		{
			for(int count = 0; count<= arr.length-1-1; count++)
		  {
				int min = count;
			
			for(int j = count+1; j< arr.length-1; j++)
			 {
				if(arr[j] < arr[min]) {
					min = j;
					
				}
				
			 }
			
				int temp = arr[min];
				arr[min] = arr[count];
				arr[count] = temp; 
				
				
		  }
			return arr;
			
		}
			public static void display(int[] arr)
			{
			for(int i : arr) 
				{
				System.out.print(i + " ");
				}
		}

}
