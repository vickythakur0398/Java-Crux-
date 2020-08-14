/*
For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.

Example 1:

Input:
N = 5
Output: Yes
Explanation: 5 is a prime number.
Example 2:

Input:
N = 4
Output: No
Explanation: 4 is not a prime number.
Your Task:
You don't need to read input or print anything. Your task is to complete the function isPrime() that takes N as parameter and returns True if N is prime else returns false. 

Expected Time Complexity : O(N1/2)
Expected Auxilliary Space :  O(1)

Constraints:
1 <= N <= 109


*/



// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    Primality  obj=new Primality ();
		    int N;
		    N=sc.nextInt();
		    if(obj.isPrime(N))
		    System.out.println("Yes");
		    else
		    
		    System.out.println("No");
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Primality 
{
    
    public boolean isPrime(int N)
    {
     
      if(N==1)
    {
        return false;
    }
    if(N==2)
    {
        return true;
    }
    int flag =0;
    for(int i =2; i <=Math.sqrt(N); i++)
    {
        if(N%i==0)
        {
            return false;
            // flag = 1;
        }
       
    }
    return true;
    }
   
}

