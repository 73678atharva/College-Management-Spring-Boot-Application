package com.app.service;

import com.app.entity.User;
import com.app.entity.UserDTO;

public interface UserService {

	public UserDTO createUser(User user);
	
	public String loginUser(User user);	
}
