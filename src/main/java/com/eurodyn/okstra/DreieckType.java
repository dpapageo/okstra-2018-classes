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
 * <p>Java class for DreieckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DreieckType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dreiecksnummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Dreiecksbedeutung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Seiteneigenschaft" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="3" minOccurs="3"/&gt;
 *         &lt;element name="in_DGM" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType"/&gt;
 *         &lt;element name="hat_Punkte" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="3" minOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DreieckType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "dreiecksnummer",
    "dreiecksbedeutung",
    "seiteneigenschaft",
    "inDGM",
    "hatPunkte"
})
public class DreieckType
    extends AbstractFeatureType
{

    @XmlElement(name = "OKSTRA_ID")
    protected String okstraid;
    @XmlElement(name = "zu_Beschriftung")
    protected List<ObjectRefType> zuBeschriftung;
    @XmlElement(name = "referenziert_Fremddatenbestand")
    protected List<ObjectRefType> referenziertFremddatenbestand;
    @XmlElement(name = "referenziert_Fremdobjekt")
    protected List<ObjectRefType> referenziertFremdobjekt;
    @XmlElement(name = "zu_Kommunikationsobjekt")
    protected List<ObjectRefType> zuKommunikationsobjekt;
    @XmlElement(name = "Dreiecksnummer")
    protected BigInteger dreiecksnummer;
    @XmlElement(name = "Dreiecksbedeutung")
    protected String dreiecksbedeutung;
    @XmlElement(name = "Seiteneigenschaft", required = true)
    protected List<KeyValuePropertyType> seiteneigenschaft;
    @XmlElement(name = "in_DGM", required = true)
    protected ObjectRefType inDGM;
    @XmlElement(name = "hat_Punkte", required = true)
    protected List<ObjectRefType> hatPunkte;

    /**
     * Gets the value of the okstraid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKSTRAID() {
        return okstraid;
    }

    /**
     * Sets the value of the okstraid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKSTRAID(String value) {
        this.okstraid = value;
    }

    /**
     * Gets the value of the zuBeschriftung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zuBeschriftung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZuBeschriftung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getZuBeschriftung() {
        if (zuBeschriftung == null) {
            zuBeschriftung = new ArrayList<ObjectRefType>();
        }
        return this.zuBeschriftung;
    }

    /**
     * Gets the value of the referenziertFremddatenbestand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenziertFremddatenbestand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenziertFremddatenbestand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getReferenziertFremddatenbestand() {
        if (referenziertFremddatenbestand == null) {
            referenziertFremddatenbestand = new ArrayList<ObjectRefType>();
        }
        return this.referenziertFremddatenbestand;
    }

    /**
     * Gets the value of the referenziertFremdobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenziertFremdobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenziertFremdobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getReferenziertFremdobjekt() {
        if (referenziertFremdobjekt == null) {
            referenziertFremdobjekt = new ArrayList<ObjectRefType>();
        }
        return this.referenziertFremdobjekt;
    }

    /**
     * Gets the value of the zuKommunikationsobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zuKommunikationsobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZuKommunikationsobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getZuKommunikationsobjekt() {
        if (zuKommunikationsobjekt == null) {
            zuKommunikationsobjekt = new ArrayList<ObjectRefType>();
        }
        return this.zuKommunikationsobjekt;
    }

    /**
     * Gets the value of the dreiecksnummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDreiecksnummer() {
        return dreiecksnummer;
    }

    /**
     * Sets the value of the dreiecksnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDreiecksnummer(BigInteger value) {
        this.dreiecksnummer = value;
    }

    /**
     * Gets the value of the dreiecksbedeutung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDreiecksbedeutung() {
        return dreiecksbedeutung;
    }

    /**
     * Sets the value of the dreiecksbedeutung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDreiecksbedeutung(String value) {
        this.dreiecksbedeutung = value;
    }

    /**
     * Gets the value of the seiteneigenschaft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seiteneigenschaft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeiteneigenschaft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getSeiteneigenschaft() {
        if (seiteneigenschaft == null) {
            seiteneigenschaft = new ArrayList<KeyValuePropertyType>();
        }
        return this.seiteneigenschaft;
    }

    /**
     * Gets the value of the inDGM property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getInDGM() {
        return inDGM;
    }

    /**
     * Sets the value of the inDGM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setInDGM(ObjectRefType value) {
        this.inDGM = value;
    }

    /**
     * Gets the value of the hatPunkte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatPunkte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatPunkte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatPunkte() {
        if (hatPunkte == null) {
            hatPunkte = new ArrayList<ObjectRefType>();
        }
        return this.hatPunkte;
    }

}
