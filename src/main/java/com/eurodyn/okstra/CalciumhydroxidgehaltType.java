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
 * <p>Java class for CalciumhydroxidgehaltType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalciumhydroxidgehaltType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Calciumhydroxidgehalt_Kategorie" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Calciumhydroxidgehalt" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil" minOccurs="0"/&gt;
 *         &lt;element name="Calciumhydroxidgehalt_Extraktion" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalciumhydroxidgehaltType", propOrder = {
    "calciumhydroxidgehaltKategorie",
    "calciumhydroxidgehalt",
    "calciumhydroxidgehaltExtraktion"
})
public class CalciumhydroxidgehaltType {

    @XmlElement(name = "Calciumhydroxidgehalt_Kategorie")
    protected KeyValuePropertyType calciumhydroxidgehaltKategorie;
    @XmlElement(name = "Calciumhydroxidgehalt")
    protected Double calciumhydroxidgehalt;
    @XmlElement(name = "Calciumhydroxidgehalt_Extraktion")
    protected Double calciumhydroxidgehaltExtraktion;

    /**
     * Gets the value of the calciumhydroxidgehaltKategorie property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getCalciumhydroxidgehaltKategorie() {
        return calciumhydroxidgehaltKategorie;
    }

    /**
     * Sets the value of the calciumhydroxidgehaltKategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setCalciumhydroxidgehaltKategorie(KeyValuePropertyType value) {
        this.calciumhydroxidgehaltKategorie = value;
    }

    /**
     * Gets the value of the calciumhydroxidgehalt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCalciumhydroxidgehalt() {
        return calciumhydroxidgehalt;
    }

    /**
     * Sets the value of the calciumhydroxidgehalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCalciumhydroxidgehalt(Double value) {
        this.calciumhydroxidgehalt = value;
    }

    /**
     * Gets the value of the calciumhydroxidgehaltExtraktion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCalciumhydroxidgehaltExtraktion() {
        return calciumhydroxidgehaltExtraktion;
    }

    /**
     * Sets the value of the calciumhydroxidgehaltExtraktion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCalciumhydroxidgehaltExtraktion(Double value) {
        this.calciumhydroxidgehaltExtraktion = value;
    }

}