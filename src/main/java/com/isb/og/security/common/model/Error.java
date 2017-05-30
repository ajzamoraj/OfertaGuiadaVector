
package com.isb.og.security.common.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import com.isb.og.security.common.enumerated.EnumErrorLevels;

/**
 * Result domain object.
 * 
 * @author Vector ITC Group
 */
public class Error implements Serializable {
    
    private static final long serialVersionUID = 415821454982304871L;
    
    private String code;
    private String message;
    private EnumErrorLevels level;
    private String description;
    
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
    
    /**
     * Sets the error level
     * 
     * @return {@link EnumErrorLevels}
     */
    public EnumErrorLevels getLevel(){
        return level;
    }
    
    /**
     * Gets the error level
     * 
     * @param level {@link EnumErrorLevels}
     */
    public void setLevel(
        final EnumErrorLevels level){
        this.level = level;
    }
    
    /**
     * Sets the description
     * 
     * @return {@link String}
     */
    public String getDescription(){
        return description;
    }
    
    /**
     * Gets the description
     * 
     * @param description {@link String}
     */
    public void setDescription(
        final String description){
        this.description = description;
    }
    
}
