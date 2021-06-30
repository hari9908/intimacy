package com.intimacy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intimacy.request.UserRequestEntity;
import com.intimacy.services.UserService;

@RestController
@RequestMapping("/user")
public class UserAPIController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> addUser(@RequestBody UserRequestEntity userRequestEntity) {
		return this.userService.addUser(userRequestEntity);
	}

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getUser(@RequestParam UserRequestEntity userRequestEntity) {
		return this.userService.addUser(userRequestEntity);
	}

	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getAllUser() {
		return this.userService.findAllUsers();
	}

}
