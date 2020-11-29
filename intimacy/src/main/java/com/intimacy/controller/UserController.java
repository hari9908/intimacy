package com.intimacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intimacy.model.User;
import com.intimacy.services.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> user = userService.getAllUsers();
		ResponseEntity<List<User>> responseEntity = null;

		try {
			responseEntity = new ResponseEntity<List<User>>(user, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = null;

		}

		return responseEntity;

	}

}
