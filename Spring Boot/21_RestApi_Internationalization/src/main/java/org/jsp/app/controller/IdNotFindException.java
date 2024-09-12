package org.jsp.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class IdNotFindException extends RuntimeException{
	public IdNotFindException(String msg) {
		super(msg);
	}
}
