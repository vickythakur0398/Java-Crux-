package e._7_and_8_recursion_;
import java.util.*;
public class print_increasing 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		int num = scn.nextInt();
		print_increasing( num);
	}
	public static void print_increasing(int num)
	{
		
		if(num ==0)
		{
			return;
		}
		
		
		print_increasing(num-1);
		System.out.println(num);
		
	}

}
