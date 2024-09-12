package com.ty.ams.exceptionclasses.timesheet;

public class TimeSheetAlreadyExists extends RuntimeException {

	@Override
	public String getMessage() {
		return "time sheet already presented for this month";
	}
}
