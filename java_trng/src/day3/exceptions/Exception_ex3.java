package day3.exceptions;

public class Exception_ex3 {
	
	public static void main(String[] args)
	{
		int x = 40;
		int y = 10;
		
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
		finally
		{
			System.out.println("This statement executes irrespective of the fact that an exception occurs or not.");
		}
		
		System.out.println("Accurate Percentage is: " + calc_percentage(56.52, 300.00));
		System.out.println("Percentage is: " + calc_percentage(50, 100));
	}
	
	public static int divide(int x, int y)
	{
		int result = x / y;
		return result;
	}
	
	public static double calc_percentage(double marks_obtained, double total_marks)
	{
		return (marks_obtained / total_marks) * 100;
	}
	
	public static int calc_percentage(int marks_obtained, int total_marks)
	{
		return (marks_obtained / total_marks) * 100;
	}
}
