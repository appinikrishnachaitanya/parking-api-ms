package com.parking.api.exceptions;

public class InvalidTicketNumberException extends RuntimeException {

	public InvalidTicketNumberException(String message) {
		super(message);
	}

}
