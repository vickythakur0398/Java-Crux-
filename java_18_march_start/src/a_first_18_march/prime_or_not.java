package a_first_18_march;
import java.util.*;
public class prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int flag = 0;
		for(int i =  2;i<=a/2; i++) {
			if(a%i ==0) {
				flag++;
			}
		}
		if(flag==0) {
			System.out.println("prime");
			
		}else {
			System.out.println("not prime");
		}
	}

}
