package com.zensar.gourab.sarkar.question3;

public class Employee {
	
	private int employeeID;
	private String employeeName;
	private double salary;
	private int age;
	
	public Employee()
	{
		// there's nothing here.
	}
	
	public Employee(int employeeID, String employeeName, double salary, int age)
	{
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.salary = salary;
		this.age = age;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", salary=" + salary + ", age="
				+ age + "]";
	}
	
}
