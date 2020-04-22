package e._7_and_8_recursion_;
import java.util.*;
public class factorial 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		//System.out.println(factoria(num));
		System.out.println(factoria(num));
	}
	public static int factoria(int num)
	{
		if( num == 0 )
		{
			return 1;
		}
		
		return (num*factoria(num-1));
		/*int fn1 = factoria(num-1);
		int res = fn1*num;
		return res;*/
		
		
			}

}
