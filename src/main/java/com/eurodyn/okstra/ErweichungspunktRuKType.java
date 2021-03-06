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
 * <p>Java class for Erweichungspunkt_RuKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Erweichungspunkt_RuKType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pruefwert" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Grad_Celsius"/&gt;
 *         &lt;element name="Soll_Oben" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Grad_Celsius" minOccurs="0"/&gt;
 *         &lt;element name="Soll_Unten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Grad_Celsius" minOccurs="0"/&gt;
 *         &lt;element name="Toleranz_Oben" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Grad_Celsius" minOccurs="0"/&gt;
 *         &lt;element name="Toleranz_Unten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Grad_Celsius" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Erweichungspunkt_RuKType", propOrder = {
    "pruefwert",
    "sollOben",
    "sollUnten",
    "toleranzOben",
    "toleranzUnten"
})
public class ErweichungspunktRuKType {

    @XmlElement(name = "Pruefwert", required = true)
    protected GradCelsius pruefwert;
    @XmlElement(name = "Soll_Oben")
    protected GradCelsius sollOben;
    @XmlElement(name = "Soll_Unten")
    protected GradCelsius sollUnten;
    @XmlElement(name = "Toleranz_Oben")
    protected GradCelsius toleranzOben;
    @XmlElement(name = "Toleranz_Unten")
    protected GradCelsius toleranzUnten;

    /**
     * Gets the value of the pruefwert property.
     * 
     * @return
     *     possible object is
     *     {@link GradCelsius }
     *     
     */
    public GradCelsius getPruefwert() {
        return pruefwert;
    }

    /**
     * Sets the value of the pruefwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradCelsius }
     *     
     */
    public void setPruefwert(GradCelsius value) {
        this.pruefwert = value;
    }

    /**
     * Gets the value of the sollOben property.
     * 
     * @return
     *     possible object is
     *     {@link GradCelsius }
     *     
     */
    public GradCelsius getSollOben() {
        return sollOben;
    }

    /**
     * Sets the value of the sollOben property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradCelsius }
     *     
     */
    public void setSollOben(GradCelsius value) {
        this.sollOben = value;
    }

    /**
     * Gets the value of the sollUnten property.
     * 
     * @return
     *     possible object is
     *     {@link GradCelsius }
     *     
     */
    public GradCelsius getSollUnten() {
        return sollUnten;
    }

    /**
     * Sets the value of the sollUnten property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradCelsius }
     *     
     */
    public void setSollUnten(GradCelsius value) {
        this.sollUnten = value;
    }

    /**
     * Gets the value of the toleranzOben property.
     * 
     * @return
     *     possible object is
     *     {@link GradCelsius }
     *     
     */
    public GradCelsius getToleranzOben() {
        return toleranzOben;
    }

    /**
     * Sets the value of the toleranzOben property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradCelsius }
     *     
     */
    public void setToleranzOben(GradCelsius value) {
        this.toleranzOben = value;
    }

    /**
     * Gets the value of the toleranzUnten property.
     * 
     * @return
     *     possible object is
     *     {@link GradCelsius }
     *     
     */
    public GradCelsius getToleranzUnten() {
        return toleranzUnten;
    }

    /**
     * Sets the value of the toleranzUnten property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradCelsius }
     *     
     */
    public void setToleranzUnten(GradCelsius value) {
        this.toleranzUnten = value;
    }

}
