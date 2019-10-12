package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Gourab Sarkar
 * @modification_date 12 Oct 2019 15:43
 * @creation_date 12 Oct 2019 15:4
 * @version 1.0
 * @copyright Gourab Sarkar 2019. All rights reserved.
 * @description This is the ProductController interface to access Product Entity used in the business layer.
 */

import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
		return productService.findAllProducts();
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable("id") int productId) 
	{
		return productService.findProductById(productId);
	}
	
	@PostMapping("/products/add")
	public String addProd(@RequestBody Product product) {
		productService.addProduct(product);
		return "new product: " + product.getProductId() + "is added";
	}
	
	@PostMapping("/products/addproduct")
	public String addProductParam(@RequestParam("id") int productId, @RequestParam("name") String name, @RequestParam("brand") String brand, @RequestParam("price") float price)
	{
		Product product = new Product(productId, name, brand, price);
		productService.addProduct(product);
		return "new product: " + product.getProductId() + "is added";
	}
	
	@PutMapping("/products/update")
	public String update(@RequestBody Product product) {
		if (productService.findProductById(product.getProductId()) != null)
		{
			productService.updateProduct(product);
			return "Product is updated successfully.";
		}
		else
		{
			return "Product with ID: " + product.getProductId() + " does not exist in database.";
		}
	}
	
	@DeleteMapping("/products/delete")
	public String delete(@RequestBody Product product) {
		if (productService.findProductById(product.getProductId()) != null)
		{
			productService.removeProduct(product);
			return "Product is deleted successfully.";
		}
		else
		{
			return "Product with ID: " + product.getProductId() + " does not exist in database.";
		}
	}

}
