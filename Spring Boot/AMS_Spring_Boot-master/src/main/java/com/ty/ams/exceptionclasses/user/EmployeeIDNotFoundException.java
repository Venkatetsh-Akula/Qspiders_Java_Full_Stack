package com.ty.ams.exceptionclasses.user;

public class EmployeeIDNotFoundException extends RuntimeException{
	@Override
	public String getMessage() {
		return "The Employee Id ( EMPID ) is not found in the Database, Invalid EMPID";
	}
}
