package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorSpyTest {
	
	// Calculator calculator = new Calculator();
	
	@Test
	public void addTest1()
	{
		// Calculator calculatorSpy = Mockito.spy(calculator);			// Here with spy method we're creating a mock object.
		Calculator calculatorSpy = Mockito.spy(Calculator.class);
		// Mockito.when(calculator.add(100, 50)).thenReturn(150);
		// Mockito.when(calculatorSpy.add(100, 50)).thenReturn(100);		// calculatorSpy is a real object, but testing is mock.
		Mockito.when(calculatorSpy.add(100, 50)).thenCallRealMethod();
		assertEquals(140, calculatorSpy.add(100, 50));
	}

}
