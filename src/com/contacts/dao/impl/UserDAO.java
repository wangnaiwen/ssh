package com.contacts.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.contacts.dao.BaseDAO;
import com.contacts.dao.IUserDAO;
import com.contacts.domain.User;

public class UserDAO extends BaseDAO implements IUserDAO{

	public User validateUser(String username, String password) {
		String sql = "from User u where u.name='"+username+"' and u.password='" + password + "'";
		
		Session session = getSession();

		Query query = session.createQuery(sql);

		List users = query.list();
		if(users.size() != 0){
			User user = (User)users.get(0);
			return user;
		}
		session.close();
		return null;
	}
}
