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
 * <p>Java class for einfacher_ZeitraumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="einfacher_ZeitraumType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hat_Startdatum" type="{http://www.okstra.de/okstra/2.018.2}StartdatumPropertyType"/&gt;
 *         &lt;element name="hat_Dauer" type="{http://www.okstra.de/okstra/2.018.2}DauerPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "einfacher_ZeitraumType", propOrder = {
    "hatStartdatum",
    "hatDauer"
})
public class EinfacherZeitraumType {

    @XmlElement(name = "hat_Startdatum", required = true)
    protected StartdatumPropertyType hatStartdatum;
    @XmlElement(name = "hat_Dauer", required = true)
    protected DauerPropertyType hatDauer;

    /**
     * Gets the value of the hatStartdatum property.
     * 
     * @return
     *     possible object is
     *     {@link StartdatumPropertyType }
     *     
     */
    public StartdatumPropertyType getHatStartdatum() {
        return hatStartdatum;
    }

    /**
     * Sets the value of the hatStartdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartdatumPropertyType }
     *     
     */
    public void setHatStartdatum(StartdatumPropertyType value) {
        this.hatStartdatum = value;
    }

    /**
     * Gets the value of the hatDauer property.
     * 
     * @return
     *     possible object is
     *     {@link DauerPropertyType }
     *     
     */
    public DauerPropertyType getHatDauer() {
        return hatDauer;
    }

    /**
     * Sets the value of the hatDauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DauerPropertyType }
     *     
     */
    public void setHatDauer(DauerPropertyType value) {
        this.hatDauer = value;
    }

}
