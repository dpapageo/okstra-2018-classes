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
 * <p>Java class for Schicht_ASB-INGPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schicht_ASB-INGPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.okstra.de/okstra/2.018.2}Schicht_ASB-ING"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schicht_ASB-INGPropertyType", propOrder = {
    "schichtASBING"
})
public class SchichtASBINGPropertyType {

    @XmlElement(name = "Schicht_ASB-ING", required = true)
    protected SchichtASBINGType schichtASBING;

    /**
     * Gets the value of the schichtASBING property.
     * 
     * @return
     *     possible object is
     *     {@link SchichtASBINGType }
     *     
     */
    public SchichtASBINGType getSchichtASBING() {
        return schichtASBING;
    }

    /**
     * Sets the value of the schichtASBING property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchichtASBINGType }
     *     
     */
    public void setSchichtASBING(SchichtASBINGType value) {
        this.schichtASBING = value;
    }

}
