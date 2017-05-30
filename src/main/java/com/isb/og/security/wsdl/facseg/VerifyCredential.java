//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 02:13:32 PM CEST 
//


package com.isb.og.security.wsdl.facseg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CB_CredentialData" type="{http://www.isban.es/webservices/TECHNICAL_FACADES/Security/F_facseg_security/cbTypes/v1}com.isb.al.facseg.security.cb.CB_CredentialData_Type"/>
 *         &lt;element name="userAddress" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type"/>
 *       &lt;/sequence>
 *       &lt;attribute name="facade" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type" fixed="ACFACSEGSecurity" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cbCredentialData",
    "userAddress"
})
@XmlRootElement(name = "verifyCredential", namespace = "http://www.isban.es/webservices/TECHNICAL_FACADES/Security/F_facseg_security/intranet/ACFACSEGSecurity/v1")
public class VerifyCredential {

    @XmlElement(name = "CB_CredentialData", required = true, nillable = true)
    protected ComIsbAlFacsegSecurityCbCBCredentialDataType cbCredentialData;
    @XmlElement(required = true, nillable = true)
    protected String userAddress;
    @XmlAttribute(name = "facade")
    protected String facade;

    /**
     * Gets the value of the cbCredentialData property.
     * 
     * @return
     *     possible object is
     *     {@link ComIsbAlFacsegSecurityCbCBCredentialDataType }
     *     
     */
    public ComIsbAlFacsegSecurityCbCBCredentialDataType getCBCredentialData() {
        return cbCredentialData;
    }

    /**
     * Sets the value of the cbCredentialData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComIsbAlFacsegSecurityCbCBCredentialDataType }
     *     
     */
    public void setCBCredentialData(ComIsbAlFacsegSecurityCbCBCredentialDataType value) {
        this.cbCredentialData = value;
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
     * Gets the value of the facade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacade() {
        if (facade == null) {
            return "ACFACSEGSecurity";
        } else {
            return facade;
        }
    }

    /**
     * Sets the value of the facade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacade(String value) {
        this.facade = value;
    }

}
