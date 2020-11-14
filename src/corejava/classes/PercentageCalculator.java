package corejava.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentageCalculator {

	public static void main(String[] args) {
		
		calculatePercentage(new int[]{12,33,56},300);
	}

	private static void calculatePercentage(int marks[],int total)
	{
		long sum = 0l;
		
		for(int mark : marks)
		{
			sum = sum + mark;
		}
		
		BigDecimal percentage = new BigDecimal(((double)sum/total)*100);
		percentage = percentage.setScale(2, RoundingMode.HALF_UP);
		
		System.out.println("Percentage :" + percentage.doubleValue());
		
	}
	
}
