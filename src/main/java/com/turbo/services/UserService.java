package com.turbo.services;

import java.util.List;

import com.turbo.entities.User;

public interface UserService {

	User getUserById(Integer userId);
	
	List<User> getAllUsers();

	User saveUser(User user);

}