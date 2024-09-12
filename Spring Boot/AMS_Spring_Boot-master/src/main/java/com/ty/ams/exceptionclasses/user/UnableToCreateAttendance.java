package com.ty.ams.exceptionclasses.user;

public class UnableToCreateAttendance extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "Unable To create Attendance check the Deatils and Timesheet Id";
	}

}
