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
 * <p>Java class for Hor_KoorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hor_KoorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Station" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter"/&gt;
 *         &lt;element name="Hoehe" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hor_KoorType", propOrder = {
    "station",
    "hoehe"
})
public class HorKoorType {

    @XmlElement(name = "Station", required = true)
    protected Meter station;
    @XmlElement(name = "Hoehe", required = true)
    protected Meter hoehe;

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setStation(Meter value) {
        this.station = value;
    }

    /**
     * Gets the value of the hoehe property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getHoehe() {
        return hoehe;
    }

    /**
     * Sets the value of the hoehe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setHoehe(Meter value) {
        this.hoehe = value;
    }

}
