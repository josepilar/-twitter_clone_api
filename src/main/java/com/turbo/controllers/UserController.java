package com.turbo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.turbo.entities.User;
import com.turbo.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "{id}",method = RequestMethod.GET)
	public User getUserById(@PathVariable("id") int userId)
	{
		return userService.getUserById(userId);
	}
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public User postUser(@RequestBody User user){
//		return user;
		return userService.saveUser(user);
	}
	
}
