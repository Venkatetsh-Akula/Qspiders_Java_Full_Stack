package com.ty.ams.exceptionclasses.user;

public class InvalidPhoneNumberException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Invalid Phone Number, The Phone Number Formate is Invalid";
	}
}