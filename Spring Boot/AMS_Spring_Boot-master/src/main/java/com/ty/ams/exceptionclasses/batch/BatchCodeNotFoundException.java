package com.ty.ams.exceptionclasses.batch;

public class BatchCodeNotFoundException extends RuntimeException{

	@Override
	public String getMessage() {
		return "Invalid Batch Code EXception";
	}
}
