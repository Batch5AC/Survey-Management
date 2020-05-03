package com.survey.loginservice.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.survey.loginservice.exceptions.AdminNotFoundException;

@ControllerAdvice
	public class GlobalExceptionHandlerController {
		@SuppressWarnings("unchecked")
		@ResponseBody
		@ExceptionHandler(AdminNotFoundException.class)
		@ResponseStatus(HttpStatus.NOT_FOUND)
		Map adminNotFoundHandler(AdminNotFoundException ex) {
			Map  map=new HashMap();
			map.put("error Code",HttpStatus.NOT_FOUND );
			map.put("errorMessage", ex.getMessage());
			map.put("errorDate", new Date());
			return map;
			
		}
		}


