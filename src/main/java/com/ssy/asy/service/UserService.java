package com.ssy.asy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssy.asy.dao.UserDao;
import com.ssy.asy.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User Userservice(long id) {
		
		return userDao.getUser(id);
	}

}
