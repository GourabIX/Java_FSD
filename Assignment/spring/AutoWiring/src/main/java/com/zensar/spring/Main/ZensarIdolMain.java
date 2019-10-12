package com.zensar.spring.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.zensar.spring.config.PerformerConfig;
import com.zensar.spring.instruments.Instrument;
import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(PerformerConfig.class);
		
		Performer instrumentalist = context.getBean("Lindsey Stirling", Performer.class);
		instrumentalist.perform();
		
		Instrument myInstrument = context.getBean("violin", Instrument.class);
		myInstrument.play();

	}

}
