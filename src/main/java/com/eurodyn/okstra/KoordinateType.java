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
 * <p>Java class for KoordinateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoordinateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="x_Koordinate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="y_Koordinate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="z_Koordinate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoordinateType", propOrder = {
    "xKoordinate",
    "yKoordinate",
    "zKoordinate"
})
public class KoordinateType {

    @XmlElement(name = "x_Koordinate")
    protected Double xKoordinate;
    @XmlElement(name = "y_Koordinate")
    protected Double yKoordinate;
    @XmlElement(name = "z_Koordinate")
    protected Double zKoordinate;

    /**
     * Gets the value of the xKoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXKoordinate() {
        return xKoordinate;
    }

    /**
     * Sets the value of the xKoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXKoordinate(Double value) {
        this.xKoordinate = value;
    }

    /**
     * Gets the value of the yKoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYKoordinate() {
        return yKoordinate;
    }

    /**
     * Sets the value of the yKoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYKoordinate(Double value) {
        this.yKoordinate = value;
    }

    /**
     * Gets the value of the zKoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZKoordinate() {
        return zKoordinate;
    }

    /**
     * Sets the value of the zKoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZKoordinate(Double value) {
        this.zKoordinate = value;
    }

}
