package f._188_aprilbacktracking;
import java.util.*;
public class to_search_woed 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "SEE";
		for(int i =0; i< board.length; i++)
		{
			for(int j =0; j< board[0].length; j++)
			{
				
				if(board[i][j] ==word.charAt(0));
				search_word(board, word, i, j, 0,new boolean [board.length][board[0].length]);

			}
		}
		System.out.println(res);
		
	}
	static boolean res =false;
	public static void search_word(char [][] board, String word, int row, int col, int vidx, boolean[][] visited )
	{
		
		if(vidx== word.length())
			
		{
			res = true;
		//System.out.println("true");
		return;
		}
	
	if(row<0||row>=board.length||col<0|| col>=board[0].length||visited[row][col]== true)
	{
		return;
	}
	
	if(word.charAt(vidx) != board[row][col])
	{
		return ;
	}
		
		
		visited[row][col] = true;
		// top
		search_word(board, word, row-1, col, vidx+1, visited);
		//bottom
		search_word(board, word, row+1, col, vidx+1, visited);
		//left
		search_word(board, word, row, col+1, vidx+1, visited);
		//rt
		search_word(board, word, row, col-1, vidx+1, visited);
		visited[row][col] = false;
	}
}
