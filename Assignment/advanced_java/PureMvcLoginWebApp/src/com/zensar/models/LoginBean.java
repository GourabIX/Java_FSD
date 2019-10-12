package com.zensar.models;

// MODEL
public class LoginBean {
	
	private String username;
	private String password;
	
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
	
	// Business logic method
	public boolean validateUser()
	{
		if (username != null && password != null && username.equals("gourab") && password.equals("welcome"))
		{
			return true;
		}
		return false;
	}

}
