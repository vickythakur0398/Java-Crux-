package Queue;

public class queue {
	
	private int data[];
	private int front = 0; //to keep track of element for removal location
	 private int size = 0; // to keep track of elemnt where it is added locatn
	
	
	
	public queue()
	{
		this.data = new int [5];
		this.front =0;
		this.size =0;
	}
	
	public queue (int size)
	{
		this.data = new int [size];
		this.front =0;
		this.size=0;
	}
	
	
	public void enqueue(int item) throws Exception
	{
		if(isFull())
		{
			throw new Exception("is already fiiled");
		}
		int a = (front +size)%data.length; //making it circular so that queue puri utilise ho
		data[a] = item;
		size++;
	}
	
	
	public int dequeue() throws Exception 
	{
		if(isEmpty())
		{
			throw new Exception("Queue is empty");
		}
		int temp = data[front];
		data[front] = 0;
		front = (front+1)%data.length; //making it circular so that front must not move out of boundary
		size--;
		
		return temp;
	}
	
	
	public void display()
	{
		for(int i =0 ; i< size; i++)
		{
			int idx = (i+front)%data.length;
			System.out.print(data[idx] + " ");
		}
		
		System.out.println();
	}

	public int getFront() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Q is full.");
		}
		int temp = data[front];
		return front;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return (size()==0);
			
	}
	 
	
	public boolean isFull()
	{
		return size()== data.length;
	}
	
}
