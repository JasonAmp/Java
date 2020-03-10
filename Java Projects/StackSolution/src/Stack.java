
public class Stack {

	Node Top;
	
	public int Insert(int data)
	{
		try {
			
			Node newNode = new Node(data);
			newNode.Next=Top;
			Top = newNode;
			
		}
		catch(NullPointerException e)
		{
			
			System.out.println("Null Reference");
		}
		return data;

	}
	
	public int Peek() {return Top.Data;}
	
	public void Pop()
	{
		try 
		{	
			
			int data = Top.Data;

			data = Top.Data;
			Top = Top.Next;
		}
		catch(NullPointerException e)
		{
			System.out.println("Stack is Empty");
		}

		
	}
	
	public void DisplayStack() 
	{
		Node tempNode = Top;
		if(Top == null)
		{
			System.out.println("Stack is Empty");
		}
		while(tempNode != null) 
		{
			System.out.println(tempNode.Data);
			tempNode = tempNode.Next;
		}
			
	}
	
	
	
	

}
