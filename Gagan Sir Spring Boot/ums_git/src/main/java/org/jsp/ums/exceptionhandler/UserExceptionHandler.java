package org.jsp.ums.exceptionhandler;

import org.jsp.ums.exceptionclasses.InvalidUserId;
import org.jsp.ums.responsestructure.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionHandler {
	
	@ExceptionHandler(InvalidUserId.class)
	public ResponseEntity<?> inavlidUserIdExceptionHandler(InvalidUserId e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ResponseStructure.builder().status(HttpStatus.BAD_REQUEST.value()).message("Invalid User Id Unable To Find User").body(e.getMessage()).build());
	}
	
	
}
