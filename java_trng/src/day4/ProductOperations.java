package day4;

import day4.exceptions.PriceTooLowException;
import day4.exceptions.InvalidNameException;

public class ProductOperations {
	
	public void displayArray(Product[] prod_arr)
	{
		for(Product obj: prod_arr)
		{
			System.out.println(obj);
			System.out.println();
		}
	}
	
	public void displayMostCostlyProduct(Product[] prod_arr)
	{
		int max_price = 0;
		Product most_expensive = new Product();
		for (Product obj: prod_arr)
		{
			if (obj.getPrice() > max_price)
			{
				max_price = obj.getPrice();
				most_expensive = obj;
			}
		}
		System.out.println("Most expensive product: " + most_expensive);
		System.out.println();
	}
	
	public void displayCheapestProductDetails(Product[] prod_arr) throws PriceTooLowException
	{
		int min_price = prod_arr[0].getPrice();
		Product cheapest_prod = new Product();
		for (Product obj: prod_arr)
		{
			if (obj.getPrice() < min_price)
			{
				min_price = obj.getPrice();
				cheapest_prod = obj;
				if (min_price <= 0)
					throw new PriceTooLowException();		// Uses default message. Insert message as arg to customise.
			}
		}
		System.out.println("Cheapest Product: " + cheapest_prod);
		System.out.println();
	}
	
	public void displayProductsWhoseNameStartsWith(Product[] prod_arr, String c) throws InvalidNameException
	{
		char start_c = c.charAt(0);
		if (verify_str_type(start_c))
		{
			for (Product prodobj: prod_arr)
			{
				if (prodobj.getProductName().startsWith(c))
				{
					System.out.println(prodobj);
					System.out.println();
				}
			}
		}
		else
		{
			throw new InvalidNameException(c + " does not classify as a valid String!");
		}
	}
	
	public static boolean verify_str_type(char c)
	{
		int ascii_val = (int) c;
		
		if ((ascii_val >= 65 && ascii_val <= 90) || (ascii_val >= 97 && ascii_val <= 122))
			return true;
		
		return false;
	}

}
