package com.survey.loginservice.exceptions;

public class AdminNotFoundException extends RuntimeException {
 
	
	public AdminNotFoundException(String eId) {
		super("could not find User " + eId);
	}
}
