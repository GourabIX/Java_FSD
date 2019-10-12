package com.zensar.services;

import org.springframework.stereotype.Service;

import com.zensar.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(User user) 
	{
		if (user.getUserName().equals("gourab") && user.getPassWord().equals("welcome"))
		{
			return true;
		}
		return false;
	}

}
