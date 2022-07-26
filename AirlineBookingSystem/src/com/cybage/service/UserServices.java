package com.cybage.service;

import com.cybage.dao.AdminDao;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.Login;
import com.cybage.model.User;

public interface UserServices {

	User getUserById(int user_id);
public User getUser(Login login);
	
	public boolean addUser(User user);
	
	
//	

}
