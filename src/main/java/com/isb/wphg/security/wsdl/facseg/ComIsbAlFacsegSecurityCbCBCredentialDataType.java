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
 * <p>Java class for com.isb.al.facseg.security.cb.CB_CredentialData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.al.facseg.security.cb.CB_CredentialData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cookieCredential" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_LARGA_Type" minOccurs="0"/>
 *         &lt;element name="tokenCredential" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_LARGA_Type" minOccurs="0"/>
 *         &lt;element name="assertion" type="{http://www.isban.es/webservices/TDCs}DOCUMENTO_XML_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.al.facseg.security.cb.CB_CredentialData_Type", propOrder = {
    "cookieCredential",
    "tokenCredential",
    "assertion"
})
public class ComIsbAlFacsegSecurityCbCBCredentialDataType {

    protected String cookieCredential;
    protected String tokenCredential;
    protected String assertion;

    /**
     * Gets the value of the cookieCredential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCookieCredential() {
        return cookieCredential;
    }

    /**
     * Sets the value of the cookieCredential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCookieCredential(String value) {
        this.cookieCredential = value;
    }

    /**
     * Gets the value of the tokenCredential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenCredential() {
        return tokenCredential;
    }

    /**
     * Sets the value of the tokenCredential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenCredential(String value) {
        this.tokenCredential = value;
    }

    /**
     * Gets the value of the assertion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssertion() {
        return assertion;
    }

    /**
     * Sets the value of the assertion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssertion(String value) {
        this.assertion = value;
    }

}
