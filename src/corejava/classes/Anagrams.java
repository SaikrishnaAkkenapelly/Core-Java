package corejava.classes;

public class Anagrams {

	public static void main(String[] args) {

		if(areAnagrams("A decimal point","I'm a dot in place"))
		{
			System.out.println("Given 2 Strings are Anagrams");
		}
		else
		{
			System.out.println("Given 2 Strings are not Anagrams");
		}
	}
	
	private static boolean areAnagrams(String input1, String input2)
	{
	
		int count[] = new int[26];
		
		for(char c : input1.toUpperCase().toCharArray())
		{
			if(Character.isAlphabetic((int)c))
				count[((int)c)-65]++;
		}
		
		for(char c : input2.toUpperCase().toCharArray())
		{
			if(Character.isAlphabetic((int)c))
				count[((int)c)-65]--;
		}
		
		for(int i : count)
		{
			if( i != 0)
				return false;
		}
		
		return true;
	}

}
