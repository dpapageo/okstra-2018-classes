//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.09 at 04:49:50 PM EET 
//


package com.eurodyn.okstra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HZ_PunktPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HZ_PunktPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.okstra.de/okstra/2.018.2}HZ_Punkt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HZ_PunktPropertyType", propOrder = {
    "hzPunkt"
})
public class HZPunktPropertyType {

    @XmlElement(name = "HZ_Punkt", required = true)
    protected HZPunktType hzPunkt;

    /**
     * Gets the value of the hzPunkt property.
     * 
     * @return
     *     possible object is
     *     {@link HZPunktType }
     *     
     */
    public HZPunktType getHZPunkt() {
        return hzPunkt;
    }

    /**
     * Sets the value of the hzPunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link HZPunktType }
     *     
     */
    public void setHZPunkt(HZPunktType value) {
        this.hzPunkt = value;
    }

}