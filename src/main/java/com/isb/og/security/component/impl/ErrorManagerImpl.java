package com.isb.og.security.component.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.isb.og.security.common.component.ErrorManager;
import com.isb.og.security.common.enumerated.EnumErrorLevels;
import com.isb.og.security.common.exception.InvalidParameterException;
import com.isb.og.security.common.model.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

/**
 * Error manager implementation.
 * 
 * @author Vector ITC Group
 */
@Component
@SuppressWarnings("unchecked")
public class ErrorManagerImpl implements ErrorManager {
    
    private static final String ERRORS = "errors";
    private static final String STATUS = "status";
    
    @Autowired
    private Environment environment;
    
    /**
     * Overrides the spring validation result
     * 
     * @param result {@link BindingResult}
     */
    @Override
    public void overrideSpringValidationResult(
        BindingResult result){
        
        if (result.hasErrors()) {
            StringBuilder errorMessage = new StringBuilder();
            
            for (ObjectError objectError : result.getAllErrors()) {
                
                errorMessage.append("#");
                errorMessage.append(objectError.getDefaultMessage());
                
            }
            throw new InvalidParameterException(errorMessage.toString());
        }
        
    }
    
    /**
     * Gets the error list
     * 
     * @param errorMap {@link Map} of {@link String}, {@link Object}
     * @return {@link List} of {@link Error}
     */
    
    @Override
    public List<Error> getErrors(
        Map<String, Object> errorMap){
        
        return (List<Error>) errorMap.get(ErrorManagerImpl.ERRORS);
    }
    
    /**
     * Gets the HTTP error status code
     * 
     * @param errorMap {@link Map} of {@link String}, {@link Object}
     * @return {@link HttpStatus}
     */
    @Override
    public HttpStatus getStatusCode(
        Map<String, Object> errorMap){
        
        return (HttpStatus) errorMap.get(STATUS);
    }
    
    /**
     * Retrieves a responseModel when an error occurs. If
     * replaceByExceptionMessage is active the predefined message for the catch
     * exception will be replaced by the one inside the exception.
     * 
     * @param e {@link Exception}
     * @return {@link Map} of {@link String}, {@link Object} with 2 elements:
     *         <p>
     *         1) key = status; Object = {@link HttpStatus}
     *         <p>
     *         2) key = errors; Object = {@link List} of {@link Error}
     */
    @Override
    public Map<String, Object> buildResponse(
        final Exception e){
        
        Map<String, Object> errorMap = new HashMap<String, Object>();
        errorMap.put(STATUS, getStatus(e));
        errorMap.put(ERRORS, getFails(e));
        
        return errorMap;
    }
    
    private HttpStatus getStatus(
        final Exception e){
        
        String className = e.getClass().getSimpleName();
        StringBuilder statusKey = new StringBuilder();
        statusKey.append("app.component.error.status.");
        statusKey.append(className);
        String statusCode = environment.getProperty(statusKey.toString());
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(Integer.valueOf(statusCode));
    }
    
    /**
     * Retrieves a result when an error has occurred.
     * 
     * @param e {@link Exception}
     * @param replaceByExceptionMessage
     * @return {@link List} of {@link Error}
     */
    private List<Error> getFails(
        final Exception e){
        
        List<Error> errors = new ArrayList<Error>();
        String className = e.getClass().getSimpleName();
        String errorMessage;
        
        if (e.getMessage() == null) {
            StringBuilder descriptionKey = new StringBuilder();
            descriptionKey.append("app.component.error.description.");
            descriptionKey.append(className);
            String description = environment.getProperty(descriptionKey.toString());
            String[] errorMessages = { description };
            iterateOverErrors(e, errors, errorMessages);
        } else {
            errorMessage = e.getMessage().startsWith("#") ? e.getMessage().substring(1) : e.getMessage();
            String[] errorMessages = errorMessage.split("#");
            iterateOverErrors(e, errors, errorMessages);
        }
        
        return errors;
        
    }
    
    /**
     * Builds the list of errors
     * 
     * @param e {@link Exception}
     * @param errors {@link List} of {@link Error}
     * @param errorMessages {@link String}[]
     */
    private void iterateOverErrors(
        final Exception e,
        final List<Error> errors,
        final String[] errorMessages){
        
        for (String description : errorMessages) {
            errors.add(buildFail(e, description));
        }
    }
    
    /**
     * Creates an error element into the error list
     * 
     * @param e {@link Exception}
     * @param description {@link String}
     * @return {@link Error}
     */
    private Error buildFail(
        final Exception e,
        final String description){
        
        String className = e.getClass().getSimpleName();
        
        StringBuilder codeKey = new StringBuilder();
        codeKey.append("app.component.error.code.");
        codeKey.append(className);
        String code = environment.getProperty(codeKey.toString());
        
        StringBuilder messageKey = new StringBuilder();
        String message;
        messageKey.append("app.component.error.message.");
        messageKey.append(className);
        message = environment.getProperty(messageKey.toString());
        
        StringBuilder levelKey = new StringBuilder();
        levelKey.append("app.component.error.level.");
        levelKey.append(className);
        String level = environment.getProperty(levelKey.toString());
        
        if (noDataFined(code, message, level)) {
            return buildDefaultResult();
        }
        return buildResult(code, message, level, description);
    }
    
    /**
     * Builds the default result when no error defined in the
     * application-error.properties file.
     * 
     * @return {@link Error}
     */
    private Error buildDefaultResult(){
        
        String code = environment.getProperty("app.component.error.code.UnknownTechnicalException");
        String message = environment.getProperty("app.component.error.message.UnknownTechnicalException");
        String level = environment.getProperty("app.component.error.level.UnknownTechnicalException");
        String description = environment.getProperty("app.component.error.description.UnknownTechnicalException");
        
        return buildResult(code, message, level, description);
    }
    
    /**
     * Checks when no error defined in the application-error.properties file
     * 
     * @param code {@link String}
     * @param message {@link String}
     * @param level {@link String}
     * @return boolean
     */
    private boolean noDataFined(
        final String code,
        final String message,
        final String level){
        
        return code == null || message == null || level == null;
    }
    
    /**
     * Builds the result.
     * 
     * @param code {@link String}
     * @param message {@link String}
     * @param description {@link String}
     * @param level {@link String}
     * @return {@link Error}
     */
    private Error buildResult(
        final String code,
        final String message,
        String level,
        String description){
        
        Error error = new Error();
        
        error.setCode(code);
        error.setMessage(message);
        error.setLevel(EnumErrorLevels.valueOf(level));
        error.setDescription(description);
        
        return error;
    }
    
}
