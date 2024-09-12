package com.ty.ams.exceptionclasses.user;

public class InvalidEmailException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Invalid Email, the Formate of Provided Email is Invalid...";
	}
	
}
