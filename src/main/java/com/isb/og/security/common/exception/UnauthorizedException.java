package com.isb.og.security.common.exception;

/**
 * Custom use not authorized exception.
 * 
 * @author Vector ITC Group
 */
public class UnauthorizedException extends RuntimeException {
    
    private static final long serialVersionUID = -5278005471979069631L;
    
    /**
     * Constructor.
     * 
     * @param string {@link String}
     */
    public UnauthorizedException(final String message) {
        super(message);
    }
}
