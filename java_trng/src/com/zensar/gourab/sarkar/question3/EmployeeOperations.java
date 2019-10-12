package com.zensar.gourab.sarkar.question3;

import java.util.List;

public class EmployeeOperations {
	
	public static void displayAllEmployees(List<Employee> allEmployeesList) throws AgeNotValidException
	{
		System.out.println("Here are all of the employee details: ");
		for (Employee currEmployee: allEmployeesList)
		{
			if (currEmployee.getAge() < 18 || currEmployee.getAge() > 60)
				throw new AgeNotValidException();
			else
			{
				System.out.println(currEmployee.toString());
			}
		}
	}
	
	public static void getEmployeeBasedOnId(List<Employee> allEmployeesList, int employeeID)
	{
		for(Employee currEmployee: allEmployeesList)
		{
			if (currEmployee.getEmployeeID() == employeeID)
			{
				System.out.println("Employee details for Employee ID: " + employeeID);
				System.out.println(currEmployee.toString());
				return;
			}
		}
	}

}
