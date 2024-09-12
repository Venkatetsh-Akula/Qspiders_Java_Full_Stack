package com.ty.ams.exceptionclasses.batch;

public class StartDateAndEndDateNotValidException extends RuntimeException{
@Override
public String getMessage() {
	return "Start Date and End Date are not Valid";
}
}
