package com.intimacy.services;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.intimacy.request.UserRequestEntity;

public interface UserService {
	ResponseEntity<Map<String, Object>> addUser(UserRequestEntity userRequestEntity);

	ResponseEntity<Map<String, Object>> getUser(UserRequestEntity userRequestEntity);

	ResponseEntity<Map<String, Object>> findAllUsers();

}
