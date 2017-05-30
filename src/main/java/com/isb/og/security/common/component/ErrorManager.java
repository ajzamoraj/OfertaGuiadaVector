package com.isb.og.security.common.component;

import java.util.List;
import java.util.Map;

import com.isb.og.security.common.model.Error;
import com.isb.og.security.form.exception.GenerateDocumentException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;

/**
 * Error manager in charge of handle system errors
 * 
 * @author Vector ITC Group
 */
public interface ErrorManager {
    
    /**
     * Retrieves a responseModel when an error occurs. If
     * replaceByExceptionMessage is active the predefined message for the catch
     * exception will be replaced by the one inside the exception.
     * 
     * @param e {@link Exception}
     * @param replaceByExceptionMessage boolean
     * @return {@link Map} of {@link String}, {@link Object} with 2 elements:
     *         <p>
     *         1) key = status; Object = {@link HttpStatus}
     *         <p>
     *         2) key = errors; Object = {@link List} of {@link Error}
     */
    Map<String, Object> buildResponse(
        final Exception e);
        
    /**
     * Gets the error list
     * 
     * @param errorMap {@link Map} of {@link String}, {@link Object}
     * @return {@link List} of {@link Error}
     */
    List<Error> getErrors(
        final Map<String, Object> errorMap);
        
    /**
     * Gets the HTTP error status code
     * 
     * @param errorMap {@link Map} of {@link String}, {@link Object}
     * @return {@link HttpStatus}
     */
    HttpStatus getStatusCode(
        final Map<String, Object> errorMap);
        
    /**
     * Overrides the spring validation result
     * 
     * @param result {@link BindingResult}
     */
    void overrideSpringValidationResult(
        final BindingResult result) throws GenerateDocumentException;
}
