package com.watch.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.watch.Exception.PriceException;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(PriceException.class)
	public ResponseEntity<String> handle(PriceException p) {
		return new ResponseEntity<>(p.getMessage(),HttpStatus.NOT_EXTENDED);
	}



	@ExceptionHandler(BrandException.class)
	public ResponseEntity<String> handled(BrandException g) {
		return new ResponseEntity<>(g.getmessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<String>handle(AgeException h) {
		return new ResponseEntity<>(h.getmessage(),HttpStatus.ACCEPTED);
		
	}
		
	}