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
 * <p>Java class for MarshallprobekoerperPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarshallprobekoerperPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.okstra.de/okstra/2.018.2}Marshallprobekoerper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarshallprobekoerperPropertyType", propOrder = {
    "marshallprobekoerper"
})
public class MarshallprobekoerperPropertyType {

    @XmlElement(name = "Marshallprobekoerper", required = true)
    protected MarshallprobekoerperType marshallprobekoerper;

    /**
     * Gets the value of the marshallprobekoerper property.
     * 
     * @return
     *     possible object is
     *     {@link MarshallprobekoerperType }
     *     
     */
    public MarshallprobekoerperType getMarshallprobekoerper() {
        return marshallprobekoerper;
    }

    /**
     * Sets the value of the marshallprobekoerper property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarshallprobekoerperType }
     *     
     */
    public void setMarshallprobekoerper(MarshallprobekoerperType value) {
        this.marshallprobekoerper = value;
    }

}
