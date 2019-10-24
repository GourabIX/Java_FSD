package com.zensar.mockito;

public class ArithmeticCalculator {
	
	private Calculator calculator;
	
	public ArithmeticCalculator() {
		
	}

	public ArithmeticCalculator(Calculator calculator) 
	{
		this.calculator = calculator;
	}
	
	public int doAddition(int num1, int num2)
	{
		return calculator.add(num1, num2);
	}
	
	

}
