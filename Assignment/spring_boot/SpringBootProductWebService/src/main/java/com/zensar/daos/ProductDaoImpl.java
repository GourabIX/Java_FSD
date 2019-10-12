package com.zensar.daos;

/**
 * @author Gourab Sarkar
 * @modification_date 12 Oct 2019 15:42
 * @creation_date 04 Oct 2019 10:24
 * @version 2.0
 * @copyright Gourab Sarkar 2019. All rights reserved.
 * @description This is the product DAO class used in the persistence layer which implements the DAO interface.
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Product> getAll() {
		return (List<Product>) hibernateTemplate.find("FROM Product");
	}

	@Override
	public Product getById(int productId) {
		return hibernateTemplate.get(Product.class, productId);
	}

	@Override
	public void insert(Product product) {
		hibernateTemplate.save(product);
	}

	@Override
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}
	
	

}
