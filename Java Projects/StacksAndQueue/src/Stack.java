
public class Stack {
	
	private static class Node
	{
		private int Data;
		private Node Next;
		
		private Node(int Data)
		{
			this.Data=Data;
		}
	}
	
	Node Top;
	
	boolean IsEmpty() {return Top == null;}
	public int peek() {return Top.Data;}
	public void push(int Data) 
	{
		Node node = new Node(Data);
		node.Next = Top;
		Top = node;
		
	}
	public int pop() 
	{
		int data = Top.Data;
		Top = Top.Next;
		return data;
		
		
	}
}
