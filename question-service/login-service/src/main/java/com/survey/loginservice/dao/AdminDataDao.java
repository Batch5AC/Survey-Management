package com.survey.loginservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.loginservice.entity.AdminDataEntity;



public interface AdminDataDao extends JpaRepository<AdminDataEntity , Integer> {

	
}
