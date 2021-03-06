package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

public class DbOperations {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("dbConfig.xml");
		ProductService productService = context.getBean("productServiceImpl", ProductService.class);
		
		List<Product> products = productService.findAllProducts();
		for (Product currentProduct: products)
		{
			System.out.println(currentProduct);
		}
		
		System.out.println("\nFound Product:");
		Product foundProductById = productService.findProductById(1005);
		System.out.println(foundProductById);
		
//		Product newProductAdd = new Product(1016, "Charan", "Stephen", (float) 99500.25);
//		productService.addProduct(newProductAdd);
		
		Product updateProduct = new Product(1017, "Samsung", "M30s", (float) 14999.25);
		if (productService.findProductById(updateProduct.getProductId()) != null)
		{
			productService.updateProduct(updateProduct);
		}
		else
		{
			System.out.println("Sorry! Product is not found in database!");
		}
		
		Product deleteProduct = new Product(1009, "a", "b", (float) 0.00);
		if (productService.findProductById(deleteProduct.getProductId()) != null)
		{
			productService.removeProduct(deleteProduct);
		}
		else
		{
			System.out.println("Sorry! Product is not found in database!");
		}
		
	}

}
