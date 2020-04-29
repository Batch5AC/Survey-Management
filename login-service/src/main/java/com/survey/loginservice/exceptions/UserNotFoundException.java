package com.survey.loginservice.exceptions;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(Integer uId) {
		super("could not find user"+uId);
	}

}
