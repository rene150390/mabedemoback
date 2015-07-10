package com.mabe.dao;

import java.util.List;

import com.mabe.model.User;

public interface UserDAO {
	public void addUser(User user);
	public List<User> getUsersByNickname(String user_nickname);
	public List<User> getUsersByEmail(String user_email);
	public void logOut(String user_email);
	public void setApikey(String user_email, String apikey);
}
