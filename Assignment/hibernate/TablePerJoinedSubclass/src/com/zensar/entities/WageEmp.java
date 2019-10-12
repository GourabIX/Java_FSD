package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Gourab Sarkar
 * @modification_date 27 Sep 2019 14:45
 * @creation_date 27 Sep 2019 11:49
 * @version 3.0
 * @description This is the persistence class as WageEmp.
 *
 */

@Entity
@Table(name = "wage_emp_2")
public class WageEmp extends Employee {
	
	private int hours;
	private float rate;
	
	public WageEmp() {
		// This is the default constructor
	}

	public WageEmp(int empId, String name, LocalDate joinDate, double salary, int hours, float rate) {
		super(empId, name, joinDate, salary);
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}

}
