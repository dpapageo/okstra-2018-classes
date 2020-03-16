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
 * <p>Java class for Menge_mit_DimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Menge_mit_DimensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Laenge" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter"/&gt;
 *         &lt;element name="Flaeche" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Quadratmeter"/&gt;
 *         &lt;element name="Volumen" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Kubikmeter"/&gt;
 *         &lt;element name="Winkel" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Radiant"/&gt;
 *         &lt;element name="Anzahl" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anteil" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Prozent"/&gt;
 *         &lt;element name="Temperatur" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Grad_Celsius"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Menge_mit_DimensionType", propOrder = {
    "laenge",
    "flaeche",
    "volumen",
    "winkel",
    "anzahl",
    "anteil",
    "temperatur"
})
public class MengeMitDimensionType {

    @XmlElement(name = "Laenge")
    protected Meter laenge;
    @XmlElement(name = "Flaeche")
    protected Quadratmeter flaeche;
    @XmlElement(name = "Volumen")
    protected Kubikmeter volumen;
    @XmlElement(name = "Winkel")
    protected Radiant winkel;
    @XmlElement(name = "Anzahl")
    protected BigInteger anzahl;
    @XmlElement(name = "Anteil")
    protected Double anteil;
    @XmlElement(name = "Temperatur")
    protected GradCelsius temperatur;

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

    /**
     * Gets the value of the winkel property.
     * 
     * @return
     *     possible object is
     *     {@link Radiant }
     *     
     */
    public Radiant getWinkel() {
        return winkel;
    }

    /**
     * Sets the value of the winkel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Radiant }
     *     
     */
    public void setWinkel(Radiant value) {
        this.winkel = value;
    }

    /**
     * Gets the value of the anzahl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahl() {
        return anzahl;
    }

    /**
     * Sets the value of the anzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahl(BigInteger value) {
        this.anzahl = value;
    }

    /**
     * Gets the value of the anteil property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnteil() {
        return anteil;
    }

    /**
     * Sets the value of the anteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnteil(Double value) {
        this.anteil = value;
    }

    /**
     * Gets the value of the temperatur property.
     * 
     * @return
     *     possible object is
     *     {@link GradCelsius }
     *     
     */
    public GradCelsius getTemperatur() {
        return temperatur;
    }

    /**
     * Sets the value of the temperatur property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradCelsius }
     *     
     */
    public void setTemperatur(GradCelsius value) {
        this.temperatur = value;
    }

}