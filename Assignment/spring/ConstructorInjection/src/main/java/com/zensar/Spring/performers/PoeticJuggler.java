package com.zensar.Spring.performers;

import com.zensar.Spring.poems.Poem;

public class PoeticJuggler extends Juggler {
	
	private Poem poem;
	
	public PoeticJuggler() 
	{
		System.out.println("Default constructor of poetic juggler called.");
	}

	public PoeticJuggler(int beanBags, Poem poem) 
	{
		super(beanBags);
		this.poem = poem;
		System.out.println("Parameterized constructor of poetic juggler called.");
	}

	@Override
	public void perform() 
	{
		super.perform();
		System.out.println("While reciting a poem...");
		poem.recite();
	}
	
	

}
