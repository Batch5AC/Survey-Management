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
	@RequestMapping("survey/user")
	public class LoginController {
		@Autowired
		LoginService loginService;

		@GetMapping("validate")
		
		//calling validateBuyer method 
		
		LoginPojo validateBuyerSignup(@RequestHeader("Authorization") String data) {
			
			String token[] = data.split(":");
			LoginPojo loginPojo = new LoginPojo();
			LoginPojo.setUsername(token[0]);
			LoginPojo.setPassword(token[1]);
			return LoginService.validateBuyerSignup(loginPojo);
		}

		//end point for retrieving an buyer
		@GetMapping("buyer/{buyerId}")
		LoginPojo getBuyer(@PathVariable("buyerId") Integer buyerId) {
			
			
			return LoginService.getBuyer(buyerId);
		}

	}


