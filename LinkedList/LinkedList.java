package linkedList;

public class LinkedList {
	
	private class Node
	{
		int data ;
		Node next;
	}
	
	Node head;
	int size;
	Node tail;
	
	
	//isEmpty
	public boolean isEmpty()
	{
		return size==0;
	}
	
	//getFirst
	public int getFirst() throws  Exception
	{
		if(size==0)
		{
			throw new Exception("ll is empty");
		}
		
		
		return head.data;
		
		
	}
	
	
	
	//getlast 
	public int getLast() throws Exception 
	{
		if(size==0)
		{
			throw new Exception("ll is empty");
			
		}
		
		return tail.data;
		
		
	}
	
	
	//getAt index
	public int getAt(int indx) throws Exception
	{
		if(size ==0)
		{
			throw new Exception("ll is empty");
		}
		if(indx <0 || indx >= size)
		{
			throw new Exception("ll is empty");

		}
		
		Node temp = head;
		
		for(int i =1; i<= indx; i++)
		{
			temp = temp.next;
		}
		
		return temp.data;
		
		
		
	}
	
	
	//display
	public void display()
	{
		Node temp = head;
		while(temp !=null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	
	public void addLast(int item)
	{
		
		//create new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		//linking 
		if(size>0)
		{
			tail.next =nn; // agar zero se bada h to bas last eale me tail se link karde
		}
		//size 0 h to ye hi pehli element h
		if(size==0)
		{
			head = nn;// jo head h vo hi pehla address store karega
			tail = nn; //tail bhi same 
			size++;
		}
		//or jab se size 1 to ye 
		else
		{
			tail = nn;
			size++;
		}
	}
}
	


