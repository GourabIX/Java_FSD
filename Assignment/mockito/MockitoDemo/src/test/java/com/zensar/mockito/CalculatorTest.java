package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class CalculatorTest {
	
	// tell mockito to create a mock Calculator object
	@Mock
	private Calculator calculator;
	
	// tells mockito to instantiate all mock objects.
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	// Create test case using jUnit annotation - @Test
	@Test
	public void testAdd()
	{
		// Mockito.when(calculator.add(6, 4)).thenReturn(100);
		Mockito.when(calculator.add(6, 4)).thenCallRealMethod();
		System.out.println(calculator.add(6, 4));
		// assertEquals(10, calculator.add(6, 4));
		assertEquals(11, calculator.add(6, 4));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivision()
	{
		Mockito.when(calculator.divide(10, 0)).thenThrow(ArithmeticException.class);
		System.out.println(calculator.divide(10, 2));
	}

}
