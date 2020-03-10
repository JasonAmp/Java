
public class Queue {

	private static class Node
	{
		private int Data;
		private Node Next;
		
		private Node(int Data)
		{
			this.Data=Data;
		}
	}
	
	Node Head; //remove from head.
	Node Tail; // add to tail.
	
	public boolean IsEmpty() 
	{
		return Head == null;
	}
	
	public int Peek() {
		
		if(Head != null)
		{
			return Head.Data;

		}
		return 0;
	}
	
	public void Add(int data) 
	{
		Node NewNode = new Node(data);
		if(Tail != null)
		{
			Tail.Next = NewNode;

		}
		Tail = NewNode;
		if(Head == null)
		{
			Head = NewNode;
		}
		
	}
	
	public int Remove() 
	{
		int data = Head.Data;
		Head = Head.Next;
		if(Head == null )
		{
			Tail=null;

		}
		return data;
	}
	
	

}
