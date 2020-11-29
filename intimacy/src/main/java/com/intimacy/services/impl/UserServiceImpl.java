package com.intimacy.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intimacy.model.User;
import com.intimacy.repository.UserRepository;
import com.intimacy.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {

		return userRepository.findAll();
	}

}
