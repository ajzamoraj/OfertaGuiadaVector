//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 10:30:19 AM CEST 
//


package com.isb.wphg.security.wsdl.facseg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.isb.al.facseg.security.cb.CB_IsMobileDeviceRegistered_E_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.al.facseg.security.cb.CB_IsMobileDeviceRegistered_E_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://www.isban.es/webservices/TDCs}UID_Type" minOccurs="0"/>
 *         &lt;element name="footprint" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_LARGA_Type" minOccurs="0"/>
 *         &lt;element name="deviceToken" type="{http://www.isban.es/webservices/TDCs}DIGITAL_SIGNATURE_Type" minOccurs="0"/>
 *         &lt;element name="repository" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.al.facseg.security.cb.CB_IsMobileDeviceRegistered_E_Type", propOrder = {
    "user",
    "footprint",
    "deviceToken",
    "repository"
})
public class ComIsbAlFacsegSecurityCbCBIsMobileDeviceRegisteredEType {

    protected String user;
    protected String footprint;
    protected String deviceToken;
    protected String repository;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the footprint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFootprint() {
        return footprint;
    }

    /**
     * Sets the value of the footprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFootprint(String value) {
        this.footprint = value;
    }

    /**
     * Gets the value of the deviceToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceToken() {
        return deviceToken;
    }

    /**
     * Sets the value of the deviceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceToken(String value) {
        this.deviceToken = value;
    }

    /**
     * Gets the value of the repository property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepository() {
        return repository;
    }

    /**
     * Sets the value of the repository property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepository(String value) {
        this.repository = value;
    }

}