//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.09 at 04:49:50 PM EET 
//


package com.eurodyn.okstra;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Abstand_AnzahlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Abstand_AnzahlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Abstand" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter"/&gt;
 *         &lt;element name="Anzahl" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Abstand_AnzahlType", propOrder = {
    "abstand",
    "anzahl"
})
public class AbstandAnzahlType {

    @XmlElement(name = "Abstand")
    protected Meter abstand;
    @XmlElement(name = "Anzahl")
    protected BigInteger anzahl;

    /**
     * Gets the value of the abstand property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getAbstand() {
        return abstand;
    }

    /**
     * Sets the value of the abstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setAbstand(Meter value) {
        this.abstand = value;
    }

    /**
     * Gets the value of the anzahl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahl() {
        return anzahl;
    }

    /**
     * Sets the value of the anzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahl(BigInteger value) {
        this.anzahl = value;
    }

}
