package f._188_aprilbacktracking;
import java.util.*;
public class coin_change_denomination 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//coin_den({2,3,5,6}, 0,10, " ");
		
		coin_den(new int[] {2,3,5,6}, 0,10, "");
		//coin_board_path(new boolean [2],3,5,6 );
	}
	public static  void coin_den(int [] arr, int vidx,int amt, String ans)
	{
		
		if(amt ==0)
		{
			System.out.println(ans);
			return;
		}
		if(vidx == arr.length)
		{
			return;
		}
		
		if(amt<0)
		{
			return;
		}
		
		
		
		
		
		// no coin use
		coin_den(arr, vidx+1, amt, ans );
		
		
		// coin use
		coin_den(arr, vidx, amt- arr[vidx] , ans+ ""+ arr[vidx] );
		
	}

}
