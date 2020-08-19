package stack;

public class Basic_opertaion_in_stack {

		//mene try catch use nhi kia bas throw karaya h to muje main me client ke throw karani hogi

	//ye mene class bana li h isme basic opration h ise use karunga jab jarurat hogi 
	
	
	int [] data;  //yaha humne initialise kar dia 
	int tos = -1;  //top of index to initially ye -1 pe hoga 
	
	//pehle me bydefault constructur daal rha hu ki agar stack ka size nhi to ye karo mtlb me by default size 5 dall rha hu
	public  Basic_opertaion_in_stack()
	{
		data = new int[5];
		//this.data is also same but if use int [] data to bilkul galat ho ajega islie its good to use this jise ye data jo hmne upar bananay h vahi ho
		this.tos =-1;
		
	}
	//agar user ne size specify kia h call karte vakt agar naam(5i.e size) aisa dia ho to ye chalega
	public Basic_opertaion_in_stack(int size)
	{
		this.data = new int[size];
		this.tos = -1;
	}
	
	
	//ab me iske andar me alag alag function banaunga 
	public void push  (int item) throws Exception
	{
		//agar ye full hua to bharega to error dega
		if(isFull())
		{
			throw new Exception("Stack is full");
			//we have two option either use try and catch and handle the exception here or simply throw error to the next
		}
		tos++;
		data[tos] = item;
		
	}
	
	//pop
	
	public int pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("stack is empty");
		}
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		return temp;
	}
	
	//peak
	public int peak() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("stack is emptyyy");
		}
		return data[tos];
	}

	//isempty
	public boolean isEmpty()
	{
//		return data.length== 0;   // to agar length 0 hua to to true or false
		return size()== 0;
	}
	
	
	//is full
	public boolean isFull()
	{
		return size()== data.length;
	}
	
	
	//size
	public int size()
	{
		return tos+1;
	}
	
	// display
	
	public void display()
	{
		for(int i =tos; i>=0; i--)
		{
//			int dis = data[tos];
			System.out.print( data[i] + " ");
		}
	}
	
}
