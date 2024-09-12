package org.jsp.app.exception;

import org.springframework.stereotype.Service;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class NoDepartmentFoundException extends RuntimeException{
	private String message;
	public NoDepartmentFoundException(String message) {
		this.message=message;
	}
	@Override
	public String toString() {
		return this.message;
	}
}
