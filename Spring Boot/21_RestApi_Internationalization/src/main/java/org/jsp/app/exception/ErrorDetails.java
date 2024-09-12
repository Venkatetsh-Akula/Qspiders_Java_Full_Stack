package org.jsp.app.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ErrorDetails {
	private LocalDateTime localdate;
	private String message;
	private String error;
	public ErrorDetails(LocalDateTime localdate, String message, String error) {
		super();
		this.localdate = localdate;
		this.message = message;
		this.error = error;
	}
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LocalDateTime getLocaldate() {
		return localdate;
	}
	public void setLocaldate(LocalDateTime localdate) {
		this.localdate = localdate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}
