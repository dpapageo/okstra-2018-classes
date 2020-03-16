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
 * <p>Java class for TunnellueftungsinfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TunnellueftungsinfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Lueftungssystem" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Lueftungsart_Normalbetrieb" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Lueftungsart_Brandfall" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Zwischendecke" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Zuluftkanaele" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Abluftkanaele" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Lueftungstrennwand_Rauchtrennwand" type="{http://www.okstra.de/okstra/2.018.2}Anzahl_unscharfPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Lueftungsart_Rettungsstollen" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Bemerkungen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TunnellueftungsinfoType", propOrder = {
    "lueftungssystem",
    "lueftungsartNormalbetrieb",
    "lueftungsartBrandfall",
    "zwischendecke",
    "zuluftkanaele",
    "abluftkanaele",
    "lueftungstrennwandRauchtrennwand",
    "lueftungsartRettungsstollen",
    "bemerkungen"
})
public class TunnellueftungsinfoType {

    @XmlElement(name = "Lueftungssystem")
    protected List<KeyValuePropertyType> lueftungssystem;
    @XmlElement(name = "Lueftungsart_Normalbetrieb")
    protected KeyValuePropertyType lueftungsartNormalbetrieb;
    @XmlElement(name = "Lueftungsart_Brandfall")
    protected KeyValuePropertyType lueftungsartBrandfall;
    @XmlElement(name = "Zwischendecke")
    protected Boolean zwischendecke;
    @XmlElement(name = "Zuluftkanaele")
    protected Boolean zuluftkanaele;
    @XmlElement(name = "Abluftkanaele")
    protected Boolean abluftkanaele;
    @XmlElement(name = "Lueftungstrennwand_Rauchtrennwand")
    protected AnzahlUnscharfPropertyType lueftungstrennwandRauchtrennwand;
    @XmlElement(name = "Lueftungsart_Rettungsstollen")
    protected KeyValuePropertyType lueftungsartRettungsstollen;
    @XmlElement(name = "Bemerkungen")
    protected String bemerkungen;

    /**
     * Gets the value of the lueftungssystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lueftungssystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLueftungssystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getLueftungssystem() {
        if (lueftungssystem == null) {
            lueftungssystem = new ArrayList<KeyValuePropertyType>();
        }
        return this.lueftungssystem;
    }

    /**
     * Gets the value of the lueftungsartNormalbetrieb property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getLueftungsartNormalbetrieb() {
        return lueftungsartNormalbetrieb;
    }

    /**
     * Sets the value of the lueftungsartNormalbetrieb property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setLueftungsartNormalbetrieb(KeyValuePropertyType value) {
        this.lueftungsartNormalbetrieb = value;
    }

    /**
     * Gets the value of the lueftungsartBrandfall property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getLueftungsartBrandfall() {
        return lueftungsartBrandfall;
    }

    /**
     * Sets the value of the lueftungsartBrandfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setLueftungsartBrandfall(KeyValuePropertyType value) {
        this.lueftungsartBrandfall = value;
    }

    /**
     * Gets the value of the zwischendecke property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZwischendecke() {
        return zwischendecke;
    }

    /**
     * Sets the value of the zwischendecke property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZwischendecke(Boolean value) {
        this.zwischendecke = value;
    }

    /**
     * Gets the value of the zuluftkanaele property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZuluftkanaele() {
        return zuluftkanaele;
    }

    /**
     * Sets the value of the zuluftkanaele property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZuluftkanaele(Boolean value) {
        this.zuluftkanaele = value;
    }

    /**
     * Gets the value of the abluftkanaele property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbluftkanaele() {
        return abluftkanaele;
    }

    /**
     * Sets the value of the abluftkanaele property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbluftkanaele(Boolean value) {
        this.abluftkanaele = value;
    }

    /**
     * Gets the value of the lueftungstrennwandRauchtrennwand property.
     * 
     * @return
     *     possible object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public AnzahlUnscharfPropertyType getLueftungstrennwandRauchtrennwand() {
        return lueftungstrennwandRauchtrennwand;
    }

    /**
     * Sets the value of the lueftungstrennwandRauchtrennwand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public void setLueftungstrennwandRauchtrennwand(AnzahlUnscharfPropertyType value) {
        this.lueftungstrennwandRauchtrennwand = value;
    }

    /**
     * Gets the value of the lueftungsartRettungsstollen property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getLueftungsartRettungsstollen() {
        return lueftungsartRettungsstollen;
    }

    /**
     * Sets the value of the lueftungsartRettungsstollen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setLueftungsartRettungsstollen(KeyValuePropertyType value) {
        this.lueftungsartRettungsstollen = value;
    }

    /**
     * Gets the value of the bemerkungen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBemerkungen() {
        return bemerkungen;
    }

    /**
     * Sets the value of the bemerkungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBemerkungen(String value) {
        this.bemerkungen = value;
    }

}
