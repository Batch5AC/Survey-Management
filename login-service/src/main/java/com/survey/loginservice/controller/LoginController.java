package com.survey.loginservice.controller;

	import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestHeader;
	import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.survey.loginservice.pojo.AdminDataPojo;
import com.survey.loginservice.pojo.AdminLoginPojo;
import com.survey.loginservice.pojo.LoginPojo;
import com.survey.loginservice.service.LoginService;
	@CrossOrigin
	@RestController
	@RequestMapping("login")
	public class LoginController {
		static Logger LOG = Logger.getLogger(LoginController.class.getClass());
		@Autowired
		LoginService loginService;

		
		//@RequestMapping(method = RequestMethod.GET, value ="user")
		@GetMapping("user")
		
		LoginPojo checkUser(@RequestHeader("Authorization") String data) {
			BasicConfigurator.configure();
			LOG.info("Entered end point \'login/user \' ");
			
			String token[] = data.split(":");
			LoginPojo loginPojo = new LoginPojo();
			loginPojo.setUsername(token[0]);
			loginPojo.setPassword(token[1]);
			LOG.info("Exited end point \'login/user \' ");
			return loginService.checkUser(loginPojo);
		}
		@GetMapping("admin")
		List<AdminDataPojo> checkAdmin(@RequestHeader("Authorization") String data) {
			LOG.info("Entered end point \'login/admin \' ");
			String token[] = data.split(":");
			AdminLoginPojo adminLoginPojo = new AdminLoginPojo();
			adminLoginPojo.setUsername(token[0]);
			adminLoginPojo.setPassword(token[1]);
			LOG.info("Exited end point \'login/admin \' ");
			return loginService.checkAdmin(adminLoginPojo);
		}
		
	}


