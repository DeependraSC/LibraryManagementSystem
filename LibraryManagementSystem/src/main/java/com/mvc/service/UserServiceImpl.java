package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Dao.UserDao;
import com.cts.bean.Login;
import com.cts.bean.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public void register(User user) throws Exception {
		// TODO Auto-generated method stub
		userDao.register(user);
	}

	public User validateUser(Login login) throws Exception {
		// TODO Auto-generated method stub
		return userDao.validateUser(login);
	}

}
