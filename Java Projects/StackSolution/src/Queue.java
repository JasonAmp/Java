
public class Queue {

	Node Top;
	Node Last;

	
	public void Enqueue(int data) 
	{
		
		try {	Node NewNode = new Node(data);
		if(Last != null) { Last.Next = NewNode; }
		Last = NewNode;
		if(Top==null) {	Top = NewNode;}
		}
		catch(NullPointerException e) {	System.out.println("Null Exception");}
		
		
	}
	
	public int Dequeue() 
	{
		int data = Top.Data;
		Top = Top.Next;
		if(Top == null )
		{
			Last=null;

		}
		return data;
	}
	
	public void DisplayQueue() 
	{
		try 
		{
			Node tempNode = Top;
			while(tempNode != null) 
			{
				System.out.println(tempNode.Data);
				tempNode = tempNode.Next;
			}
				
		}
		catch(NullPointerException e)
		{
			System.out.println("Queue is Empty");

		}

	}


}
