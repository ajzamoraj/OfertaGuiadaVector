package com.isb.og.common.exception;

public class PpiRuntimeException extends RuntimeException{


	/**
	 * 
	 */
	private static final long serialVersionUID = -6718607749446612809L;

	public PpiRuntimeException() {
		super();
	}

	public PpiRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PpiRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public PpiRuntimeException(String message) {
		super(message);
	}

	public PpiRuntimeException(Throwable cause) {
		super(cause);
	}

	
	
}
