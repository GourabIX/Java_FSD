package com.zensar.entities;

/**
 * @author Gourab Sarkar, 2019.
 * @version 0.1
 * @creation_date Sep. 21, 2019 05:24PM
 * @modification_date Sep. 21, 2019 05:24PM
 * @copyright Zensar Technologies, India. All rights reserved.
 * @description Java Bean class used to represent database entity.
 * 				It is also used as value object.
 * 				It is used in all layers of application.
*/

public class User {
	
	private String username;
	private String password;
	
	public User()
	{
		// There's nothing here.
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
}
