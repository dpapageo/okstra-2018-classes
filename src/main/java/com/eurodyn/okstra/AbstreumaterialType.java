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
 * <p>Java class for AbstreumaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstreumaterialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gesteinsart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Lieferkoernung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PSV" type="{http://www.okstra.de/okstra/2.018.2}PSV_AbstreumaterialPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Leuchtdichtekoeffizient" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}cd_pro_Quadratmeter_und_Lux" minOccurs="0"/&gt;
 *         &lt;element name="Ueberkorn" type="{http://www.okstra.de/okstra/2.018.2}UeberkornPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Unterkorn" type="{http://www.okstra.de/okstra/2.018.2}UnterkornPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstreumaterialType", propOrder = {
    "gesteinsart",
    "lieferkoernung",
    "psv",
    "leuchtdichtekoeffizient",
    "ueberkorn",
    "unterkorn"
})
public class AbstreumaterialType {

    @XmlElement(name = "Gesteinsart", required = true)
    protected String gesteinsart;
    @XmlElement(name = "Lieferkoernung", required = true)
    protected String lieferkoernung;
    @XmlElement(name = "PSV")
    protected PSVAbstreumaterialPropertyType psv;
    @XmlElement(name = "Leuchtdichtekoeffizient")
    protected CdProQuadratmeterUndLux leuchtdichtekoeffizient;
    @XmlElement(name = "Ueberkorn")
    protected UeberkornPropertyType ueberkorn;
    @XmlElement(name = "Unterkorn")
    protected UnterkornPropertyType unterkorn;

    /**
     * Gets the value of the gesteinsart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGesteinsart() {
        return gesteinsart;
    }

    /**
     * Sets the value of the gesteinsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGesteinsart(String value) {
        this.gesteinsart = value;
    }

    /**
     * Gets the value of the lieferkoernung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieferkoernung() {
        return lieferkoernung;
    }

    /**
     * Sets the value of the lieferkoernung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieferkoernung(String value) {
        this.lieferkoernung = value;
    }

    /**
     * Gets the value of the psv property.
     * 
     * @return
     *     possible object is
     *     {@link PSVAbstreumaterialPropertyType }
     *     
     */
    public PSVAbstreumaterialPropertyType getPSV() {
        return psv;
    }

    /**
     * Sets the value of the psv property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSVAbstreumaterialPropertyType }
     *     
     */
    public void setPSV(PSVAbstreumaterialPropertyType value) {
        this.psv = value;
    }

    /**
     * Gets the value of the leuchtdichtekoeffizient property.
     * 
     * @return
     *     possible object is
     *     {@link CdProQuadratmeterUndLux }
     *     
     */
    public CdProQuadratmeterUndLux getLeuchtdichtekoeffizient() {
        return leuchtdichtekoeffizient;
    }

    /**
     * Sets the value of the leuchtdichtekoeffizient property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdProQuadratmeterUndLux }
     *     
     */
    public void setLeuchtdichtekoeffizient(CdProQuadratmeterUndLux value) {
        this.leuchtdichtekoeffizient = value;
    }

    /**
     * Gets the value of the ueberkorn property.
     * 
     * @return
     *     possible object is
     *     {@link UeberkornPropertyType }
     *     
     */
    public UeberkornPropertyType getUeberkorn() {
        return ueberkorn;
    }

    /**
     * Sets the value of the ueberkorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UeberkornPropertyType }
     *     
     */
    public void setUeberkorn(UeberkornPropertyType value) {
        this.ueberkorn = value;
    }

    /**
     * Gets the value of the unterkorn property.
     * 
     * @return
     *     possible object is
     *     {@link UnterkornPropertyType }
     *     
     */
    public UnterkornPropertyType getUnterkorn() {
        return unterkorn;
    }

    /**
     * Sets the value of the unterkorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnterkornPropertyType }
     *     
     */
    public void setUnterkorn(UnterkornPropertyType value) {
        this.unterkorn = value;
    }

}
