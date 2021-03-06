//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 02:13:32 PM CEST 
//


package com.isb.og.security.wsdl.facseg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="errorCode" type="{http://www.isban.es/webservices/TDCs}CODIGO_ERROR_APP_Type" minOccurs="0"/>
 *         &lt;element name="params" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="param" type="{http://www.isban.es/webservices/TDCc}DESCRIPCION_TRADUCIBLE_Type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="messageByDefault" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_EXTRALARGA_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorCode",
    "params",
    "messageByDefault"
})
@XmlRootElement(name = "com.isb.al.facseg.security.exc.EX_NewPasswordNotEqual", namespace = "http://www.isban.es/webservices/TECHNICAL_FACADES/Security/F_facseg_security/functionalFaults/v1")
public class ComIsbAlFacsegSecurityExcEXNewPasswordNotEqual {

    protected String errorCode;
    protected ComIsbAlFacsegSecurityExcEXNewPasswordNotEqual.Params params;
    protected String messageByDefault;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link ComIsbAlFacsegSecurityExcEXNewPasswordNotEqual.Params }
     *     
     */
    public ComIsbAlFacsegSecurityExcEXNewPasswordNotEqual.Params getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComIsbAlFacsegSecurityExcEXNewPasswordNotEqual.Params }
     *     
     */
    public void setParams(ComIsbAlFacsegSecurityExcEXNewPasswordNotEqual.Params value) {
        this.params = value;
    }

    /**
     * Gets the value of the messageByDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageByDefault() {
        return messageByDefault;
    }

    /**
     * Sets the value of the messageByDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageByDefault(String value) {
        this.messageByDefault = value;
    }


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
     *         &lt;element name="param" type="{http://www.isban.es/webservices/TDCc}DESCRIPCION_TRADUCIBLE_Type" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "param"
    })
    public static class Params {

        @XmlElement(nillable = true)
        protected List<DESCRIPCIONTRADUCIBLEType> param;

        /**
         * Gets the value of the param property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the param property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParam().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DESCRIPCIONTRADUCIBLEType }
         * 
         * 
         */
        public List<DESCRIPCIONTRADUCIBLEType> getParam() {
            if (param == null) {
                param = new ArrayList<DESCRIPCIONTRADUCIBLEType>();
            }
            return this.param;
        }

    }

}
