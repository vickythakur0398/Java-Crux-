package f._10_12_april_array_list_plus_recur____recursion_get;
import java.util.*;
public class maze_path_multi_step {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(maze_path(0,0,2,2));

	}
	public static ArrayList<String> maze_path(int c_r, int c_c, int e_r, int e_c)
	{
		if(c_r == e_r && c_c == e_c)
		{
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		
		if(c_r> e_r || c_c> e_c)
		{
			ArrayList<String> br = new ArrayList<>();
		//	br.add("\n");
			return br;
		}
		
		
		
		ArrayList<String> mr = new ArrayList<>();
		
		
		for(int move = 1; move <= e_r-c_r;move++)
		{
			ArrayList<String> rrh = maze_path(c_r , c_c+ move, e_r, e_c);
					for(String val:rrh)
					{
						mr.add("H" + move+ val);
					}
		}
		
		
		for(int move = 1; move<= e_c-c_c; move++)
		{
			ArrayList<String> rrv = maze_path(c_r + move, c_c, e_r, e_c);
			for(String val:rrv)
			{
				mr.add("V" + move+ val);
			}
		}
		
		
		for(int move = 1; move<= e_c-c_c && move<= e_r-c_c; move++)
		{
			ArrayList<String> rrd = maze_path(c_r + move, c_c+move, e_r, e_c);
			for(String val:rrd)
			{
				mr.add("D" + move+ val);
			}
		}
		
		return mr;
	}

}
