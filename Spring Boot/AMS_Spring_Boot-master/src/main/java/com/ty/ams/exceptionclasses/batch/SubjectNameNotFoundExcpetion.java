package com.ty.ams.exceptionclasses.batch;

public class SubjectNameNotFoundExcpetion extends RuntimeException{
 @Override
public String getMessage() {
	return "Subject Name not Present";
}
}
