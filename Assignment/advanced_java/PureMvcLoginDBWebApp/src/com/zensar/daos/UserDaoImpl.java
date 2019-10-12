package com.zensar.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Gourab Sarkar, 2019.
 * @version 0.1
 * @creation_date Sep. 21, 2019 05:37 PM
 * @modification_date Sep. 23, 2019 10:20 AM
 * @copyright Zensar Technologies, India. All rights reserved.
 * @description It is Data Access Object (DAO) interface implementer class.
 * 				It is used in Persistence Layer of Application.
*/

import java.util.List;

import com.zensar.entities.User;

public class UserDaoImpl implements UserDao {

	private Connection conn;
	
	public void setConnection(Connection conn)
	{
		this.conn = conn;
	}
	
	@Override
	public void insert(User user) throws SQLException {
		
		String sqlQuery = "INSERT INTO user_login VALUES(?, ?)";
			
		PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
			
		int insertCount = pstmt.executeUpdate();
		if (insertCount > 0)
		{
			System.out.println("New user inserted successfully!");
		}
		else
		{
			System.out.println("Oops! New user could not be inserted!");
		}		

	}

	@Override
	public void update(User user) throws SQLException {
		
		String sqlQuery = "UPDATE user_login SET password=? WHERE username=?";
		
		PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
		pstmt.setString(1, user.getPassword());
		pstmt.setString(2, user.getUsername());
		
		int queryFate = pstmt.executeUpdate();
		if (queryFate > 0)
		{
			System.out.println("User updated successfully!");
		}
		else
		{
			System.out.println("Oops! User could not be updated!");
		}	

	}

	@Override
	public void delete(User user) throws SQLException {
		
		String sqlQuery = "DELETE FROM user_login WHERE username=?";
		
		PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
		pstmt.setString(1, user.getUsername());
		
		int queryFate = pstmt.executeUpdate();
		if (queryFate == 0)
		{
			System.out.println("Deletion successful!");
		}
		else
		{
			System.out.println("Oops! Deletion failed.");
		}

	}

	@Override
	public User getByUsername(String username) throws SQLException {
		
		String sqlQuery = "SELECT username, password FROM user_login WHERE username=?";
		PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
		pstmt.setString(1, username);
		
		ResultSet rs = pstmt.executeQuery();
		if (rs.next())
		{
			User retUser = new User();
			retUser.setUsername(rs.getString("username"));
			retUser.setPassword(rs.getString("password"));
			return retUser;
		}
		return null;
	}

	@Override
	public List<User> getAll() throws SQLException {
		
		List<User> userList = new ArrayList<User>();
		
		String sqlQuery = "SELECT username, password FROM user_login";
		Statement pstmt = conn.createStatement();
		
		ResultSet rs = pstmt.executeQuery(sqlQuery);
		while(rs.next())
		{
			String uname = rs.getString("username");
			String upass = rs.getString("password");
			
			User currUser = new User();
			currUser.setUsername(uname);
			currUser.setPassword(upass);
			
			userList.add(currUser);
		}
		
		return userList;
	}

}
