package com.zensar.spring.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.instruments.Instrument;
import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("performers.xml");
		
		Performer instrumentalist = context.getBean("Lindsey Stirling", Performer.class);
		instrumentalist.perform();
		
		Performer inheritedInstrumentalist = context.getBean("Inherited Lindsey Stirling", Performer.class);
		inheritedInstrumentalist.perform();
		
		Performer inheritedInstrumentalistNewInstrument = context.getBean("Inherited Lindsey Stirling different instrument", Performer.class);
		inheritedInstrumentalistNewInstrument.perform();

	}

}
