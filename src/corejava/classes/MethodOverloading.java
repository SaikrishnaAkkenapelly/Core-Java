package corejava.classes;

public class MethodOverloading {
	
	public static void main(String[] args) {

		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1,'A'));
		System.out.println(add('B',2));
	}
	
	private static long add(int input1,int input2)
	{
		return input1+input2;
	}
	
	/* add method is overloaded by changing number of arguments */
	
	private static long add(int input1,int input2, int input3)
	{
		return input1+input2;
	}
	
	/* add method is overloaded by changing arguments data types */
	
	private static long add(int input1,char input2)
	{
		return input1+input2;
	}
	
	/* add method is overloaded by changing arguments sequence */
	
	private static long add(char input1,int input2)
	{
		return input1+input2;
	}
	
	/* constructors can also be overloaded in the same way which is constructor overloading
	 * return types, access specifiers of methods are not considered in method overloading, they can be anything */
	
}
