package e._7_and_8_recursion_;
import java.util.*;
public class fibonacci 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		System.out.println(fibo(num));
		
	}
	public static int fibo(int num)
	{  
		if(num == 0 || num ==1 )
		{
			return num;
		}
		int f1= fibo(num-1);
		int f2 = fibo(num-2);
		int fn = f1+f2;
		return fn;
	}
}
