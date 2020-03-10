
public class Array {

	String [] Array;
	public Array() 
	{
		Array = new String[10];
	}
	
	
	public void Push(String Data, int Index_position)
	{
		for(int i=Array.length-1; i > Index_position; i--)
		{
			Array[i] = Array[i-1];
		}
		Array[Index_position] = Data;
		
			
	}
	
	public void Print() 
	{
		for(int i=0;i<Array.length;i++)
		{
			System.out.println(Array[i]);
		}
	}
	
	public boolean Search(String Data)
	{
		boolean found = false;
		for(int i=0;i<Array.length;i++)
		{
			if(Array[i]==Data)
			{

				found = true;
			}
		}
		return found;
	}

}
