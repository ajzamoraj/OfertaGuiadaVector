package com.isb.og.security.common.exception;

/**
 * Custom user not authenticated exception.
 * 
 * @author Vector ITC Group
 */
public class UnauthenticatedException extends RuntimeException {
    
    private static final long serialVersionUID = -5278005471979069631L;
    
    /**
     * Constructor.
     * 
     * @param string {@link String}
     */
    public UnauthenticatedException(final String message) {
        super(message);
    }
}
