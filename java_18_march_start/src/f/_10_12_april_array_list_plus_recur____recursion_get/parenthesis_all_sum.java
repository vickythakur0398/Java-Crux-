/*
 * Given a string of numbers and operators, return all possible results 
 * from computing all the different possible ways to group numbers and operators. 
 * The valid operators are +, - and *.

Example 1:

Input: "2-1-1"
Output: [0, 2]
Explanation: 
((2-1)-1) = 0 
(2-(1-1)) = 2
Example 2:

Input: "2*3-4*5"
Output: [-34, -14, -10, -10, 10]
Explanation: 
(2*(3-(4*5))) = -34 
((2*3)-(4*5)) = -14 
((2*(3-4))*5) = -10 
(2*((3-4)*5)) = -10 
(((2*3)-4)*5) = 10
 */


package f._10_12_april_array_list_plus_recur____recursion_get;
import java.util.*;
public class parenthesis_all_sum 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(parentheis("2-1-1"));

	}
	public static ArrayList<Integer> parentheis(String str)
	{
		ArrayList<Integer> mr = new ArrayList<>();
		for(int i =0; i< str.length();i++)
		{
			
			char ch = str.charAt(i);
			if(ch == '+' || ch == '-'|| ch == '*') 
			{
			
			String rr1 = str.substring(0, i);
			String rr2 = str.substring(i+1);
			
			ArrayList<Integer> rr11 = parentheis(rr1);
			ArrayList<Integer> rr22 = parentheis(rr2);
			
			
			
			
		
			
			for(int val: rr11)
			{
				for(int val2: rr22)
				{
					
					if(ch == '+')
					{
						mr.add(val+val2);
					}
					
					if(ch == '-')
					{
						mr.add(val-val2);
					}
					
					if(ch == '*')
					{
						mr.add(val*val2);
					}
					
					
					
					
					
				}
			}
			
		}	
			
		}
		if(mr.size() == 0 )
		{
			mr.add(Integer.parseInt(str));
		}
		
		return mr;
	}

}
