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
 * <p>Java class for Dyn_ScherrheometerPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dyn_ScherrheometerPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.okstra.de/okstra/2.018.2}Dyn_Scherrheometer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dyn_ScherrheometerPropertyType", propOrder = {
    "dynScherrheometer"
})
public class DynScherrheometerPropertyType {

    @XmlElement(name = "Dyn_Scherrheometer", required = true)
    protected DynScherrheometerType dynScherrheometer;

    /**
     * Gets the value of the dynScherrheometer property.
     * 
     * @return
     *     possible object is
     *     {@link DynScherrheometerType }
     *     
     */
    public DynScherrheometerType getDynScherrheometer() {
        return dynScherrheometer;
    }

    /**
     * Sets the value of the dynScherrheometer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynScherrheometerType }
     *     
     */
    public void setDynScherrheometer(DynScherrheometerType value) {
        this.dynScherrheometer = value;
    }

}
