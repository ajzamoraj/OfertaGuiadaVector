package com.isb.og.security.common.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import com.isb.og.common.component.ErrorManager;
import com.isb.og.common.exception.PpiRuntimeException;
import com.isb.og.common.exception.UnauthenticatedException;
import com.isb.og.common.exception.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Extends Spring boot ErrorController.
 * 
 * @author Vector ITC Group
 */
@RestController
public class CustomErrorController implements ErrorController {
    
    private static final String MESSAGE = "message";
    private static final Logger LOGGER = Logger.getLogger(CustomErrorController.class);
    private static final String PATH = "/error";
    
    @Autowired
    protected ErrorManager errorManager;
    
    @Autowired
    private ErrorAttributes errorAttributes;
    
    /**
     * Hndles errors.
     * 
     * @param request {@link HttpServletRequest}
     * @param response {@link HttpServletResponse}
     */
    @RequestMapping(value = PATH)
    void error(
        final HttpServletRequest request,
        final HttpServletResponse response){
        
        Map<String, Object> attributes = getErrorAttributes(request, false);
        
        StringBuilder errorMessage = buildLogErrrorMessage(attributes);
        LOGGER.error(errorMessage.toString());
        
        if (response.getStatus() == 401) {
            throw new UnauthorizedException(attributes.get(CustomErrorController.MESSAGE).toString());
        }
        if (response.getStatus() == 403) {
            throw new UnauthenticatedException(attributes.get(CustomErrorController.MESSAGE).toString());
        }
        throw new PpiRuntimeException(attributes.get(CustomErrorController.MESSAGE).toString());
    }
    
    /**
     * Gets the error path.
     * 
     * @return {@link String}
     */
    @Override
    public String getErrorPath(){
        return PATH;
    }
    
    /**
     * Builds the log error message
     * 
     * @param attributes {@link Map} of {@link String}, {@link String}
     * @return {@link StringBuilder}
     */
    private StringBuilder buildLogErrrorMessage(
        final Map<String, Object> attributes){
        
        StringBuilder errorMessage = new StringBuilder();
        
        errorMessage.append("timestamp=");
        errorMessage.append(attributes.get("timestamp").toString());
        errorMessage.append("status=");
        errorMessage.append(attributes.get("status").toString());
        errorMessage.append("message=");
        errorMessage.append(attributes.get(CustomErrorController.MESSAGE).toString());
        errorMessage.append("path=");
        errorMessage.append(attributes.get("path").toString());
        
        return errorMessage;
    }
    
    /**
     * Gets the error attributes
     * 
     * @param request HttpServletRequestWrapper
     * @param includeStackTrace boolean
     * @return {@link Map} of {@link String}, {@link String}
     */
    private Map<String, Object> getErrorAttributes(
        final HttpServletRequest request,
        final boolean includeStackTrace){
        
        RequestAttributes requestAttributes = new ServletRequestAttributes(request);
        return errorAttributes.getErrorAttributes(requestAttributes, includeStackTrace);
    }
    
}
