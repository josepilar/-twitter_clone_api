package com.turbo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbo.entities.User;
import com.turbo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired 
	private UserRepository userRepository;
	
	@Override
	public User getUserById(Integer userId) {
		return userRepository.findOne(userId);
	}

}
