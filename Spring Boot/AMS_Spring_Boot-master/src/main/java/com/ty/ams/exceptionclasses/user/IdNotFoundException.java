package com.ty.ams.exceptionclasses.user;

public class IdNotFoundException extends RuntimeException{
	@Override
	public String getMessage() {
		return "The Id Not Found, For the Entity Id Not Found";
	}
}
