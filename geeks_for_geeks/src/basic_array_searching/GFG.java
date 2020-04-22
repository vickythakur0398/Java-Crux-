package basic_array_searching;



import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {  static Scanner scn = new Scanner(System.in);
 public static void main(String[] args) 
	

	{
	    int tc = scn.nextInt();
	    for(int t = 0; t< tc; t++)
	    {
	        int size = scn.nextInt();
	        int k = scn.nextInt();
	        int [] arr = new int[size];
	        for(int l = 0; l <arr.length; l++)
	        {
	            arr[l] = scn.nextInt();
	        }
	        //int first_break = scn.nextInt();
	        
	       // display(arr);
	        reverse( arr, k);
	        display(arr);

	        System.out.println();
	    }
	}
	public static void reverse(int[] arr, int k)
	{   
	    
	     for(int i = 0; i< arr.length; i = i+k )
	    {
	        int start = i;
	        
	        int end = Math.min(i+k-1, arr.length-1); // if k is less than array varna out of bound aa jefa to isme jo min hoga use lega k
	        while(start<= end)
	        {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            
	            
	            start++;
	            end--;
	        }
	        
	        
	        
	        
	        
	    }
	}
	public static void display(int[] arr)
	{
	    for(int i:arr)
	    {
	        System.out.print(i + " ");
	    }
	}
	 
 }

/*class GFG{
static Scanner scn = new Scanner(System.in);
 
	public static void main (String[] args)
	{
	    int tc = scn.nextInt();
	    for(int t =0; t< tc; t++)
	    {
	        int size = scn.nextInt();
	        int [] arr = new int [size];
	        
	        for(int i =0; i<= arr.length-1; i++)
	        {
	            arr[i] = scn.nextInt();
	        }
	        printLeaders(arr, size);
	        System.out.println();
	    }
	}
	
	public static void printLeaders(int arr[], int size) 
    { 
        int max_from_right =  arr[size-1]; 
   
        /* Rightmost element is always leader 
        System.out.print(max_from_right + " "); 
       
        for (int i = size-2; i >= 0; i--) 
        { 
            if (max_from_right < arr[i]) 
            {            
            max_from_right = arr[i]; 
            System.out.print(max_from_right + " "); 
            } 
            
           // System.out.println();
        }     
    } 

	 
}













/*import java.util.*;

public class GFG 
{
    static Scanner scn = new Scanner(System.in);
	public static void main (String[] args)
	{
	 int tc = scn.nextInt();
	 for(int i = 0; i< tc; i++)
	 {
	     int n = scn.nextInt();
	     int [] arr = new int[n];
	     for(int k = 0; k<= arr.length-1; k++)
	     {
	         arr[k] = scn.nextInt();
	     }
	     
	     rverse(arr);
	     ArrayList<Integer> arrn = leader_array(arr);
	   // System.out.println(leader_array(arr));
	    // System.out.println(rverse(arr));
	    //System.out.println(reverseArrayList((leader_array(arr))));
	   // ArrayList<Integer> arrn = reverseArrayList((leader_array(arr)));
	   /* for(int l =0; l<= arrn.size(); l++) {
	    	System.out.print(arrn.get(l) + " ");
	    	System.out.println();
	    }
	    
	    for(int l =arrn.size() ;l >= 0; l--)
	    	
	    {
	    	System.out.print(arrn.get(l) + " ");
	    }
	    System.out.println();
	   // System.out.println( reverseArrayList((leader_array(arr))));
	    
	     
	 }
	 
	}
	public static ArrayList<Integer> leader_array(int[] arr )
	{
	    //Array List<Integer> list = new Array List();
		//int max = -1;
		
	    ArrayList<Integer> list = new ArrayList<>();
	  int max =  arr[arr.length-1];
	   System.out.print(max + " " );
	    for(int k = arr.length-2; k >= 0; k--)
	    {
	        if(arr[k] >= max)
	        {
	            list.add(arr[k]);
	            max = arr[k];
	        }
	    }
	   // revere( list);
	    return list;
	}
	
	
	public static int [ ] rverse(int[] arr)
	{
		int i = 0;
		int j = arr.length-1;
		while(i<= j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			
			i++;
			j--;
		}
		return arr;
	}
	
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) 
    {
        { 
           
            for (int i = 0; i < list.size() / 2; i++) { 
                Integer temp = list.get(i); 
                list.set(i, list.get(list.size() - i - 1)); 
                list.set(list.size() - i - 1, temp); 
            } 
      
            // Return the reversed arraylist 
            return list; 
        } 

    }

	
	
	 
}

/*
 package basic_array_searching;
import java.util.*;

public class GFG 
{
    static Scanner scn = new Scanner(System.in);
	public static void main (String[] args)
	{
	 int tc = scn.nextInt();
	 for(int i = 0; i< tc; i++)
	 {
	     int n = scn.nextInt();
	     int [] arr = new int[n];
	     for(int k = 0; k<= arr.length-1; k++)
	     {
	         arr[k] = scn.nextInt();
	     }
	     
	     rverse(arr);
	     ArrayList<Integer> arrn = leader_array(arr);
	   // System.out.println(leader_array(arr));
	    // System.out.println(rverse(arr));
	    //System.out.println(reverseArrayList((leader_array(arr))));
	   // ArrayList<Integer> arrn = reverseArrayList((leader_array(arr)));
	   /* for(int l =0; l<= arrn.size(); l++) {
	    	System.out.print(arrn.get(l) + " ");
	    	System.out.println();
	    }
	    
	    for(int l =arrn.size() ;l >= 0; l--)
	    	
	    {
	    	System.out.print(arrn.get(l) + " ");
	    }
	    System.out.println();
	   // System.out.println( reverseArrayList((leader_array(arr))));
	    
	     
	 }
	 
	}
	public static ArrayList<Integer> leader_array(int[] arr )
	{
	    //Array List<Integer> list = new Array List();
		int max = -1;
		
	    ArrayList<Integer> list = new ArrayList<>();
	  //  list.add(arr[arr.length-1]);
	    for(int k = 0; k <= arr.length-1; k++)
	    {
	        if(arr[k] >= max)
	        {
	            list.add(arr[k]);
	            max = arr[k];
	        }
	    }
	   // revere( list);
	    return list;
	}
	
	
	public static int [ ] rverse(int[] arr)
	{
		int i = 0;
		int j = arr.length-1;
		while(i<= j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			
			i++;
			j--;
		}
		return arr;
	}
	
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) 
    {
        { 
           
            for (int i = 0; i < list.size() / 2; i++) { 
                Integer temp = list.get(i); 
                list.set(i, list.get(list.size() - i - 1)); 
                list.set(list.size() - i - 1, temp); 
            } 
      
            // Return the reversed arraylist 
            return list; 
        } 

    }

	
	
	 
}



  
*/