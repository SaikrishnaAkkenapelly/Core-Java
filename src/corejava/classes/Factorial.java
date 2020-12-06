package corejava.classes;

public class Factorial {

	public static void main(String[] args)
	{
		System.out.println(findFactorialUsingIteration(10));
		System.out.println(findFactorialUsingrecursion(0));
	}
	
	private static long findFactorialUsingIteration(int number)
	{
		long factorial = 1;
		
		while(number > 1)
		{
			factorial = factorial * number;
			number--;
		}
		
		return factorial;
	}
	
	private static long findFactorialUsingrecursion(int number)
	{
		if(number > 1)
		{
			return number * findFactorialUsingrecursion(number-1);
		}
		return 1;
	}

}
