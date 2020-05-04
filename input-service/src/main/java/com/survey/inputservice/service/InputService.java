package com.survey.inputservice.service;

import org.springframework.http.ResponseEntity;

import com.survey.inputservice.pojo.InputPojo;

public interface InputService {

	ResponseEntity<InputPojo> addInput(InputPojo inputPojo);
	
}
