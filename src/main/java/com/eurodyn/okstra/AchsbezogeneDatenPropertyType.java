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
 * <p>Java class for achsbezogene_DatenPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="achsbezogene_DatenPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.okstra.de/okstra/2.018.2}achsbezogene_Daten"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "achsbezogene_DatenPropertyType", propOrder = {
    "achsbezogeneDaten"
})
public class AchsbezogeneDatenPropertyType {

    @XmlElement(name = "achsbezogene_Daten", required = true)
    protected AchsbezogeneDatenType achsbezogeneDaten;

    /**
     * Gets the value of the achsbezogeneDaten property.
     * 
     * @return
     *     possible object is
     *     {@link AchsbezogeneDatenType }
     *     
     */
    public AchsbezogeneDatenType getAchsbezogeneDaten() {
        return achsbezogeneDaten;
    }

    /**
     * Sets the value of the achsbezogeneDaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link AchsbezogeneDatenType }
     *     
     */
    public void setAchsbezogeneDaten(AchsbezogeneDatenType value) {
        this.achsbezogeneDaten = value;
    }

}
