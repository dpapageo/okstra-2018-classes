//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.09 at 04:49:50 PM EET 
//


package com.eurodyn.okstra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dynamische_StempeleindringtiefeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dynamische_StempeleindringtiefeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dynamische_Stempeleindringtiefe_absolut" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Millimeter"/&gt;
 *         &lt;element name="Dynamische_Eindringtiefe" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Promille"/&gt;
 *         &lt;element name="Stuetzring" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Probekoerper" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Abbruchkriterium" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Besonderheiten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Verformungsverlauf" type="{http://www.okstra.de/okstra/2.018.2}VerformungsverlaufPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dynamische_StempeleindringtiefeType", propOrder = {
    "dynamischeStempeleindringtiefeAbsolut",
    "dynamischeEindringtiefe",
    "stuetzring",
    "probekoerper",
    "abbruchkriterium",
    "besonderheiten",
    "verformungsverlauf"
})
public class DynamischeStempeleindringtiefeType {

    @XmlElement(name = "Dynamische_Stempeleindringtiefe_absolut", required = true)
    protected Millimeter dynamischeStempeleindringtiefeAbsolut;
    @XmlElement(name = "Dynamische_Eindringtiefe")
    protected double dynamischeEindringtiefe;
    @XmlElement(name = "Stuetzring")
    protected boolean stuetzring;
    @XmlElement(name = "Probekoerper", required = true)
    protected KeyValuePropertyType probekoerper;
    @XmlElement(name = "Abbruchkriterium", required = true)
    protected KeyValuePropertyType abbruchkriterium;
    @XmlElement(name = "Besonderheiten")
    protected String besonderheiten;
    @XmlElement(name = "Verformungsverlauf")
    protected List<VerformungsverlaufPropertyType> verformungsverlauf;

    /**
     * Gets the value of the dynamischeStempeleindringtiefeAbsolut property.
     * 
     * @return
     *     possible object is
     *     {@link Millimeter }
     *     
     */
    public Millimeter getDynamischeStempeleindringtiefeAbsolut() {
        return dynamischeStempeleindringtiefeAbsolut;
    }

    /**
     * Sets the value of the dynamischeStempeleindringtiefeAbsolut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Millimeter }
     *     
     */
    public void setDynamischeStempeleindringtiefeAbsolut(Millimeter value) {
        this.dynamischeStempeleindringtiefeAbsolut = value;
    }

    /**
     * Gets the value of the dynamischeEindringtiefe property.
     * 
     */
    public double getDynamischeEindringtiefe() {
        return dynamischeEindringtiefe;
    }

    /**
     * Sets the value of the dynamischeEindringtiefe property.
     * 
     */
    public void setDynamischeEindringtiefe(double value) {
        this.dynamischeEindringtiefe = value;
    }

    /**
     * Gets the value of the stuetzring property.
     * 
     */
    public boolean isStuetzring() {
        return stuetzring;
    }

    /**
     * Sets the value of the stuetzring property.
     * 
     */
    public void setStuetzring(boolean value) {
        this.stuetzring = value;
    }

    /**
     * Gets the value of the probekoerper property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getProbekoerper() {
        return probekoerper;
    }

    /**
     * Sets the value of the probekoerper property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setProbekoerper(KeyValuePropertyType value) {
        this.probekoerper = value;
    }

    /**
     * Gets the value of the abbruchkriterium property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getAbbruchkriterium() {
        return abbruchkriterium;
    }

    /**
     * Sets the value of the abbruchkriterium property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setAbbruchkriterium(KeyValuePropertyType value) {
        this.abbruchkriterium = value;
    }

    /**
     * Gets the value of the besonderheiten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBesonderheiten() {
        return besonderheiten;
    }

    /**
     * Sets the value of the besonderheiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBesonderheiten(String value) {
        this.besonderheiten = value;
    }

    /**
     * Gets the value of the verformungsverlauf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verformungsverlauf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerformungsverlauf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerformungsverlaufPropertyType }
     * 
     * 
     */
    public List<VerformungsverlaufPropertyType> getVerformungsverlauf() {
        if (verformungsverlauf == null) {
            verformungsverlauf = new ArrayList<VerformungsverlaufPropertyType>();
        }
        return this.verformungsverlauf;
    }

}
