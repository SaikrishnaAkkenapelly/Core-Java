package corejava.classes;

import corejava.pojo.Cricketer;

public class CricketSelections {

	public static void main(String[] args) {

		Cricketer viratKohli = new Cricketer("Kohli",Cricketer.BATSMAN, 59.3d, 166.25d, 248);
		Cricketer rohitSharma = new Cricketer("Rohit",Cricketer.BATSMAN, 49.3d, 63.38d, 224);
		Cricketer sachinTendulkar = new Cricketer("Sachin",Cricketer.BATSMAN, 44.8d,44.5d, 463);
		Cricketer rahulDravid = new Cricketer("Dravid",Cricketer.BATSMAN, 39.2d,42.5d, 344);
		
		System.out.println("Are these two crickters are same talented ? "+viratKohli.equals(rohitSharma));
		
		Cricketer cricketers[] = new Cricketer[]{viratKohli,rohitSharma,sachinTendulkar,rahulDravid};
		
		Cricketer selectedCricketers[] = selectCricketers(cricketers,2);
		for (Cricketer cricketer : selectedCricketers)
		{
			System.out.println(cricketer.getName()+" is selected..");	
		}
	}

	private static  Cricketer[] selectCricketers(Cricketer cricketers[],int noOfCricktersToBeSelected)
	{
		if(noOfCricktersToBeSelected > cricketers.length)
		{
			throw new IllegalArgumentException("Incorrect arguments..");
		}
		else if(noOfCricktersToBeSelected == cricketers.length)
		{
			return cricketers;
		}
		else
		{
			sortCrickters(cricketers,0,cricketers.length-1);
			Cricketer selectedCricketers[] = new Cricketer[noOfCricktersToBeSelected];
			for (int index = 0; index < noOfCricktersToBeSelected; index++)
			{
				selectedCricketers[index] = cricketers[index];
			}
			return selectedCricketers;
		}
		
	}
	
	private static void sortCrickters(Cricketer cricketers[],int startIndex,int endIndex)
	{
		if(startIndex < endIndex)
		{
			int pivotCricketerIndex = partionCricketes(cricketers,startIndex,endIndex);
			sortCrickters(cricketers, startIndex, pivotCricketerIndex-1);
			sortCrickters(cricketers, pivotCricketerIndex+1,endIndex);
		}
	}

	private static int partionCricketes(Cricketer[] cricketers, int startIndex, int endIndex)
	{
		int partitionCricketerIndex = startIndex;
		Cricketer pivotCricketer  = cricketers[endIndex];
		for (int index = startIndex; index < endIndex; index++)
		{
			Cricketer betterCrickter = cricketers[index].compareWith(pivotCricketer);
			if(betterCrickter.equals(cricketers[index]))
			{
				swapCrickters(index,partitionCricketerIndex,cricketers);
				partitionCricketerIndex++;
			}
		}
		swapCrickters(partitionCricketerIndex,endIndex,cricketers);
		return partitionCricketerIndex;
	}
	
	private static void swapCrickters(int firstIndex,int secondIndex,Cricketer cricketers[])
	{
		Cricketer temporaryCricketer = cricketers[firstIndex];
		cricketers[firstIndex] = cricketers[secondIndex];
		cricketers[secondIndex] = temporaryCricketer;
	}

}
