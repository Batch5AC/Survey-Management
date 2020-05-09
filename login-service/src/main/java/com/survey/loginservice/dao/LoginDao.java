package com.survey.loginservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.loginservice.entity.LoginEntity;

public interface LoginDao extends JpaRepository<LoginEntity, Integer> {
	LoginEntity findByUsernameAndPassword(String username, String password);

}
