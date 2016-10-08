package com.contacts.dao;

import com.contacts.domain.User;


public interface IUserDAO {
	public User validateUser(String username, String password);
}
