package corejava.classes;

public class Power {

	public static void main(String[] args)
	{
		System.out.println(power(2,10));
		System.out.println(powerUsingEvenOdd(2,10));
		System.out.println(modularPower(2,10,3));
	}
	
	private static long power(int base,int exponent)
	{
		//T(n) = n and S(n) = n
		if(exponent == 0)
		{
			return 1;
		}
		
		return base * power(base,exponent-1);
	}
	
	private static long powerUsingEvenOdd(int base,int exponent)
	{
		//T(n) = log n and S(n) = n
		if(exponent == 0)
		{
			return 1;
		}
		else if( exponent % 2 == 0 )
		{
			long temp = powerUsingEvenOdd(base, exponent/2);
			return temp*temp;
		}
		else
		{
			return base*powerUsingEvenOdd(base, exponent-1);
		}
	}
	
	private static long modularPower(int base,int exponent, int modulas)
	{
		// T(n) = log n and S(n) = n
		if(exponent == 0)
		{
			return 1;
		}
		else if( exponent % 2 == 0 )
		{
			long temp = modularPower(base, exponent/2, modulas);
			return (temp*temp) % modulas;
		}
		else
		{
			return ((base % modulas ) *(modularPower(base, exponent-1, modulas))) % modulas;
		}
	}

}
