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
 * <p>Java class for com.isb.sanogu.serviciosdirog.e.f.cb.BuscGestoraPP_E_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.sanogu.serviciosdirog.e.f.cb.BuscGestoraPP_E_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datoBusqueda" type="{http://www.isban.es/webservices/TDCs}NOMBRE_MEDIO_Type" minOccurs="0"/>
 *         &lt;element name="indReps" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.sanogu.serviciosdirog.e.f.cb.BuscGestoraPP_E_Type", propOrder = {
    "datoBusqueda",
    "indReps"
})
public class ComIsbSanoguServiciosdirogEFCbBuscGestoraPPEType {

    protected String datoBusqueda;
    protected String indReps;

    /**
     * Gets the value of the datoBusqueda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoBusqueda() {
        return datoBusqueda;
    }

    /**
     * Sets the value of the datoBusqueda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoBusqueda(String value) {
        this.datoBusqueda = value;
    }

    /**
     * Gets the value of the indReps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndReps() {
        return indReps;
    }

    /**
     * Sets the value of the indReps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndReps(String value) {
        this.indReps = value;
    }

}