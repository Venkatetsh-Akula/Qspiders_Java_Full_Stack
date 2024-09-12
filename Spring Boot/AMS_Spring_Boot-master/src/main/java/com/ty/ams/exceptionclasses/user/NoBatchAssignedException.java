package com.ty.ams.exceptionclasses.user;

public class NoBatchAssignedException extends RuntimeException {
	@Override
	public String getMessage() {
		return "No Batchs Assigned, No Batchs Are Taken By This User";
	}
}
