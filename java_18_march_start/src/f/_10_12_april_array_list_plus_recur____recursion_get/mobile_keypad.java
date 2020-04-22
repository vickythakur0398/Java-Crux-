package f._10_12_april_array_list_plus_recur____recursion_get;
import java.util.*;
public class mobile_keypad 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args)
	{
		String str = scn.next();
		System.out.println(getkpc(str));

	}
	public static ArrayList<String> getkpc(String str)
	{
		if(str.length()== 0)
		{
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
			
		}
		
	char s1 = str.charAt(0);
	String answer = getCode(s1);
	
	String ros = str.substring(1); // rest_of_result
	
	
	ArrayList<String> mr = new ArrayList<>();
	ArrayList<String> cr =  getkpc(ros);
	
	
	for(int i = 0; i< answer.length(); i++)
	{
		//for(String val:cr)
		for(int k = 0; k< cr.size(); k++)
		{
			mr.add(answer.charAt(i) + cr.get(k));
		}
	}
	
	return mr;
		
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
