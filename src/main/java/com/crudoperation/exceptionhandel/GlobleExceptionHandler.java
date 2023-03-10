package com.crudoperation.exceptionhandel;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleExceptionHandler {
	

	@ExceptionHandler(ResourcenotfountException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)

	@ResponseBody
	public ErrorResponse handleNoRecordFoundException(ResourcenotfountException ex) 
	{

	    ErrorResponse errorResponse = new ErrorResponse();
	    errorResponse.setMessage(ex.getMessage());
	    return errorResponse;
	}
}
