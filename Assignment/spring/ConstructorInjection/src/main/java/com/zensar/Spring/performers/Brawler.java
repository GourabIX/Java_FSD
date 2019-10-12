package com.zensar.Spring.performers;

public class Brawler implements Performer {
	
	private int punches;
	
	public Brawler() {
		System.out.println("Default constructor of Brawler called.");
	}

	public Brawler(int punches) {
		this.punches = punches;
		System.out.println("Parameterized method of Brawler called.");
	}

	@Override
	public void perform() {
		System.out.println("Brawler throwing punches! " + punches);		
	}
	
}
