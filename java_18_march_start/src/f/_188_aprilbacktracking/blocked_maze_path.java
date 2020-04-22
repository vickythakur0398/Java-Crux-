package f._188_aprilbacktracking;
import java.util.*;
public class blocked_maze_path 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int[][] board = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };

		//int [][] board = {{0,1,0,0,0},{0,0,0,0,},{0,1,0,0},{0,0,1,0}};
		block_maze( board,  0 , 0  , new boolean[board.length][board[0].length] , "");
	}
	public static void block_maze(int [][] board, int row, int col,boolean[][] visited, String ans)
	{
		
		if(row==board.length-1 && col == board[0].length-1)
		{
			System.out.println(ans);
			return;
		}
		
		
		if(row<0|| row>= board.length|| col< 0|| col>= board[0].length||board[row][col] == 1||visited[row][col]== true )
		{
			return;
		}
		visited[row][col] = true;
		
		// bottom
		block_maze(board, row+1, col, visited,ans+ "B");
		
		
		//top
		block_maze(board, row-1, col, visited, ans+"T" );
		
		
		// left
		block_maze(board, row, col-1, visited, ans+"L");
		
		
		// rt
		block_maze(board, row, col+1, visited, ans+ "R" );
		
		
		visited[row][col] = false;

		
		
		
		
		
		
	}

}
