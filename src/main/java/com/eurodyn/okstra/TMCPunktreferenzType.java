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
 * <p>Java class for TMC_PunktreferenzType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMC_PunktreferenzType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Primaer" type="{http://www.okstra.de/okstra/2.018.2}TMC_Location_CodePropertyType"/&gt;
 *         &lt;element name="Offset" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter"/&gt;
 *         &lt;element name="Richtung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMC_PunktreferenzType", propOrder = {
    "primaer",
    "offset",
    "richtung"
})
public class TMCPunktreferenzType {

    @XmlElement(name = "Primaer", required = true)
    protected TMCLocationCodePropertyType primaer;
    @XmlElement(name = "Offset", required = true)
    protected Meter offset;
    @XmlElement(name = "Richtung", required = true)
    protected KeyValuePropertyType richtung;

    /**
     * Gets the value of the primaer property.
     * 
     * @return
     *     possible object is
     *     {@link TMCLocationCodePropertyType }
     *     
     */
    public TMCLocationCodePropertyType getPrimaer() {
        return primaer;
    }

    /**
     * Sets the value of the primaer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMCLocationCodePropertyType }
     *     
     */
    public void setPrimaer(TMCLocationCodePropertyType value) {
        this.primaer = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setOffset(Meter value) {
        this.offset = value;
    }

    /**
     * Gets the value of the richtung property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getRichtung() {
        return richtung;
    }

    /**
     * Sets the value of the richtung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setRichtung(KeyValuePropertyType value) {
        this.richtung = value;
    }

}
