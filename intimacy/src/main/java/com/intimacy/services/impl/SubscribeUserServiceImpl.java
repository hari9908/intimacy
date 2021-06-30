package com.intimacy.services.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.intimacy.model.User;
import com.intimacy.repository.UserRepository;
import com.intimacy.request.SubscribeUserRequestEntity;
import com.intimacy.services.SubscribeUserService;

@Service
public class SubscribeUserServiceImpl implements SubscribeUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public ResponseEntity<Map<String, Object>> addSubscribeUser(SubscribeUserRequestEntity subscribeUserRequestEntity) {

		Map<String, Object> result = new HashMap<String, Object>();

		if (subscribeUserRequestEntity == null) {
			result.put("Error : ", "Invalid request");
			return new ResponseEntity<Map<String, Object>>(result, HttpStatus.BAD_REQUEST);
		}

		if (subscribeUserRequestEntity.getRequestor() == null || subscribeUserRequestEntity.getTarget() == null) {
			result.put("Error : ", "Requester or Target can not be empty");
			return new ResponseEntity<Map<String, Object>>(result, HttpStatus.BAD_REQUEST);
		}

		String email1 = subscribeUserRequestEntity.getRequestor();
		String email2 = subscribeUserRequestEntity.getTarget();

		if (email1.equals(email2)) {
			result.put("Info : ", "Cannot subscribe , if users are same");
			return new ResponseEntity<Map<String, Object>>(result, HttpStatus.OK);
		}

		User user1 = this.userRepository.findByEmail(email1);
		User user2 = this.userRepository.findByEmail(email2);

		user1.addSubscribeUsers(user2);
		this.userRepository.save(user1);

		result.put("Success", true);

		return new ResponseEntity<Map<String, Object>>(result, HttpStatus.OK);
	}
}
