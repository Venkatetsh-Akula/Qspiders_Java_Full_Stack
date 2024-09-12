package com.ty.ams.exceptionclasses.user;

public class AttendanceNotFoundWithTheEnterdDate extends RuntimeException {
	
	public String getMessage() {
		return "Unable to Find the Attendance with the Enter date";
	}
}
