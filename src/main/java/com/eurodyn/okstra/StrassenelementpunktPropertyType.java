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
 * <p>Java class for StrassenelementpunktPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrassenelementpunktPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.okstra.de/okstra/2.018.2}Strassenelementpunkt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrassenelementpunktPropertyType", propOrder = {
    "strassenelementpunkt"
})
public class StrassenelementpunktPropertyType {

    @XmlElement(name = "Strassenelementpunkt", required = true)
    protected StrassenelementpunktType strassenelementpunkt;

    /**
     * Gets the value of the strassenelementpunkt property.
     * 
     * @return
     *     possible object is
     *     {@link StrassenelementpunktType }
     *     
     */
    public StrassenelementpunktType getStrassenelementpunkt() {
        return strassenelementpunkt;
    }

    /**
     * Sets the value of the strassenelementpunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrassenelementpunktType }
     *     
     */
    public void setStrassenelementpunkt(StrassenelementpunktType value) {
        this.strassenelementpunkt = value;
    }

}
