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
 * <p>Java class for com.isb.sanogu.serviciosdirog.e.f.cb.RecContraPlanPen_S_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.sanogu.serviciosdirog.e.f.cb.RecContraPlanPen_S_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaPlan" type="{http://www.isban.es/webservices/SANOGU/Serviciosdirog_e/F_sanogu_serviciosdirog_e/cbTypes/vDraft}com.isb.sanogu.serviciosdirog.e.f.cb.ListaPlanTitular_Type" minOccurs="0"/>
 *         &lt;element name="repos" type="{http://www.isban.es/webservices/SANOGU/Serviciosdirog_e/F_sanogu_serviciosdirog_e/cbTypes/vDraft}com.isb.sanogu.serviciosdirog.e.f.cb.Pag_S_recContrPlaPen_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.sanogu.serviciosdirog.e.f.cb.RecContraPlanPen_S_Type", propOrder = {
    "listaPlan",
    "repos"
})
public class ComIsbSanoguServiciosdirogEFCbRecContraPlanPenSType {

    protected ComIsbSanoguServiciosdirogEFCbListaPlanTitularType listaPlan;
    protected ComIsbSanoguServiciosdirogEFCbPagSRecContrPlaPenType repos;

    /**
     * Gets the value of the listaPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ComIsbSanoguServiciosdirogEFCbListaPlanTitularType }
     *     
     */
    public ComIsbSanoguServiciosdirogEFCbListaPlanTitularType getListaPlan() {
        return listaPlan;
    }

    /**
     * Sets the value of the listaPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComIsbSanoguServiciosdirogEFCbListaPlanTitularType }
     *     
     */
    public void setListaPlan(ComIsbSanoguServiciosdirogEFCbListaPlanTitularType value) {
        this.listaPlan = value;
    }

    /**
     * Gets the value of the repos property.
     * 
     * @return
     *     possible object is
     *     {@link ComIsbSanoguServiciosdirogEFCbPagSRecContrPlaPenType }
     *     
     */
    public ComIsbSanoguServiciosdirogEFCbPagSRecContrPlaPenType getRepos() {
        return repos;
    }

    /**
     * Sets the value of the repos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComIsbSanoguServiciosdirogEFCbPagSRecContrPlaPenType }
     *     
     */
    public void setRepos(ComIsbSanoguServiciosdirogEFCbPagSRecContrPlaPenType value) {
        this.repos = value;
    }

}
