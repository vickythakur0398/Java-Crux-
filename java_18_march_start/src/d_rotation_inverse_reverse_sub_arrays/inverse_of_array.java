package d_rotation_inverse_reverse_sub_arrays;
import java.util.*;
public class inverse_of_array {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr = {3,4,0,1,2};
		int [] arrnew = new int[arr.length-1];
		
		System.out.println(inverse(arr , arrnew));
		//display(arrnew);
		

	}
	public static int[] inverse(int[] arr , int[] arrnew)
	{
		for(int i =1; i< arr.length; i++) 
		{
			arrnew[arr[i]] = i;
		}
		return arrnew;
	}
	public static void display(int[] arrnew) 
	{
		for(int i:arrnew) 
		{
			System.out.print(i + " ");
		}
	}
}
