package com.xyzinc.deviceinventory.exception;

public class ExceptionMsgDetails {
	
	private String resouceKey;
	private String errorCode;
	private String message;
	
	public ExceptionMsgDetails(String resouceKey, String errorCode, String message) {
		super();
		this.resouceKey = resouceKey;
		this.errorCode = errorCode;
		this.message = message;
	}
	
	/**
	 * @return the resouceKey
	 */
	public String getResouceKey() {
		return resouceKey;
	}
	/**
	 * @param resouceKey the resouceKey to set
	 */
	public void setResouceKey(String resouceKey) {
		this.resouceKey = resouceKey;
	}
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	

}
