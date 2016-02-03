package com.turbo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.turbo.entities.User;
import com.turbo.services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	

	@RequestMapping(value="/{id}")
	@ResponseBody
	public User getUserById(@PathVariable("id") Integer id){
		return userService.gerUserById(id);
	}
}
