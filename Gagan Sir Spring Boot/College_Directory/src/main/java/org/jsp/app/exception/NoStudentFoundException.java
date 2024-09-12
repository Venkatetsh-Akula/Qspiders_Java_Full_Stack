package org.jsp.app.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class NoStudentFoundException extends RuntimeException{
	private String message;
	public NoStudentFoundException(String message) {
		this.message=message;
	}
	@Override
	public String toString() {
		return this.message;
	}
}
