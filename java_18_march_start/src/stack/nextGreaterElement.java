package stack;
import java.util.*;
public class nextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {50,20,10,40,30,60,15,5};
		Stack<Integer> s = new Stack<>();
		
		
		for(int i =0; i< arr.length; i++)
		{
			//if my array element is greater then the first elemt of stack simply pop that till its smaller
			while(!s.isEmpty()&& arr[i] > s.peek())
			{
				
				System.out.println(s.pop() + "->" + arr[i]);
			}
			
			s.push(arr[i]);
			
			
		}
		
		while(!s.isEmpty())
		{
			System.out.println(s.pop() + "->"+ -1);

		}

	}

}
