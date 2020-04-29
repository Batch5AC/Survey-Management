package com.survey.loginservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.loginservice.dao.AdminLoginDao;
import com.survey.loginservice.dao.LoginDao;
import com.survey.loginservice.entity.AdminDataEntity;
import com.survey.loginservice.entity.AdminLoginEntity;
import com.survey.loginservice.entity.LoginEntity;
import com.survey.loginservice.pojo.AdminDataPojo;
import com.survey.loginservice.pojo.AdminLoginPojo;
import com.survey.loginservice.pojo.LoginPojo;
@Service

public class LoginServiceImpl implements LoginService{
@Autowired
LoginDao loginDao;
@Autowired
AdminLoginDao adminLoginDao;
	@Override
	public LoginPojo checkUser(LoginPojo loginPojo) {
		// TODO Auto-generated method stub
		LoginEntity loginEntity = loginDao.findByUsernameAndPassword(loginPojo.getUsername(),
				loginPojo.getPassword());
		
        //checking for the existence of buyer entity
		
		if (loginEntity!= null) {
			loginPojo = new LoginPojo(loginEntity.getId(), loginEntity.getUsername(),
					null);
			return loginPojo;
	}

	return null;

}
	@Override
	public AdminDataPojo checkAdmin(AdminLoginPojo adminLoginPojo) {
		AdminLoginEntity adminLoginEntity = adminLoginDao.findByUsernameAndPassword(adminLoginPojo.getUsername(),
				adminLoginPojo.getPassword());
	

		if(adminLoginEntity!=null) {
			
			
			
			//////should finish
		}
		return null;
	}
}