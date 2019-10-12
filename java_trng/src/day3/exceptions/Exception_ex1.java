package day3.exceptions;

public class Exception_ex1 {
	
	public static void main(String[] args)
	{
		int x = 40;
		int y = 0;
//		int result = x / y;
//		System.out.println("Result is: " + result);
		
		divide(x, y);
	}
	
	public static void divide(int x, int y)
	{
		try
		{
			int result = 0;
			result  = x / y;
			System.out.println("Result is: " + result);
		}
		catch (ArithmeticException exc)
		{
			System.out.println(exc);
		}
	}

}
