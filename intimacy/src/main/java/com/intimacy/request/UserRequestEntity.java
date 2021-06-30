package com.intimacy.request;

import java.util.List;

import com.intimacy.model.User;

public class UserRequestEntity {
	private List<String> userList;
	private User user;

	public List<String> getUsers() {
		return userList;
	}

	public void setUsers(List<String> userList) {
		this.userList = userList;
	}

	public List<String> getUserList() {
		return userList;
	}

	public void setUserList(List<String> userList) {
		this.userList = userList;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
