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
 * <p>Java class for com.isb.al.facseg.security.cb.CB_IdentificationData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.al.facseg.security.cb.CB_IdentificationData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://www.isban.es/webservices/TDCs}UID_Type" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.isban.es/webservices/TDCs}TELEFONO_INTERNACIONAL_Type" minOccurs="0"/>
 *         &lt;element name="card" type="{http://www.isban.es/webservices/TDCs}PAN_Type" minOccurs="0"/>
 *         &lt;element name="numberContract" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://www.isban.es/webservices/TDCc}DOCUM_PERSONA_CORPORATIVO_Type" minOccurs="0"/>
 *         &lt;element name="personalID" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.al.facseg.security.cb.CB_IdentificationData_Type", propOrder = {
    "user",
    "alias",
    "mobile",
    "card",
    "numberContract",
    "documento",
    "personalID"
})
public class ComIsbAlFacsegSecurityCbCBIdentificationDataType {

    protected String user;
    protected String alias;
    protected String mobile;
    protected String card;
    protected String numberContract;
    protected DOCUMPERSONACORPORATIVOType documento;
    protected String personalID;

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
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCard(String value) {
        this.card = value;
    }

    /**
     * Gets the value of the numberContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberContract() {
        return numberContract;
    }

    /**
     * Sets the value of the numberContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberContract(String value) {
        this.numberContract = value;
    }

    /**
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMPERSONACORPORATIVOType }
     *     
     */
    public DOCUMPERSONACORPORATIVOType getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMPERSONACORPORATIVOType }
     *     
     */
    public void setDocumento(DOCUMPERSONACORPORATIVOType value) {
        this.documento = value;
    }

    /**
     * Gets the value of the personalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalID() {
        return personalID;
    }

    /**
     * Sets the value of the personalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalID(String value) {
        this.personalID = value;
    }

}
