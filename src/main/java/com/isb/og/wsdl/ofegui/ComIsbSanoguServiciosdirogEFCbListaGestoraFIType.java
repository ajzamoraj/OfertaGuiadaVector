//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.31 at 09:55:15 AM CEST 
//


package com.isb.og.wsdl.ofegui;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.isb.sanogu.serviciosdirog.e.f.cb.ListaGestoraFI_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.sanogu.serviciosdirog.e.f.cb.ListaGestoraFI_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gestora" type="{http://www.isban.es/webservices/SANOGU/Serviciosdirog_e/F_sanogu_serviciosdirog_e/cbTypes/vDraft}com.isb.sanogu.serviciosdirog.e.f.cb.GestoraFI_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.sanogu.serviciosdirog.e.f.cb.ListaGestoraFI_Type", propOrder = {
    "gestora"
})
public class ComIsbSanoguServiciosdirogEFCbListaGestoraFIType {

    @XmlElement(nillable = true)
    protected List<ComIsbSanoguServiciosdirogEFCbGestoraFIType> gestora;

    /**
     * Gets the value of the gestora property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gestora property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGestora().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComIsbSanoguServiciosdirogEFCbGestoraFIType }
     * 
     * 
     */
    public List<ComIsbSanoguServiciosdirogEFCbGestoraFIType> getGestora() {
        if (gestora == null) {
            gestora = new ArrayList<ComIsbSanoguServiciosdirogEFCbGestoraFIType>();
        }
        return this.gestora;
    }

}
