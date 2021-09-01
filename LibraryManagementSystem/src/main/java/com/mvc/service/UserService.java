package com.cts.service;

import com.cts.bean.Login;
import com.cts.bean.User;

public interface UserService {

	void register(User user) throws Exception;

	User validateUser(Login login) throws Exception;

}
