package com.mabe.dataserviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mabe.dao.UserDAO;
import com.mabe.dataservice.UserDataService;
import com.mabe.model.User;

@Service
public class UserDataServiceImp implements UserDataService{
	
	@Autowired private UserDAO userDAO;
	
	@Transactional
	public void addUser(User user){
		this.userDAO.addUser(user);
	}
	
	@Transactional
	public List<User> getUsersByNickname(String user_nickname){
		return this.userDAO.getUsersByNickname(user_nickname);
	}
	
	@Transactional
	public List<User> getUsersByEmail(String user_email){
		return this.userDAO.getUsersByEmail(user_email);
	}
	
	@Transactional
	public void logOut(String user_email){
		this.userDAO.logOut(user_email);
	}
	
	@Transactional
	public void setApikey(String user_email, String apikey){
		this.userDAO.setApikey(user_email, apikey);
	}
}
