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
 * <p>Java class for com.isb.al.facseg.security.cb.CB_AuthenticateByOTPHW_S_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.al.facseg.security.cb.CB_AuthenticateByOTPHW_S_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credentialData" type="{http://www.isban.es/webservices/TECHNICAL_FACADES/Security/F_facseg_security/cbTypes/v1}com.isb.al.facseg.security.cb.CB_CredentialData_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.al.facseg.security.cb.CB_AuthenticateByOTPHW_S_Type", propOrder = {
    "credentialData"
})
public class ComIsbAlFacsegSecurityCbCBAuthenticateByOTPHWSType {

    protected ComIsbAlFacsegSecurityCbCBCredentialDataType credentialData;

    /**
     * Gets the value of the credentialData property.
     * 
     * @return
     *     possible object is
     *     {@link ComIsbAlFacsegSecurityCbCBCredentialDataType }
     *     
     */
    public ComIsbAlFacsegSecurityCbCBCredentialDataType getCredentialData() {
        return credentialData;
    }

    /**
     * Sets the value of the credentialData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComIsbAlFacsegSecurityCbCBCredentialDataType }
     *     
     */
    public void setCredentialData(ComIsbAlFacsegSecurityCbCBCredentialDataType value) {
        this.credentialData = value;
    }

}
