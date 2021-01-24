/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args)
	{
	    Scanner scn = new Scanner(System.in);
	    int num = scn.nextInt();
	    int num2 = scn.nextInt();
	    int min = Math.min(num, num2);
	    
	    for(int i = min; i >= 1; i--)
	    {
	        if((num % i == 0)&& (num2% i == 0))
	        {
	           System.out.println(i);
	           break;
	        }
	    }
	}
}
