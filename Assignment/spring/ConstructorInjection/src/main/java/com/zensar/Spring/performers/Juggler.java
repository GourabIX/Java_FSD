package com.zensar.Spring.performers;

public class Juggler implements Performer {
	
	private int beanBags;
	
	public Juggler() 
	{
		System.out.println("NoArg constructor of juggler called.");
	}

	public Juggler(int beanBags) 
	{
		this.beanBags = beanBags;
		System.out.println("Parameterized constructor of Juggler called.");
	}
	
	public void perform()
	{
		System.out.println("Juggler juggling beanbags! " + beanBags);
	}

}
