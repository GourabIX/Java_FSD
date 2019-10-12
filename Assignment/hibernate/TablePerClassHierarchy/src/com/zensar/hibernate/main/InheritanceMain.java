package com.zensar.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
		
		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Employee employee = new Employee();
		employee.setName("Gourab Sarkar");
		employee.setJoinDate(LocalDate.of(2019, 8, 26));
		employee.setSalary(7500.50);
		
		s.save(employee);
		
		WageEmp wageEmp = new WageEmp();
		wageEmp.setName("Sudhanya");
		wageEmp.setJoinDate(LocalDate.of(2019, 8, 26));
		wageEmp.setHours(52);
		wageEmp.setRate(12.25f);			// 'f' at the end indicates that it is a float value
		wageEmp.setSalary(7500.50);
		
		s.save(wageEmp);
		
		t.commit();
		s.close();

	}

}
