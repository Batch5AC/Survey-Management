package com.survey.inputservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survey.inputservice.entity.InputEntity;



@Repository

public interface InputDao extends JpaRepository<InputEntity,Integer> {
	//InputEntity findByUserid(int userid);

	
}
