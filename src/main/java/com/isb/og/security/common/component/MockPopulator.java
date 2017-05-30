package com.isb.og.security.common.component;

import org.apache.log4j.Logger;
import org.springframework.util.ReflectionUtils;

/**
 * Poulator to generate hiterachy objects.
 * 
 * @author Vector ITC Group
 */
public class MockPopulator {
    
    private static final Logger LOGGER = Logger.getLogger(MockPopulator.class);
    
    private static final String ERRROR_POPULATING = "Errror while populating...";
    
    /**
     * Contructor.
     */
    private MockPopulator() {
    
    }
    
    /**
     * Populates an object filling it with random values.
     * 
     * @param object {@link Object}
     * @param mockMetadata {@link MockMetadata}
     */
    public static void populate(
        final Object object,
        final MockMetadata mockMetadata){
        ReflectionUtils.doWithFields(object.getClass(), new MockPopulatorCallback(object, mockMetadata));
    }
    
    /**
     * Populates a parametrized class filling it with random values.
     * 
     * @param clazz {@link Class}
     * @param mockMetadata {@link MockMetadata}
     * @return {@link Class} T
     */
    public static <T> T populate(
        final Class<T> clazz,
        final MockMetadata mockMetadata){
        T instance = null;
        try {
            instance = createInstanceWithDefaultConstructor(clazz);
            populate(instance, mockMetadata);
        } catch (InstantiationException e) {
            LOGGER.debug(ERRROR_POPULATING, e);
        } catch (IllegalAccessException iae) {
            LOGGER.debug(ERRROR_POPULATING, iae);
        }
        return instance;
    }
    
    /**
     * Creates an instance from a class.
     * 
     * @param clazz {@link Class}
     * @return {@link Class} T
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws Exception e
     */
    private static <T> T createInstanceWithDefaultConstructor(
        Class<T> clazz) throws InstantiationException, IllegalAccessException{
        return clazz.newInstance();
    }
    
}
