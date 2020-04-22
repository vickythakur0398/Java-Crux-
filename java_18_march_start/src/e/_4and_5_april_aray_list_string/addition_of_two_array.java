package e._4and_5_april_aray_list_string;
import java.util.*;
public class addition_of_two_array 
{

	public static void main(String[] args) 
	{
		int [] one = {9,9,6,5};
		int[] two = {9,9};
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(sum_(one, two));
		
		
		
 	}public static ArrayList<Integer> sum_(int[] one, int[] two)
	{	
 		ArrayList<Integer> list = new ArrayList<>();
 		int i = one.length-1;
 		int j = two.length-1;
 		int carry = 0;
 		
 		while(i >=0|| j>= 0 )
 		{
 			int sum = carry;
 			if(i>=0)
 			
 				sum += one[i];
 			if(j>=0)
 			
 				sum += two[j];
 			
 			int rem = sum%10;
 			carry = sum/10;
 			list.add(0,rem);
 			i--;
 			j--;
 			
 			
 			}if(carry!=0) {
 				list.add(0,carry);
 			
 		}
		return list;
 		
	}

}
