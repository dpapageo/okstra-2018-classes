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
 * <p>Java class for KommunikationPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KommunikationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.okstra.de/okstra/2.018.2}Kommunikation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KommunikationPropertyType", propOrder = {
    "kommunikation"
})
public class KommunikationPropertyType {

    @XmlElement(name = "Kommunikation", required = true)
    protected KommunikationType kommunikation;

    /**
     * Gets the value of the kommunikation property.
     * 
     * @return
     *     possible object is
     *     {@link KommunikationType }
     *     
     */
    public KommunikationType getKommunikation() {
        return kommunikation;
    }

    /**
     * Sets the value of the kommunikation property.
     * 
     * @param value
     *     allowed object is
     *     {@link KommunikationType }
     *     
     */
    public void setKommunikation(KommunikationType value) {
        this.kommunikation = value;
    }

}
