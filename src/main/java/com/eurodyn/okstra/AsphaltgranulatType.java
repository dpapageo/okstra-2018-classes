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
 * <p>Java class for AsphaltgranulatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsphaltgranulatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bezeichnung_nach_TLAG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Menge" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil"/&gt;
 *         &lt;element name="Zugabemenge_max_zulaessig" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil"/&gt;
 *         &lt;element name="Bindemittelanteil_Asphaltgranulat" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil"/&gt;
 *         &lt;element name="Erweichungspunkt_Rueck_Asphaltgranulat" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Grad_Celsius"/&gt;
 *         &lt;element name="Nadelpenetration_Rueck" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Zehntel_mm" minOccurs="0"/&gt;
 *         &lt;element name="Zugabebindemittel" type="{http://www.okstra.de/okstra/2.018.2}ZugabebindemittelPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Result_Erweichungspunkt_Bindemittelgemisch" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Grad_Celsius"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsphaltgranulatType", propOrder = {
    "bezeichnungNachTLAG",
    "menge",
    "zugabemengeMaxZulaessig",
    "bindemittelanteilAsphaltgranulat",
    "erweichungspunktRueckAsphaltgranulat",
    "nadelpenetrationRueck",
    "zugabebindemittel",
    "resultErweichungspunktBindemittelgemisch"
})
public class AsphaltgranulatType {

    @XmlElement(name = "Bezeichnung_nach_TLAG", required = true)
    protected String bezeichnungNachTLAG;
    @XmlElement(name = "Menge")
    protected double menge;
    @XmlElement(name = "Zugabemenge_max_zulaessig")
    protected double zugabemengeMaxZulaessig;
    @XmlElement(name = "Bindemittelanteil_Asphaltgranulat")
    protected double bindemittelanteilAsphaltgranulat;
    @XmlElement(name = "Erweichungspunkt_Rueck_Asphaltgranulat", required = true)
    protected GradCelsius erweichungspunktRueckAsphaltgranulat;
    @XmlElement(name = "Nadelpenetration_Rueck")
    protected BigInteger nadelpenetrationRueck;
    @XmlElement(name = "Zugabebindemittel")
    protected ZugabebindemittelPropertyType zugabebindemittel;
    @XmlElement(name = "Result_Erweichungspunkt_Bindemittelgemisch", required = true)
    protected GradCelsius resultErweichungspunktBindemittelgemisch;

    /**
     * Gets the value of the bezeichnungNachTLAG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnungNachTLAG() {
        return bezeichnungNachTLAG;
    }

    /**
     * Sets the value of the bezeichnungNachTLAG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnungNachTLAG(String value) {
        this.bezeichnungNachTLAG = value;
    }

    /**
     * Gets the value of the menge property.
     * 
     */
    public double getMenge() {
        return menge;
    }

    /**
     * Sets the value of the menge property.
     * 
     */
    public void setMenge(double value) {
        this.menge = value;
    }

    /**
     * Gets the value of the zugabemengeMaxZulaessig property.
     * 
     */
    public double getZugabemengeMaxZulaessig() {
        return zugabemengeMaxZulaessig;
    }

    /**
     * Sets the value of the zugabemengeMaxZulaessig property.
     * 
     */
    public void setZugabemengeMaxZulaessig(double value) {
        this.zugabemengeMaxZulaessig = value;
    }

    /**
     * Gets the value of the bindemittelanteilAsphaltgranulat property.
     * 
     */
    public double getBindemittelanteilAsphaltgranulat() {
        return bindemittelanteilAsphaltgranulat;
    }

    /**
     * Sets the value of the bindemittelanteilAsphaltgranulat property.
     * 
     */
    public void setBindemittelanteilAsphaltgranulat(double value) {
        this.bindemittelanteilAsphaltgranulat = value;
    }

    /**
     * Gets the value of the erweichungspunktRueckAsphaltgranulat property.
     * 
     * @return
     *     possible object is
     *     {@link GradCelsius }
     *     
     */
    public GradCelsius getErweichungspunktRueckAsphaltgranulat() {
        return erweichungspunktRueckAsphaltgranulat;
    }

    /**
     * Sets the value of the erweichungspunktRueckAsphaltgranulat property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradCelsius }
     *     
     */
    public void setErweichungspunktRueckAsphaltgranulat(GradCelsius value) {
        this.erweichungspunktRueckAsphaltgranulat = value;
    }

    /**
     * Gets the value of the nadelpenetrationRueck property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNadelpenetrationRueck() {
        return nadelpenetrationRueck;
    }

    /**
     * Sets the value of the nadelpenetrationRueck property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNadelpenetrationRueck(BigInteger value) {
        this.nadelpenetrationRueck = value;
    }

    /**
     * Gets the value of the zugabebindemittel property.
     * 
     * @return
     *     possible object is
     *     {@link ZugabebindemittelPropertyType }
     *     
     */
    public ZugabebindemittelPropertyType getZugabebindemittel() {
        return zugabebindemittel;
    }

    /**
     * Sets the value of the zugabebindemittel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZugabebindemittelPropertyType }
     *     
     */
    public void setZugabebindemittel(ZugabebindemittelPropertyType value) {
        this.zugabebindemittel = value;
    }

    /**
     * Gets the value of the resultErweichungspunktBindemittelgemisch property.
     * 
     * @return
     *     possible object is
     *     {@link GradCelsius }
     *     
     */
    public GradCelsius getResultErweichungspunktBindemittelgemisch() {
        return resultErweichungspunktBindemittelgemisch;
    }

    /**
     * Sets the value of the resultErweichungspunktBindemittelgemisch property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradCelsius }
     *     
     */
    public void setResultErweichungspunktBindemittelgemisch(GradCelsius value) {
        this.resultErweichungspunktBindemittelgemisch = value;
    }

}