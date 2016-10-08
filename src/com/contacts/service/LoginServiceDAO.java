package com.contacts.service;

import com.contacts.domain.User;

public interface LoginServiceDAO {
	User login(String username, String password);
}

