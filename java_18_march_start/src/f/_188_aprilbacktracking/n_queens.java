package f._188_aprilbacktracking;
import java.util.*;
public class n_queens 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		n_queens_box(new boolean[4][4], 0, 0, 2, 0, "");
	}public static boolean is_it_safe_to_pace_queen(boolean [][]board, int row, int col)
	{
		// upar se na koi kate
		int r = row-1;
		int c = col;
		while(r>=0)
		{
			if(board[r][c])
			{
			return false;	
			}
			r--;
		}
		
		// left se na koi ktae
		
		r = row;
		c = col-1;
		while(c>=0)
		{
			if(board[r][c])
			{
				return false;
			}
			c--;
		}
		// diagnally left
		r = row-1;
		c = col-1;
		while(c>=0&& r>=0)
		{
			if(board[r][c])
			{
			return false;	
			}
			r--;
			c--;
		}
		
		// diagnal rt
		r = row-1;
		c = col+1;
		while(c< board[0].length && r>=0)
		{
			if(board[r][c])
			{
				return false;
			}
			
			r--;
			c++;
		}
		return true;
		
	}
	public static void n_queens_box(boolean[][] board, int row, int col , int tq, int qpsf, String ans)
	{
		
		if(qpsf== tq)
		{
			System.out.println(ans);
			return;
		}
		
		if(col== board[0].length)
		{
			row ++;
			col =0;
			
		}
		
		
		if(row == board.length)
		{
			return;
		}
		
		
		
		
		if(is_it_safe_to_pace_queen(board,  row, col))
		{
		
		// place 
		board[row][col] = true; // 00 pe initally queen h
		n_queens_box(board, row, col + 1, tq, qpsf + 1, ans + "{" + row + "-" + col + "} ");
		board[row][col] = false;
		}
		// not place
		n_queens_box(board, row, col + 1, tq, qpsf, ans);
		
		
	}
	
	
}
