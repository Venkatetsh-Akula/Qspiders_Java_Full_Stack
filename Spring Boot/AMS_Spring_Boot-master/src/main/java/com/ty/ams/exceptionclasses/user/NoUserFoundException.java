package com.ty.ams.exceptionclasses.user;

public class NoUserFoundException extends RuntimeException {
	@Override
	public String getMessage() {
		return "No Users Are Present In Database, Database Is Empty...";
	}
}