package com.zensar.hibernate.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;
import org.hibernate.engine.jdbc.ClobProxy;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;


public class ComponentMappingMain {

	public static void main(String[] args) {
		
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Name name = new Name();
		name.setFirstName("Gourab");
		name.setMiddleName("");
		name.setLastName("Sarkar");
		
		Customer cust = new Customer();
		cust.setCustomerId(1018);
		cust.setCustomerName(name);
		cust.setGender("Male");
		cust.setAge(22);
		cust.setAddress("Kolkata");
		cust.setBirthDate(LocalDate.of(1996, 9, 8));
		
		try {
			File photo = new File(".\\resources\\images.png");			// represents the file but does not open the file
			FileInputStream fis = new FileInputStream(photo);			// opens the file in read mode.
			Blob customerPhoto = BlobProxy.generateProxy(fis, photo.length()); 
			cust.setProfilePhoto(customerPhoto);
			
			File textFile = new File(".\\resources\\CustomerInfo.txt");
			FileReader fr = new FileReader(textFile);
			Clob description = ClobProxy.generateProxy(fr, textFile.length());
			cust.setDescription(description);
			
			s.save(cust);
			t.commit();
			s.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
