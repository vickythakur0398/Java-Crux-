package a_first_18_march;
import java.util.*;
public class reverse_a_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	//	int digit = scn.nextInt();
		int sum =0;
		while(n!= 0) {
			int rem = n%10;
		//	sum += rem*Math.pow(10, digit);
			sum = sum*10+ rem; // just comment it and uncomment all we will get the same answer by second method
			//digit--;
			n= n/10;
			
		}
		System.out.println(sum);
	}

}
