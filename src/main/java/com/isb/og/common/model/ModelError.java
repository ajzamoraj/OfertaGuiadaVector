
package com.isb.og.common.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Errors domain object.
 * 
 * @author Vector ITC Group
 */
public class ModelError implements Serializable {
    
    private static final long serialVersionUID = 415821454982304871L;
    
    @JsonInclude(Include.NON_NULL)
    private List<Error> errors;
    
    /**
     * Sets the errors.
     * 
     * @return {@link List} of {@link Error}
     */
    public final List<Error> getErrors(){
        return errors;
    }
    
    /**
     * Gets the errors.
     * 
     * @param errors {@link List} of {@link Error}
     */
    public final void setErrors(
        final List<Error> errors){
        this.errors = errors;
    }
    
}
