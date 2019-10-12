package com.zensar.spring.instruments;

public class Violin implements Instrument {

	@Override
	public void play() {
		System.out.println("Wing Wing Wing!");
	}

	@Override
	public void tune() {
		System.out.println("Violin is tuned.");		
	}

	@Override
	public void clean() {
		System.out.println("Violin is clean.");
	}

}
