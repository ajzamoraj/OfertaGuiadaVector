//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.31 at 09:55:15 AM CEST 
//


package com.isb.og.wsdl.ofegui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.isb.sanogu.serviciosdirog.e.f.cb.FondoFI_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.sanogu.serviciosdirog.e.f.cb.FondoFI_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codISIN" type="{http://www.isban.es/webservices/TDCs}CODIGO_ISIN_Type" minOccurs="0"/>
 *         &lt;element name="idFondo" type="{http://www.isban.es/webservices/TDCc}NUM_PERSONA_CLIENTE_Type" minOccurs="0"/>
 *         &lt;element name="nombreFondo" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.sanogu.serviciosdirog.e.f.cb.FondoFI_Type", propOrder = {
    "codISIN",
    "idFondo",
    "nombreFondo"
})
public class ComIsbSanoguServiciosdirogEFCbFondoFIType {

    protected String codISIN;
    protected NUMPERSONACLIENTEType idFondo;
    protected String nombreFondo;

    /**
     * Gets the value of the codISIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodISIN() {
        return codISIN;
    }

    /**
     * Sets the value of the codISIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodISIN(String value) {
        this.codISIN = value;
    }

    /**
     * Gets the value of the idFondo property.
     * 
     * @return
     *     possible object is
     *     {@link NUMPERSONACLIENTEType }
     *     
     */
    public NUMPERSONACLIENTEType getIdFondo() {
        return idFondo;
    }

    /**
     * Sets the value of the idFondo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NUMPERSONACLIENTEType }
     *     
     */
    public void setIdFondo(NUMPERSONACLIENTEType value) {
        this.idFondo = value;
    }

    /**
     * Gets the value of the nombreFondo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFondo() {
        return nombreFondo;
    }

    /**
     * Sets the value of the nombreFondo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFondo(String value) {
        this.nombreFondo = value;
    }

}
