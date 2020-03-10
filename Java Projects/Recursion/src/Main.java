import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) 
	{
		//Factorial
		List<Integer> FactorialList = new ArrayList<Integer>();

		Recursive factorial = new Recursive();

		FactorialList.add(factorial.Factorial(0));
		FactorialList.add(factorial.Factorial(1));
		FactorialList.add(factorial.Factorial(2));
		FactorialList.add(factorial.Factorial(3));
		FactorialList.add(factorial.Factorial(4));
		FactorialList.add(factorial.Factorial(5));
		
		//Fibonacci
		
		List<Integer> FibList = new ArrayList<Integer>();

		Recursive fibonacci = new Recursive();
		FibList.add(fibonacci.Fib(5));
		FibList.add(fibonacci.Fib(4));
		FibList.add(fibonacci.Fib(8));
		FibList.add(fibonacci.Fib(9));
		FibList.add(fibonacci.Fib(12));



		System.out.println("Factorial: ");

		for(int index=0;index<FactorialList.size();index++)
		{
			System.out.println(FactorialList.get(index));
		}
		System.out.println();
		System.out.println("Fibonacci Sequence: ");

		for(int index=0;index<FibList.size();index++)
		{
			System.out.println(FibList.get(index));
		}
	}

}
