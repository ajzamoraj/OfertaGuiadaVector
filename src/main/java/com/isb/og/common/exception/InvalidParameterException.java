package com.isb.og.common.exception;

/**
 * Custom invalid parameter/s exception.
 * 
 * @author Vector ITC Group
 */
public class InvalidParameterException extends RuntimeException {
    
    private static final long serialVersionUID = -5278005471979069631L;
    
    /**
     * Constructor.
     * 
     * @param string {@link String}
     */
    public InvalidParameterException(final String message) {
        super(message);
    }
}
