package a_first_18_march;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.println(sum);
		for(int i = 0; i< n; i++) {
			a = b;
			b = sum;
			sum = a+b;
			System.out.println(sum);
		}
	}

}
