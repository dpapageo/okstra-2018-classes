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
 * <p>Java class for PSV_AbstreumaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSV_AbstreumaterialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pruefwert" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Soll" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSV_AbstreumaterialType", propOrder = {
    "pruefwert",
    "soll"
})
public class PSVAbstreumaterialType {

    @XmlElement(name = "Pruefwert", required = true)
    protected BigInteger pruefwert;
    @XmlElement(name = "Soll", required = true)
    protected BigInteger soll;

    /**
     * Gets the value of the pruefwert property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPruefwert() {
        return pruefwert;
    }

    /**
     * Sets the value of the pruefwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPruefwert(BigInteger value) {
        this.pruefwert = value;
    }

    /**
     * Gets the value of the soll property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSoll() {
        return soll;
    }

    /**
     * Sets the value of the soll property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSoll(BigInteger value) {
        this.soll = value;
    }

}
