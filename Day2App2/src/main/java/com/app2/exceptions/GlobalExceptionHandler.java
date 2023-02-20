package com.app2.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	

	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler(ProductException ie, WebRequest req)  {
		
		MyErrorDetails err= new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		
	 return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	
	}
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myanyExphandler(Exception ie, WebRequest req)  {
		
		MyErrorDetails err= new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
	 return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	
	}
	
@ExceptionHandler(NoHandlerFoundException.class)
public ResponseEntity<MyErrorDetails> mynotFoundHandler(NoHandlerFoundException nfe,WebRequest req)  {
		

MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));

	return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
				
}
	
	
	
	
	
}
