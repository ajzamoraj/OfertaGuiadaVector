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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.isb.al.facseg.security.cb.CB_AuthenticateByBiometrics_E_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.al.facseg.security.cb.CB_AuthenticateByBiometrics_E_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationData" type="{http://www.isban.es/webservices/TECHNICAL_FACADES/Security/F_facseg_security/cbTypes/v1}com.isb.al.facseg.security.cb.CB_AuthenticationData_Type" minOccurs="0"/>
 *         &lt;element name="userAddress" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *         &lt;element name="bioSampleID" type="{http://www.isban.es/webservices/TDCs}STRING_290_Type" minOccurs="0"/>
 *         &lt;element name="bioSample" type="{http://www.isban.es/webservices/TDCs}BASE_64_Type" minOccurs="0"/>
 *         &lt;element name="bioType" type="{http://www.isban.es/webservices/TDCs}STRING_5_Type" minOccurs="0"/>
 *         &lt;element name="repository" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *         &lt;element name="inAux" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operationData" type="{http://www.isban.es/webservices/TECHNICAL_FACADES/Security/F_facseg_security/cbTypes/v1}com.isb.al.facseg.security.cb.CB_OperationData_Type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="frame" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.al.facseg.security.cb.CB_AuthenticateByBiometrics_E_Type", propOrder = {
    "authenticationData",
    "userAddress",
    "bioSampleID",
    "bioSample",
    "bioType",
    "repository",
    "inAux",
    "frame"
})
public class ComIsbAlFacsegSecurityCbCBAuthenticateByBiometricsEType {

    protected ComIsbAlFacsegSecurityCbCBAuthenticationDataType authenticationData;
    protected String userAddress;
    protected String bioSampleID;
    protected String bioSample;
    protected String bioType;
    protected String repository;
    protected ComIsbAlFacsegSecurityCbCBAuthenticateByBiometricsEType.InAux inAux;
    protected String frame;

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
     * Gets the value of the bioSampleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBioSampleID() {
        return bioSampleID;
    }

    /**
     * Sets the value of the bioSampleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBioSampleID(String value) {
        this.bioSampleID = value;
    }

    /**
     * Gets the value of the bioSample property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBioSample() {
        return bioSample;
    }

    /**
     * Sets the value of the bioSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBioSample(String value) {
        this.bioSample = value;
    }

    /**
     * Gets the value of the bioType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBioType() {
        return bioType;
    }

    /**
     * Sets the value of the bioType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBioType(String value) {
        this.bioType = value;
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

    /**
     * Gets the value of the inAux property.
     * 
     * @return
     *     possible object is
     *     {@link ComIsbAlFacsegSecurityCbCBAuthenticateByBiometricsEType.InAux }
     *     
     */
    public ComIsbAlFacsegSecurityCbCBAuthenticateByBiometricsEType.InAux getInAux() {
        return inAux;
    }

    /**
     * Sets the value of the inAux property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComIsbAlFacsegSecurityCbCBAuthenticateByBiometricsEType.InAux }
     *     
     */
    public void setInAux(ComIsbAlFacsegSecurityCbCBAuthenticateByBiometricsEType.InAux value) {
        this.inAux = value;
    }

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
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
     *         &lt;element name="operationData" type="{http://www.isban.es/webservices/TECHNICAL_FACADES/Security/F_facseg_security/cbTypes/v1}com.isb.al.facseg.security.cb.CB_OperationData_Type" maxOccurs="unbounded" minOccurs="0"/>
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
        "operationData"
    })
    public static class InAux {

        @XmlElement(nillable = true)
        protected List<ComIsbAlFacsegSecurityCbCBOperationDataType> operationData;

        /**
         * Gets the value of the operationData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operationData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperationData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ComIsbAlFacsegSecurityCbCBOperationDataType }
         * 
         * 
         */
        public List<ComIsbAlFacsegSecurityCbCBOperationDataType> getOperationData() {
            if (operationData == null) {
                operationData = new ArrayList<ComIsbAlFacsegSecurityCbCBOperationDataType>();
            }
            return this.operationData;
        }

    }

}
