package corejava.classes;

public class QuickSort {

	public static void main(String[] args) {

		int marks[] = new int[]{7,2,1,6,8,5,3,4};
		quickSort(marks,0,marks.length-1);
		for (int subjectMarks : marks)
		{
			System.out.println(subjectMarks);
		}
	}

	private static void quickSort(int[] marks, int startIndex, int endIndex)
	{
		if(startIndex < endIndex)
		{
			int partionIndex = createPartion(marks,startIndex,endIndex);
			quickSort(marks, startIndex, partionIndex-1);
			quickSort(marks, partionIndex+1, endIndex);
		}
	}

	private static int createPartion(int[] marks, int startIndex, int endIndex)
	{
		int pivotIndex = endIndex;
		int partionIndex = startIndex;
		for (int index = startIndex; index < marks.length; index++)
		{
			if(marks[index] <= marks[pivotIndex])
			{
				swap(index,partionIndex,marks);
				partionIndex++;
			}
		}
		swap(partionIndex,pivotIndex,marks);
		return partionIndex;
	}

	private static void swap(int index1, int index2, int[] marks)
	{
		int temp = marks[index1];
		marks[index1] = marks[index2];
		marks[index2] = temp;
		
	}

}
