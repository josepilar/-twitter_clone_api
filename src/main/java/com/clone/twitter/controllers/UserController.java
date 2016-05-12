package com.clone.twitter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clone.twitter.entities.Credential;
import com.clone.twitter.entities.User;
import com.clone.twitter.services.CredentialIService;
import com.clone.twitter.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private CredentialIService credentialIService;
	
	@RequestMapping(value = "{id}",method = RequestMethod.GET)
	public User getUserById(@PathVariable("id") int userId){
		return  userService.getUserById(userId);
	}
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public User postUser(@RequestBody User user){
		return userService.saveUser(user);
	}
	
	@RequestMapping(value="{id}/credential", method = RequestMethod.POST)
	public Credential postCredential(@RequestBody Credential credential, @PathVariable("id") int userId){
		User user = userService.getUserById(userId);
		if(user != null){
			credential.setUser(user);
			return credentialIService.saveCredential(credential);
		}
		return null;
	}

}
