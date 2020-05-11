package com.ssy.asy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssy.asy.service.UserService;
import com.ssy.asy.service.impl.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UserService userServiceimpl;
	
	@RequestMapping("/user")
	public String GetUser(long id){
		
		return userServiceimpl.Userservice(id).toString();
	}
	
//	@RequestMapping("getUser/{id}")
//	public String GetUser1(@PathVariable long id){
//		
//		return userServiceimpl.Userservice(id).toString();
//	}

}
