package com.zensar.services;

/**
 * @author Gourab Sarkar
 * @modification_date 12 Oct 2019 15:43
 * @creation_date 04 Oct 2019 11:40
 * @version 2.0
 * @copyright Gourab Sarkar 2019. All rights reserved.
 * @description This is the ProductServiceImpl class which implements the ProductService interface used in the business layer.
 */

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.ProductDao;
import com.zensar.entities.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> findAllProducts() {
		return productDao.getAll();
	}

	@Override
	public Product findProductById(int productId) {
		return productDao.getById(productId);
	}

	@Override
	public void addProduct(Product product) {
		productDao.insert(product);
	}

	@Override
	public void updateProduct(Product product) {
		productDao.update(product);
	}

	@Override
	public void removeProduct(Product product) {
		productDao.delete(product);
	}

	@Override
	public List<Product> findProductsByPriceRange(double priceMin, double priceMax) {		
		List<Product> listOfAllProducts = productDao.getAll();
		List<Product> listOfProductsInPriceRange = new ArrayList<Product>();
		for (Product currentProduct: listOfAllProducts)
		{
			if (currentProduct.getPrice() <= priceMax && currentProduct.getPrice() >= priceMin)
			{
				listOfProductsInPriceRange.add(currentProduct);
			}
		}
		return listOfProductsInPriceRange;
	}

	@Override
	public List<Product> findProductsByName(String productName) {
		List<Product> listOfAllProducts = productDao.getAll();
		List<Product> listOfProductsContainingProductName = new ArrayList<Product>();
		for (Product currentProduct: listOfAllProducts)
		{
			if (currentProduct.getName().contains(productName))
			{
				listOfProductsContainingProductName.add(currentProduct);
			}
		}
		return listOfProductsContainingProductName;
	}

	@Override
	public List<Product> findProductsByBrand(String productBrand) {
		List<Product> listOfAllProducts = productDao.getAll();
		List<Product> listOfProductsOfBrand = new ArrayList<Product>();
		for (Product currentProduct: listOfAllProducts)
		{
			if (currentProduct.getBrand().equals(productBrand))
			{
				listOfProductsOfBrand.add(currentProduct);
			}
		}
		return listOfProductsOfBrand;
	}

	@Override
	public long getProductCount() {
		List<Product> listOfAllProducts = productDao.getAll();
		return listOfAllProducts.size();
	}

}
