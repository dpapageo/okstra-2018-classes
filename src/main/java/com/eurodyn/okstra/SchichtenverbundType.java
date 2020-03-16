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
 * <p>Java class for SchichtenverbundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchichtenverbundType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Scherweg_Mittelwert" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Millimeter"/&gt;
 *         &lt;element name="Schichtenverbund_Scherkraft" type="{http://www.okstra.de/okstra/2.018.2}Schichtenverbund_ScherkraftPropertyType"/&gt;
 *         &lt;element name="Haftzugfestigkeit" type="{http://www.okstra.de/okstra/2.018.2}HaftzugfestigkeitPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchichtenverbundType", propOrder = {
    "scherwegMittelwert",
    "schichtenverbundScherkraft",
    "haftzugfestigkeit"
})
public class SchichtenverbundType {

    @XmlElement(name = "Scherweg_Mittelwert", required = true)
    protected Millimeter scherwegMittelwert;
    @XmlElement(name = "Schichtenverbund_Scherkraft", required = true)
    protected SchichtenverbundScherkraftPropertyType schichtenverbundScherkraft;
    @XmlElement(name = "Haftzugfestigkeit")
    protected HaftzugfestigkeitPropertyType haftzugfestigkeit;

    /**
     * Gets the value of the scherwegMittelwert property.
     * 
     * @return
     *     possible object is
     *     {@link Millimeter }
     *     
     */
    public Millimeter getScherwegMittelwert() {
        return scherwegMittelwert;
    }

    /**
     * Sets the value of the scherwegMittelwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Millimeter }
     *     
     */
    public void setScherwegMittelwert(Millimeter value) {
        this.scherwegMittelwert = value;
    }

    /**
     * Gets the value of the schichtenverbundScherkraft property.
     * 
     * @return
     *     possible object is
     *     {@link SchichtenverbundScherkraftPropertyType }
     *     
     */
    public SchichtenverbundScherkraftPropertyType getSchichtenverbundScherkraft() {
        return schichtenverbundScherkraft;
    }

    /**
     * Sets the value of the schichtenverbundScherkraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchichtenverbundScherkraftPropertyType }
     *     
     */
    public void setSchichtenverbundScherkraft(SchichtenverbundScherkraftPropertyType value) {
        this.schichtenverbundScherkraft = value;
    }

    /**
     * Gets the value of the haftzugfestigkeit property.
     * 
     * @return
     *     possible object is
     *     {@link HaftzugfestigkeitPropertyType }
     *     
     */
    public HaftzugfestigkeitPropertyType getHaftzugfestigkeit() {
        return haftzugfestigkeit;
    }

    /**
     * Sets the value of the haftzugfestigkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link HaftzugfestigkeitPropertyType }
     *     
     */
    public void setHaftzugfestigkeit(HaftzugfestigkeitPropertyType value) {
        this.haftzugfestigkeit = value;
    }

}
