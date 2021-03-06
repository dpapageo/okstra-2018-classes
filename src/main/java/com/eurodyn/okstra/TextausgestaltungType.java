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
 * <p>Java class for TextausgestaltungType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextausgestaltungType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Breite" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Groesse"/&gt;
 *         &lt;element name="Hoehe" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Groesse"/&gt;
 *         &lt;element name="Einheit" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Schriftart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Schrifthoehe" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Groesse"/&gt;
 *         &lt;element name="Schriftfarbe" type="{http://www.okstra.de/okstra/2.018.2}RGB_FarbePropertyType"/&gt;
 *         &lt;element name="Kasten" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Beschriftungsfahne" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="vertikale_Ausrichtung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="horizontale_Ausrichtung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Einfuegeposition" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextausgestaltungType", propOrder = {
    "breite",
    "hoehe",
    "einheit",
    "schriftart",
    "schrifthoehe",
    "schriftfarbe",
    "kasten",
    "beschriftungsfahne",
    "vertikaleAusrichtung",
    "horizontaleAusrichtung",
    "einfuegeposition"
})
public class TextausgestaltungType {

    @XmlElement(name = "Breite")
    protected double breite;
    @XmlElement(name = "Hoehe")
    protected double hoehe;
    @XmlElement(name = "Einheit", required = true)
    protected KeyValuePropertyType einheit;
    @XmlElement(name = "Schriftart", required = true)
    protected String schriftart;
    @XmlElement(name = "Schrifthoehe")
    protected double schrifthoehe;
    @XmlElement(name = "Schriftfarbe", required = true)
    protected RGBFarbePropertyType schriftfarbe;
    @XmlElement(name = "Kasten")
    protected boolean kasten;
    @XmlElement(name = "Beschriftungsfahne")
    protected KeyValuePropertyType beschriftungsfahne;
    @XmlElement(name = "vertikale_Ausrichtung", required = true)
    protected KeyValuePropertyType vertikaleAusrichtung;
    @XmlElement(name = "horizontale_Ausrichtung", required = true)
    protected KeyValuePropertyType horizontaleAusrichtung;
    @XmlElement(name = "Einfuegeposition", required = true)
    protected KeyValuePropertyType einfuegeposition;

    /**
     * Gets the value of the breite property.
     * 
     */
    public double getBreite() {
        return breite;
    }

    /**
     * Sets the value of the breite property.
     * 
     */
    public void setBreite(double value) {
        this.breite = value;
    }

    /**
     * Gets the value of the hoehe property.
     * 
     */
    public double getHoehe() {
        return hoehe;
    }

    /**
     * Sets the value of the hoehe property.
     * 
     */
    public void setHoehe(double value) {
        this.hoehe = value;
    }

    /**
     * Gets the value of the einheit property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getEinheit() {
        return einheit;
    }

    /**
     * Sets the value of the einheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setEinheit(KeyValuePropertyType value) {
        this.einheit = value;
    }

    /**
     * Gets the value of the schriftart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchriftart() {
        return schriftart;
    }

    /**
     * Sets the value of the schriftart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchriftart(String value) {
        this.schriftart = value;
    }

    /**
     * Gets the value of the schrifthoehe property.
     * 
     */
    public double getSchrifthoehe() {
        return schrifthoehe;
    }

    /**
     * Sets the value of the schrifthoehe property.
     * 
     */
    public void setSchrifthoehe(double value) {
        this.schrifthoehe = value;
    }

    /**
     * Gets the value of the schriftfarbe property.
     * 
     * @return
     *     possible object is
     *     {@link RGBFarbePropertyType }
     *     
     */
    public RGBFarbePropertyType getSchriftfarbe() {
        return schriftfarbe;
    }

    /**
     * Sets the value of the schriftfarbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBFarbePropertyType }
     *     
     */
    public void setSchriftfarbe(RGBFarbePropertyType value) {
        this.schriftfarbe = value;
    }

    /**
     * Gets the value of the kasten property.
     * 
     */
    public boolean isKasten() {
        return kasten;
    }

    /**
     * Sets the value of the kasten property.
     * 
     */
    public void setKasten(boolean value) {
        this.kasten = value;
    }

    /**
     * Gets the value of the beschriftungsfahne property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getBeschriftungsfahne() {
        return beschriftungsfahne;
    }

    /**
     * Sets the value of the beschriftungsfahne property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setBeschriftungsfahne(KeyValuePropertyType value) {
        this.beschriftungsfahne = value;
    }

    /**
     * Gets the value of the vertikaleAusrichtung property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getVertikaleAusrichtung() {
        return vertikaleAusrichtung;
    }

    /**
     * Sets the value of the vertikaleAusrichtung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setVertikaleAusrichtung(KeyValuePropertyType value) {
        this.vertikaleAusrichtung = value;
    }

    /**
     * Gets the value of the horizontaleAusrichtung property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getHorizontaleAusrichtung() {
        return horizontaleAusrichtung;
    }

    /**
     * Sets the value of the horizontaleAusrichtung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setHorizontaleAusrichtung(KeyValuePropertyType value) {
        this.horizontaleAusrichtung = value;
    }

    /**
     * Gets the value of the einfuegeposition property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getEinfuegeposition() {
        return einfuegeposition;
    }

    /**
     * Sets the value of the einfuegeposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setEinfuegeposition(KeyValuePropertyType value) {
        this.einfuegeposition = value;
    }

}
