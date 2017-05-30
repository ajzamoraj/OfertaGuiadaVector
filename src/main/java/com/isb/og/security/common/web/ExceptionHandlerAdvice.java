package com.isb.og.security.common.web;

import java.util.Map;

import org.apache.log4j.Logger;
import com.isb.og.common.component.ErrorManager;
import com.isb.og.common.exception.ErrorExecutingQueryException;
import com.isb.og.common.exception.InvalidDbModelException;
import com.isb.og.common.exception.InvalidParameterException;
import com.isb.og.common.exception.NoResultsFoundException;
import com.isb.og.common.exception.RestCallException;
import com.isb.og.common.exception.UnauthenticatedException;
import com.isb.og.common.exception.UnauthorizedException;
import com.isb.og.common.exception.UnknownTechnicalException;
import com.isb.og.common.model.ModelError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Centralized exception handler
 * 
 * @author Vector ITC Group
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {
    
    private static final Logger LOGGER = Logger.getLogger(ExceptionHandlerAdvice.class);
    
    @Autowired
    private ErrorManager errorManager;
    
    /**
     * Handles {@link Exception}
     * 
     * @param e {@link Exception}
     * @return {@link ResponseEntity} of {@link ModelError}
     */
    @ResponseBody
    @ExceptionHandler({
            ErrorExecutingQueryException.class,
            InvalidDbModelException.class,
            InvalidParameterException.class,
            NoResultsFoundException.class,
            RestCallException.class,
            UnauthenticatedException.class,
            UnauthorizedException.class,
            UnknownTechnicalException.class,
            Exception.class })
    public final ResponseEntity<ModelError> handleControllerException(
        final Exception e){
        
        LOGGER.error(e.getMessage(), e);
        
        ModelError modelError = new ModelError();
        
        Map<String, Object> errorMap = errorManager.buildResponse(e);
        modelError.setErrors(errorManager.getErrors(errorMap));
        
        return new ResponseEntity<ModelError>(modelError, errorManager.getStatusCode(errorMap));
    }
}
