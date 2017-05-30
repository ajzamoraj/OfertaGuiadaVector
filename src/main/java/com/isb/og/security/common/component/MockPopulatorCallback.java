package com.isb.og.security.common.component;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.util.ReflectionUtils;

/**
 * Callback for mocked results population.
 * 
 * @author Vector ITC Group
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class MockPopulatorCallback implements ReflectionUtils.FieldCallback {
    
    private static final Logger LOGGER = Logger.getLogger(MockPopulatorCallback.class);
    
    private static final int DATE_WINDOW_MILLIS = 1000;
    private static final String ERROR_MOCK_LIST = "Error while mocking list of elements using refection...";
    private static final String JAVA_UTIL_LIST = "java.util.List";
    private static final String UNGENERATED_VALUE_MARKER = "N/A";
    private static final String SYMBOL_SMALLER_THAN = "<";
    private static final char SYMBOL_COLON = ',';
    private static final char SYMBOL_DOT = '.';
    
    private MockMetadata mockMetadata;
    private Object targetObject;
    private SecureRandom random;
    private MockCantGenerateValueHandler cantGenerateValueHandler = new MockWarnOnCantGenerateValueHandler();
    
    /**
     * Constructor.
     * 
     * @param targetObject {@link Object}
     * @param mockMetadata {@link MockMetadata}
     */
    public MockPopulatorCallback(final Object targetObject, final MockMetadata mockMetadata) {
        this.targetObject = targetObject;
        this.random = new SecureRandom();
        this.mockMetadata = mockMetadata;
    }
    
    /**
     * Constructor 2.
     * 
     * @param targetObject {@link Object}
     * @param cantGenerateValueHandler {@link MockCantGenerateValueHandler}
     * @param mockMetadata {@link MockMetadata}
     */
    public MockPopulatorCallback(
            Object targetObject,
            MockCantGenerateValueHandler cantGenerateValueHandler,
            final MockMetadata mockMetadata) {
        this(targetObject, mockMetadata);
        this.cantGenerateValueHandler = cantGenerateValueHandler;
    }
    
    /**
     * Overrides reflection do with method.
     * 
     * @param field {@link Field}
     */
    @Override
    public void doWith(
        final Field field) throws IllegalAccessException{
        
        if (!Modifier.isFinal(field.getModifiers())) {
            cantGenerateValueHandler.setField(field);
            Object value = mockRandomObjectValue(field);
            if (!value.equals(UNGENERATED_VALUE_MARKER)) {
                ReflectionUtils.makeAccessible(field);
                field.set(targetObject, value);
            }
        }
    }
    
    /**
     * Generates random value.
     * 
     * @param field {@link Field}
     * @return {@link Object}
     */
    public Object mockRandomObjectValue(
        final Field field){
        
        Class<?> fieldType = field.getType();
        String fieldName = field.getName();
        
        if (Date.class.isAssignableFrom(fieldType)) {
            return new Date(System.currentTimeMillis() - random.nextInt(DATE_WINDOW_MILLIS));
        }
        if (fieldType.equals(Short.class)) {
            return (short) random.nextInt(Short.MAX_VALUE + 1);
        }
        if (Number.class.isAssignableFrom(fieldType)) {
            return random.nextInt(Byte.MAX_VALUE) + 1;
        }
        if (fieldType.equals(Integer.TYPE)) {
            return random.nextInt();
        }
        if (fieldType.equals(Long.TYPE)) {
            return random.nextInt();
        }
        if (fieldType.equals(Boolean.TYPE)) {
            return random.nextBoolean();
        }
        if (Enum.class.isAssignableFrom(fieldType)) {
            Object[] enumValues = fieldType.getEnumConstants();
            return enumValues[random.nextInt(enumValues.length)];
        }
        if (fieldType.equals(String.class)) {
            return mockDataTypedStrings(fieldName);
        }
        return mockListOfElements(field, fieldType, null);
    }
    
    /**
     * Mocks the element type java.util.List
     * 
     * @param field {@link Field}
     * @param fieldType {@link Class}
     * @param o {@link Object}
     * @return {@link Object}
     */
    private Object mockListOfElements(
        final Field field,
        final Class<?> fieldType,
        Object o){
        final Class<?> c;
        Object oAux = o;
        try {
        	//Esta clase se utiliza solo para el mockeo y no debe subir a produccion. Por tanto el aviso de sonar no tiene sentido.
            if (JAVA_UTIL_LIST.equals(fieldType.getName())) { //NOSONAR
                String tmp = field.getAnnotatedType().getType().getTypeName();
                String parametrizedListElementType = tmp.split(SYMBOL_SMALLER_THAN)[1];
                parametrizedListElementType = parametrizedListElementType.substring(0,
                        parametrizedListElementType.length() - 1);
                        
                List<?> list = new ArrayList<>();
                mockListOfElementsElement(parametrizedListElementType, list);
                return list;
            } else {
                c = Class.forName(fieldType.getName());
                oAux = c.newInstance();
                MockPopulator.populate(oAux, this.mockMetadata);
            }
        } catch (ClassNotFoundException e) {
            LOGGER.error(ERROR_MOCK_LIST, e);
        } catch (InstantiationException e) {
            LOGGER.error(ERROR_MOCK_LIST, e);
        } catch (IllegalAccessException e) {
            LOGGER.error(ERROR_MOCK_LIST, e);
        }
        return oAux;
    }
    
    /**
     * Process the java.lang.String objects
     * 
     * @param fieldName {@link String}
     * @return {@link Object}
     */
    private Object mockDataTypedStrings(
        final String fieldName){
        
        DateFormat dateFormatter = new SimpleDateFormat(mockMetadata.getDateTimeFormat());
        
        Locale locale = new Locale(mockMetadata.getLocaleAsString());
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
        symbols.setGroupingSeparator(SYMBOL_DOT);
        symbols.setDecimalSeparator(SYMBOL_COLON);
        DecimalFormat decimalFormatter = new DecimalFormat(mockMetadata.getDecimalFormat(), symbols);
        
        DecimalFormat integerFormatter = new DecimalFormat(mockMetadata.getIntegerFormat(), symbols);
        
        if (mockMetadata.getDateTime().contains(fieldName)) {
            Date randomDateTime = new Date(System.currentTimeMillis() - random.nextInt(DATE_WINDOW_MILLIS));
            return dateFormatter.format(randomDateTime);
        }
        if (mockMetadata.getDate().contains(fieldName)) {
            Date randomDateTime = new Date(System.currentTimeMillis() - random.nextInt(DATE_WINDOW_MILLIS));
            return dateFormatter.format(randomDateTime).split(" ")[0];
        }
        if (mockMetadata.getTime().contains(fieldName)) {
            Date randomDateTime = new Date(System.currentTimeMillis() - random.nextInt(DATE_WINDOW_MILLIS));
            return dateFormatter.format(randomDateTime).split(" ")[1];
        }
        if (mockMetadata.getDecimalShort().contains(fieldName)) {
            return decimalFormatter.format(random.nextInt(99)) + SYMBOL_COLON + random.nextInt(99);
        }
        if (mockMetadata.getDecimalMedium().contains(fieldName)) {
            return decimalFormatter.format(random.nextInt(9999)) + SYMBOL_COLON + random.nextInt(99);
        }
        if (mockMetadata.getDecimalLong().contains(fieldName)) {
            return decimalFormatter.format(random.nextLong()) + SYMBOL_COLON + random.nextInt(99);
        }
        if (mockMetadata.getIntegerShort().contains(fieldName)) {
            return integerFormatter.format(random.nextInt(99));
        }
        if (mockMetadata.getIntegerMedium().contains(fieldName)) {
            return integerFormatter.format(random.nextInt(9999));
        }
        if (mockMetadata.getIntegerLong().contains(fieldName)) {
            return integerFormatter.format(random.nextLong());
        }
        if (mockMetadata.getStringAndNumbersShort().contains(fieldName)) {
            return getRandomString(mockMetadata.getLengthShort(), mockMetadata.getAlphanumericCharSequence());
        }
        if (mockMetadata.getStringAndNumbersMedium().contains(fieldName)) {
            return getRandomString(mockMetadata.getLengthMedium(), mockMetadata.getAlphanumericCharSequence());
        }
        if (mockMetadata.getStringAndNumbersLong().contains(fieldName)) {
            return getRandomString(mockMetadata.getLengthLong(), mockMetadata.getAlphanumericCharSequence());
        }
        if (mockMetadata.getStringAndNumbersHyperLong().contains(fieldName)) {
            return getRandomString(mockMetadata.getLengthHyperLong(), mockMetadata.getAlphanumericCharSequence());
        }
        if (mockMetadata.getStringShort().contains(fieldName)) {
            return getRandomString(mockMetadata.getLengthShort(), mockMetadata.getAlphabeticalCharSequence());
        }
        if (mockMetadata.getStringMedium().contains(fieldName)) {
            return getRandomString(mockMetadata.getLengthMedium(), mockMetadata.getAlphabeticalCharSequence());
        }
        if (mockMetadata.getStringLong().contains(fieldName)) {
            return getRandomString(mockMetadata.getLengthLong(), mockMetadata.getAlphabeticalCharSequence());
        }
        if (mockMetadata.getStringHyperLong().contains(fieldName)) {
            return getRandomString(mockMetadata.getLengthHyperLong(), mockMetadata.getAlphanumericCharSequence());
        }
        return UUID.randomUUID().toString();
    }
    
    /**
     * Processes the internal element mocking Its data.
     * 
     * @param parametrizedListElementType {@link String}
     * @param list {@link List}
     * @throws ClassNotFoundException cnfe
     * @throws InstantiationException ie
     * @throws IllegalAccessException iae
     */
    private void mockListOfElementsElement(
        String parametrizedListElementType,
        List list) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        for (int i = 0; i < mockMetadata.getRowNumber(); i++) {
            Class celem = Class.forName(parametrizedListElementType);
            Object oelem = celem.newInstance();
            MockPopulator.populate(oelem, this.mockMetadata);
            list.add(oelem);
        }
    }
    
    /**
     * Gets a random string value with the specified size and the characters
     * contained in the char collection parameter.
     * 
     * @param size int
     * @param charCollection {@link String}
     * @return {@link String}
     */
    protected String getRandomString(
        final int size,
        final String charCollection){
        
        StringBuilder salt = new StringBuilder();
        SecureRandom rnd = new SecureRandom();
        while (salt.length() <= size) {
            int index = (int) (rnd.nextFloat() * charCollection.length());
            salt.append(charCollection.charAt(index));
        }
        return salt.toString();
        
    }
    
}
