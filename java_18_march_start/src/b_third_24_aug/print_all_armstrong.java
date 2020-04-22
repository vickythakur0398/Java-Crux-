package b_third_24_aug;
import java.util.*;
public class print_all_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		//System.out.println(is_armstrong(153));
		for(int i = a; i<= b; i++) {
			boolean res = is_armstrong(i);
			if(res == true) {
				System.out.println(i);
			}
		}
		
		
		
	}public static int digit(int a) {
		int count = 0;
		while(a != 0) {
			//int rem = a%10;
			count++;
			a = a/10;
		}
		return count;
	}public static boolean is_armstrong(int a) {
		int temp = a;
		int sum = 0;
		int count = digit(a);
		while(a!=0) {
			int rem = a%10;
			sum += Math.pow(rem, count);
			
			
			
			a = a/10;
		}
		if(temp == sum) {
			return true;
		}
		return false;
	}

}
