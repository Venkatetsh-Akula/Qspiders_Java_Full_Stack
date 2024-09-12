package org.jsp.ums.exceptionclasses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Builder
@NoArgsConstructor
public class InvalidUserId extends RuntimeException {
	private  String message;
	public InvalidUserId(String message) {
		this.message=message;
	}
	
	
	@Override
	public String getMessage() {
		return message;
	}
}
