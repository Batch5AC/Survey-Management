package com.survey.loginservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.survey.loginservice.pojo.AdminDataPojo;
import com.survey.loginservice.pojo.AdminLoginPojo;
import com.survey.loginservice.pojo.LoginPojo;
import com.survey.loginservice.pojo.UserOutput;

public interface LoginService {
	ResponseEntity<UserOutput> checkUser(LoginPojo loginPojo);

	ResponseEntity<List<AdminDataPojo>> checkAdmin(AdminLoginPojo adminLoginPojo);
}
