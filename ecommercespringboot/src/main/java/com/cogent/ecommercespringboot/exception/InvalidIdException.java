package com.cogent.ecommercespringboot.exception;

import lombok.ToString;

@ToString
public class InvalidIdException extends RuntimeException{
	public InvalidIdException(String message) {
		super(message);
	}


}
