package com.isb.og.security.common.exception;

/**
 * Rest call exception.
 * 
 * @author Vector ITC Group
 */
public class RestCallException extends RuntimeException {
    
    private static final long serialVersionUID = -5278005471979069631L;
    
    /**
     * Constructor.
     * 
     * @param string {@link String}
     */
    public RestCallException(final String message) {
        super(message);
    }
}
