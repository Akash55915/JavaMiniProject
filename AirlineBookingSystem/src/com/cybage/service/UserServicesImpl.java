package com.cybage.service;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.Login;
import com.cybage.model.User;

public class UserServicesImpl implements UserServices{
	UserDao userDao= new UserDaoImpl();
	@Override
	public User getUserById(int user_id) {

		return userDao.getUser(user_id);
	}
	@Override
	public User getUser(Login login) {
		
		return userDao.getUser(login);
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	

}
