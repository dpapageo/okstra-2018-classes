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
 * <p>Java class for BaukilometerbereichType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaukilometerbereichType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Baukilometer_Anfang" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Kilometer"/&gt;
 *         &lt;element name="Baukilometer_Ende" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Kilometer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaukilometerbereichType", propOrder = {
    "baukilometerAnfang",
    "baukilometerEnde"
})
public class BaukilometerbereichType {

    @XmlElement(name = "Baukilometer_Anfang", required = true)
    protected Kilometer baukilometerAnfang;
    @XmlElement(name = "Baukilometer_Ende", required = true)
    protected Kilometer baukilometerEnde;

    /**
     * Gets the value of the baukilometerAnfang property.
     * 
     * @return
     *     possible object is
     *     {@link Kilometer }
     *     
     */
    public Kilometer getBaukilometerAnfang() {
        return baukilometerAnfang;
    }

    /**
     * Sets the value of the baukilometerAnfang property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kilometer }
     *     
     */
    public void setBaukilometerAnfang(Kilometer value) {
        this.baukilometerAnfang = value;
    }

    /**
     * Gets the value of the baukilometerEnde property.
     * 
     * @return
     *     possible object is
     *     {@link Kilometer }
     *     
     */
    public Kilometer getBaukilometerEnde() {
        return baukilometerEnde;
    }

    /**
     * Sets the value of the baukilometerEnde property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kilometer }
     *     
     */
    public void setBaukilometerEnde(Kilometer value) {
        this.baukilometerEnde = value;
    }

}
