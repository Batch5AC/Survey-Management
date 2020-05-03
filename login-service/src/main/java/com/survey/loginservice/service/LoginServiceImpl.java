package com.survey.loginservice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.loginservice.dao.AdminDataDao;
import com.survey.loginservice.dao.AdminLoginDao;
import com.survey.loginservice.dao.LoginDao;
import com.survey.loginservice.entity.AdminDataEntity;
import com.survey.loginservice.entity.AdminLoginEntity;
import com.survey.loginservice.entity.LoginEntity;
import com.survey.loginservice.exceptions.AdminNotFoundException;
import com.survey.loginservice.pojo.AdminDataPojo;
import com.survey.loginservice.pojo.AdminLoginPojo;
import com.survey.loginservice.pojo.LoginPojo;
@Service

public class LoginServiceImpl implements LoginService{
	static Logger LOG = Logger.getLogger(LoginServiceImpl.class.getClass());
@Autowired
LoginDao loginDao;
@Autowired
AdminLoginDao adminLoginDao;
@Autowired
AdminDataDao adminDataDao;
	@Override
	public LoginPojo checkUser(LoginPojo loginPojo) {
		
		// TODO Auto-generated method stub
		LOG.info("Entered checkUser() service");


		LoginEntity loginEntity = loginDao.findByUsernameAndPassword(loginPojo.getUsername(),
				loginPojo.getPassword());
		
        //checking for the existence of buyer entity
		
		if (loginEntity!= null) {
			loginPojo = new LoginPojo(loginEntity.getId(), loginEntity.getUsername(),
					null);
			
			LOG.info("Exited checkUser() service");
			BasicConfigurator.resetConfiguration();
			return loginPojo;
	}
		else {
			throw new AdminNotFoundException(loginPojo.getUsername());
		}

	
}
	@Override
	public List<AdminDataPojo> checkAdmin(AdminLoginPojo adminLoginPojo) {
		LOG.info("Entered checkAdmin() service");
		AdminLoginEntity adminLoginEntity = adminLoginDao.findByUsernameAndPassword(adminLoginPojo.getUsername(),
				adminLoginPojo.getPassword());
	

		if(adminLoginEntity!=null) {
			
			List<AdminDataPojo> allAdminDataPojo=new ArrayList();
			Iterable<AdminDataEntity> allAdminDataEntity=adminDataDao.findAll();
			Iterator itr=allAdminDataEntity.iterator();
			while(itr.hasNext())
			{
				AdminDataEntity adminDataEntity=(AdminDataEntity) itr.next();
				AdminDataPojo adminDataPojo=new AdminDataPojo(adminDataEntity.getInputid(),adminDataEntity.getUserid(),adminDataEntity.getQuestion1(),adminDataEntity.getQuestion2(),adminDataEntity.getQuestion3(),adminDataEntity.getQuestion4(),adminDataEntity.getQuestion5(),adminDataEntity.getQuestion6());
				 allAdminDataPojo.add(adminDataPojo);
			
			
			}
			
			LOG.info("Exited checkAdmin() service");
			BasicConfigurator.resetConfiguration();
		return allAdminDataPojo;
		
		}
		
		else {
			throw new AdminNotFoundException(adminLoginPojo.getUsername());
		}
		
	}
}