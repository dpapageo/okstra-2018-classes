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
 * <p>Java class for Art_LagerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Art_LagerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bauart" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Zulassung" type="{http://www.okstra.de/okstra/2.018.2}ZulassungPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Hersteller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Typenbezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Material_Rollen" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Material_Gleitflaeche" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Art_LagerType", propOrder = {
    "bauart",
    "zulassung",
    "hersteller",
    "typenbezeichnung",
    "materialRollen",
    "materialGleitflaeche"
})
public class ArtLagerType {

    @XmlElement(name = "Bauart", required = true)
    protected List<KeyValuePropertyType> bauart;
    @XmlElement(name = "Zulassung")
    protected List<ZulassungPropertyType> zulassung;
    @XmlElement(name = "Hersteller")
    protected String hersteller;
    @XmlElement(name = "Typenbezeichnung", required = true)
    protected String typenbezeichnung;
    @XmlElement(name = "Material_Rollen")
    protected KeyValuePropertyType materialRollen;
    @XmlElement(name = "Material_Gleitflaeche")
    protected KeyValuePropertyType materialGleitflaeche;

    /**
     * Gets the value of the bauart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bauart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBauart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getBauart() {
        if (bauart == null) {
            bauart = new ArrayList<KeyValuePropertyType>();
        }
        return this.bauart;
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
     * Gets the value of the typenbezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypenbezeichnung() {
        return typenbezeichnung;
    }

    /**
     * Sets the value of the typenbezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypenbezeichnung(String value) {
        this.typenbezeichnung = value;
    }

    /**
     * Gets the value of the materialRollen property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getMaterialRollen() {
        return materialRollen;
    }

    /**
     * Sets the value of the materialRollen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setMaterialRollen(KeyValuePropertyType value) {
        this.materialRollen = value;
    }

    /**
     * Gets the value of the materialGleitflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getMaterialGleitflaeche() {
        return materialGleitflaeche;
    }

    /**
     * Sets the value of the materialGleitflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setMaterialGleitflaeche(KeyValuePropertyType value) {
        this.materialGleitflaeche = value;
    }

}
