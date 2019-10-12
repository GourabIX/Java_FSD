package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Gourab Sarkar
 * @creation_date Sep 26, 2019 14:46
 * @modification_date Sep 26, 2019 14:46
 * @version 1.0
 * @copyright Gourab Sarkar, 2019. All rights reserved.
 * @description This is the Name class.
 *
 */

@Embeddable
public class Name {
	
	@Column(name = "first", length = 30)
	private String firstName;
	@Column(name = "middle", length = 30)
	private String middleName;
	private String lastName;
	
	public Name() {
		// There's nothing here
	}

	public Name(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
	
}
