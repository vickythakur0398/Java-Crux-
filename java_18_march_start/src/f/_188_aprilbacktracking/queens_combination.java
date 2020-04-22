package f._188_aprilbacktracking;
import java.util.*;
public class queens_combination 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		queens_compination_board(new boolean[4], 0,2,  0,"" );
	}
	public static void queens_compination_board(boolean [] board,int col, int tq,int qpsf,String ans )
	{
		if(tq== qpsf)
		{
			System.out.println(ans);
			return;
			
		}
		
		if(col==board.length) 
		{
			return;
		}
		
		
		
		
		// place
		board[col] = true;
		queens_compination_board( board,col+1, tq, qpsf+1,ans + 'b'+ col);
		board[col] = false;
		
		
		// not place
		queens_compination_board( board,col+1, tq, qpsf,ans );
	}

}
