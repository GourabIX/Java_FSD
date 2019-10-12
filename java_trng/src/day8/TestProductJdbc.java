package day8;

public class TestProductJdbc {

	public static void main(String[] args) {
		
//		Product prod = new Product(108, "Logitech Mouse", 799);
//		ProductOperations updater = new ProductOperations();
//		updater.productCostUpdater(prod);
//		updater.productNameUpdater(prod);
		
		Product prodAdd = new Product(116, "LAN cable", 559);
		ProductOperations adder = new ProductOperations();
		if (adder.addProduct(prodAdd) == 0)
		{
			System.out.println("Operation Failed!");
		}
		else
		{
			System.out.println("Operation successful.");
		}
		
//		Product prodDel = new Product(116, "", 0);
//		ProductOperations deleter = new ProductOperations();
//		deleter.delProduct(prodDel);
		
	}

}
