package com.xl.dao.impl;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.xl.dao.BaseDao;
import com.xl.dao.UserDao;
import com.xl.entity.User;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public User searchUser(String username, String pwd) {
		Session session = this.getSession();
		User user = (User) session.createQuery("from User where userName=? and pwd=?").setParameter(0, username)
				.setParameter(1, pwd).uniqueResult();
		return user;
	}

}
