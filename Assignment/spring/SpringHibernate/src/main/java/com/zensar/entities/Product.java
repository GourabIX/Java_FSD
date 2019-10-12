package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * @author Gourab Sarkar
 * @creation_date Sep. 25, 2019, 4:45 PM
 * @modification_date Oct. 11, 2019, 10:53
 * @version 3.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is a persistent class which represents database table PRODUCT.
 * 				It is a POJO (Plain Old Java Object) class.
 */

@Component
@Entity
public class Product {
	
	@Id
	@Column(name = "ID")
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	public Product() {
		// There's nothing here
	}
	
	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

}
