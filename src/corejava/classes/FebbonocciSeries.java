package corejava.classes;

import java.util.ArrayList;

public class FebbonocciSeries {

	private static ArrayList<Long> febSeries = new ArrayList<>();
	
	public static void main(String[] args)
	{
		for(int index = 0 ; index < 50 ; index ++)
		{
			System.out.print(getFebbonocciNumberUsingRecursion(index)+",");
		}
		
		System.out.println("");
		
		for(int index = 0 ; index < 50 ; index ++)
		{
			System.out.print(getFebbonocciNumberUsingIteration(index)+",");
		}
		
		febSeries.add(0l);
		febSeries.add(1l);
		
		System.out.println("");
		
		for(int index = 0 ; index < 50 ; index ++)
		{
			System.out.print(getFebbUsingRecWithMemoization(index)+",");
		}
	}

	private static long getFebbonocciNumberUsingRecursion(int index)
	{
		if(index == 0 || index == 1)
		{
			return index;
		}
		// this is the worst logic since it recalculates the same many times and T(n) = 2^n and S(n) = n
		return getFebbonocciNumberUsingRecursion(index -1) + getFebbonocciNumberUsingRecursion(index-2);
	}
	
	private static long getFebbonocciNumberUsingIteration(int index)
	{
		// good logic T(n) = n
		if(index == 0 || index == 1)
		{
			return index;
		}
		
		int count = 1;
		long firstNumber = 0;
		long secondNumber = 1;
		long result = 0;
		while(count < index)
		{
			result = firstNumber + secondNumber;
			count++;
			firstNumber = secondNumber;
			secondNumber = result;
		}
		
		return result;
	}
	
	private static long getFebbUsingRecWithMemoization(int index)
	{
		// this is optimized form of using recursion called as recursion with memoization avoids recalculation
		if(febSeries.size()-1 < index)
		{
			febSeries.add(getFebbUsingRecWithMemoization(index-1) + getFebbUsingRecWithMemoization(index-2));
		}
		// T(n) = n but S(n) = n
		return febSeries.get(index);
	}
}
