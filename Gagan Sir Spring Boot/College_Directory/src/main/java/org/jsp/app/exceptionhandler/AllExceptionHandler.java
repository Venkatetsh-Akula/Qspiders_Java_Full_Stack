package org.jsp.app.exceptionhandler;

import org.jsp.app.exception.EmailAlreadyExist;
import org.jsp.app.exception.InvalidCredentials;
import org.jsp.app.exception.InvalidData;
import org.jsp.app.exception.NoAdministratorFound;
import org.jsp.app.exception.NoCourseFoundException;
import org.jsp.app.exception.NoDepartmentFoundException;
import org.jsp.app.exception.NoEnrollmentFoundException;
import org.jsp.app.exception.NoFacultyFoundException;
import org.jsp.app.exception.NoStudentFoundException;
import org.jsp.app.exception.NoUserFoundException;
import org.jsp.app.structure.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AllExceptionHandler {

	@ExceptionHandler(InvalidCredentials.class)
	public ResponseEntity<?> invalidCredentialsMethod(InvalidCredentials e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().httpcode(HttpStatus.NOT_FOUND.value())
				.message("Invalid UserName Or Invalid Password").body(e.toString()).build());
	}
	
	
	@ExceptionHandler(InvalidData.class)
	public ResponseEntity<?> invalidDataMethod(InvalidData e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ResponseStructure.builder().httpcode(HttpStatus.BAD_REQUEST.value())
				.message("Some Data Missing from User").body(e.toString()).build());
	}
	@ExceptionHandler(EmailAlreadyExist.class)
	public ResponseEntity<?> emailAlreadyExistMethod(EmailAlreadyExist e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ResponseStructure.builder().httpcode(HttpStatus.BAD_REQUEST.value())
				.message("Email Already Exist").body(e.getMessage()).build());
	}
	@ExceptionHandler(NoUserFoundException.class)
	public ResponseEntity<?> noUserFoundExceptionMethod(NoUserFoundException e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().httpcode(HttpStatus.NOT_FOUND.value())
				.message("No Users found based on Id").body(e.getMessage()).build());
				
	}
	
	
	@ExceptionHandler(NoStudentFoundException.class)
	public ResponseEntity<?> noStudentFoundExceptionMethod(NoStudentFoundException e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().httpcode(HttpStatus.NOT_FOUND.value())
				.message("No Students found").body(e.getMessage()).build());
	}
	@ExceptionHandler(NoFacultyFoundException.class)
	public ResponseEntity<?> noFacultyFoundExceptionMethod(NoFacultyFoundException e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().httpcode(HttpStatus.NOT_FOUND.value())
				.message("No Faculty Found").body(e.getMessage()).build());
	}
	@ExceptionHandler(NoAdministratorFound.class)
	public ResponseEntity<?> noAdministratorFoundMethod(NoAdministratorFound e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().httpcode(HttpStatus.NOT_FOUND.value())
				.message("No Administrator Found in data").body(e.toString()).build());
	}
	@ExceptionHandler(NoCourseFoundException.class)
	public ResponseEntity<?> noCourseFoundExceptionMethod(NoCourseFoundException e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().httpcode(HttpStatus.NOT_FOUND.value())
				.message("No Course Found in the list").body(e.toString()).build());
	}
	@ExceptionHandler(NoEnrollmentFoundException.class)
	public ResponseEntity<?>  noEnrollmentFoundExceptionMethod(NoEnrollmentFoundException e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().httpcode(HttpStatus.NOT_FOUND.value())
				.message("No enrollments found").body(e.getMessage()).build());
	}
	@ExceptionHandler(NoDepartmentFoundException.class)
	public ResponseEntity<?> noDepartmentFoundExceptionMethod(NoDepartmentFoundException e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().httpcode(HttpStatus.NOT_FOUND.value())
				.message("No Departments found").body(e.toString()).build());
	}
}
