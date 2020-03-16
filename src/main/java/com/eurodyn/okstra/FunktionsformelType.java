//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.09 at 04:49:50 PM EET 
//


package com.eurodyn.okstra;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunktionsformelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunktionsformelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Formelkatalog" type="{http://www.okstra.de/okstra/2.018.2}FormelkatalogPropertyType"/&gt;
 *         &lt;element name="Formelnummer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Argument" type="{http://www.okstra.de/okstra/2.018.2}ArgumentPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunktionsformelType", propOrder = {
    "formelkatalog",
    "formelnummer",
    "argument"
})
public class FunktionsformelType {

    @XmlElement(name = "Formelkatalog", required = true)
    protected FormelkatalogPropertyType formelkatalog;
    @XmlElement(name = "Formelnummer", required = true)
    protected BigInteger formelnummer;
    @XmlElement(name = "Argument", required = true)
    protected List<ArgumentPropertyType> argument;

    /**
     * Gets the value of the formelkatalog property.
     * 
     * @return
     *     possible object is
     *     {@link FormelkatalogPropertyType }
     *     
     */
    public FormelkatalogPropertyType getFormelkatalog() {
        return formelkatalog;
    }

    /**
     * Sets the value of the formelkatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormelkatalogPropertyType }
     *     
     */
    public void setFormelkatalog(FormelkatalogPropertyType value) {
        this.formelkatalog = value;
    }

    /**
     * Gets the value of the formelnummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFormelnummer() {
        return formelnummer;
    }

    /**
     * Sets the value of the formelnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFormelnummer(BigInteger value) {
        this.formelnummer = value;
    }

    /**
     * Gets the value of the argument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the argument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArgumentPropertyType }
     * 
     * 
     */
    public List<ArgumentPropertyType> getArgument() {
        if (argument == null) {
            argument = new ArrayList<ArgumentPropertyType>();
        }
        return this.argument;
    }

}