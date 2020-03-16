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
 * <p>Java class for Einaxialer_DruckschwellversuchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Einaxialer_DruckschwellversuchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dehnung" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Promille"/&gt;
 *         &lt;element name="Dehnungsrate" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Promille_pro_10000_Lastwechsel"/&gt;
 *         &lt;element name="Abbruchkriterium" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Erreichte_Anzahl_Belastungszyklen" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Bewertung_Ergebnis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Einaxialer_DruckschwellversuchType", propOrder = {
    "dehnung",
    "dehnungsrate",
    "abbruchkriterium",
    "erreichteAnzahlBelastungszyklen",
    "bewertungErgebnis"
})
public class EinaxialerDruckschwellversuchType {

    @XmlElement(name = "Dehnung")
    protected double dehnung;
    @XmlElement(name = "Dehnungsrate")
    protected double dehnungsrate;
    @XmlElement(name = "Abbruchkriterium", required = true)
    protected KeyValuePropertyType abbruchkriterium;
    @XmlElement(name = "Erreichte_Anzahl_Belastungszyklen", required = true)
    protected BigInteger erreichteAnzahlBelastungszyklen;
    @XmlElement(name = "Bewertung_Ergebnis", required = true)
    protected String bewertungErgebnis;

    /**
     * Gets the value of the dehnung property.
     * 
     */
    public double getDehnung() {
        return dehnung;
    }

    /**
     * Sets the value of the dehnung property.
     * 
     */
    public void setDehnung(double value) {
        this.dehnung = value;
    }

    /**
     * Gets the value of the dehnungsrate property.
     * 
     */
    public double getDehnungsrate() {
        return dehnungsrate;
    }

    /**
     * Sets the value of the dehnungsrate property.
     * 
     */
    public void setDehnungsrate(double value) {
        this.dehnungsrate = value;
    }

    /**
     * Gets the value of the abbruchkriterium property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getAbbruchkriterium() {
        return abbruchkriterium;
    }

    /**
     * Sets the value of the abbruchkriterium property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setAbbruchkriterium(KeyValuePropertyType value) {
        this.abbruchkriterium = value;
    }

    /**
     * Gets the value of the erreichteAnzahlBelastungszyklen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErreichteAnzahlBelastungszyklen() {
        return erreichteAnzahlBelastungszyklen;
    }

    /**
     * Sets the value of the erreichteAnzahlBelastungszyklen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErreichteAnzahlBelastungszyklen(BigInteger value) {
        this.erreichteAnzahlBelastungszyklen = value;
    }

    /**
     * Gets the value of the bewertungErgebnis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBewertungErgebnis() {
        return bewertungErgebnis;
    }

    /**
     * Sets the value of the bewertungErgebnis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBewertungErgebnis(String value) {
        this.bewertungErgebnis = value;
    }

}