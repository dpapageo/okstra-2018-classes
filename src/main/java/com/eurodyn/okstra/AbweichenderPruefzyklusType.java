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
 * <p>Java class for Abweichender_PruefzyklusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Abweichender_PruefzyklusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zyklus" type="{http://www.okstra.de/okstra/2.018.2}DauerPropertyType"/&gt;
 *         &lt;element name="Pruefart" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Abweichender_PruefzyklusType", propOrder = {
    "zyklus",
    "pruefart"
})
public class AbweichenderPruefzyklusType {

    @XmlElement(name = "Zyklus", required = true)
    protected DauerPropertyType zyklus;
    @XmlElement(name = "Pruefart", required = true)
    protected KeyValuePropertyType pruefart;

    /**
     * Gets the value of the zyklus property.
     * 
     * @return
     *     possible object is
     *     {@link DauerPropertyType }
     *     
     */
    public DauerPropertyType getZyklus() {
        return zyklus;
    }

    /**
     * Sets the value of the zyklus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DauerPropertyType }
     *     
     */
    public void setZyklus(DauerPropertyType value) {
        this.zyklus = value;
    }

    /**
     * Gets the value of the pruefart property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getPruefart() {
        return pruefart;
    }

    /**
     * Sets the value of the pruefart property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setPruefart(KeyValuePropertyType value) {
        this.pruefart = value;
    }

}
