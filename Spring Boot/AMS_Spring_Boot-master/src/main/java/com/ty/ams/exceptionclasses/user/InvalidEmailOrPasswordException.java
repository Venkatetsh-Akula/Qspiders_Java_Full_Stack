package com.ty.ams.exceptionclasses.user;

public class InvalidEmailOrPasswordException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Inavalid Credentials, Invalid Email or Password";
	}
}
