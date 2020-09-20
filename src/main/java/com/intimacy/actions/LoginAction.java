package com.intimacy.actions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginAction {

	LoginAction(){
		System.out.println("----------");
	}
	
	@RequestMapping("/login")
	String logIn() {
		return "role1/welcome";
	}
}
