package f._10_12_april_array_list_plus_recur____recursion_get;
import java.util.*;
public class permutation 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String str = scn.next();
		System.out.println(perm(str));
		

	}
	public static ArrayList<String>  perm(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> br= new ArrayList<>();
			br.add("");
			return br;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = perm(ros);
		
	
		//for(int i =0; i<=rr.size(); i++)
		for(String val: rr)
		{
			for(int i =0; i<=val.length(); i++) {
		mr.add(ros.substring(0,i) + ch + ros.substring(i));
			//	mr.add(val.substring(0,i) + ch + val.substring(i));
		}
		
		}
		
		
		return mr;
	}

}
