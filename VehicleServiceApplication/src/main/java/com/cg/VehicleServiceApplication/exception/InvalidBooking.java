package com.cg.VehicleServiceApplication.exception;

public class InvalidBooking extends Exception {

	private static final long serialVersionUID = 1L;

	private String message;

	public InvalidBooking(String message) {
		super(message);
	}
	
	
}
