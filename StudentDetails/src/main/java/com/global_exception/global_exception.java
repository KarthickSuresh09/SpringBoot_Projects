package com.global_exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class global_exception {

	
	@ExceptionHandler(id.class)
	public ResponseEntity <Object> getall(id e){
		return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(age.class)
	public ResponseEntity<Object> getall(age s){
		return new ResponseEntity<Object>(s.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(attendance.class)
	public ResponseEntity<Object>getall(attendance k){
		return new ResponseEntity<Object>(k.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(course.class)
	public ResponseEntity<Object>getall(course f){
		return new ResponseEntity<Object>(f.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(gender.class)
	public ResponseEntity<Object>getall(gender a){
		return new ResponseEntity<Object>(a.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(name.class)
	public ResponseEntity<Object>getall(name b){
		return new ResponseEntity<Object>(b.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(rollNumber.class)
	public ResponseEntity<Object>getall(rollNumber c){
		return new ResponseEntity<Object>(c.getMessage(),HttpStatus.NOT_FOUND);
	}
}
