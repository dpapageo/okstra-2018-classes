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
 * <p>Java class for ZulassungPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZulassungPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.okstra.de/okstra/2.018.2}Zulassung"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZulassungPropertyType", propOrder = {
    "zulassung"
})
public class ZulassungPropertyType {

    @XmlElement(name = "Zulassung", required = true)
    protected ZulassungType zulassung;

    /**
     * Gets the value of the zulassung property.
     * 
     * @return
     *     possible object is
     *     {@link ZulassungType }
     *     
     */
    public ZulassungType getZulassung() {
        return zulassung;
    }

    /**
     * Sets the value of the zulassung property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZulassungType }
     *     
     */
    public void setZulassung(ZulassungType value) {
        this.zulassung = value;
    }

}
