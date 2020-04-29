package com.survey.inputservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	InputService inputService;
	
	@PostMapping("input")
	

	InputPojo addInput(@RequestBody InputPojo inputPojo)
	{
		//BasicConfigurator.configure();
		//LOG.info("entered controller add seller");

		//LOG.info("exited controller add seller");
		return inputService.addInput(inputPojo);
	}
	

}
