package com.atsp.ssm.service.impl;

import java.util.List;

import com.atsp.ssm.model.User;

public interface UserService {
	
	public List<User> getAllUser();
	
	public User getUserById(int id);
}
