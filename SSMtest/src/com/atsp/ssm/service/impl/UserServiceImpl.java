package com.atsp.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atsp.ssm.dao.UserMapper;
import com.atsp.ssm.model.User;
import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userDao;
	
	@Override
	public List<User> getAllUser() {
		List<User> list = userDao.getAllUser();

		return list;
	}
	
	@Override
	public User getUserById(int id) {
		User user = userDao.getUserById(id);
	
		return user;
	}

}
