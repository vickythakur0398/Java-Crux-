package TCS;
import java.util.*;
public class patterns {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a = scn.nextInt();
//		for(int i =0; i< a; i++)
//		{
//			System.out.println("*");
//			
//		}
		
		square(a);
		sptraingle(a);
		spt(a);

	}
	public static void square(int a)
	{
		for(int i =0; i< a; i++)
		{
			for(int j =0; j<a; j++  )
			{
				System.out.print("*"+ " ");
			}
			
			System.out.println();
		}
	}
	
	public static void traingle(int n)
	{
		for(int row = 0; row<n; row++)
		{
			for(int col = 0; col< row; col++)
			{
				System.out.print(row+ " ");
			}
			
			System.out.println();
		}
	}
	
	public static void sptraingle(int n)
	{
		for(int i =0; i<n; i++)
		{
			//csp
			for(int csp =n-1; csp> i; csp--)
			{
				System.out.print(" "+ " ");
			}
			//nst
			for(int nst = 0; nst< i; nst++ )
			{
				System.out.print("*"+ " ");
			}
			
			System.out.println();
		}
	}
	
	public static void spt(int n)
	{
		int x= 1;
		for(int i =0; i< n; i++)
		{
			//csp
			for(int csp = n-1; csp> i ; csp--)
			{
				System.out.print(" "+ " ");
			}
			
			////nst
			for(int nst = 0; nst <(2*i)+1; nst++)
			{
				System.out.print(x+ " ");
				x++;
			}
//			x++;
			System.out.println();
		}
	}

}
