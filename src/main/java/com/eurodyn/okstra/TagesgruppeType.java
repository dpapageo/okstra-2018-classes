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
 * <p>Java class for TagesgruppeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TagesgruppeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fahrtzweckgruppe" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Normalzeitbereich" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="weitere_Tagesgruppen" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TagesgruppeType", propOrder = {
    "fahrtzweckgruppe",
    "normalzeitbereich",
    "weitereTagesgruppen"
})
public class TagesgruppeType {

    @XmlElement(name = "Fahrtzweckgruppe")
    protected KeyValuePropertyType fahrtzweckgruppe;
    @XmlElement(name = "Normalzeitbereich")
    protected KeyValuePropertyType normalzeitbereich;
    @XmlElement(name = "weitere_Tagesgruppen")
    protected KeyValuePropertyType weitereTagesgruppen;

    /**
     * Gets the value of the fahrtzweckgruppe property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getFahrtzweckgruppe() {
        return fahrtzweckgruppe;
    }

    /**
     * Sets the value of the fahrtzweckgruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setFahrtzweckgruppe(KeyValuePropertyType value) {
        this.fahrtzweckgruppe = value;
    }

    /**
     * Gets the value of the normalzeitbereich property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getNormalzeitbereich() {
        return normalzeitbereich;
    }

    /**
     * Sets the value of the normalzeitbereich property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setNormalzeitbereich(KeyValuePropertyType value) {
        this.normalzeitbereich = value;
    }

    /**
     * Gets the value of the weitereTagesgruppen property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getWeitereTagesgruppen() {
        return weitereTagesgruppen;
    }

    /**
     * Sets the value of the weitereTagesgruppen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setWeitereTagesgruppen(KeyValuePropertyType value) {
        this.weitereTagesgruppen = value;
    }

}
