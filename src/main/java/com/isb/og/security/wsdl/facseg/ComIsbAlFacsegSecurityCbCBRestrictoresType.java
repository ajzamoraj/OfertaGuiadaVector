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
 * <p>Java class for com.isb.al.facseg.security.cb.CB_Restrictores_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.al.facseg.security.cb.CB_Restrictores_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restrictor" type="{http://www.isban.es/webservices/TECHNICAL_FACADES/Security/F_facseg_security/cbTypes/v1}com.isb.al.facseg.security.cb.CB_Restrictor_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.al.facseg.security.cb.CB_Restrictores_Type", propOrder = {
    "restrictor"
})
public class ComIsbAlFacsegSecurityCbCBRestrictoresType {

    @XmlElement(nillable = true)
    protected List<ComIsbAlFacsegSecurityCbCBRestrictorType> restrictor;

    /**
     * Gets the value of the restrictor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComIsbAlFacsegSecurityCbCBRestrictorType }
     * 
     * 
     */
    public List<ComIsbAlFacsegSecurityCbCBRestrictorType> getRestrictor() {
        if (restrictor == null) {
            restrictor = new ArrayList<ComIsbAlFacsegSecurityCbCBRestrictorType>();
        }
        return this.restrictor;
    }

}
