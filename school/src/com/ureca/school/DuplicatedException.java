package com.ureca.school;

public class DuplicatedException extends Exception{
	public DuplicatedException() {
		this("Duplicated Exception");
	}
	
	public DuplicatedException(String message) {
		super(message);
	}
}
