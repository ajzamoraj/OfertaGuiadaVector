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
 * <p>Java class for com.isb.sanogu.serviciosdirog.e.f.cb.ObtRepresentantes_S_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.sanogu.serviciosdirog.e.f.cb.ObtRepresentantes_S_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaRepresentantes" type="{http://www.isban.es/webservices/SANOGU/Serviciosdirog_e/F_sanogu_serviciosdirog_e/cbTypes/vDraft}com.isb.sanogu.serviciosdirog.e.f.cb.ListaRepresentante_Type" minOccurs="0"/>
 *         &lt;element name="memento" type="{http://www.isban.es/webservices/TDCs}SQLMEMENTO_Type" minOccurs="0"/>
 *         &lt;element name="hayMas" type="{http://www.isban.es/webservices/TDCs}INDICADOR_SI-NO_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.sanogu.serviciosdirog.e.f.cb.ObtRepresentantes_S_Type", propOrder = {
    "listaRepresentantes",
    "memento",
    "hayMas"
})
public class ComIsbSanoguServiciosdirogEFCbObtRepresentantesSType {

    protected ComIsbSanoguServiciosdirogEFCbListaRepresentanteType listaRepresentantes;
    protected String memento;
    protected String hayMas;

    /**
     * Gets the value of the listaRepresentantes property.
     * 
     * @return
     *     possible object is
     *     {@link ComIsbSanoguServiciosdirogEFCbListaRepresentanteType }
     *     
     */
    public ComIsbSanoguServiciosdirogEFCbListaRepresentanteType getListaRepresentantes() {
        return listaRepresentantes;
    }

    /**
     * Sets the value of the listaRepresentantes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComIsbSanoguServiciosdirogEFCbListaRepresentanteType }
     *     
     */
    public void setListaRepresentantes(ComIsbSanoguServiciosdirogEFCbListaRepresentanteType value) {
        this.listaRepresentantes = value;
    }

    /**
     * Gets the value of the memento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemento() {
        return memento;
    }

    /**
     * Sets the value of the memento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemento(String value) {
        this.memento = value;
    }

    /**
     * Gets the value of the hayMas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHayMas() {
        return hayMas;
    }

    /**
     * Sets the value of the hayMas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHayMas(String value) {
        this.hayMas = value;
    }

}