package com.ty.ams.exceptionclasses.user;

public class InvalidPhoneNumberOrPasswordException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Invalid Credentials, Invalid Phone Number or Password";
	}
}
