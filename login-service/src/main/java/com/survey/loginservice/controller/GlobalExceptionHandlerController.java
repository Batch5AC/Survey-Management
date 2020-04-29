package com.survey.loginservice.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.survey.loginservice.exceptions.UserNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandlerController {

	@ResponseBody
	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	Map employeeNotFoundHandler(UserNotFoundException ex) {
		Map  map=new HashMap();
		map.put("error Code",HttpStatus.NOT_FOUND );
		map.put("errorMessage", ex.getMessage());
		map.put("errorDate", new Date());
		return map;
		
}
}
