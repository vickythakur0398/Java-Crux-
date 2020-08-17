package stack;

public class StackBasicClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//to sabse pehle jisko lena h uska refrence 
		Basic_opertaion_in_stack s = new Basic_opertaion_in_stack();
		
		
		//jab hum ye sab kar rhe to hume ise koi mtlb nhi h ki ye kese ho rha h kyuki hum ek abstract layer pe kaam kar rhe jese array list me karte h
		//hume kya pata vo andar kese manage krta h(pata to h vese :-))
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(80);  //error aiega ab 6 element dala to 



		System.out.println(s.isFull());

		s.display();
		System.out.println(s.pop());
		s.display();
		System.out.println(s.pop());
		System.out.println(s.isFull());

		s.display();
		System.out.println(s.isEmpty());
		s.pop();
		s.pop();
		s.pop();
		s.display();
		System.out.println(s.isEmpty());


	}

}
