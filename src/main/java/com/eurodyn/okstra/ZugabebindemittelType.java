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
 * <p>Java class for ZugabebindemittelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZugabebindemittelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Art" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sorte" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Anteil" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil" minOccurs="0"/&gt;
 *         &lt;element name="Erweichungspunkt_RuK" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Grad_Celsius" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZugabebindemittelType", propOrder = {
    "art",
    "sorte",
    "anteil",
    "erweichungspunktRuK"
})
public class ZugabebindemittelType {

    @XmlElement(name = "Art", required = true)
    protected String art;
    @XmlElement(name = "Sorte", required = true)
    protected String sorte;
    @XmlElement(name = "Anteil")
    protected Double anteil;
    @XmlElement(name = "Erweichungspunkt_RuK")
    protected GradCelsius erweichungspunktRuK;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArt(String value) {
        this.art = value;
    }

    /**
     * Gets the value of the sorte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorte() {
        return sorte;
    }

    /**
     * Sets the value of the sorte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorte(String value) {
        this.sorte = value;
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
     * Gets the value of the erweichungspunktRuK property.
     * 
     * @return
     *     possible object is
     *     {@link GradCelsius }
     *     
     */
    public GradCelsius getErweichungspunktRuK() {
        return erweichungspunktRuK;
    }

    /**
     * Sets the value of the erweichungspunktRuK property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradCelsius }
     *     
     */
    public void setErweichungspunktRuK(GradCelsius value) {
        this.erweichungspunktRuK = value;
    }

}
