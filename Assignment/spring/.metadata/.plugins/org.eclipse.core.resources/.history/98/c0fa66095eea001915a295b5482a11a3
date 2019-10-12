package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;
	
	public Instrumentalist() {
		System.out.println("Instrumentalist is created.");
	}
	
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set.");
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is set.");
	}

	@Override
	public void perform() {
		System.out.println("Instrumentalist is performing a song " + song);
	}

}
