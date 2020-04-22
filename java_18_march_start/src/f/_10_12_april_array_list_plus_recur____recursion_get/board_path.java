package f._10_12_april_array_list_plus_recur____recursion_get;
import java.util.*;
public class board_path 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(board_path(0,10));

	}
	public static ArrayList<String> board_path(int cur, int end)
	{
		if(cur== end)
		{
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			
			return br;
			
		}
		if(cur>end)
		{
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		for(int dice= 1; dice<= 6; dice++)
		{
			ArrayList<String> rr = board_path(cur+dice, end);
			
			
			for(String val: rr)
			{
				mr.add(dice + val);
			}
			
			
		}
		return mr;
		
		
		
		
	}

}
