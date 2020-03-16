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
 * <p>Java class for VerdichtungsgradType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerdichtungsgradType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pruefwert" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Prozent"/&gt;
 *         &lt;element name="Soll_Oben" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Soll_Unten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Prozent"/&gt;
 *         &lt;element name="Unzulaessige_Abweichung" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Prozent"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerdichtungsgradType", propOrder = {
    "pruefwert",
    "sollOben",
    "sollUnten",
    "unzulaessigeAbweichung"
})
public class VerdichtungsgradType {

    @XmlElement(name = "Pruefwert")
    protected double pruefwert;
    @XmlElement(name = "Soll_Oben")
    protected Double sollOben;
    @XmlElement(name = "Soll_Unten")
    protected double sollUnten;
    @XmlElement(name = "Unzulaessige_Abweichung")
    protected double unzulaessigeAbweichung;

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
     */
    public double getSollUnten() {
        return sollUnten;
    }

    /**
     * Sets the value of the sollUnten property.
     * 
     */
    public void setSollUnten(double value) {
        this.sollUnten = value;
    }

    /**
     * Gets the value of the unzulaessigeAbweichung property.
     * 
     */
    public double getUnzulaessigeAbweichung() {
        return unzulaessigeAbweichung;
    }

    /**
     * Sets the value of the unzulaessigeAbweichung property.
     * 
     */
    public void setUnzulaessigeAbweichung(double value) {
        this.unzulaessigeAbweichung = value;
    }

}
