package com.survey.questionservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.survey.questionservice.Pojo.QuestionPojo;
import com.survey.questionservice.service.QuestionService;

@RestController
@RequestMapping("survey")
@CrossOrigin

public class QuestionController {
	@Autowired
	QuestionService queService;

	// Using get mapping to retreive questions from DB
	@GetMapping("question")
	QuestionPojo getQuestions() {
	
		return queService.getQuestions();

	}

}
