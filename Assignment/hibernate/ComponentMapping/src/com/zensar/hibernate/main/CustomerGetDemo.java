package com.zensar.hibernate.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class CustomerGetDemo {
	
	public static void main(String[] args) {
		
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Customer cust = s.get(Customer.class, 1018);
		System.out.println(cust.getCustomerId());
		System.out.println(cust.getAddress());
		System.out.println(cust.getAge());
		System.out.println(cust.getGender());
		System.out.println(cust.getBirthDate());
		
		try {
			Name customerName = cust.getCustomerName();
			System.out.println(customerName);
			Blob customerPhoto = cust.getProfilePhoto();
			InputStream in = customerPhoto.getBinaryStream();
			FileOutputStream fout = new FileOutputStream(".\\resources\\newPhoto.png");
			int data = 0;
			while ((data = in.read()) != -1)
			{
				fout.write(data);
			}
			
			in.close();
			fout.close();
			
			Clob description = cust.getDescription();
			Reader rdr = description.getCharacterStream();
			PrintWriter printer = new PrintWriter(".\\resources\\CustomerDBInfo.txt");
			int charData;
			while ((charData = rdr.read()) != -1)
			{
				printer.print((char) charData);
				System.out.print((char) charData);
			}
			rdr.close();
			printer.close();
			
			t.commit();
			s.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
