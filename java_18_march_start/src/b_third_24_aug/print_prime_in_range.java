package b_third_24_aug;
import java.util.*;
public class print_prime_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scn = new Scanner(System.in);
	int a = scn.nextInt();
	int b = scn.nextInt();
	print_prime( a, b);
	
	
		

	}public static boolean prime_or_nor(int a ) {
		int flag = 0;
		for(int i = 2; i<= a/2 ; i++) {
			if(a%i ==0) {
				flag = 1;
			}
		}if(flag ==0) {
			return true;
		}
		return false;
	}public static void print_prime(int a, int b) {
		for(int i = a; i<= b; i++) {
			boolean res = prime_or_nor(i);
			if(res== true) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
	}

}
