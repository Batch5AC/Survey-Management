package com.survey.loginservice.service;

import java.util.List;

import com.survey.loginservice.pojo.AdminDataPojo;
import com.survey.loginservice.pojo.AdminLoginPojo;
import com.survey.loginservice.pojo.LoginPojo;

public interface LoginService {
	LoginPojo checkUser(LoginPojo loginPojo);

	List<AdminDataPojo> checkAdmin(AdminLoginPojo adminLoginPojo);

}
