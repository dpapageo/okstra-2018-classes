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
 * <p>Java class for TMC_Location_CodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMC_Location_CodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Laendercode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Tabellennummer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Location_Code" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMC_Location_CodeType", propOrder = {
    "laendercode",
    "version",
    "tabellennummer",
    "locationCode"
})
public class TMCLocationCodeType {

    @XmlElement(name = "Laendercode", required = true)
    protected String laendercode;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "Tabellennummer", required = true)
    protected BigInteger tabellennummer;
    @XmlElement(name = "Location_Code", required = true)
    protected BigInteger locationCode;

    /**
     * Gets the value of the laendercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaendercode() {
        return laendercode;
    }

    /**
     * Sets the value of the laendercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaendercode(String value) {
        this.laendercode = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the tabellennummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTabellennummer() {
        return tabellennummer;
    }

    /**
     * Sets the value of the tabellennummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTabellennummer(BigInteger value) {
        this.tabellennummer = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocationCode(BigInteger value) {
        this.locationCode = value;
    }

}