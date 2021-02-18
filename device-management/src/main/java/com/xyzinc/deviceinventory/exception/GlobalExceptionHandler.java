package com.xyzinc.deviceinventory.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.xyzinc.deviceinventory.common.MessageConstants;

@ControllerAdvice
public class GlobalExceptionHandler {
    
	@ExceptionHandler(SerialNumberNotFoundException.class)
	public ResponseEntity<Object> hadndleSerialNumberNotFoundException
	        (SerialNumberNotFoundException ex){
		ExceptionMsgDetails exceptionDetails = new ExceptionMsgDetails(MessageConstants.SERIAL_NUMBER_NOT_FOUND,
				 MessageConstants.ERROR_FOUR,MessageConstants.SERIAL_NUMBER_NOT_FOUND_MSG); 
		
         return new ResponseEntity(exceptionDetails, HttpStatus.NOT_FOUND);    
    }
	
	@ExceptionHandler(InvalidSerialNumberException.class)
	public ResponseEntity<Object> hadndleInvalidSerialNumberException
	        (InvalidSerialNumberException ex){
		ExceptionMsgDetails exceptionDetails = new ExceptionMsgDetails(MessageConstants.INVALID_SERIAL_NUMBER,
				MessageConstants.ERROR_THREE,MessageConstants.INVALID_SERIAL_NUMBER_MSG); 
		
         return new ResponseEntity(exceptionDetails, HttpStatus.BAD_REQUEST);
         
    }
	
	@ExceptionHandler(InvalidMachineCodeException.class)
	public ResponseEntity<Object> hadndleInvalidSerialNumberException
                                              (InvalidMachineCodeException ex){
        ExceptionMsgDetails exceptionDetails = new ExceptionMsgDetails(MessageConstants.INVALID_MACHINE_CODE,
		MessageConstants.ERROR_ONE,MessageConstants.INVALID_MACHINE_CODE_MSG); 

        return new ResponseEntity(exceptionDetails, HttpStatus.BAD_REQUEST);
 
    }
	
	@ExceptionHandler(MachineCodeNotFoundException.class)
	public ResponseEntity<Object> hadndleMachineCodeNotFoundException
	                       (MachineCodeNotFoundException ex){
                 ExceptionMsgDetails exceptionDetails = new ExceptionMsgDetails(MessageConstants.MACHINE_CODE_NOT_FOUND,
                 MessageConstants.ERROR_TWO,MessageConstants.MACHINE_CODE_ERROR_MSG); 

              return new ResponseEntity(exceptionDetails, HttpStatus.NOT_FOUND);

    }
	
}