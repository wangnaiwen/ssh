package com.contacts.service;

import com.contacts.dao.impl.UserDAO;
import com.contacts.domain.User;

public class LoginServiceImpl implements LoginServiceDAO{

	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public User login(String username, String password) {
		User user = userDAO.validateUser(username, password);
		return user;
	}
	
}
