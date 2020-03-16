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
 * <p>Java class for Geometrie_ASB-INGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Geometrie_ASB-INGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bedeutung_Schluessel" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Bedeutung_Freitext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Laenge" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Flaeche" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Quadratmeter" minOccurs="0"/&gt;
 *         &lt;element name="Volumen" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Kubikmeter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geometrie_ASB-INGType", propOrder = {
    "bedeutungSchluessel",
    "bedeutungFreitext",
    "laenge",
    "flaeche",
    "volumen"
})
public class GeometrieASBINGType {

    @XmlElement(name = "Bedeutung_Schluessel")
    protected KeyValuePropertyType bedeutungSchluessel;
    @XmlElement(name = "Bedeutung_Freitext")
    protected String bedeutungFreitext;
    @XmlElement(name = "Laenge")
    protected Meter laenge;
    @XmlElement(name = "Flaeche")
    protected Quadratmeter flaeche;
    @XmlElement(name = "Volumen")
    protected Kubikmeter volumen;

    /**
     * Gets the value of the bedeutungSchluessel property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getBedeutungSchluessel() {
        return bedeutungSchluessel;
    }

    /**
     * Sets the value of the bedeutungSchluessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setBedeutungSchluessel(KeyValuePropertyType value) {
        this.bedeutungSchluessel = value;
    }

    /**
     * Gets the value of the bedeutungFreitext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedeutungFreitext() {
        return bedeutungFreitext;
    }

    /**
     * Sets the value of the bedeutungFreitext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedeutungFreitext(String value) {
        this.bedeutungFreitext = value;
    }

    /**
     * Gets the value of the laenge property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getLaenge() {
        return laenge;
    }

    /**
     * Sets the value of the laenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setLaenge(Meter value) {
        this.laenge = value;
    }

    /**
     * Gets the value of the flaeche property.
     * 
     * @return
     *     possible object is
     *     {@link Quadratmeter }
     *     
     */
    public Quadratmeter getFlaeche() {
        return flaeche;
    }

    /**
     * Sets the value of the flaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quadratmeter }
     *     
     */
    public void setFlaeche(Quadratmeter value) {
        this.flaeche = value;
    }

    /**
     * Gets the value of the volumen property.
     * 
     * @return
     *     possible object is
     *     {@link Kubikmeter }
     *     
     */
    public Kubikmeter getVolumen() {
        return volumen;
    }

    /**
     * Sets the value of the volumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kubikmeter }
     *     
     */
    public void setVolumen(Kubikmeter value) {
        this.volumen = value;
    }

}