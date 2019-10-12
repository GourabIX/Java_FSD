package com.zensar.spring.performers;

import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {

	private String song;
	private Set<Instrument> instruments;
	
	public Set<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public void perform() {
		
		for (Instrument instrument: instruments)
		{
			System.out.println("Instrumentalist is playing a song " + song);
			instrument.play();
		}
		
	}

}
