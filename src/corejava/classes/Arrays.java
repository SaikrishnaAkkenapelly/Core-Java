package corejava.classes;

public class Arrays {

	public static void main(String[] args) {
		
		understandArrays();
	}

	private static void understandArrays()
	{
		/* When array with primitive data types were created all its values are initialized to their defaults
		 * int = 0
		 * float = 0.0
		 * boolean = false
		 * char = (char)0 */
		
		int[] studentIds = new int[10];
		System.out.println("Id of 2nd Student is :"+ studentIds[2]);
		
		/* In java maximum index can of an array is 2^32 */
		
		int length = 1000;
		int subjects[] = new int[length * length * length * length];
		
		/* In java objects should not be compared like this */
		
		int rollNumbers[] = {1,2,3};
		int grades[] = {1,2,3};
		System.out.println("This will return false :"+ (rollNumbers == grades));
	}
}
