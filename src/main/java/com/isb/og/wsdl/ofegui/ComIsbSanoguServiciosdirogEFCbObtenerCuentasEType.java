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
 * <p>Java class for com.isb.sanogu.serviciosdirog.e.f.cb.ObtenerCuentas_E_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.sanogu.serviciosdirog.e.f.cb.ObtenerCuentas_E_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://www.isban.es/webservices/TDCc}NUM_PERSONA_CLIENTE_Type" minOccurs="0"/>
 *         &lt;element name="empresa" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type" minOccurs="0"/>
 *         &lt;element name="tipoIntevencion" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_INTERVENCION_Type" minOccurs="0"/>
 *         &lt;element name="divisa" type="{http://www.isban.es/webservices/TDCs}DIVISA_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.sanogu.serviciosdirog.e.f.cb.ObtenerCuentas_E_Type", propOrder = {
    "cliente",
    "empresa",
    "tipoIntevencion",
    "divisa"
})
public class ComIsbSanoguServiciosdirogEFCbObtenerCuentasEType {

    protected NUMPERSONACLIENTEType cliente;
    protected String empresa;
    protected String tipoIntevencion;
    protected String divisa;

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link NUMPERSONACLIENTEType }
     *     
     */
    public NUMPERSONACLIENTEType getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link NUMPERSONACLIENTEType }
     *     
     */
    public void setCliente(NUMPERSONACLIENTEType value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresa(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the tipoIntevencion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIntevencion() {
        return tipoIntevencion;
    }

    /**
     * Sets the value of the tipoIntevencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIntevencion(String value) {
        this.tipoIntevencion = value;
    }

    /**
     * Gets the value of the divisa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisa() {
        return divisa;
    }

    /**
     * Sets the value of the divisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisa(String value) {
        this.divisa = value;
    }

}
