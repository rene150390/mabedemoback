package com.mabe.daoimp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mabe.dao.UserDAO;
import com.mabe.model.User;

@Repository
public class UserDAOImp implements UserDAO{
	
	@Autowired private SessionFactory sessionFactory;
	
	public void addUser(User user){
		this.sessionFactory.getCurrentSession().save(user);
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getUsersByNickname(String user_nickname){
		return this.sessionFactory.getCurrentSession().createQuery("from User U where U.user_nickname='"+user_nickname+"'").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getUsersByEmail(String user_email){
		return this.sessionFactory.getCurrentSession().createQuery("from User U where U.user_email='"+user_email+"'").list();
	}
	
	public void logOut(String user_email){
		this.sessionFactory.getCurrentSession().createQuery("update User set apikey='' where user_email = '"+user_email+"'").executeUpdate();
	}
	
	public void setApikey(String user_email, String apikey){
		this.sessionFactory.getCurrentSession().createQuery("update User set apikey='"+apikey+"' where user_email = '"+user_email+"'").executeUpdate();
	}
}
