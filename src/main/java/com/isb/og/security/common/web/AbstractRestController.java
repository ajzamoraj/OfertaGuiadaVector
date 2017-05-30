package com.isb.og.security.common.web;

import org.apache.log4j.Logger;
import com.isb.og.common.component.ErrorManager;
import com.isb.og.common.enumerated.EnumSecurityTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Common features for all controllers.
 * 
 * @author Vector ITC Group
 */
public abstract class AbstractRestController {
    
    private static final Logger LOGGER = Logger.getLogger(AbstractRestController.class);
    
    @Autowired
    protected ErrorManager errorManager;
    
    @Value("${app.security.type:NO_SECURED}")
    protected String securityType;
    
    @Value("${app.security.mock.user:XXTEST}")
    protected String mockUser;
    
    @Value("${app.security.prefix:/public}")
    protected String securedPrefix;
    
    /**
     * Builds a mocked corporate user.
     * 
     * @return {@link String}
     */
    public String getLoggedUser(){
        
        LOGGER.debug("Checking logged user in JWT token...");
        if (EnumSecurityTypes.NO_SECURED.getSecurityType().equals(securityType)) {
            LOGGER.debug("The environment does not manage corporative cookie...generatig corporate user...");
            TestingAuthenticationToken authentication = new TestingAuthenticationToken(mockUser, null);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            return mockUser;
        } else {
            LOGGER.debug("The environment manages corporative cookie... extracting corporate user...");
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            return (String) authentication.getPrincipal();
        }
    }
    
}
