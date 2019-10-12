package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

@Component
public class piano implements Instrument {

	@Override
	public void play() {
		
		System.out.println("ping ping ping");

	}

}
