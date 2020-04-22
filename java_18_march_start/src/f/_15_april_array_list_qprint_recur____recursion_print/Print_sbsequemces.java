package f._15_april_array_list_qprint_recur____recursion_print;
import java.util.*;
public class Print_sbsequemces 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		print_subs("abc", "");
	}
	public static void print_subs(String ques, String ans) 
	{
		
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String rest_of_ques = ques.substring(1);
		
		// not add ch
		print_subs(rest_of_ques, ans);
		// add karna h
		print_subs(rest_of_ques, ans+ch);
		
	}

}
