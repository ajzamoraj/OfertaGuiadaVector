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
 * <p>Java class for com.isb.al.facseg.security.cb.CB_Politicas_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.al.facseg.security.cb.CB_Politicas_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entity" type="{http://www.isban.es/webservices/TDCs}EMPRESA_DEL_CENTRO_Type" minOccurs="0"/>
 *         &lt;element name="environment" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *         &lt;element name="restrictores" type="{http://www.isban.es/webservices/TECHNICAL_FACADES/Security/F_facseg_security/cbTypes/v1}com.isb.al.facseg.security.cb.CB_Restrictores_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.al.facseg.security.cb.CB_Politicas_Type", propOrder = {
    "entity",
    "environment",
    "attribute",
    "restrictores"
})
public class ComIsbAlFacsegSecurityCbCBPoliticasType {

    protected String entity;
    protected String environment;
    protected String attribute;
    protected ComIsbAlFacsegSecurityCbCBRestrictoresType restrictores;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the restrictores property.
     * 
     * @return
     *     possible object is
     *     {@link ComIsbAlFacsegSecurityCbCBRestrictoresType }
     *     
     */
    public ComIsbAlFacsegSecurityCbCBRestrictoresType getRestrictores() {
        return restrictores;
    }

    /**
     * Sets the value of the restrictores property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComIsbAlFacsegSecurityCbCBRestrictoresType }
     *     
     */
    public void setRestrictores(ComIsbAlFacsegSecurityCbCBRestrictoresType value) {
        this.restrictores = value;
    }

}
