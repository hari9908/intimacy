package com.intimacy.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intimacy.dao.UserDAO;
import com.intimacy.entity.User;

@Controller
@RequestMapping("/friends")
public class UserAction {

	// need to inject User DAO
	@Autowired
	private UserDAO userDAO;

	@RequestMapping("/welcome")
	public String friendsList(Model model) {

		List<User> friendsList = userDAO.getUsers();
		model.addAttribute("friendsList", friendsList);
		return "users/welcome";

	}

}
