package f._10_12_april_array_list_plus_recur____recursion_get;
import java.util.*;
public class maze_path 
{
static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(get_maze_path(0,0,2,2));
	}
	public static ArrayList<String> get_maze_path(int current_row, int current_col, int end_row, int end_col)
	{
		//+ve base case
		if(current_row== end_row && current_col == end_col)
		{
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		// -ve case
		if(current_row>end_row || current_col> end_col)
		{
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> recursn_result_horizontal = get_maze_path(current_row+1, current_col, end_row, end_col);
		for(String val: recursn_result_horizontal)
		{
			mr.add("H" +val);
		}
		ArrayList<String> recursn_result_vertical = get_maze_path(current_row, current_col+1, end_row, end_col);
		for(String val:recursn_result_vertical)
		{
			mr.add("V" + val);
		}
		return mr;
		
		
	}

}
