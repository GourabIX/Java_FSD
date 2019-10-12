package day3;

public class TestProductArray {
	
	public static void main(String[] args)
	{
		Product prod1 = new Product(10, "DELL Monitor", 6000);
		Product prod2 = new Product(20, "HP ProDesk", 50000);
		Product prod3 = new Product(30, "Logitech M20", 600);
		Product prod4 = new Product(40, "DELL Keyboard", 750);
		
		// Array of Product objects
		Product prod_arr[] = {prod1, prod2, prod3, prod4};
		
		displayArray(prod_arr);

	}

	public static void displayArray(Product[] prod_arr)
	{
		// Better style of Declaring an array of Product objects
		for(Product prod_obj: prod_arr)
		{
			System.out.println(prod_obj.toString());
			System.out.println("\n");
		}
	}
}
