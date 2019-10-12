package com.zensar.spring.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.zensar.spring.config.PerformerConfig;
import com.zensar.spring.exceptions.PerformanceException;
import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(PerformerConfig.class);
		
		Performer juggler = context.getBean("charan", Performer.class);
		try 
		{
			juggler.perform();
		} 
		catch (PerformanceException e) 
		{
			e.printStackTrace();
		}

	}

}
