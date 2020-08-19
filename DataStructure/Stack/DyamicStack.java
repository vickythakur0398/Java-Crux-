package stack;
//import package ka naam agar dusre package me parent hai to
public class dyanimcStack extends Basic_opertaion_in_stack  {
	
	
	@Override
	public void push(int item) throws Exception
	{
		if(isFull())
		{
			int[] newArray = new int[data.length*2];
			
			for(int i =0; i< data.length; i++)
			{
				newArray[i] = data[i];
			}
			
			
			//ab refrence change karna hai jise ki nae array pe point kare
			data = newArray;
		}
		a
		//ab baki push me to same kaam h or vo pehle se hi parent me bana hua h to 
		//push(10);//ye karenge to yai wala push call ho jaega hume to parent wala karna h thats why we use super
		super.push(item); // error aiega agar error handle nhi kia to kyuki parent ko pata nhi h size pehle hi handle ho chuka h 
	}
	

}
