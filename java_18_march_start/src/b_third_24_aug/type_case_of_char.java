package b_third_24_aug;
import java.util.*;
public class type_case_of_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		
		if(ch>= 'a' && ch<= 'z') {
			System.out.println("Lower");
		}else if(ch>= 'A' && ch<= 'Z') {
			System.out.println("Upper");
		}else {
			System.out.println("invalid");
		}
		
		

	}

}
