package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.Greeting;

public class SpringMain {

	public static void main(String[] args) {
		
		// creating the object of Spring IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("greetings.xml");
		
		// Use FileSystemXmlApplicationContext if the xml file is not in Classpath but is present in FS.
		
		Greeting festGreeting = context.getBean("festivalGreetObj", Greeting.class);
		 System.out.println(festGreeting.greet());
		
		Greeting anniversaryGreeting = context.getBean("anniversaryGreetObj", Greeting.class);
		 System.out.println(anniversaryGreeting.greet());

	}

}
