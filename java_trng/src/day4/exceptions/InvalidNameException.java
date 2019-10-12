package day4.exceptions;

public class InvalidNameException extends Exception {
	
	public InvalidNameException()
	{
		super("Name entered is not valid!");
	}
	
	public InvalidNameException(String msg)
	{
		super(msg);
	}

}
