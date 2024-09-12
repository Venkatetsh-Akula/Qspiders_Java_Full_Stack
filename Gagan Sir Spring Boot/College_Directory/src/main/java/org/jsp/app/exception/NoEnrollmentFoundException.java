package org.jsp.app.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class NoEnrollmentFoundException extends RuntimeException {
	private String message;
	public NoEnrollmentFoundException(String message) {
		this.message=message;
	}
	@Override
	public String toString() {
		return this.message;
	}
}
