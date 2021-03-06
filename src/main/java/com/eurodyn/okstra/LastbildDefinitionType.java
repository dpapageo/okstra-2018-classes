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
 * <p>Java class for Lastbild_DefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lastbild_DefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name_Lastbild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ueberschreitungsgrenze_Lastvergleich" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Lastdefinition" type="{http://www.okstra.de/okstra/2.018.2}LastdefinitionPropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RGST_Bezug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="durchgehende_Flaechenlast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lastbild_DefinitionType", propOrder = {
    "nameLastbild",
    "ueberschreitungsgrenzeLastvergleich",
    "lastdefinition",
    "rgstBezug",
    "durchgehendeFlaechenlast"
})
public class LastbildDefinitionType {

    @XmlElement(name = "Name_Lastbild")
    protected String nameLastbild;
    @XmlElement(name = "Ueberschreitungsgrenze_Lastvergleich")
    protected Double ueberschreitungsgrenzeLastvergleich;
    @XmlElement(name = "Lastdefinition", required = true)
    protected List<LastdefinitionPropertyType> lastdefinition;
    @XmlElement(name = "RGST_Bezug")
    protected String rgstBezug;
    @XmlElement(name = "durchgehende_Flaechenlast")
    protected Boolean durchgehendeFlaechenlast;

    /**
     * Gets the value of the nameLastbild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLastbild() {
        return nameLastbild;
    }

    /**
     * Sets the value of the nameLastbild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLastbild(String value) {
        this.nameLastbild = value;
    }

    /**
     * Gets the value of the ueberschreitungsgrenzeLastvergleich property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUeberschreitungsgrenzeLastvergleich() {
        return ueberschreitungsgrenzeLastvergleich;
    }

    /**
     * Sets the value of the ueberschreitungsgrenzeLastvergleich property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUeberschreitungsgrenzeLastvergleich(Double value) {
        this.ueberschreitungsgrenzeLastvergleich = value;
    }

    /**
     * Gets the value of the lastdefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastdefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastdefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LastdefinitionPropertyType }
     * 
     * 
     */
    public List<LastdefinitionPropertyType> getLastdefinition() {
        if (lastdefinition == null) {
            lastdefinition = new ArrayList<LastdefinitionPropertyType>();
        }
        return this.lastdefinition;
    }

    /**
     * Gets the value of the rgstBezug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRGSTBezug() {
        return rgstBezug;
    }

    /**
     * Sets the value of the rgstBezug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRGSTBezug(String value) {
        this.rgstBezug = value;
    }

    /**
     * Gets the value of the durchgehendeFlaechenlast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDurchgehendeFlaechenlast() {
        return durchgehendeFlaechenlast;
    }

    /**
     * Sets the value of the durchgehendeFlaechenlast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDurchgehendeFlaechenlast(Boolean value) {
        this.durchgehendeFlaechenlast = value;
    }

}
