package day8_1;

public class TestProductJdbc {

	public static void main(String[] args) {
		
//		Product prod = new Product(101, "Nokia Xpress Music", 799);
//		ProductOperations updater = new ProductOperations();
//		if (updater.productCostUpdater(prod) == 0)
//			System.out.println("Operation Failed!");
//		else
//			System.out.println("Operation successful.");
//		
//		updater.productNameUpdater(prod);
//		if (updater.productNameUpdater(prod) == 0)
//			System.out.println("Operation Failed!");
//		else
//			System.out.println("Operation successful.");
		
//		Product prodAdd = new Product(116, "LAN cable", 559);
//		ProductOperations adder = new ProductOperations();
//		if (adder.addProduct(prodAdd) == 0)
//		{
//			System.out.println("Operation Failed!");
//		}
//		else
//		{
//			System.out.println("Operation successful.");
//		}
		
//		Product prodDel = new Product(116, "", 0);
//		ProductOperations deleter = new ProductOperations();
//		if (deleter.delProduct(prodDel) == 0)
//			System.out.println("Operation Failed!");
//		else
//			System.out.println("Operation successful.");
		
//		try
//		{
//			Product prod = new Product();
//			ProductOperations prodGet = new ProductOperations();
//			prod = prodGet.getProduct(101);
//			System.out.println(prod);
//		}
//		catch (Exception exc)
//		{
//			System.out.println("Exception detected: " + exc);
//		}
		
		try
		{
			ProductOperations prodGet = new ProductOperations();

			for (Product currProduct: prodGet.getAllProducts())
			{
				System.out.println(currProduct);
			}
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
	}

}
