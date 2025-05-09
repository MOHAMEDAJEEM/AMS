package com.app.Execption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public  ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
		
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleGlobalException(Exception ex){
		return new ResponseEntity<>("Intername Server Error :" +ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	

}
