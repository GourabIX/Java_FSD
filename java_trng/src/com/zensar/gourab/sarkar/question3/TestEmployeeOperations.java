package com.zensar.gourab.sarkar.question3;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeOperations {

	public static void main(String[] args) {
		
		List<Employee> allEmployees = new ArrayList<Employee>(4);
		Employee employee1 = new Employee(101, "Gourab Sarkar", 7600, 23);
		Employee employee2 = new Employee(102, "Himanshu Maurya", 455421221, 22);
		Employee employee3 = new Employee(103, "Rahul BS", 459999, 22);
		Employee employee4 = new Employee(104, "Akansh Sai", 50000, 22);
		
		allEmployees.add(employee1);
		allEmployees.add(employee2);
		allEmployees.add(employee3);
		allEmployees.add(employee4);
		
		try
		{
			EmployeeOperations.displayAllEmployees(allEmployees);
		}
		catch(Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		EmployeeOperations.getEmployeeBasedOnId(allEmployees, 101);
	}

}
