//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 02:13:32 PM CEST 
//


package com.isb.og.security.wsdl.facseg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.isb.al.facseg.security.cb.CB_AuthenticationCredential_E_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.al.facseg.security.cb.CB_AuthenticationCredential_E_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationData" type="{http://www.isban.es/webservices/TECHNICAL_FACADES/Security/F_facseg_security/cbTypes/v1}com.isb.al.facseg.security.cb.CB_AuthenticationData_Type" minOccurs="0"/>
 *         &lt;element name="userAddress" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *         &lt;element name="newPassword" type="{http://www.isban.es/webservices/TDCs}PASSWORD_GENERICA_Type" minOccurs="0"/>
 *         &lt;element name="newPasswordConfirm" type="{http://www.isban.es/webservices/TDCs}PASSWORD_GENERICA_Type" minOccurs="0"/>
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
@XmlType(name = "com.isb.al.facseg.security.cb.CB_AuthenticationCredential_E_Type", propOrder = {
    "authenticationData",
    "userAddress",
    "newPassword",
    "newPasswordConfirm",
    "repository"
})
public class ComIsbAlFacsegSecurityCbCBAuthenticationCredentialEType {

    protected ComIsbAlFacsegSecurityCbCBAuthenticationDataType authenticationData;
    protected String userAddress;
    protected String newPassword;
    protected String newPasswordConfirm;
    protected String repository;

    /**
     * Gets the value of the authenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link ComIsbAlFacsegSecurityCbCBAuthenticationDataType }
     *     
     */
    public ComIsbAlFacsegSecurityCbCBAuthenticationDataType getAuthenticationData() {
        return authenticationData;
    }

    /**
     * Sets the value of the authenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComIsbAlFacsegSecurityCbCBAuthenticationDataType }
     *     
     */
    public void setAuthenticationData(ComIsbAlFacsegSecurityCbCBAuthenticationDataType value) {
        this.authenticationData = value;
    }

    /**
     * Gets the value of the userAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * Sets the value of the userAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAddress(String value) {
        this.userAddress = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

    /**
     * Gets the value of the newPasswordConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPasswordConfirm() {
        return newPasswordConfirm;
    }

    /**
     * Sets the value of the newPasswordConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPasswordConfirm(String value) {
        this.newPasswordConfirm = value;
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
