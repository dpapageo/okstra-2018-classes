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
 * <p>Java class for ZeitabschnittType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeitabschnittType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Startzeitpunkt" type="{http://www.okstra.de/okstra/2.018.2}ZeitpunktPropertyType"/&gt;
 *         &lt;element name="Endezeitpunkt" type="{http://www.okstra.de/okstra/2.018.2}ZeitpunktPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeitabschnittType", propOrder = {
    "startzeitpunkt",
    "endezeitpunkt"
})
public class ZeitabschnittType {

    @XmlElement(name = "Startzeitpunkt", required = true)
    protected ZeitpunktPropertyType startzeitpunkt;
    @XmlElement(name = "Endezeitpunkt")
    protected ZeitpunktPropertyType endezeitpunkt;

    /**
     * Gets the value of the startzeitpunkt property.
     * 
     * @return
     *     possible object is
     *     {@link ZeitpunktPropertyType }
     *     
     */
    public ZeitpunktPropertyType getStartzeitpunkt() {
        return startzeitpunkt;
    }

    /**
     * Sets the value of the startzeitpunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeitpunktPropertyType }
     *     
     */
    public void setStartzeitpunkt(ZeitpunktPropertyType value) {
        this.startzeitpunkt = value;
    }

    /**
     * Gets the value of the endezeitpunkt property.
     * 
     * @return
     *     possible object is
     *     {@link ZeitpunktPropertyType }
     *     
     */
    public ZeitpunktPropertyType getEndezeitpunkt() {
        return endezeitpunkt;
    }

    /**
     * Sets the value of the endezeitpunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeitpunktPropertyType }
     *     
     */
    public void setEndezeitpunkt(ZeitpunktPropertyType value) {
        this.endezeitpunkt = value;
    }

}
