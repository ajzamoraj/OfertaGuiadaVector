
package com.isb.wphg.common.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

/**
 * Result domain object.
 * 
 * @author Vector ITC Group
 */
public class Result implements Serializable {
    
    private static final long serialVersionUID = 415821454982304871L;
    
    private String code;
    private String message;
    
    /**
     * Gets the code.
     * 
     * @return {@link String}
     */
    public final String getCode(){
        return code;
    }
    
    /**
     * Sets the code
     * 
     * @param code {@link String}
     */
    public final void setCode(
        final String code){
        this.code = StringUtils.trimToNull(code);
    }
    
    /**
     * Gets the message.
     * 
     * @return {@link String}
     */
    public final String getMessage(){
        return message;
    }
    
    /**
     * Sets the message.
     * 
     * @param message {@link String}
     */
    public final void setMessage(
        final String message){
        this.message = StringUtils.trimToNull(message);
    }
    
}
