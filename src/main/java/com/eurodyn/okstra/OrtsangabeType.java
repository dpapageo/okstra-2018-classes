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
 * <p>Java class for OrtsangabeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrtsangabeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ortsangabe" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Groesse_Ortsangabe" type="{http://www.okstra.de/okstra/2.018.2}Abstand_AnzahlPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrtsangabeType", propOrder = {
    "ortsangabe",
    "groesseOrtsangabe"
})
public class OrtsangabeType {

    @XmlElement(name = "Ortsangabe", required = true)
    protected KeyValuePropertyType ortsangabe;
    @XmlElement(name = "Groesse_Ortsangabe")
    protected AbstandAnzahlPropertyType groesseOrtsangabe;

    /**
     * Gets the value of the ortsangabe property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getOrtsangabe() {
        return ortsangabe;
    }

    /**
     * Sets the value of the ortsangabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setOrtsangabe(KeyValuePropertyType value) {
        this.ortsangabe = value;
    }

    /**
     * Gets the value of the groesseOrtsangabe property.
     * 
     * @return
     *     possible object is
     *     {@link AbstandAnzahlPropertyType }
     *     
     */
    public AbstandAnzahlPropertyType getGroesseOrtsangabe() {
        return groesseOrtsangabe;
    }

    /**
     * Sets the value of the groesseOrtsangabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstandAnzahlPropertyType }
     *     
     */
    public void setGroesseOrtsangabe(AbstandAnzahlPropertyType value) {
        this.groesseOrtsangabe = value;
    }

}
