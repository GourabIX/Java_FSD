package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

@Component("violin")
public class Violin implements Instrument {

	@Override
	public void play() {
		System.out.println("Wing Wing Wing!");
	}

}
