package com.zensar.daos;

import java.sql.SQLException;
import java.util.List;

import com.zensar.entities.User;

/**
 * @author Gourab Sarkar, 2019.
 * @version 0.1
 * @creation_date Sep. 21, 2019 05:30PM
 * @modification_date Sep. 21, 2019 05:30PM
 * @copyright Zensar Technologies, India. All rights reserved.
 * @description It is Data Access Object (DAO) interface.
 * 				It is used in Persistence Layer of Application.
*/

public interface UserDao {
	
	void insert(User user) throws SQLException;
	void update(User user) throws SQLException;
	void delete(User user) throws SQLException;
	User getByUsername(String username) throws SQLException;
	List<User> getAll() throws SQLException;	

}
