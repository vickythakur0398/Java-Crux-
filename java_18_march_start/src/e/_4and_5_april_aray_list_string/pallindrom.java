package e._4and_5_april_aray_list_string;
import java.util.*;
public class pallindrom 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String num = "nltin";
		System.out.println(pallindrome( num));
	}
	public static boolean pallindrome( String num)
	{	
		int bool = 0;
		int j = 0;
		int i = num.length()-1;
		while(j <= i)
		{
			if(num.charAt(i) != num.charAt(j)) 
			{
				return false;
			}
		//return true;
			j++;
			i--;
		
		
	}
		
		return true;

}
}
