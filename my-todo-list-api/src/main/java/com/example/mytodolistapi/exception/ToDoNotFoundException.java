package com.example.mytodolistapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ToDoNotFoundException extends RuntimeException {
	
	public ToDoNotFoundException(String msg) {
		super(msg);
	}
}
