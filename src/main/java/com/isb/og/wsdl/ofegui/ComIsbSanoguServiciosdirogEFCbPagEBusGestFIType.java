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
 * <p>Java class for com.isb.sanogu.serviciosdirog.e.f.cb.Pag_E_BusGestFI_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.sanogu.serviciosdirog.e.f.cb.Pag_E_BusGestFI_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clienteRepo" type="{http://www.isban.es/webservices/TDCc}NUM_PERSONA_CLIENTE_Type" minOccurs="0"/>
 *         &lt;element name="indRep" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.sanogu.serviciosdirog.e.f.cb.Pag_E_BusGestFI_Type", propOrder = {
    "clienteRepo",
    "indRep"
})
public class ComIsbSanoguServiciosdirogEFCbPagEBusGestFIType {

    protected NUMPERSONACLIENTEType clienteRepo;
    protected String indRep;

    /**
     * Gets the value of the clienteRepo property.
     * 
     * @return
     *     possible object is
     *     {@link NUMPERSONACLIENTEType }
     *     
     */
    public NUMPERSONACLIENTEType getClienteRepo() {
        return clienteRepo;
    }

    /**
     * Sets the value of the clienteRepo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NUMPERSONACLIENTEType }
     *     
     */
    public void setClienteRepo(NUMPERSONACLIENTEType value) {
        this.clienteRepo = value;
    }

    /**
     * Gets the value of the indRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndRep() {
        return indRep;
    }

    /**
     * Sets the value of the indRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndRep(String value) {
        this.indRep = value;
    }

}
