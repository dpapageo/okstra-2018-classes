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
 * <p>Java class for VerformungsbestaendigkeitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerformungsbestaendigkeitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dynamische_Stempeleindringtiefe" type="{http://www.okstra.de/okstra/2.018.2}Dynamische_StempeleindringtiefePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Einaxialer_Druckschwellversuch" type="{http://www.okstra.de/okstra/2.018.2}Einaxialer_DruckschwellversuchPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerformungsbestaendigkeitType", propOrder = {
    "dynamischeStempeleindringtiefe",
    "einaxialerDruckschwellversuch"
})
public class VerformungsbestaendigkeitType {

    @XmlElement(name = "Dynamische_Stempeleindringtiefe")
    protected DynamischeStempeleindringtiefePropertyType dynamischeStempeleindringtiefe;
    @XmlElement(name = "Einaxialer_Druckschwellversuch")
    protected EinaxialerDruckschwellversuchPropertyType einaxialerDruckschwellversuch;

    /**
     * Gets the value of the dynamischeStempeleindringtiefe property.
     * 
     * @return
     *     possible object is
     *     {@link DynamischeStempeleindringtiefePropertyType }
     *     
     */
    public DynamischeStempeleindringtiefePropertyType getDynamischeStempeleindringtiefe() {
        return dynamischeStempeleindringtiefe;
    }

    /**
     * Sets the value of the dynamischeStempeleindringtiefe property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamischeStempeleindringtiefePropertyType }
     *     
     */
    public void setDynamischeStempeleindringtiefe(DynamischeStempeleindringtiefePropertyType value) {
        this.dynamischeStempeleindringtiefe = value;
    }

    /**
     * Gets the value of the einaxialerDruckschwellversuch property.
     * 
     * @return
     *     possible object is
     *     {@link EinaxialerDruckschwellversuchPropertyType }
     *     
     */
    public EinaxialerDruckschwellversuchPropertyType getEinaxialerDruckschwellversuch() {
        return einaxialerDruckschwellversuch;
    }

    /**
     * Sets the value of the einaxialerDruckschwellversuch property.
     * 
     * @param value
     *     allowed object is
     *     {@link EinaxialerDruckschwellversuchPropertyType }
     *     
     */
    public void setEinaxialerDruckschwellversuch(EinaxialerDruckschwellversuchPropertyType value) {
        this.einaxialerDruckschwellversuch = value;
    }

}