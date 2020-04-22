package f._15_april_array_list_qprint_recur____recursion_print;
import java.util.*;
public class kpc 

{
	
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		mobile_keypad("145", "");
		System.out.println(count);

	}static int count =0;
	public static void mobile_keypad(String ques, String ans)
	{
		if(ques.length()==0)
		{
			System.out.println( " -"+ans);
			count++;
//			System.out.println(count);
			return;
			
		}
		
		char ch = ques.charAt(0);
		String rest_of = ques.substring(1);
		String in_ch = getCode(ch); 
		
		for(int i = 0; i< in_ch.length(); i++)
		{
			char digit = in_ch.charAt(i);
			mobile_keypad(rest_of, ans+digit);
		}
		
		
		
		
		
		
	}
	
	
	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}


}
