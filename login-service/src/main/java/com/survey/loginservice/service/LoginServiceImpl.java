package com.survey.loginservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.loginservice.dao.LoginDao;
import com.survey.loginservice.entity.LoginEntity;
import com.survey.loginservice.pojo.LoginPojo;
@Service

public class LoginServiceImpl implements LoginService{
@Autowired
LoginDao loginDao;
	@Override
	public LoginPojo validateBuyerSignup(LoginPojo loginPojo) {
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
}