package com.survey.questionservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.survey.questionservice.Pojo.QuestionPojo;

public interface QuestionService {

	QuestionPojo getQuestions();

}
