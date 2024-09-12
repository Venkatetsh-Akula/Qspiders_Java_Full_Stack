package com.ty.ams.exceptionclasses.batch;

public class BatchIdNotFoundException extends RuntimeException{

	@Override
	public String getMessage() {
		return "Batch Id Not Found, Invalid Batch id";
	}
}
