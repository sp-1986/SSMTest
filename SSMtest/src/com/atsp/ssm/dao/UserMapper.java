package com.atsp.ssm.dao;

import java.util.List;

import com.atsp.ssm.model.User;

public interface UserMapper {
	
	public List<User> getAllUser();
	
	public User getUserById(int id);
}
