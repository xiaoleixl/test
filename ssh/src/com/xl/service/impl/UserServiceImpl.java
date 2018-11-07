package com.xl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xl.dao.UserDao;
import com.xl.entity.User;
import com.xl.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User searchUser(String username, String pwd) {
		// TODO Auto-generated method stub
		return userDao.searchUser(username, pwd);
	}

}
