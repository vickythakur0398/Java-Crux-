package e._4and_5_april_aray_list_string;
import java.util.*;
public class substrings 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "block";
		//int i = 0;
		int j = str.length()-1;
		
		for(int i =0; i<= j; i++)
		{
			for(int k = i+1; k<=j+1; k++)
			{
				System.out.println(str.substring(i, k));
				System.out.println();
			}
		}
	
		
	}
		

}
