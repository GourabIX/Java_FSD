package com.zensar.gourab.sarkar.question3;

public class AgeNotValidException extends Exception {
	
	public AgeNotValidException()
	{
		System.out.println("Age is invalid. Allowed Limits: 18 - 60.");
	}
	
	public AgeNotValidException(String msg)
	{
		super(msg);
	}

}
