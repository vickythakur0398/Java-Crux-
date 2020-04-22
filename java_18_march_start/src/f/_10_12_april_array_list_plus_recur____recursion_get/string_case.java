package f._10_12_april_array_list_plus_recur____recursion_get;
import java.util.*;
public class string_case 
{
	

static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String str = "a1b2";
		
		System.out.println(change_case(str));

	}
	public static ArrayList<String> change_case(String str)
	{
		if(str.length()==0) 
		{
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = change_case(ros);
		ArrayList<String> mr = new ArrayList<>();
		
		
		
		
		
		for(String val:rr)
			if(Character.isDigit(ch))
			{
				mr.add(ch+val);
			
		}else
		{
			mr.add(Character.toLowerCase(ch) +val );
			mr.add(Character.toUpperCase(ch)+val );
			
		}
		return mr;
		
		
	}

}
