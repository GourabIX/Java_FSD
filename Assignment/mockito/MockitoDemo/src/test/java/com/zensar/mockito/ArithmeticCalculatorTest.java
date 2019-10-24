package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)				// tells mockito to create mock objects. Alternative to @Rule.
public class ArithmeticCalculatorTest {
	
	@Mock
	private Calculator calculator;
	
	@InjectMocks
	private ArithmeticCalculator arithmeticCalculator;
	
	@Test
	public void testArithmeticCalculator()
	{
		Mockito.when(arithmeticCalculator.doAddition(10, 20)).thenReturn(30);
		
		assertEquals(30, arithmeticCalculator.doAddition(10, 20));
	}
}
