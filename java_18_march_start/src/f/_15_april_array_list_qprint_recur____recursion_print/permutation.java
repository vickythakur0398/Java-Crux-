package f._15_april_array_list_qprint_recur____recursion_print;
import java.util.*;
public class permutation 
{
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_permu_2("abc", "");
	}
	public static void print_permu(String ques, String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i =0; i< ques.length(); i++)
		{
			char ch = ques.charAt(i);
			String rest_of_ques = ques.substring(0,i) + ques.substring(i+1);
			print_permu(rest_of_ques, ans+ch);
			
		}
		
		
	}
	public static void print_permu_2(String ques, String ans)
	{
		if(ques.length()== 0)
		{
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		for(int i =0; i<= ans.length(); i++)
		{
			print_permu_2(ros, ans.substring(0,i) + ch + ans.substring(i));
		}
	}

}
