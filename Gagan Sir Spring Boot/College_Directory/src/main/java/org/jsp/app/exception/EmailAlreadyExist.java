package org.jsp.app.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
public class EmailAlreadyExist extends RuntimeException{
	private String message;
	public EmailAlreadyExist(String message) {
		this.message=message;
	}
	@Override
	public String toString() {
		return this.message;
	}
}
