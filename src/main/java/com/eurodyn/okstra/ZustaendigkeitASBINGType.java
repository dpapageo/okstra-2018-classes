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
 * <p>Java class for Zustaendigkeit_ASB-INGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Zustaendigkeit_ASB-INGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zustaendige_Stelle" type="{http://www.okstra.de/okstra/2.018.2}Zustaendige_StellePropertyType"/&gt;
 *         &lt;element name="Aufgabe" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Sonstige_Aufgabe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zustaendigkeit_ASB-INGType", propOrder = {
    "zustaendigeStelle",
    "aufgabe",
    "sonstigeAufgabe"
})
public class ZustaendigkeitASBINGType {

    @XmlElement(name = "Zustaendige_Stelle", required = true)
    protected ZustaendigeStellePropertyType zustaendigeStelle;
    @XmlElement(name = "Aufgabe", required = true)
    protected KeyValuePropertyType aufgabe;
    @XmlElement(name = "Sonstige_Aufgabe")
    protected String sonstigeAufgabe;

    /**
     * Gets the value of the zustaendigeStelle property.
     * 
     * @return
     *     possible object is
     *     {@link ZustaendigeStellePropertyType }
     *     
     */
    public ZustaendigeStellePropertyType getZustaendigeStelle() {
        return zustaendigeStelle;
    }

    /**
     * Sets the value of the zustaendigeStelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZustaendigeStellePropertyType }
     *     
     */
    public void setZustaendigeStelle(ZustaendigeStellePropertyType value) {
        this.zustaendigeStelle = value;
    }

    /**
     * Gets the value of the aufgabe property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getAufgabe() {
        return aufgabe;
    }

    /**
     * Sets the value of the aufgabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setAufgabe(KeyValuePropertyType value) {
        this.aufgabe = value;
    }

    /**
     * Gets the value of the sonstigeAufgabe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonstigeAufgabe() {
        return sonstigeAufgabe;
    }

    /**
     * Sets the value of the sonstigeAufgabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonstigeAufgabe(String value) {
        this.sonstigeAufgabe = value;
    }

}