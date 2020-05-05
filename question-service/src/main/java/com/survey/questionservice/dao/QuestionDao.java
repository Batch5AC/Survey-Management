package com.survey.questionservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.questionservice.entity.QuestionEntity;

public interface QuestionDao extends JpaRepository<QuestionEntity, Integer> {

}
