package e_april_4_sortings;
import java.util.*;
public class bubble_sort 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int [] arr = {60, 50, 40, 30, 20, 10};
		System.out.println(bubble_sort(arr));
		display(arr);
	}
		public static int[] bubble_sort(int[] arr) 
		{
			
			for(int count = 0; count< arr.length-1; count++) 
			{
			
				for(int j = 0; j< arr.length-1 - count; j++ ) 
				{
					if(arr[j] > arr[j+1]) 
					{
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
					
				}
				
				
			}
			
			return arr;
			
			
		}
			public static void display(int[] arr) {
				for(int i : arr) {
					System.out.print(i + " ");
				}
			}

}
