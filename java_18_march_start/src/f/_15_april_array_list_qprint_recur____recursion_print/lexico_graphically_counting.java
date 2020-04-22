package f._15_april_array_list_qprint_recur____recursion_print;
import java.util.*;
public class lexico_graphically_counting 
{
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		lexico(0,10000);
	}
	public static void lexico(int start, int end)
	{
		if(start>end)
		{
			return;
		}
		System.out.println(start);
		int i = 0;
		if(start == 0)
		{
			 i =1;
		}	
		
		
		
		while(i<10)
		{
			lexico(start*10+i, end);
			
			i++;
		}
		
			}

}
