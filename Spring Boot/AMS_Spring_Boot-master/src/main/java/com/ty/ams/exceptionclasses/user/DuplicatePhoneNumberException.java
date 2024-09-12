package com.ty.ams.exceptionclasses.user;

public class DuplicatePhoneNumberException extends RuntimeException{
	@Override
	public String getMessage() {
		return "The Phone Number Is Already Exist In Database";
	}
}