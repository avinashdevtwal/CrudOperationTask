package com.crudoperation.exceptionhandel;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourcenotfountException extends RuntimeException {
 
	
	private static final long serialVersionUID = 1L;

	public ResourcenotfountException(String message) {
 super(message);
	}
}