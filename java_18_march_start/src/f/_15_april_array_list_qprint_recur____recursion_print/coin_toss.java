package f._15_april_array_list_qprint_recur____recursion_print;
import java.util.*;
public class coin_toss 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		print_coin_toss(500, " ");

	}
	public static void print_coin_toss(int num, String ans)
	{
		if(num==0)
		{
			System.out.println(ans);
			return;
		}
		
		
		print_coin_toss(num-1, ans+"H");
		print_coin_toss(num-1, ans+"T");

	}
	

}
