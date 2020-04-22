package f._15_april_array_list_qprint_recur____recursion_print;
import java.util.*;
public class maze_path 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		maze_path(0, "",10);
	}
	public static void maze_path(int ques, String ans, int end)
	{
		if(ques== end)
		{
			System.out.println(ans);
			return;
		}
		if(ques>end)
		{
			return;
		}
		
		
		for(int i =1; i<= 6; i++ )
		{
			maze_path(ques+i, ans + i, end);
		}
		
	}

}
