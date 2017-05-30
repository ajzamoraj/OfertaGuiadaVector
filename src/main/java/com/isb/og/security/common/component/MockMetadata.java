package com.isb.og.security.common.component;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Callback for mocked results population.
 * 
 * @author Vector ITC Group
 */
@Component
@PropertySource("classpath:mock-metadata.properties")
public class MockMetadata {
    
    @Value("${mock.populator.metadata.datetimeformat:dd-MM-yyyy hh:mm:ss}")
    private String dateTimeFormat;
    @Value("${mock.populator.metadata.locale:ES}")
    private String localeAsString;
    @Value("${mock.populator.metadata.integerformat:#,###}")
    private String integerFormat;
    @Value("${mock.populator.metadata.decimalformat:#,###.##}")
    private String decimalFormat;
    @Value("${mock.populator.metadata.numbermilessplitter:.}")
    private String numberMilesSplitter;
    @Value("${mock.populator.metadata.numberdecimalsplitter:,}")
    private String numberDecimalSplitter;
    @Value("${mock.populator.metadata.alphanumericcharsequence:ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnñopqrstuvwxyz 1234567890}")
    private String alphanumericCharSequence;
    @Value("${mock.populator.metadata.alphabeticalcharsequece:ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz }")
    private String alphabeticalCharSequence;
    @Value("${mock.populator.metadata.numericcharsequece:1234567890}")
    private String numericCharSequence;
    @Value("${mock.populator.metadata.lengthshort:2}")
    private short lengthShort;
    @Value("${mock.populator.metadata.lengthmedium:5}")
    private short lengthMedium;
    @Value("${mock.populator.metadata.lengthlong:10}")
    private short lengthLong;
    @Value("${mock.populator.metadata.lengthhyperlong:50}")
    private short lengthHyperLong;
    @Value("${mock.populator.metadata.rowsnumber:10}")
    private short rowsNumber;
    
    private Set<String> stringShort = new HashSet<String>();
    private Set<String> stringMedium = new HashSet<String>();
    private Set<String> stringLong = new HashSet<String>();
    private Set<String> stringHyperLong = new HashSet<String>();
    private Set<String> stringAndNumbersShort = new HashSet<String>();
    private Set<String> stringAndNumbersMedium = new HashSet<String>();
    private Set<String> stringAndNumbersLong = new HashSet<String>();
    private Set<String> stringAndNumbersHyperLong = new HashSet<String>();
    private Set<String> integerShort = new HashSet<String>();
    private Set<String> integerMedium = new HashSet<String>();
    private Set<String> integerLong = new HashSet<String>();
    private Set<String> decimalShort = new HashSet<String>();
    private Set<String> decimalMedium = new HashSet<String>();
    private Set<String> decimalLong = new HashSet<String>();
    private Set<String> dateTime = new HashSet<String>();
    private Set<String> date = new HashSet<String>();
    private Set<String> time = new HashSet<String>();
    
    /**
     * Gets the map with the field names in lower case for short strings.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getStringShort(){
        return stringShort;
    }
    
    /**
     * Sets the map with the field names in lower case for short strings.
     * 
     * @param stringShort {@link Set} of {@link String}
     */
    public final void setStringShort(
        final Set<String> stringShort){
        this.stringShort = stringShort;
    }
    
    /**
     * Gets the map with the field names in lower case for medium strings.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getStringMedium(){
        return stringMedium;
    }
    
    /**
     * Sets the map with the field names in lower case for medium strings.
     * 
     * @param stringMedium {@link Set} of {@link String}
     */
    public final void setStringMedium(
        final Set<String> stringMedium){
        this.stringMedium = stringMedium;
    }
    
    /**
     * Gets the hyper long string size.
     * 
     * @return the stringHyperLong
     */
    public final Set<String> getStringHyperLong(){
        return stringHyperLong;
    }
    
    /**
     * Gets the hyper long string and numbers size.
     * 
     * @return the stringAndNumbersHyperLong
     */
    public final Set<String> getStringAndNumbersHyperLong(){
        return stringAndNumbersHyperLong;
    }
    
    /**
     * Gets the map with the field names in lower case for long strings.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getStringLong(){
        return stringLong;
    }
    
    /**
     * Sets the map with the field names in lower case for long strings.
     * 
     * @param stringLong {@link Set} of {@link String}
     */
    public final void setStringLong(
        final Set<String> stringLong){
        this.stringLong = stringLong;
    }
    
    /**
     * Sets the strings with number short.
     * 
     * @return {@link Set} of {@link String}t
     */
    public final Set<String> getStringAndNumbersShort(){
        return stringAndNumbersShort;
    }
    
    /**
     * Gets the strings with number short.
     * 
     * @param stringAndNumbersShort {@link Set} of {@link String}
     */
    public final void setStringAndNumbersShort(
        final Set<String> stringAndNumbersShort){
        this.stringAndNumbersShort = stringAndNumbersShort;
    }
    
    /**
     * Sets the strings with number medium.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getStringAndNumbersMedium(){
        return stringAndNumbersMedium;
    }
    
    /**
     * Gets the strings with number medium.
     * 
     * @param stringAndNumbersMedium {@link Set} of {@link String}
     */
    public final void setStringAndNumbersMedium(
        final Set<String> stringAndNumbersMedium){
        this.stringAndNumbersMedium = stringAndNumbersMedium;
    }
    
    /**
     * Sets the strings with number long.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getStringAndNumbersLong(){
        return stringAndNumbersLong;
    }
    
    /**
     * Gets the strings with number long.
     * 
     * @param stringAndNumbersLong the stringAndNumbersLong to set
     */
    public final void setStringAndNumbersLong(
        final Set<String> stringAndNumbersLong){
        this.stringAndNumbersLong = stringAndNumbersLong;
    }
    
    /**
     * Gets the map with the field names in lower case for short integers.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getIntegerShort(){
        return integerShort;
    }
    
    /**
     * Sets the map with the field names in lower case for short integers.
     * 
     * @param integerShort {@link Set} of {@link String}
     */
    public final void setIntegerShort(
        final Set<String> integerShort){
        this.integerShort = integerShort;
    }
    
    /**
     * Gets the map with the field names in lower case for medium integers.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getIntegerMedium(){
        return integerMedium;
    }
    
    /**
     * Sets the map with the field names in lower case for medium integers.
     * 
     * @param integerMedium {@link Set} of {@link String}
     */
    public final void setIntegerMedium(
        final Set<String> integerMedium){
        this.integerMedium = integerMedium;
    }
    
    /**
     * Gets the map with the field names in lower case for long integers.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getIntegerLong(){
        return integerLong;
    }
    
    /**
     * Sets the map with the field names in lower case for long integers.
     * 
     * @param integerLong {@link Set} of {@link String}
     */
    public final void setIntegerLong(
        final Set<String> integerLong){
        this.integerLong = integerLong;
    }
    
    /**
     * Gets the map with the field names in lower case for short decimals.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getDecimalShort(){
        return decimalShort;
    }
    
    /**
     * Sets the map with the field names in lower case for short decimals.
     * 
     * @param decimalShort {@link Set} of {@link String}
     */
    public final void setDecimalShort(
        final Set<String> decimalShort){
        this.decimalShort = decimalShort;
    }
    
    /**
     * Gets the map with the field names in lower case for medium decimals.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getDecimalMedium(){
        return decimalMedium;
    }
    
    /**
     * Sets the map with the field names in lower case for medium decimals.
     * 
     * @param decimalMedium {@link Set} of {@link String}
     */
    public final void setDecimalMedium(
        final Set<String> decimalMedium){
        this.decimalMedium = decimalMedium;
    }
    
    /**
     * Gets the map with the field names in lower case for long decimals.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getDecimalLong(){
        return decimalLong;
    }
    
    /**
     * Sets the map with the field names in lower case for long decimals.
     * 
     * @param decimalLong {@link Set} of {@link String}
     */
    public final void setDecimalLong(
        final Set<String> decimalLong){
        this.decimalLong = decimalLong;
    }
    
    /**
     * Gets the map with the field names in lower case for date and time.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getDateTime(){
        return dateTime;
    }
    
    /**
     * Sets the map with the field names in lower case for date and time.
     * 
     * @param dateTime {@link Set} of {@link String}
     */
    public final void setDateTime(
        final Set<String> dateTime){
        this.dateTime = dateTime;
    }
    
    /**
     * Gets the map with the field names in lower case for date.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getDate(){
        return date;
    }
    
    /**
     * Sets the map with the field names in lower case for date.
     * 
     * @param date {@link Set} of {@link String}
     */
    public final void setDate(
        final Set<String> date){
        this.date = date;
    }
    
    /**
     * Gets the map with the field names in lower case for time.
     * 
     * @return {@link Set} of {@link String}
     */
    public final Set<String> getTime(){
        return time;
    }
    
    /**
     * Sets the map with the field names in lower case for time.
     * 
     * @param time {@link Set} of {@link String}
     */
    public final void setTime(
        final Set<String> time){
        this.time = time;
    }
    
    /**
     * Gets the date time format
     * 
     * @return {@link String}
     */
    public final String getDateTimeFormat(){
        return dateTimeFormat;
    }
    
    /**
     * Gets the locale as string.
     * 
     * @return {@link String}
     */
    public final String getLocaleAsString(){
        return localeAsString;
    }
    
    /**
     * Gets the integer number format.
     * 
     * @return {@link String}
     */
    public final String getIntegerFormat(){
        return integerFormat;
    }
    
    /**
     * Gets the decimal number format.
     * 
     * @return {@link String}
     */
    public final String getDecimalFormat(){
        return decimalFormat;
    }
    
    /**
     * Gets the miles splitter char.
     * 
     * @return {@link String}
     */
    public final String getNumberMilesSplitter(){
        return numberMilesSplitter;
    }
    
    /**
     * Gets the decimal splitter char.
     * 
     * @return {@link String}
     */
    public final String getNumberDecimalSplitter(){
        return numberDecimalSplitter;
    }
    
    /**
     * Gets the available alphanumeric char sequence.
     * 
     * @return {@link String}
     */
    public final String getAlphanumericCharSequence(){
        return alphanumericCharSequence;
    }
    
    /**
     * Gets the alphabetical char sequece.
     * 
     * @return {@link String}
     */
    public final String getAlphabeticalCharSequence(){
        return alphabeticalCharSequence;
    }
    
    /**
     * Gets the length for the short typed values.
     * 
     * @return short
     */
    public final short getLengthShort(){
        return lengthShort;
    }
    
    /**
     * Gets the length for the medium typed values.
     * 
     * @return short
     */
    public final short getLengthMedium(){
        return lengthMedium;
    }
    
    /**
     * Gets the length for the long typed values.
     * 
     * @return short
     */
    public final short getLengthLong(){
        return lengthLong;
    }
    
    /**
     * Gets the numeric char sequence.
     * 
     * @return {@link String}
     */
    public final String getNumericCharSequence(){
        return numericCharSequence;
    }
    
    /**
     * Gets the number of rows
     * 
     * @return int
     */
    public final int getRowNumber(){
        return rowsNumber;
    }
    
    /**
     * Gets the hyper long size.
     * 
     * @return short
     */
    public final short getLengthHyperLong(){
        return lengthHyperLong;
    }
}
