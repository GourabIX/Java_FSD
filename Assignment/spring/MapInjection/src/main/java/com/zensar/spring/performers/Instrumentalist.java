package com.zensar.spring.performers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {

	private Map<Instrument, String> instrumentSongMap;

	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}

	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing songs: ");
		
		for (Map.Entry<Instrument, String> inst : instrumentSongMap.entrySet())
		{
			System.out.println("Song is " + inst.getValue() + " is played by ");
			inst.getKey().play();
		}
		
	}

}
