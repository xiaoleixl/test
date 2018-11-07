package com.xl.dao;

import com.xl.entity.User;

public interface UserDao {
	
	public User searchUser(String username,String pwd);
}
