package f._10_12_april_array_list_plus_recur____recursion_get;
import java.util.*;
public class subsequences_of_strings 
{
static Scanner scn = new Scanner(System.in); 
	public static void main(String[] args) 
	{
		String str = scn.next();
		System.out.println(subsqncs(str));

	}
	public static ArrayList<String> subsqncs(String str)
	{
		
		if(str.length() == 0)
		{
			ArrayList<String> br = new ArrayList<>();        
			br.add("");                                        
			return br;
			
		}
																		
		char s = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = subsqncs(ros);
		for(String val:rr )
		{
			mr.add(val);
			mr.add(val+s);
		}
		return mr;
		
		
		
	}

}
