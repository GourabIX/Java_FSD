package day3;

public class TestProductArray3 {
	
	public static void main(String[] args)
	{
		Product prod1 = new Product(10, "DELL Monitor", 6000);
		Product prod2 = new Product(20, "HP ProDesk", 50000);
		Product prod3 = new Product(30, "Logitech M20", 600);
		Product prod4 = new Product(40, "DELL Keyboard", 750);
		
		// Array of Product objects
		Product[] prod_arr = new Product[4];
		prod_arr[0] = prod1;
		prod_arr[1] = prod2;
		prod_arr[2] = prod3;
		prod_arr[3] = prod4;
		
		displayArray(prod_arr);
		displayMostCostlyProduct(prod_arr);
		displayMostCostlyProductDetails(prod_arr);

	}

	public static void displayArray(Product[] prod_arr)
	{
		// Better style of Declaring an array of Product objects
		for(Product prod_obj: prod_arr)
		{
			System.out.println(prod_obj);		// automatically calls toString() if the object is not NULL
			System.out.println("\n");
		}
	}
	
	public static void displayMostCostlyProduct(Product[] prod_arr)
	{
		int prev_price = 0;
		Product max_price_prod = new Product();
		for(Product prod_obj: prod_arr)
		{
			if (prod_obj.getPrice() > prev_price)
			{
				prev_price = prod_obj.getPrice();
				max_price_prod = prod_obj;
			}	
		}
		System.out.println("Maximum Price: " + prev_price);
		System.out.println("Product Details: " + max_price_prod.toString() + "\n");
	}
	
	public static void displayMostCostlyProductDetails(Product[] prod_arr)
	{
		int prev_price = 0;
		int max_index = 0;
		for(int i = 0; i < prod_arr.length; i++)
		{
			if (prod_arr[i].getPrice() > prev_price)
			{
				prev_price = prod_arr[i].getPrice();
				max_index = i;
			}
		}
		System.out.println("Maximum Price: " + prev_price);
		System.out.println("Product Details: " + prod_arr[max_index].toString());
	}
}
