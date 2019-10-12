package com.zensar.Spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.Spring.performers.Performer;
import com.zensar.Spring.performers.PoeticJuggler;

public class ZensarIdolMain {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("performers.xml");
		
		Performer juggler = context.getBean("Pyare Mohan", Performer.class);
		juggler.perform();
		
		Performer brawler = context.getBean("Lambert Eskel", Performer.class);
		brawler.perform();
		
		Performer poeticJuggler = context.getBean("Taylor Swift", Performer.class);
		poeticJuggler.perform();
		
	}

}
