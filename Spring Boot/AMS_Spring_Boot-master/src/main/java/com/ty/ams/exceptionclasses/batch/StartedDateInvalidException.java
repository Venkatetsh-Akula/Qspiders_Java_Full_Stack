package com.ty.ams.exceptionclasses.batch;

public class StartedDateInvalidException extends RuntimeException{

	@Override
	public String getMessage() {
		return "diven date for batch start date is not valid";
	}
	
}
