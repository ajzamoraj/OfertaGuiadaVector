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
 * <p>Java class for com.isb.sanogu.serviciosdirog.e.f.cb.ObtenerCuentas_S_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.sanogu.serviciosdirog.e.f.cb.ObtenerCuentas_S_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaCuentas" type="{http://www.isban.es/webservices/SANOGU/Serviciosdirog_e/F_sanogu_serviciosdirog_e/cbTypes/vDraft}com.isb.sanogu.serviciosdirog.e.f.cb.ListaCuentas_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.sanogu.serviciosdirog.e.f.cb.ObtenerCuentas_S_Type", propOrder = {
    "listaCuentas"
})
public class ComIsbSanoguServiciosdirogEFCbObtenerCuentasSType {

    protected ComIsbSanoguServiciosdirogEFCbListaCuentasType listaCuentas;

    /**
     * Gets the value of the listaCuentas property.
     * 
     * @return
     *     possible object is
     *     {@link ComIsbSanoguServiciosdirogEFCbListaCuentasType }
     *     
     */
    public ComIsbSanoguServiciosdirogEFCbListaCuentasType getListaCuentas() {
        return listaCuentas;
    }

    /**
     * Sets the value of the listaCuentas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComIsbSanoguServiciosdirogEFCbListaCuentasType }
     *     
     */
    public void setListaCuentas(ComIsbSanoguServiciosdirogEFCbListaCuentasType value) {
        this.listaCuentas = value;
    }

}
