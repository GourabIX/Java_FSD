package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("Festival")														// This decorative annotation replaces XML bean definition
public class FestivalGreeting implements Greeting {

	public FestivalGreeting() 
	{
		System.out.println("FestivalGreeting object created.");
	}
	
	@Override
	public String greet() 
	{
		return "\nHappy Overworking!";
	}

}
