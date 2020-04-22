package f._15_april_array_list_qprint_recur____recursion_print;
import java.util.*;
public class nitin_pallindromics 
{
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(is_pallindrome("nitin"));
	palindrome_partition("NITIN"," ");

	}
	public static boolean is_pallindrome(String str)
	{
		int i =0;
		int j = str.length()-1;
		while(i<=j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	public static void palindrome_partition(String ques, String ans)
	{
		if(ques.length() ==0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i =1; i<=ques.length();i++) 
	{
		String part = ques.substring(  0, i);
		String rest_of = ques.substring(i);
		
		if(is_pallindrome(part))
			
		{
			palindrome_partition(rest_of, ans+ part + " ");
			
		}
	}
		
	}

}
