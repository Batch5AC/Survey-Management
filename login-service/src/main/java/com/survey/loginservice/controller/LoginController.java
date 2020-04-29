package com.survey.loginservice.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestHeader;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.survey.loginservice.pojo.LoginPojo;
import com.survey.loginservice.service.LoginService;
	@CrossOrigin
	@RestController
	@RequestMapping("user")
	public class LoginController {
		@Autowired
		LoginService loginService;

		@GetMapping("check")
		
		//calling validateBuyer method 
		
		LoginPojo validateBuyerSignup(@RequestHeader("Authorization") String data) {
			
			String token[] = data.split(":");
			LoginPojo loginPojo = new LoginPojo();
			loginPojo.setUsername(token[0]);
			loginPojo.setPassword(token[1]);
			return loginService.checkUser(loginPojo);
		}

		
	}


