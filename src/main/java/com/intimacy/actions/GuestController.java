package com.intimacy.actions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestController {

	GuestController() {
		System.out.println("-----------");
	}

	@RequestMapping("/")
	public String guestLobby() {
		return "guest";
	}

}
