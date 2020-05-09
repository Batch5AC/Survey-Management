package com.survey.loginservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.loginservice.entity.AdminLoginEntity;

public interface AdminLoginDao extends JpaRepository<AdminLoginEntity, Integer> {
	AdminLoginEntity findByUsernameAndPassword(String username, String password);

}
