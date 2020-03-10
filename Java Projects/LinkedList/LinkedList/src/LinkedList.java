
public class LinkedList {

	
	Node Head;
	int Count=1;
	
	public void Push(int data) 
	{
		
		Node NewNode = new Node(data);
		NewNode.Next = Head;
		Head = NewNode;
	}
	public int Count() 
	{
		Node Temp = Head;
		while(Temp.Next!=null)
		{
			Count++;
			Temp= Temp.Next;
		}
		return Count;
	}

}
