package day11.Assignments.q1;

public class PriceTooLowException extends Exception {
	
	public PriceTooLowException()
	{
		System.out.println("Price cannot be less than Rs. 5!");
	}
	
	public PriceTooLowException(String msg)
	{
		super(msg);
	}
}
