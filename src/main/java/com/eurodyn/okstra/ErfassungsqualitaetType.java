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
 * <p>Java class for ErfassungsqualitaetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErfassungsqualitaetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Erfassung_Verfahren" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Standardabweichung" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Zentimeter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErfassungsqualitaetType", propOrder = {
    "erfassungVerfahren",
    "standardabweichung"
})
public class ErfassungsqualitaetType {

    @XmlElement(name = "Erfassung_Verfahren")
    protected KeyValuePropertyType erfassungVerfahren;
    @XmlElement(name = "Standardabweichung")
    protected Zentimeter standardabweichung;

    /**
     * Gets the value of the erfassungVerfahren property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getErfassungVerfahren() {
        return erfassungVerfahren;
    }

    /**
     * Sets the value of the erfassungVerfahren property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setErfassungVerfahren(KeyValuePropertyType value) {
        this.erfassungVerfahren = value;
    }

    /**
     * Gets the value of the standardabweichung property.
     * 
     * @return
     *     possible object is
     *     {@link Zentimeter }
     *     
     */
    public Zentimeter getStandardabweichung() {
        return standardabweichung;
    }

    /**
     * Sets the value of the standardabweichung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zentimeter }
     *     
     */
    public void setStandardabweichung(Zentimeter value) {
        this.standardabweichung = value;
    }

}
