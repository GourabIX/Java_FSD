package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Gourab Sarkar
 * @modification_date 27 Sep 2019 14:45
 * @creation_date 27 Sep 2019 11:17
 * @version 3.0
 * @description This is the persistence class as Employee.
 *
 */

@Entity
@Table(name = "emp_master_2")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)			// Auto generates empId in table
	private int empId;
	private String name;
	private LocalDate joinDate;
	private double salary;
	
	public Employee() {
		// This is the default constructor
	}

	public Employee(int empId, String name, LocalDate joinDate, double salary) {
		this.empId = empId;
		this.name = name;
		this.joinDate = joinDate;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", joinDate=" + joinDate + ", salary=" + salary + "]";
	}
	
}
