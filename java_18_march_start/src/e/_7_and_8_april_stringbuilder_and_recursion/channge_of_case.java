package e._7_and_8_april_stringbuilder_and_recursion;
import java.util.*;
public class channge_of_case 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String str = "hElLoo";
		System.out.println((Sb(str)));
		
		
	}
	public static String Sb(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		for(int i =0; i<sb.length();i++ )
		{
			char ch = sb.charAt(i);
			if(ch >= 'a' && ch<= 'z')
			{
				sb.setCharAt(i, (char) (ch-32));
			}else
			{
				sb.setCharAt(i, (char)(ch+32));
			}
		}
		
		String sbr = sb.toString();
		return sbr;
	}

}
