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
 * <p>Java class for PrimeMeridianType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimeMeridianType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}greenwichLongitude"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimeMeridianType", namespace = "http://www.opengis.net/gml/3.2", propOrder = {
    "greenwichLongitude"
})
public class PrimeMeridianType
    extends IdentifiedObjectType
{

    @XmlElement(required = true)
    protected AngleType greenwichLongitude;

    /**
     * Gets the value of the greenwichLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getGreenwichLongitude() {
        return greenwichLongitude;
    }

    /**
     * Sets the value of the greenwichLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setGreenwichLongitude(AngleType value) {
        this.greenwichLongitude = value;
    }

}
