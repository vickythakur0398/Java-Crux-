package f._188_aprilbacktracking;
import java.util.*;
public class quees_comb_2d 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		queen_comb_2d_box(new boolean [2][3],0,0,1,0,"" );

	}
	public static void queen_comb_2d_box(boolean [][] board , int row, int col, int tq, int qpsf , String ans )
	{
		if(qpsf== tq)
		{
			System.out.println(ans);
			return;
		}
		
		if(col == board[0].length)
		{
//			row++;
//			col = 0;
//			
			// method 2 by recursion so that new frame is created istead of making changes in existing frame by recur
			 		queen_comb_2d_box(board, row+1, 0, tq, qpsf, ans );
			return;

		}
		
		if(row == board.length)
		{
			return;
		}
		
		
		
		
		// queen places
		board[row][col] = true;
		queen_comb_2d_box(board, row, col+1, tq, qpsf+1, ans+ " {" + row + "-"+ col+ "}" );
		board[row][col] = false;
		
		
		
		//  not place
		queen_comb_2d_box(board, row, col+1, tq, qpsf, ans);

	}

}
