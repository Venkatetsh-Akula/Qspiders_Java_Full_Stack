package com.ty.ams.exceptionclasses.user;

public class DuplicateEmailException extends RuntimeException{
	@Override
	public String getMessage() {
		return "The Email Is Allready Exist In Database";
	}
}