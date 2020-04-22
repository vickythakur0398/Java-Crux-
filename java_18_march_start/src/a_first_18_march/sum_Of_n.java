package a_first_18_march;
import java.util.*;
public class sum_Of_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		
		int sum = 0; 
		int i =1;
		while(i<= a) {
			
			sum = sum+i;
			
			
			
			i++;
		}
		System.out.println(sum);
	}

}
