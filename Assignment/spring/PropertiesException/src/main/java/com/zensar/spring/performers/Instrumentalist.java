package com.zensar.spring.performers;

import java.util.Enumeration;
import java.util.Properties;

public class Instrumentalist implements Performer {

	private Properties properties;			// This is a non-generic class.
	
	private Properties instrumentSongProps;
	 
    public Properties getInstrumentSongProps() {
        return instrumentSongProps;
    }
 
    public void setInstrumentSongProps(Properties instrumentSongProps) {
        this.instrumentSongProps = instrumentSongProps;
    }
    @Override
    public void perform() {
        System.out.println("Instrumentalist is playing songs: ");
        Enumeration instruments = instrumentSongProps.keys();
        
        while(instruments.hasMoreElements()) {
            String instrumentName = (String) instruments.nextElement();
            String song = instrumentSongProps.getProperty(instrumentName);
            System.out.println("Instrument is playing song " +song+" by "+instrumentName);
        }
    }
	
}
