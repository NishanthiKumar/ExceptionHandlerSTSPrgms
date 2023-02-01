package com.example.electronics;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<Object> noSuch(NoSuchElementException nse){
		return new ResponseEntity<Object>("no element",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(PriceException.class)
	public ResponseEntity<Object> noPrice(PriceException pe){
		return new ResponseEntity<Object>("Price out of stock",HttpStatus.BAD_REQUEST);
	}

}
