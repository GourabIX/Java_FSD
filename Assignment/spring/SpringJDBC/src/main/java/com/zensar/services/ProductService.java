package com.zensar.services;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author Gourab Sarkar
 * @modification_date 04 Oct 2019 11:40
 * @creation_date 04 Oct 2019 11:40
 * @version 1.0
 * @copyright Gourab Sarkar 2019. All rights reserved.
 * @description This is the ProductService interface used in the business layer.
 */

public interface ProductService {
	
	List<Product> findAllProducts();
	Product findProductById(int productId);
	void addProduct(Product product);
	void updateProduct(Product product);
	void removeProduct(Product product);
	List<Product> findProductsByPriceRange(double priceMin, double priceMax);
	List<Product> findProductsByName(String productName);
	List<Product> findProductsByBrand(String productBrand);
	long getProductCount();
	
}
