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
 * <p>Java class for KorngroesseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KorngroesseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Korngroessenanteil" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Pruefwert" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil"/&gt;
 *         &lt;element name="Soll_Oben" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil" minOccurs="0"/&gt;
 *         &lt;element name="Soll_Unten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil" minOccurs="0"/&gt;
 *         &lt;element name="Toleranz_Oben" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil" minOccurs="0"/&gt;
 *         &lt;element name="Toleranz_Unten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil" minOccurs="0"/&gt;
 *         &lt;element name="Unzulaessige_Abweichung" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KorngroesseType", propOrder = {
    "korngroessenanteil",
    "pruefwert",
    "sollOben",
    "sollUnten",
    "toleranzOben",
    "toleranzUnten",
    "unzulaessigeAbweichung"
})
public class KorngroesseType {

    @XmlElement(name = "Korngroessenanteil", required = true)
    protected KeyValuePropertyType korngroessenanteil;
    @XmlElement(name = "Pruefwert")
    protected double pruefwert;
    @XmlElement(name = "Soll_Oben")
    protected Double sollOben;
    @XmlElement(name = "Soll_Unten")
    protected Double sollUnten;
    @XmlElement(name = "Toleranz_Oben")
    protected Double toleranzOben;
    @XmlElement(name = "Toleranz_Unten")
    protected Double toleranzUnten;
    @XmlElement(name = "Unzulaessige_Abweichung")
    protected Double unzulaessigeAbweichung;

    /**
     * Gets the value of the korngroessenanteil property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getKorngroessenanteil() {
        return korngroessenanteil;
    }

    /**
     * Sets the value of the korngroessenanteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setKorngroessenanteil(KeyValuePropertyType value) {
        this.korngroessenanteil = value;
    }

    /**
     * Gets the value of the pruefwert property.
     * 
     */
    public double getPruefwert() {
        return pruefwert;
    }

    /**
     * Sets the value of the pruefwert property.
     * 
     */
    public void setPruefwert(double value) {
        this.pruefwert = value;
    }

    /**
     * Gets the value of the sollOben property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSollOben() {
        return sollOben;
    }

    /**
     * Sets the value of the sollOben property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSollOben(Double value) {
        this.sollOben = value;
    }

    /**
     * Gets the value of the sollUnten property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSollUnten() {
        return sollUnten;
    }

    /**
     * Sets the value of the sollUnten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSollUnten(Double value) {
        this.sollUnten = value;
    }

    /**
     * Gets the value of the toleranzOben property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getToleranzOben() {
        return toleranzOben;
    }

    /**
     * Sets the value of the toleranzOben property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setToleranzOben(Double value) {
        this.toleranzOben = value;
    }

    /**
     * Gets the value of the toleranzUnten property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getToleranzUnten() {
        return toleranzUnten;
    }

    /**
     * Sets the value of the toleranzUnten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setToleranzUnten(Double value) {
        this.toleranzUnten = value;
    }

    /**
     * Gets the value of the unzulaessigeAbweichung property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnzulaessigeAbweichung() {
        return unzulaessigeAbweichung;
    }

    /**
     * Sets the value of the unzulaessigeAbweichung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnzulaessigeAbweichung(Double value) {
        this.unzulaessigeAbweichung = value;
    }

}
