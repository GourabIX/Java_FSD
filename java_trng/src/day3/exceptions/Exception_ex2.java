package day3.exceptions;

public class Exception_ex2 {
	
	public static void main(String[] args)
	{
		int x = 40;
		int y = 0;
//		int result = x / y;
		
		try
		{
			int result = divide(x, y);
			System.out.println("Result is: " + result);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " + e);
			// The return statement will not run if the exception is thrown.
			// Throwing an exception causes the control flow of your program to go immediately 
			// to the exception's handler(*), skipping anything else in the way.
		}
	}
	
	public static int divide(int x, int y)
	{
		int result = 0;
		try
		{
			result  = x / y;
		}
		catch (ArithmeticException exc)
		{
			System.out.println("Division by zero is not allowed.");
			throw exc;						// returns immediately with thrown exception to the caller
		}
		return result;
	}

}
