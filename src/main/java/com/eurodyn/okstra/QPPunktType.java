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
 * <p>Java class for QP_PunktType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QP_PunktType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Abstand_zur_Achse" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter"/&gt;
 *         &lt;element name="Hoehe" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QP_PunktType", propOrder = {
    "bezeichnung",
    "abstandZurAchse",
    "hoehe"
})
public class QPPunktType {

    @XmlElement(name = "Bezeichnung")
    protected String bezeichnung;
    @XmlElement(name = "Abstand_zur_Achse", required = true)
    protected Meter abstandZurAchse;
    @XmlElement(name = "Hoehe", required = true)
    protected Meter hoehe;

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the abstandZurAchse property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getAbstandZurAchse() {
        return abstandZurAchse;
    }

    /**
     * Sets the value of the abstandZurAchse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setAbstandZurAchse(Meter value) {
        this.abstandZurAchse = value;
    }

    /**
     * Gets the value of the hoehe property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getHoehe() {
        return hoehe;
    }

    /**
     * Sets the value of the hoehe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setHoehe(Meter value) {
        this.hoehe = value;
    }

}