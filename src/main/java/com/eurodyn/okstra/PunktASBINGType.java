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
 * <p>Java class for Punkt_ASB-INGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Punkt_ASB-INGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="X" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter"/&gt;
 *         &lt;element name="Y" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Punkt_ASB-INGType", propOrder = {
    "x",
    "y"
})
public class PunktASBINGType {

    @XmlElement(name = "X", required = true)
    protected Meter x;
    @XmlElement(name = "Y", required = true)
    protected Meter y;

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setX(Meter value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setY(Meter value) {
        this.y = value;
    }

}