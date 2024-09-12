package com.ty.ams.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ty.ams.exceptionclasses.batch.BatchCodeNotFoundException;
import com.ty.ams.exceptionclasses.batch.BatchIdNotFoundException;
import com.ty.ams.exceptionclasses.batch.BatchesNotPresentException;
import com.ty.ams.exceptionclasses.batch.NoSuchBatchModeFoundException;
import com.ty.ams.exceptionclasses.batch.StartDateAndEndDateNotValidException;
import com.ty.ams.exceptionclasses.batch.StartedDateInvalidException;
import com.ty.ams.exceptionclasses.batch.SubjectNameNotFoundExcpetion;
import com.ty.ams.responsestructure.ResponseStructure;

@RestControllerAdvice
public class BatchExceptionHandler {

	@ExceptionHandler(BatchIdNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> batchIdNotFoundExceptionHandler(
			BatchIdNotFoundException batchIdNotFoundException) {
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		structure.setBody(batchIdNotFoundException.getMessage());
		structure.setMessage("No Batch Found For Passed Batch Id");
		return new ResponseEntity<>(structure, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(BatchCodeNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> batchCodeNotFoundException(
			BatchCodeNotFoundException batchCodeNotFoundException) {
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		structure.setBody(batchCodeNotFoundException.getMessage());
		structure.setMessage("No Batch Found For Passed Batch Code");
		return new ResponseEntity<>(structure, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(BatchesNotPresentException.class)
	public ResponseEntity<ResponseStructure<String>> batchNotPresentException(
			BatchesNotPresentException batchesNotPresentException) {
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		structure.setBody(batchesNotPresentException.getMessage());
		structure.setMessage("No Batches to desplay");
		return new ResponseEntity<>(structure, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(SubjectNameNotFoundExcpetion.class)
	public ResponseEntity<ResponseStructure<String>> subjectNameNotFoundExcpetion(
			SubjectNameNotFoundExcpetion subjectNameNotFoundExcpetion) {
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		structure.setBody(subjectNameNotFoundExcpetion.getMessage());
		structure.setMessage("No such subject name present");
		return new ResponseEntity<>(structure, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(StartedDateInvalidException.class)
	public ResponseEntity<ResponseStructure<String>> startedDateInvalidException(
			StartedDateInvalidException startedDateInvalidException) {
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		structure.setBody(startedDateInvalidException.getMessage());
		structure.setMessage("No such start date for batch");
		return new ResponseEntity<>(structure, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(NoSuchBatchModeFoundException.class)
	public ResponseEntity<ResponseStructure<String>> startedDateInvalidException(
			NoSuchBatchModeFoundException noSuchBatchModeFoundException) {
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		structure.setBody(noSuchBatchModeFoundException.getMessage());
		structure.setMessage("No such Batch Mode ");
		return new ResponseEntity<>(structure, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(StartDateAndEndDateNotValidException.class)
	public ResponseEntity<ResponseStructure<String>> startedDateInvalidException(
			StartDateAndEndDateNotValidException startDateAndEndDateNotValidException) {
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		structure.setBody(startDateAndEndDateNotValidException.getMessage());
		structure.setMessage("No such Start date or End Date for Batch ");
		return new ResponseEntity<>(structure, HttpStatus.NOT_FOUND);
	}
}
