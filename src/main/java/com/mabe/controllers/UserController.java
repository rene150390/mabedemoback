package com.mabe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mabe.auth.UserAuth;
import com.mabe.dataservice.UserDataService;
import com.mabe.model.User;
import com.mabe.utils.ClassBase64;
import com.mabe.utils.FechaHora;
import com.mabe.utils.MD5;
import com.mabe.utils.PasswordEncoder;
import com.mabe.wrappers.WSetLoginUser;
import com.mabe.wrappers.WebServiceResponse;

@Controller
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired private UserDataService userDataService;
	@Autowired private ShaPasswordEncoder shaEncoder;
	
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public @ResponseBody String addUser(@RequestBody User user) {
		User newuser = new User(user.getUser_nickname(), user.getUser_email(), PasswordEncoder.encodePassword(user.getUser_password()), FechaHora.getFechaHora());
		this.userDataService.addUser(newuser);
		
		return "Ok";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public @ResponseBody WebServiceResponse userLogin(@RequestBody UserAuth user) {
		
		String result = "";
		String user_email = user.getEmail();
		List<User> listaUsuariosEmail = this.userDataService.getUsersByEmail(user_email);
		String apikey = "";
		User primerUser = null;
		String userPass = "";
		WebServiceResponse response = new WebServiceResponse();
		WSetLoginUser lu = null;
		if(listaUsuariosEmail.isEmpty()){
			result = "usuarionoexiste";
		}else{
			primerUser = listaUsuariosEmail.get(0);
			userPass = primerUser.getUser_password();
			apikey = primerUser.getApikey();
			result = "LoginOk";
			if(PasswordEncoder.isMatch(user.getPassword(), userPass)
					&& result.equals("LoginOk")){
				result = "LoginOk";
				if(apikey.equals("") && result.equals("LoginOk")){
					result = "LoginOk";
				}else{
					this.userDataService.logOut(user_email);
					result = "LoginOk";
				}
			}else{
				result = "wrongpass";
			}
			if(result.equals("LoginOk") ){
				String hashedApikey = this.shaEncoder.encodePassword(ClassBase64.encode(FechaHora.getFechaHora())+MD5.encodeMD5(MD5.encodeMD5(user_email)), "");
				this.userDataService.setApikey(user_email, hashedApikey);
				String apikeyraw = this.userDataService.getUsersByEmail(user_email).get(0).getApikey();
				lu = new WSetLoginUser(result, ""+primerUser.getId_user(), primerUser.getUser_nickname(), apikeyraw);
				response.setRespuesta(lu);
			}else{
				lu= new WSetLoginUser(result, "", "", "");
				response.setRespuesta(lu);
			}
			
		}
		
		return response;
	}
}
