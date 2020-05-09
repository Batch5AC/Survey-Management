package com.survey.loginservice.controller;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.survey.loginservice.pojo.AdminDataPojo;
import com.survey.loginservice.pojo.AdminLoginPojo;
import com.survey.loginservice.pojo.LoginPojo;
import com.survey.loginservice.pojo.QuestionPojo;
import com.survey.loginservice.pojo.UserOutput;
import com.survey.loginservice.service.LoginService;

@CrossOrigin
@RestController
@RequestMapping("login")
public class LoginController {
	static Logger LOG = Logger.getLogger(LoginController.class.getClass());
	@Autowired
	LoginService loginService;

	// Accepting the user credentials and calling the checkUser method of LoginserviceImpl
	
	@GetMapping("user")
	public ResponseEntity<UserOutput> checkUser(@RequestHeader("Authorization") String data) {
		BasicConfigurator.configure();
		LOG.info("Entered end point \'login/user \' ");

		String token[] = data.split(":");
		LoginPojo loginPojo = new LoginPojo();
		loginPojo.setUsername(token[0]);
		loginPojo.setPassword(token[1]);
		LOG.info("Exited end point \'login/user \' ");
		return this.loginService.checkUser(loginPojo);
	}

	// accepting the user credentials and calling the checkUser method of
	// serviceImpl
	@GetMapping("admin")
	public ResponseEntity<List<AdminDataPojo>> checkAdmin(@RequestHeader("Authorization") String data) {
		// List<AdminDataPojo> checkAdmin(@RequestHeader("Authorization") String data) {
		LOG.info("Entered end point \'login/admin \' ");
		String token[] = data.split(":");
		AdminLoginPojo adminLoginPojo = new AdminLoginPojo();
		adminLoginPojo.setUsername(token[0]);
		adminLoginPojo.setPassword(token[1]);
		LOG.info("Exited end point \'login/admin \' ");
		return this.loginService.checkAdmin(adminLoginPojo);
	}

	// retrieving the questions from question service using rest template
	@GetMapping("question")

	// calling the fallback method using hystrix
	@HystrixCommand(fallbackMethod = "getFallbackCatalog")
	QuestionPojo getQuestions() {

		RestTemplate restTemplate = new RestTemplate();
		System.out.println("hi");

		QuestionPojo questionpojo = restTemplate.getForObject("http://localhost:8182/question-service/survey/questions",
				QuestionPojo.class);
		return questionpojo;
	}

	// Hystrix call back method when question service method is down
	QuestionPojo getFallbackCatalog() {
		return new QuestionPojo(0, "server down", "server down", "server down", "server down", "server down",
				"server down");
	}
}