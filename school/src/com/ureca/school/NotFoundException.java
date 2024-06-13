package com.ureca.school;

public class NotFoundException extends Exception{
	public NotFoundException() {
		this("NotFoundException");
	}
	
	public NotFoundException(String message) {
		super(message);
	}

}
