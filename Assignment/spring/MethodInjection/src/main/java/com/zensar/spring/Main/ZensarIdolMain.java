package com.zensar.spring.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("performers.xml");
		
		Performer magician = context.getBean("PC Sircar", Performer.class);
		magician.perform();

	}

}
