package e._7_and_8_recursion_;
import java.util.*;
public class power_ 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		int x = scn.nextInt();
		System.out.println(pow(num, x));
		
	}
	public static int pow(int n, int x)
	{
		if(x == 0) 
		{
			return 1;
		}
		
		
		return (int) (n*(Math.pow(n, x-1)));
	}

}
