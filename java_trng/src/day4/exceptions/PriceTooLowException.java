package day4.exceptions;

public class PriceTooLowException extends Exception {
	
	public PriceTooLowException()
	{
		super("Price cannot be 0 or lesser!");
	}
	
	public PriceTooLowException(String msg)
	{
		super(msg);					// Used for sending specific reason for exception during coding
	}

}
