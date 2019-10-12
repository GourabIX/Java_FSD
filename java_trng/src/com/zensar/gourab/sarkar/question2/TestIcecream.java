package com.zensar.gourab.sarkar.question2;

public class TestIcecream {
	
	public static void main(String[] args) {
		
		Icecream icecream1 = new Icecream("chocolate", 25);
		Icecream icecream2 = new Icecream("vanilla", 20);
		Icecream icecream3 = new Icecream("pista", 30);
		Icecream icecream4 = new Icecream("almond", 35);
		
		Icecream[] myIcecreams = new Icecream[4];		// The number of heap objects must be exactly equal to the number of objects created.
														// Otherwise it will give NullPointerException.
		myIcecreams[0] = icecream1;
		myIcecreams[1] = icecream2;
		myIcecreams[2] = icecream3;
		myIcecreams[3] = icecream4;
		
		System.out.println("Total Bill Due: " + calculateCustomerBill(myIcecreams));
		getFlavourOfMaxPriceIcecream(myIcecreams);

	}

	public static float calculateCustomerBill(Icecream[] icecream)
	{
		float totalCost = 0;
		float totalDiscounts = 0;
		for(Icecream currIcecream: icecream)
		{
			totalCost += currIcecream.getPrice();
			totalDiscounts += currIcecream.getDiscount();
		}
		
		return totalCost - totalDiscounts;
	}
	
	public static void getFlavourOfMaxPriceIcecream(Icecream[] icecream)
	{
		float maxPrice = icecream[0].getPrice();
		Icecream maxPriceIcecream = new Icecream();
		for(Icecream ic: icecream)
		{
			if (ic.getPrice() > maxPrice)
			{
				maxPrice = ic.getPrice();
				maxPriceIcecream = ic;
			}
		}
		System.out.println("Flavour of icecream with maximum Price: " + maxPriceIcecream.getFlavour());
	}

}
