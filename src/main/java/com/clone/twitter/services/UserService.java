package com.clone.twitter.services;

import java.util.List;

import com.clone.twitter.entities.User;

public interface UserService {

	User getUserById(Integer userId);
	
	List<User> getAllUsers();

	User saveUser(User user);

}