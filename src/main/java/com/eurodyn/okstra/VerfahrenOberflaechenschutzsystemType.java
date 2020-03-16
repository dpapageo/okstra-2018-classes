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
 * <p>Java class for Verfahren_OberflaechenschutzsystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Verfahren_OberflaechenschutzsystemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hersteller" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Systembezeichnung" type="{http://www.okstra.de/okstra/2.018.2}SystembezeichnungPropertyType"/&gt;
 *         &lt;element name="Art_Oberflaechenschutzsystem" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Schicht" type="{http://www.okstra.de/okstra/2.018.2}Schicht_ASB-INGPropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Zulassung" type="{http://www.okstra.de/okstra/2.018.2}ZulassungPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verfahren_OberflaechenschutzsystemType", propOrder = {
    "hersteller",
    "systembezeichnung",
    "artOberflaechenschutzsystem",
    "schicht",
    "zulassung"
})
public class VerfahrenOberflaechenschutzsystemType {

    @XmlElement(name = "Hersteller", required = true)
    protected String hersteller;
    @XmlElement(name = "Systembezeichnung", required = true)
    protected SystembezeichnungPropertyType systembezeichnung;
    @XmlElement(name = "Art_Oberflaechenschutzsystem", required = true)
    protected KeyValuePropertyType artOberflaechenschutzsystem;
    @XmlElement(name = "Schicht", required = true)
    protected List<SchichtASBINGPropertyType> schicht;
    @XmlElement(name = "Zulassung")
    protected List<ZulassungPropertyType> zulassung;

    /**
     * Gets the value of the hersteller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHersteller() {
        return hersteller;
    }

    /**
     * Sets the value of the hersteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHersteller(String value) {
        this.hersteller = value;
    }

    /**
     * Gets the value of the systembezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link SystembezeichnungPropertyType }
     *     
     */
    public SystembezeichnungPropertyType getSystembezeichnung() {
        return systembezeichnung;
    }

    /**
     * Sets the value of the systembezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystembezeichnungPropertyType }
     *     
     */
    public void setSystembezeichnung(SystembezeichnungPropertyType value) {
        this.systembezeichnung = value;
    }

    /**
     * Gets the value of the artOberflaechenschutzsystem property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getArtOberflaechenschutzsystem() {
        return artOberflaechenschutzsystem;
    }

    /**
     * Sets the value of the artOberflaechenschutzsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setArtOberflaechenschutzsystem(KeyValuePropertyType value) {
        this.artOberflaechenschutzsystem = value;
    }

    /**
     * Gets the value of the schicht property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schicht property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchicht().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchichtASBINGPropertyType }
     * 
     * 
     */
    public List<SchichtASBINGPropertyType> getSchicht() {
        if (schicht == null) {
            schicht = new ArrayList<SchichtASBINGPropertyType>();
        }
        return this.schicht;
    }

    /**
     * Gets the value of the zulassung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zulassung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZulassung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZulassungPropertyType }
     * 
     * 
     */
    public List<ZulassungPropertyType> getZulassung() {
        if (zulassung == null) {
            zulassung = new ArrayList<ZulassungPropertyType>();
        }
        return this.zulassung;
    }

}