package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("Anniversary")
public class AnniversaryGreeting implements Greeting {

	public AnniversaryGreeting() {
		System.out.println("Default constructor for anniversary greeting called.");
	}
	
	@Override
	public String greet() {
		return "\nHappy Some Anniversary!";
	}

}
