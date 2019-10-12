package com.zensar.services;

/**
 * @author Gourab Sarkar, 2019.
 * @version 2.0
 * @creation_date Sep. 21, 2019 05:24 PM
 * @modification_date Sep. 28, 2019 11:47 AM
 * @copyright Zensar Technologies, India. All rights reserved.

*/

import java.util.List;

import com.zensar.daos.UserDao;
import com.zensar.entities.User;
import com.zensar.exceptions.ServiceException;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

	@Override
	public void addUser(User user) throws ServiceException {
		userDao.insert(user);

	}

	@Override
	public void updateUser(User user) throws ServiceException {
		userDao.update(user);

	}

	@Override
	public void removeUser(User user) throws ServiceException {
		
		userDao.delete(user);

	}

	@Override
	public User findUserByUsername(String username) throws ServiceException {
		User user = userDao.getByUsername(username);
		return user;
	}

	@Override
	public List<User> findAllUsers() throws ServiceException {
		return userDao.getAll();
	}

	@Override
	public boolean validateUser(User user) throws ServiceException {
		User dbUser = findUserByUsername(user.getUsername());
		
		if (dbUser != null && dbUser.getPassword().equals(user.getPassword()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
