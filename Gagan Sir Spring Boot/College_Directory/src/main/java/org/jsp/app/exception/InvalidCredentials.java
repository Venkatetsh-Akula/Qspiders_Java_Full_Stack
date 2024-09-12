package org.jsp.app.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class InvalidCredentials extends RuntimeException {
	private String message;
	public InvalidCredentials(String message) {
		this.message=message;
	}
	@Override
	public String toString() {
		return this.message;
	}
}
