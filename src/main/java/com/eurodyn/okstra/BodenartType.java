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
 * <p>Java class for BodenartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodenartType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Schluessel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Version_Schluessel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Angabe_Bodenart" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodenartType", propOrder = {
    "schluessel",
    "versionSchluessel",
    "angabeBodenart"
})
public class BodenartType {

    @XmlElement(name = "Schluessel", required = true)
    protected String schluessel;
    @XmlElement(name = "Version_Schluessel", required = true)
    protected String versionSchluessel;
    @XmlElement(name = "Angabe_Bodenart", required = true)
    protected KeyValuePropertyType angabeBodenart;

    /**
     * Gets the value of the schluessel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchluessel() {
        return schluessel;
    }

    /**
     * Sets the value of the schluessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchluessel(String value) {
        this.schluessel = value;
    }

    /**
     * Gets the value of the versionSchluessel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionSchluessel() {
        return versionSchluessel;
    }

    /**
     * Sets the value of the versionSchluessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionSchluessel(String value) {
        this.versionSchluessel = value;
    }

    /**
     * Gets the value of the angabeBodenart property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getAngabeBodenart() {
        return angabeBodenart;
    }

    /**
     * Sets the value of the angabeBodenart property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setAngabeBodenart(KeyValuePropertyType value) {
        this.angabeBodenart = value;
    }

}
