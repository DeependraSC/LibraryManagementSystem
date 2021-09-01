package com.cts.Dao;

import com.cts.bean.Login;
import com.cts.bean.User;
public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}