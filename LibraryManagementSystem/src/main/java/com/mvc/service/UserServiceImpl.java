package com.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.Dao.UserDao;
import com.mvc.bean.Login;
import com.mvc.bean.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public void register(User user) throws Exception {
		
		userDao.register(user);
	}

	public User validateUser(Login login) throws Exception {
		
		return userDao.validateUser(login);
	}

}
