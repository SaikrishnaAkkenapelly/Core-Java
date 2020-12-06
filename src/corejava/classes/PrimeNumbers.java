package corejava.classes;

public class PrimeNumbers {

	public static void main(String[] args)
	{
		// Calculation of sum of prime numbers under a given number
		
		long sum = 0;
		int under = 1000000;
		
		for(int number = 0 ; number < under ; number++)
		{
			if(isPrime(number))
			{
				sum = sum + number;
				System.out.print(" "+number+",");
			}
		}
		
		System.out.println("\n sum : " + sum);
		
	}

	private static boolean isPrime(int number)
	{
		int index = 2;
		
		if(number < index)
		{
			return false;
		}
		
		/* After square root of a number, the factors just repeat
		 * so if there are no factors before square root then
		 * there will be no factors after square root also
		 * so no need to check after square root
		 * NUMBER OF FACTORS BEFORE SQRT ARE ALWAYS EQUALS AFTER SQRT */
				
		for(index = 2 ; index <= Math.sqrt(number); index++)
		{
			if(number % index == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
}
