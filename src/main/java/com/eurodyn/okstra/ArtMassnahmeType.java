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
 * <p>Java class for Art_MassnahmeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Art_MassnahmeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kategorie" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Ordnungsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Bemerkung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Kostenkatalog" type="{http://www.okstra.de/okstra/2.018.2}KostenkatalogPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Art_MassnahmeType", propOrder = {
    "kategorie",
    "ordnungsnummer",
    "name",
    "bemerkung",
    "kostenkatalog"
})
public class ArtMassnahmeType {

    @XmlElement(name = "Kategorie", required = true)
    protected List<KeyValuePropertyType> kategorie;
    @XmlElement(name = "Ordnungsnummer", required = true)
    protected String ordnungsnummer;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Bemerkung")
    protected String bemerkung;
    @XmlElement(name = "Kostenkatalog")
    protected List<KostenkatalogPropertyType> kostenkatalog;

    /**
     * Gets the value of the kategorie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kategorie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKategorie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getKategorie() {
        if (kategorie == null) {
            kategorie = new ArrayList<KeyValuePropertyType>();
        }
        return this.kategorie;
    }

    /**
     * Gets the value of the ordnungsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdnungsnummer() {
        return ordnungsnummer;
    }

    /**
     * Sets the value of the ordnungsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdnungsnummer(String value) {
        this.ordnungsnummer = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the bemerkung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the value of the bemerkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBemerkung(String value) {
        this.bemerkung = value;
    }

    /**
     * Gets the value of the kostenkatalog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kostenkatalog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKostenkatalog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KostenkatalogPropertyType }
     * 
     * 
     */
    public List<KostenkatalogPropertyType> getKostenkatalog() {
        if (kostenkatalog == null) {
            kostenkatalog = new ArrayList<KostenkatalogPropertyType>();
        }
        return this.kostenkatalog;
    }

}
