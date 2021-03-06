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
 * <p>Java class for DauerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DauerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Jahre" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Jahre" minOccurs="0"/&gt;
 *         &lt;element name="Monate" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Monate" minOccurs="0"/&gt;
 *         &lt;element name="Wochen" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Wochen" minOccurs="0"/&gt;
 *         &lt;element name="Tage" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Tage" minOccurs="0"/&gt;
 *         &lt;element name="Stunden" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Stunden" minOccurs="0"/&gt;
 *         &lt;element name="Minuten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Minuten" minOccurs="0"/&gt;
 *         &lt;element name="Sekunden" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Sekunden" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DauerType", propOrder = {
    "jahre",
    "monate",
    "wochen",
    "tage",
    "stunden",
    "minuten",
    "sekunden"
})
public class DauerType {

    @XmlElement(name = "Jahre")
    protected Jahre jahre;
    @XmlElement(name = "Monate")
    protected Monate monate;
    @XmlElement(name = "Wochen")
    protected Wochen wochen;
    @XmlElement(name = "Tage")
    protected Tage tage;
    @XmlElement(name = "Stunden")
    protected Stunden stunden;
    @XmlElement(name = "Minuten")
    protected Minuten minuten;
    @XmlElement(name = "Sekunden")
    protected Sekunden sekunden;

    /**
     * Gets the value of the jahre property.
     * 
     * @return
     *     possible object is
     *     {@link Jahre }
     *     
     */
    public Jahre getJahre() {
        return jahre;
    }

    /**
     * Sets the value of the jahre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jahre }
     *     
     */
    public void setJahre(Jahre value) {
        this.jahre = value;
    }

    /**
     * Gets the value of the monate property.
     * 
     * @return
     *     possible object is
     *     {@link Monate }
     *     
     */
    public Monate getMonate() {
        return monate;
    }

    /**
     * Sets the value of the monate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Monate }
     *     
     */
    public void setMonate(Monate value) {
        this.monate = value;
    }

    /**
     * Gets the value of the wochen property.
     * 
     * @return
     *     possible object is
     *     {@link Wochen }
     *     
     */
    public Wochen getWochen() {
        return wochen;
    }

    /**
     * Sets the value of the wochen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wochen }
     *     
     */
    public void setWochen(Wochen value) {
        this.wochen = value;
    }

    /**
     * Gets the value of the tage property.
     * 
     * @return
     *     possible object is
     *     {@link Tage }
     *     
     */
    public Tage getTage() {
        return tage;
    }

    /**
     * Sets the value of the tage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tage }
     *     
     */
    public void setTage(Tage value) {
        this.tage = value;
    }

    /**
     * Gets the value of the stunden property.
     * 
     * @return
     *     possible object is
     *     {@link Stunden }
     *     
     */
    public Stunden getStunden() {
        return stunden;
    }

    /**
     * Sets the value of the stunden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stunden }
     *     
     */
    public void setStunden(Stunden value) {
        this.stunden = value;
    }

    /**
     * Gets the value of the minuten property.
     * 
     * @return
     *     possible object is
     *     {@link Minuten }
     *     
     */
    public Minuten getMinuten() {
        return minuten;
    }

    /**
     * Sets the value of the minuten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Minuten }
     *     
     */
    public void setMinuten(Minuten value) {
        this.minuten = value;
    }

    /**
     * Gets the value of the sekunden property.
     * 
     * @return
     *     possible object is
     *     {@link Sekunden }
     *     
     */
    public Sekunden getSekunden() {
        return sekunden;
    }

    /**
     * Sets the value of the sekunden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sekunden }
     *     
     */
    public void setSekunden(Sekunden value) {
        this.sekunden = value;
    }

}
