package day4;

import day4.exceptions.PriceTooLowException;
import day4.exceptions.InvalidNameException;

public class TestProductOperations {

	public static void main(String[] args) {
		
		Product prod1 = new Product(10, "DELL Monitor", 6000);
		Product prod2 = new Product(20, "HP ProDesk", 50000);
		Product prod3 = new Product(30, "Logitech M20", 0);
		Product prod4 = new Product(40, "DELL Keyboard", 750);
		
		// Array of Product objects
		Product[] prod_arr = new Product[4];
		prod_arr[0] = prod1;
		prod_arr[1] = prod2;
		prod_arr[2] = prod3;
		prod_arr[3] = prod4;
		
		ProductOperations prod_ops = new ProductOperations();
		prod_ops.displayArray(prod_arr);
		
		System.out.println("Product whose name starts with: " + "L");
		try 
		{
			prod_ops.displayProductsWhoseNameStartsWith(prod_arr, "#");
		}
		catch(InvalidNameException exc)
		{
			System.out.println(exc);
		}
		
		try
		{
			prod_ops.displayCheapestProductDetails(prod_arr);
		}
		catch (PriceTooLowException exc)
		{
			System.out.println(exc);
		}

	}

}
