package com.survey.inputservice.controller;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.survey.inputservice.pojo.InputPojo;
import com.survey.inputservice.service.InputService;

@CrossOrigin
@RestController
@RequestMapping("survey")
public class InputController {
	static Logger LOG = Logger.getLogger(InputController.class.getClass());
	
	@Autowired
	InputService inputService;
	
	
	@PostMapping("input")

	ResponseEntity<InputPojo> addInput(@RequestBody InputPojo inputPojo)
	{
		BasicConfigurator.configure();
		LOG.info("entered controller addInput()");

		LOG.info("exited controller addInput()");
		return this.inputService.addInput(inputPojo);
	}
	
	
	

}
