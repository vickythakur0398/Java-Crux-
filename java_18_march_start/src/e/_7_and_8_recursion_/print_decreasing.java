package e._7_and_8_recursion_;
import java.util.*;
public class print_decreasing {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		print_decreasing(num);

	}
	public static void print_decreasing(int num) 
	{
		if(num ==0)
		{
			return;
		}
		
		System.out.println(num);
		print_decreasing(num-1);
		
		
		
	}

}
