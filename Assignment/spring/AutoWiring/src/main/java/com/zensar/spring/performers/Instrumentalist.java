package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;

@Component("Lindsey Stirling")
public class Instrumentalist implements Performer {

	@Value("What do you mean?")
	private String song;
	@Autowired								// Can only use on complex types
	// UnsatisfiedDependencyException results if there are multiple classes implementing the same interface
	// if @Qualifier is not specified.
	@Qualifier("piano")						// takes camel case name of class automatically
	private Instrument instrument;
	
	@Override
	public void perform() {
		System.out.println("Instrumentalist is performing a song " + song + " with " + instrument.toString());
	}

}
