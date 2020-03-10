
public class LinkedList2 {

	Node Head;
	
	
	public void Push(int Data) 
	{
		Node NewNode = new Node(Data);
		NewNode.next = Head;
		Head = NewNode;
	}
	
	public void PrintNodes( ) 
	{
		Node currentNode = Head;
		
		while(currentNode != null)
		{
			System.out.println(currentNode.data);
			currentNode = currentNode.next;

		}
	}
}
