package com.ty.ams.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ty.ams.exceptionclasses.user.AttendanceNotFoundException;
import com.ty.ams.exceptionclasses.user.DuplicateEmailException;
import com.ty.ams.exceptionclasses.user.DuplicatePhoneNumberException;
import com.ty.ams.exceptionclasses.user.EmployeeIDNotFoundException;
import com.ty.ams.exceptionclasses.user.IdNotFoundException;
import com.ty.ams.exceptionclasses.user.InvalidEmailException;
import com.ty.ams.exceptionclasses.user.InvalidEmailOrPasswordException;
import com.ty.ams.exceptionclasses.user.InvalidPhoneNumberException;
import com.ty.ams.exceptionclasses.user.InvalidPhoneNumberOrPasswordException;
import com.ty.ams.exceptionclasses.user.NoBatchAssignedException;
import com.ty.ams.exceptionclasses.user.NoUserFoundException;
import com.ty.ams.exceptionclasses.user.UnableToCreateAttendance;
import com.ty.ams.responsestructure.ResponseStructure;

@RestControllerAdvice
public class UserExceptionHandler {

	@ExceptionHandler(DuplicateEmailException.class)
	public ResponseEntity<ResponseStructure<String>> duplicateEmailExceptionHandler(
			DuplicateEmailException duplicateEmailException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("Duplicate Email Encounterd...");
		structure.setBody(duplicateEmailException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(DuplicatePhoneNumberException.class)
	public ResponseEntity<ResponseStructure<String>> duplicatePhoneNumberExceptionHandler(
			DuplicatePhoneNumberException duplicatePhoneNumberException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("Duplicate Phone Number Encounterd...");
		structure.setBody(duplicatePhoneNumberException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(EmployeeIDNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> employeeIDNotFoundExceptionHandler(
			EmployeeIDNotFoundException employeeIDNotFoundException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		structure.setMessage("No Employee Found for Passed EMPID");
		structure.setBody(employeeIDNotFoundException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> idNotFoundExceptionHandler(
			IdNotFoundException idNotFoundException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		structure.setMessage("No User Found For Passed User Id");
		structure.setBody(idNotFoundException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(InvalidEmailOrPasswordException.class)
	public ResponseEntity<ResponseStructure<String>> invalidEmailOrPasswordExceptionHandler(
			InvalidEmailOrPasswordException invalidEmailOrPasswordException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("Invalid Credentials, Invalid Email or Password...");
		structure.setBody(invalidEmailOrPasswordException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InvalidEmailException.class)
	public ResponseEntity<ResponseStructure<String>> invalidEmailExceptionHandler(
			InvalidEmailException invalidEmailException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("Invalid Email Encounterd...");
		structure.setBody(invalidEmailException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InvalidPhoneNumberException.class)
	public ResponseEntity<ResponseStructure<String>> invalidPhoneNumberExceptionHandler(
			InvalidPhoneNumberException invalidPhoneNumberException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("Invalid Phone Number Encounterd...");
		structure.setBody(invalidPhoneNumberException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InvalidPhoneNumberOrPasswordException.class)
	public ResponseEntity<ResponseStructure<String>> invalidPhoneNumberOrPasswordExceptionHandler(
			InvalidPhoneNumberOrPasswordException invalidPhoneNumberOrPasswordException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("Invalid Credentials, Invalid Email or Password...");
		structure.setBody(invalidPhoneNumberOrPasswordException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoBatchAssignedException.class)
	public ResponseEntity<ResponseStructure<String>> noBatchAssignedExceptionHandler(
			NoBatchAssignedException noBatchAssignedException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("No Batchs Assigned for Particular User...");
		structure.setBody(noBatchAssignedException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoUserFoundException.class)
	public ResponseEntity<ResponseStructure<String>> noUserFoundExceptionHandler(
			NoUserFoundException noUserFoundException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("No Users are Present in Database, Database is Empty...");
		structure.setBody(noUserFoundException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UnableToCreateAttendance.class)
	public ResponseEntity<ResponseStructure<String>> unableToCreateAttendance(
			UnableToCreateAttendance unableToCreateAttendance){
		
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.CONFLICT.value());
		structure.setMessage("Unable to create the Attendance Check The Details And TimeSheet ID");
		structure.setBody(unableToCreateAttendance.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.CONFLICT);
		
	}
	
	@ExceptionHandler(AttendanceNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> attendanceNotFoundException(
			AttendanceNotFoundException attendanceNotFoundException ){
		
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.NO_CONTENT.value());
		structure.setMessage("Unable to find the attendance with mention details...");
		structure.setBody(attendanceNotFoundException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.NO_CONTENT);
	}

} 
