package com.isb.og.security.common.component;

import java.lang.reflect.Field;

/**
 * handles mock utilities to avoid a field which the system can not generate
 * mock value.
 * 
 * @author Vector ITC Group
 */
public class MockWarnOnCantGenerateValueHandler implements MockCantGenerateValueHandler {
    
    private static final String UNGENERATED_VALUE_MARKER = "N/A";
    private Field field;
    
    /**
     * Sets the field.
     * 
     * @param field {@link Field}
     */
    public void setField(
        final Field field){
        this.field = field;
    }
    
    /**
     * Gets the field.
     * 
     * @return the field {@link Field}
     */
    public final Field getField(){
        return field;
    }
    
    /**
     * Handles the field that can not be generated.
     * 
     * @param fieldType {@link Class}
     * @return {@link Object}
     */
    public Object handle(
        Class<?> fieldType){
        return UNGENERATED_VALUE_MARKER;
    }
}
