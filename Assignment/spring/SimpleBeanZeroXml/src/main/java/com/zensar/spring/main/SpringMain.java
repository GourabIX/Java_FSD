package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.zensar.spring.Greeting;
import com.zensar.spring.config.GreetingConfig;

public class SpringMain {

	public static void main(String[] args) {
		
		// creating the object of Spring IOC container
		ApplicationContext context = new AnnotationConfigApplicationContext(GreetingConfig.class);
		
		// Use FileSystemXmlApplicationContext if the xml file is not in Classpath but is present in FS.
		
		Greeting festGreeting = context.getBean("Festival", Greeting.class);
		System.out.println(festGreeting.greet());
		
		Greeting anniversaryGreeting = context.getBean("Anniversary", Greeting.class);
		System.out.println(anniversaryGreeting.greet());

	}

}
