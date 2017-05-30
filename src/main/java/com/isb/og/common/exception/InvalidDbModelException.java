package com.isb.og.common.exception;

/**
 * No available operation exception.
 * 
 * @author Vector ITC Group
 */
public class InvalidDbModelException extends RuntimeException {
    
    private static final long serialVersionUID = 1236020227199650270L;
    
    /**
     * Constructor.
     * 
     * @param string {@link String}
     */
    public InvalidDbModelException(final String message) {
        super(message);
    }
    
}
