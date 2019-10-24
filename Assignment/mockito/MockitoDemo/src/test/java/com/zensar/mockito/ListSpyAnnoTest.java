package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ListSpyAnnoTest {
	
	@Spy
	List<String> spiedCities = new ArrayList<String>();
	
	@Test
	public void testSpyList()
	{
		spiedCities.add("Pune");
		spiedCities.add("Kolkata");
		spiedCities.add("Hyderabad");
		
		System.out.println(spiedCities.size());
		
		Mockito.verify(spiedCities).add("Pune");
		Mockito.verify(spiedCities).add("Kolkata");
		Mockito.verify(spiedCities).add("Hyderabad");
		
		assertEquals(3, spiedCities.size());
		
		Mockito.doReturn(100).when(spiedCities).size();
		// assertEquals(3, spiedCities.size());
		assertEquals(100, spiedCities.size());
	}

}
