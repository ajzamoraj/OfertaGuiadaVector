//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.31 at 09:55:15 AM CEST 
//


package com.isb.og.wsdl.ofegui;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.isb.sanogu.serviciosdirog.e.f.cb.EvalCondTrasParciPP_E_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.isb.sanogu.serviciosdirog.e.f.cb.EvalCondTrasParciPP_E_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contrato" type="{http://www.isban.es/webservices/TDCc}CONTRATO_Type" minOccurs="0"/>
 *         &lt;element name="tipoTrasp" type="{http://www.isban.es/webservices/TDCs}TIPO_UNIDAD_MVTO_FONDOS_Type" minOccurs="0"/>
 *         &lt;element name="importe" type="{http://www.isban.es/webservices/TDCc}IMPORTE_Type" minOccurs="0"/>
 *         &lt;element name="participaciones" type="{http://www.isban.es/webservices/TDCs}PARTICIPACIONES_RETENIDAS_Type" minOccurs="0"/>
 *         &lt;element name="modalidad" type="{http://www.isban.es/webservices/TDCs}MODALIDAD_TRASPASO_PLANES_Type" minOccurs="0"/>
 *         &lt;element name="subTipoProd" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_PRODUCTO_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.isb.sanogu.serviciosdirog.e.f.cb.EvalCondTrasParciPP_E_Type", propOrder = {
    "contrato",
    "tipoTrasp",
    "importe",
    "participaciones",
    "modalidad",
    "subTipoProd"
})
public class ComIsbSanoguServiciosdirogEFCbEvalCondTrasParciPPEType {

    protected CONTRATOType contrato;
    protected String tipoTrasp;
    protected IMPORTEType importe;
    protected BigDecimal participaciones;
    protected String modalidad;
    protected SUBTIPODEPRODUCTOType subTipoProd;

    /**
     * Gets the value of the contrato property.
     * 
     * @return
     *     possible object is
     *     {@link CONTRATOType }
     *     
     */
    public CONTRATOType getContrato() {
        return contrato;
    }

    /**
     * Sets the value of the contrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTRATOType }
     *     
     */
    public void setContrato(CONTRATOType value) {
        this.contrato = value;
    }

    /**
     * Gets the value of the tipoTrasp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTrasp() {
        return tipoTrasp;
    }

    /**
     * Sets the value of the tipoTrasp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTrasp(String value) {
        this.tipoTrasp = value;
    }

    /**
     * Gets the value of the importe property.
     * 
     * @return
     *     possible object is
     *     {@link IMPORTEType }
     *     
     */
    public IMPORTEType getImporte() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMPORTEType }
     *     
     */
    public void setImporte(IMPORTEType value) {
        this.importe = value;
    }

    /**
     * Gets the value of the participaciones property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParticipaciones() {
        return participaciones;
    }

    /**
     * Sets the value of the participaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParticipaciones(BigDecimal value) {
        this.participaciones = value;
    }

    /**
     * Gets the value of the modalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModalidad() {
        return modalidad;
    }

    /**
     * Sets the value of the modalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModalidad(String value) {
        this.modalidad = value;
    }

    /**
     * Gets the value of the subTipoProd property.
     * 
     * @return
     *     possible object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public SUBTIPODEPRODUCTOType getSubTipoProd() {
        return subTipoProd;
    }

    /**
     * Sets the value of the subTipoProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public void setSubTipoProd(SUBTIPODEPRODUCTOType value) {
        this.subTipoProd = value;
    }

}
