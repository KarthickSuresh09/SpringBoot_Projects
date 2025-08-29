package com.global_expection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class global_expection {

	@ExceptionHandler(id_exception.class )
	
	public ResponseEntity <Object>getall(id_exception e){
	
	return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(book_price_exception.class)

	public ResponseEntity<Object>getall(book_price_exception s){
		
		return new ResponseEntity<Object>(s.getMessage(),HttpStatus.NOT_FOUND);
		
	}
		@ExceptionHandler(book_logo_exception.class)
		
		public ResponseEntity<Object>getall(book_logo_exception k){
			return new ResponseEntity<Object>(k.getMessage(),HttpStatus.NOT_FOUND);
		}

	
		@ExceptionHandler(book_name_exception.class)
		public ResponseEntity<Object>getall(book_name_exception z){
			return new ResponseEntity<Object>(z.getMessage(),HttpStatus.NOT_FOUND);
		}
		
		
		@ExceptionHandler(isold_exception.class)
		public ResponseEntity<Object>getall(isold_exception j){
		return new ResponseEntity<Object>(j.getMessage(),HttpStatus.NOT_FOUND);	
		}
}
