package org.jsp.app.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.jsp.app.controller.IdNotFindException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception e,WebRequest w){
		ErrorDetails er=new ErrorDetails(LocalDateTime.now(),e.getMessage(),w.getDescription(false));
		return new ResponseEntity(er,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(IdNotFindException.class)
	public final ResponseEntity<Object> handleUserNotFoundException(Exception e,WebRequest w){
		ErrorDetails er=new ErrorDetails(LocalDateTime.now(),e.getMessage(),w.getDescription(false));
		return new ResponseEntity(er,HttpStatus.NOT_FOUND);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		
		ErrorDetails er=new ErrorDetails(LocalDateTime.now(),ex.getFieldError().getDefaultMessage(),request.getDescription(false));
		
		return new ResponseEntity(er,HttpStatus.BAD_REQUEST);
	}
	
}
