
public class Recursive {

	
	
	
	public int Factorial(int n)
	{
		if(n < 1)
		{
			return 1;
		}
		return n*Factorial(n-1);
	}
	
	public int Fib(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		else
		{
			return Fib(n-1)+Fib(n-2);		
		}
		
		
	}

}
