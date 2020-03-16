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
 * <p>Java class for KommunikationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KommunikationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kommunikationsadresse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Kommunikationstyp" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Dienstlich_Privat" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KommunikationType", propOrder = {
    "kommunikationsadresse",
    "kommunikationstyp",
    "dienstlichPrivat"
})
public class KommunikationType {

    @XmlElement(name = "Kommunikationsadresse", required = true)
    protected String kommunikationsadresse;
    @XmlElement(name = "Kommunikationstyp", required = true)
    protected KeyValuePropertyType kommunikationstyp;
    @XmlElement(name = "Dienstlich_Privat")
    protected KeyValuePropertyType dienstlichPrivat;

    /**
     * Gets the value of the kommunikationsadresse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunikationsadresse() {
        return kommunikationsadresse;
    }

    /**
     * Sets the value of the kommunikationsadresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunikationsadresse(String value) {
        this.kommunikationsadresse = value;
    }

    /**
     * Gets the value of the kommunikationstyp property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getKommunikationstyp() {
        return kommunikationstyp;
    }

    /**
     * Sets the value of the kommunikationstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setKommunikationstyp(KeyValuePropertyType value) {
        this.kommunikationstyp = value;
    }

    /**
     * Gets the value of the dienstlichPrivat property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getDienstlichPrivat() {
        return dienstlichPrivat;
    }

    /**
     * Sets the value of the dienstlichPrivat property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setDienstlichPrivat(KeyValuePropertyType value) {
        this.dienstlichPrivat = value;
    }

}