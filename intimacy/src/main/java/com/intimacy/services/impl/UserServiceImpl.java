package com.intimacy.services.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.intimacy.model.User;
import com.intimacy.repository.UserRepository;
import com.intimacy.request.UserRequestEntity;
import com.intimacy.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public ResponseEntity<Map<String, Object>> addUser(UserRequestEntity userRequestEntity) {
		Map<String, Object> result = new HashMap<String, Object>();
		User user = userRequestEntity.getUser();
		user = userRepository.save(user);
		result.put("sucess", user);
		return new ResponseEntity<Map<String, Object>>(result, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<Map<String, Object>> getUser(UserRequestEntity userRequestEntity) {

		Map<String, Object> result = new HashMap<String, Object>();
		User user = userRequestEntity.getUser();
		user = userRepository.findByEmail(user.getEmail());
		result.put("sucess", user);
		return new ResponseEntity<Map<String, Object>>(result, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<Map<String, Object>> findAllUsers() {
		Map<String, Object> result = new HashMap<String, Object>();

		List<User> users = userRepository.findAll();
		result.put("sucess", users);
		return new ResponseEntity<Map<String, Object>>(result, HttpStatus.OK);

	}

}
