package com.capgemini.exception.main;

public class DebitLimitExceedsException extends Exception {

	public DebitLimitExceedsException() {
		super();
		
	}

	public DebitLimitExceedsException(String message) {
		super(message);
		
	}

}