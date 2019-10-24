package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;
import org.mockito.Mockito;

public class IteratorTest {
	
	@Test
	public void testMoreThanOneReturnValue()
	{
		Iterator<String> it = Mockito.mock(Iterator.class);
		
		Mockito.when(it.next()).thenReturn("Rose").thenReturn("Jasmine").thenReturn("Tulip");
		
		String resultString = it.next() + " " + it.next() + " " + it.next();
		
//		assertEquals("Rose Jasmine Tulip", resultString);
		assertEquals("RoseJasmine Tulip", resultString);
	}

}
