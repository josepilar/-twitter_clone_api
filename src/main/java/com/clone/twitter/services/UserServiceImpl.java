package com.clone.twitter.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.twitter.entities.User;
import com.clone.twitter.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUserById(Integer userId) {
		return userRepository.findOne(userId);
	}

	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		return (User) userRepository.save(user);
	}

}
