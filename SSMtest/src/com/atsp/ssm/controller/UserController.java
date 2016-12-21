package com.atsp.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.atsp.ssm.model.User;
import com.atsp.ssm.service.impl.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/getAllUser")
	
	public String getAllUser(HttpServletRequest request) {
		List<User> list = userService.getAllUser();
		
		request.setAttribute("listUser", list);
		
	//	System.out.println("~~~~");
		return "/AllUser";
	}
	
	@RequestMapping(value="/getUserById")
	
	public String  getUserById(@RequestParam(value="id") int id,HttpServletRequest request,Model model){
		User user = userService.getUserById(id);
	
	
		List<User> list = new ArrayList<>();
		list.add(user);
		model.addAttribute("listUser",list);
//		request.setAttribute("listUser", list);
//		request.setAttribute("user", user);
		System.out.println(id);

		return "/AllUser";
	}
	
	
}
