package com.isb.wphg.security.interceptor;

import java.security.InvalidParameterException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.isb.wphg.security.aspect.Securizar;
import com.isb.wphg.security.model.SeguridadTokenBean;
import com.isb.wphg.security.service.ISecurityService;


/**
 * The Class LoggingInterceptor.
 */
@Aspect
@Service
public class SeguridadControllerInterceptor {
    
    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(SeguridadControllerInterceptor.class);
    
    /** The application context. */
    @Autowired
    ApplicationContext applicationContext;
    
	@Autowired
	private ISecurityService securityService;
	
    /**
     * Log invocation.
     *
     * @param jp the jp
     * @param Securizar the request id
     * @throws CrisClientException
     */
    @Before("@annotation(com.isb.wphg.security.aspect.Securizar) && @annotation(securizar)")
    public final void seguridadInvocation(
        final JoinPoint jp,
        final Securizar securizar) throws Exception{
        try {
            Object[] argumentos = jp.getArgs();
            String token = argumentos[0] instanceof String ? (String)argumentos[0] : null;
            
            if(token!=null){
            	SeguridadTokenBean tokenBean = new SeguridadTokenBean();
            	tokenBean.setOriginalToken(token);
            	tokenBean.setValidToken(false);
            	securityService.verifyCredential(tokenBean );
            	
            } else {
                throw new InvalidParameterException("Falta el token de seguridad.");
            }
            
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw e;
        }
    }
    
}
