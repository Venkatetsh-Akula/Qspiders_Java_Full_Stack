package com.ty.ams.exceptionclasses.batch;

public class NoSuchBatchModeFoundException extends RuntimeException {
	@Override
	public String getMessage() {
		return "No such Batch Mode is present ";
	}

}
