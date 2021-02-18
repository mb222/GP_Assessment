package com.xyzinc.deviceinventory.exception;

public class SerialNumberNotFoundException extends RuntimeException{

   
	private static final long serialVersionUID = 1L;
	
	public SerialNumberNotFoundException(String message) {
		super(message);
    }

	public SerialNumberNotFoundException() {
		// TODO Auto-generated constructor stub
	}
}
