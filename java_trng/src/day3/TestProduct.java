package day3;

public class TestProduct {

	public static void main(String[] args) {

		Product prod1 = new Product(); // Default constructor called. Specified by () empty parentheses.

		System.out.println(prod1.getProductID());
		System.out.println(prod1.getProductName());
		System.out.println(prod1.getPrice());
		System.out.println();

		prod1.setProductID(9);
		prod1.setProductName("Infinity");
		prod1.setPrice(99);

		System.out.println(prod1.getProductID());
		System.out.println(prod1.getProductName());
		System.out.println(prod1.getPrice());
		System.out.println();
		
		Product prod2 = new Product();
		
		prod2.setPrice(42999);
		prod2.setProductID(2);
		prod2.setProductName("Lenovo Ideapad 330");
		
		System.out.println(prod2.getProductName());
		System.out.println(prod2.getProductID());
		System.out.println(prod2.getPrice());
		System.out.println();
		
		Product prod3 = new Product(9, "Lenovo Legion Y530", 74999);
		System.out.println(prod3.getProductName());
		System.out.println(prod3.getProductID());
		System.out.println(prod3.getPrice() + "\n");
		
		Product prod4 = new Product(104, "Chair", 2000);
		System.out.println(prod4); 			// day3.Product@15db9742 :: Package_name.class_Name@ObjectHashCode
											// toString() inside the Class is not defined.

	}

}
