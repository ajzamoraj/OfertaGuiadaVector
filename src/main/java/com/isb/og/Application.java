package com.isb.og;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Spring boot starter class.
 * 
 * @author Vector ITC Group
 */

@SpringBootApplication
public class Application {
    
    private static final Logger LOGGER = Logger.getLogger(Application.class);
    
    /**
     * Main Spring boot method
     * 
     * @param args {@link String}[]
     */
    public static void main(
        final String[] args){
    	
        LOGGER.info("Starting application...");
        SpringApplication.run(Application.class, args);//NOSONAR
        
    }
    
    /**
     * Command line runner bean
     * 
     * @param ctx {@link ApplicationContext}
     * @return {@link CommandLineRunner}
     */
    @Bean
    public CommandLineRunner commandLineRunner(
        final ApplicationContext ctx){
        
        return args -> {
            
            LOGGER.debug("Let's inspect the beans provided by Spring Boot:");
            
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                LOGGER.debug(beanName);
            }
        };
    }
    
    /**
     * Customizing displatcher servlet.
     * 
     * @return {@link DispatcherServlet}
     */
    @Bean
    public DispatcherServlet dispatcherServlet(){
        
        DispatcherServlet ds = new DispatcherServlet();
        ds.setThrowExceptionIfNoHandlerFound(true);
        
        return ds;
    }
}
