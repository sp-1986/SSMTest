package com.atsp.ssm.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.atsp.ssm.model.User;
import com.atsp.ssm.service.impl.UserService;


public class UserTest {
	
	@Resource
	public UserService userService;
	
	
	@Test
	public void getAllUser() {
		List<User> list = userService.getAllUser();
		System.out.println(list);
	
	}
	@Test
	public void getUserById(){
		
		User result = null;
		try {
			result = userService.getUserById(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}

}
