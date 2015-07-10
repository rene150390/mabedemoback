/*
 * Developer: René Mariano Sanabria, renemarianos@hotmail.com, https://github.com/renesanabria90
 * 
 * BCrypt encode, and compare password type by the user with existing password stored in the database. 
 *
 * 
 * */

package com.mabe.utils;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	
	private String password;
	public static String encodePassword(String password){
		List<String> listaPassword = new ArrayList<String>();
		
		int i = 0;
		while (i < 10) {
			
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String hashedPassword = passwordEncoder.encode(password);
			listaPassword.add(hashedPassword);
			//System.out.println(""+hashedPassword+"");
			i++;
		}
		//System.out.println(""+PasswordEncoder.randomValue()+"");
		return listaPassword.get(PasswordEncoder.randomValue());
		
	}
	public static String encodePassword1(String password){
		//List<String> listaPassword = new ArrayList<String>();
		
		//int i = 0;
		//while (i < 10) {
			
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String hashedPassword = passwordEncoder.encode(password);
			//listaPassword.add(hashedPassword);
			//System.out.println(""+hashedPassword+"");
			//i++;
		//}
		//System.out.println(""+PasswordEncoder.randomValue()+"");
		return hashedPassword;
		
	}
	/*public static String encodePassword(String password){
		//List<String> listaPassword = new ArrayList<String>();
		
		//int i = 0;
		//while (i < 10) {
			
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String hashedPassword = passwordEncoder.encode(password);
			//listaPassword.add(hashedPassword);
			//System.out.println(""+hashedPassword+"");
			//i++;
		//}
		//System.out.println(""+PasswordEncoder.randomValue()+"");
		return hashedPassword;
		
	}*/
	
	public static int randomValue(){
		Random r = new Random();
		return r.nextInt(9-0) + 0;
	}
	
	public static boolean isMatch(String pass1, String pass2){
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		boolean flag = passwordEncoder.matches(pass1, pass2) == true ? true : false;
		return flag;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
