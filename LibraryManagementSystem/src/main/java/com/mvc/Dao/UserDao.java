package com.mvc.Dao;

import com.mvc.bean.Login;
import com.mvc.bean.User;

public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}
