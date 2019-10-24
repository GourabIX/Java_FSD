package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ListTest {
	
	@Mock
	List<String> list;
	
	@Test
	public void testList()
	{
		Mockito.when(list.get(0)).thenReturn("Rose");			// this mocks the list object and returns rose. But there is nothing present in list. In fact, list is an interface.
		// Mockito.when(list.get(0)).thenCallRealMethod();
		assertEquals("Rose", list.get(0));
	}
	
	@Test
	public void testLinkedListSpy()
	{
		// Mocking a linked list
		List<String> list = new LinkedList<String>();
		List<String> spy = Mockito.spy(list);
		spy.add("Rose");
		
		Mockito.when(spy.get(0)).thenReturn("Rose");
		
		assertEquals("Rose", spy.get(0));
	}

}
