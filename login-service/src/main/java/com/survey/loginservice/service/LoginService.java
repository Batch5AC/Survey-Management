package com.survey.loginservice.service;

import com.survey.loginservice.pojo.AdminDataPojo;
import com.survey.loginservice.pojo.AdminLoginPojo;
import com.survey.loginservice.pojo.LoginPojo;

public interface LoginService {
	LoginPojo checkUser(LoginPojo loginPojo);

	AdminDataPojo checkAdmin(AdminLoginPojo adminLoginPojo);

}
