package com.cybage.dao;

import com.cybage.model.Login;
import com.cybage.model.User;

public interface UserDao {
   User getUser(int user_id); 
   public User getUser(Login login);
	
  	public boolean addUser(User user);
}
