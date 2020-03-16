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
 * <p>Java class for VersionsinfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersionsinfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Erfassungsstempel" type="{http://www.okstra.de/okstra/2.018.2}ErfassungsstempelPropertyType"/&gt;
 *         &lt;element name="Pruefstempel" type="{http://www.okstra.de/okstra/2.018.2}PruefstempelPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Loeschkennzeichen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Kommentar" type="{http://www.okstra.de/okstra/2.018.2}Kommentar_MengenberechnungPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionsinfoType", propOrder = {
    "erfassungsstempel",
    "pruefstempel",
    "loeschkennzeichen",
    "kommentar"
})
public class VersionsinfoType {

    @XmlElement(name = "Erfassungsstempel", required = true)
    protected ErfassungsstempelPropertyType erfassungsstempel;
    @XmlElement(name = "Pruefstempel")
    protected PruefstempelPropertyType pruefstempel;
    @XmlElement(name = "Loeschkennzeichen")
    protected Boolean loeschkennzeichen;
    @XmlElement(name = "Kommentar")
    protected List<KommentarMengenberechnungPropertyType> kommentar;

    /**
     * Gets the value of the erfassungsstempel property.
     * 
     * @return
     *     possible object is
     *     {@link ErfassungsstempelPropertyType }
     *     
     */
    public ErfassungsstempelPropertyType getErfassungsstempel() {
        return erfassungsstempel;
    }

    /**
     * Sets the value of the erfassungsstempel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErfassungsstempelPropertyType }
     *     
     */
    public void setErfassungsstempel(ErfassungsstempelPropertyType value) {
        this.erfassungsstempel = value;
    }

    /**
     * Gets the value of the pruefstempel property.
     * 
     * @return
     *     possible object is
     *     {@link PruefstempelPropertyType }
     *     
     */
    public PruefstempelPropertyType getPruefstempel() {
        return pruefstempel;
    }

    /**
     * Sets the value of the pruefstempel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PruefstempelPropertyType }
     *     
     */
    public void setPruefstempel(PruefstempelPropertyType value) {
        this.pruefstempel = value;
    }

    /**
     * Gets the value of the loeschkennzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoeschkennzeichen() {
        return loeschkennzeichen;
    }

    /**
     * Sets the value of the loeschkennzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoeschkennzeichen(Boolean value) {
        this.loeschkennzeichen = value;
    }

    /**
     * Gets the value of the kommentar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kommentar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKommentar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KommentarMengenberechnungPropertyType }
     * 
     * 
     */
    public List<KommentarMengenberechnungPropertyType> getKommentar() {
        if (kommentar == null) {
            kommentar = new ArrayList<KommentarMengenberechnungPropertyType>();
        }
        return this.kommentar;
    }

}
