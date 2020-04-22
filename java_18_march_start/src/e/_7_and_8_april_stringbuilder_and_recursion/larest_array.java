package e._7_and_8_april_stringbuilder_and_recursion;
import java.util.*;
public class larest_array 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [] arr = {54,546,548,60};
		largest_array(arr);
		
		

	}
	public static void largest_array(int[] arr)
	{
		for(int count = 0; count<= arr.length-2; count++)
		{
			for(int start = 0; start<= arr.length-count-2; start++)
			{
				if(iscompare(arr[start] ,  arr[start+1]))
				{
					int temp = arr[start];
					arr[start] = arr[ start+1];
					arr[start+1] = temp;
				}
			}
		}
		display(arr);
	}
	public static boolean iscompare(int n1, int n2)
	{
		String n1n2= n1 + "" + n2;  // to convert int to string
		String n2n1 = n2+"" + n1;
		
		int res = n1n2.compareTo(n2n1); // isme agar n1n2 bada hoga to +ve aiega result vrna negative
		if(res > 0)    // agar res me +ve hai matlab n1n2 bada h n2n1 se to swap nhi karana h
		{
			return false;
		}else {
			return true;
		}
		
		
	}
	public static void display(int[] arr)
	{
		for(int val:arr)
		{
			System.out.print(val);
		}
	}

}
