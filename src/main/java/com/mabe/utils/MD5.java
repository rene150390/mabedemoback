/*
 * Developer: René Mariano Sanabria, renemarianos@hotmail.com, https://github.com/renesanabria90
 * 
 * MD5 encrypt. 
 *
 * 
 * */

package com.mabe.utils;



import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class MD5 {
	
	 public static String encodeMD5(String nickname){
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		return encoder.encodePassword(nickname, null); 
	 }
	

}
