package com.intimacy.actions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PasswordRecoveryAction {
	@RequestMapping("/forgotPassword")
	String forgotPassword(Model model) {

		model.addAttribute("message", "Sucess");
		return "forgot_password";
	}
}
 