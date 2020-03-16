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
 * <p>Java class for SpurType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpurType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Spurnummer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Art_verallg_Spur" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="von_Deckenbuch" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType"/&gt;
 *         &lt;element name="ist_Gegenspur_zu" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ist_Fahrspur_zu" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Querneigungsband" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="hat_Hoehenzug" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="hat_Breitenband" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpurType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "spurnummer",
    "artVerallgSpur",
    "bezeichnung",
    "vonDeckenbuch",
    "istGegenspurZu",
    "istFahrspurZu",
    "hatQuerneigungsband",
    "hatHoehenzug",
    "hatBreitenband"
})
public class SpurType
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
    @XmlElement(name = "Spurnummer", required = true)
    protected BigInteger spurnummer;
    @XmlElement(name = "Art_verallg_Spur", required = true)
    protected KeyValuePropertyType artVerallgSpur;
    @XmlElement(name = "Bezeichnung")
    protected String bezeichnung;
    @XmlElement(name = "von_Deckenbuch", required = true)
    protected ObjectRefType vonDeckenbuch;
    @XmlElement(name = "ist_Gegenspur_zu")
    protected List<ObjectRefType> istGegenspurZu;
    @XmlElement(name = "ist_Fahrspur_zu")
    protected List<ObjectRefType> istFahrspurZu;
    @XmlElement(name = "hat_Querneigungsband")
    protected ObjectRefType hatQuerneigungsband;
    @XmlElement(name = "hat_Hoehenzug")
    protected ObjectRefType hatHoehenzug;
    @XmlElement(name = "hat_Breitenband", required = true)
    protected ObjectRefType hatBreitenband;

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
     * Gets the value of the spurnummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpurnummer() {
        return spurnummer;
    }

    /**
     * Sets the value of the spurnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpurnummer(BigInteger value) {
        this.spurnummer = value;
    }

    /**
     * Gets the value of the artVerallgSpur property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getArtVerallgSpur() {
        return artVerallgSpur;
    }

    /**
     * Sets the value of the artVerallgSpur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setArtVerallgSpur(KeyValuePropertyType value) {
        this.artVerallgSpur = value;
    }

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the vonDeckenbuch property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getVonDeckenbuch() {
        return vonDeckenbuch;
    }

    /**
     * Sets the value of the vonDeckenbuch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setVonDeckenbuch(ObjectRefType value) {
        this.vonDeckenbuch = value;
    }

    /**
     * Gets the value of the istGegenspurZu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the istGegenspurZu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIstGegenspurZu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getIstGegenspurZu() {
        if (istGegenspurZu == null) {
            istGegenspurZu = new ArrayList<ObjectRefType>();
        }
        return this.istGegenspurZu;
    }

    /**
     * Gets the value of the istFahrspurZu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the istFahrspurZu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIstFahrspurZu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getIstFahrspurZu() {
        if (istFahrspurZu == null) {
            istFahrspurZu = new ArrayList<ObjectRefType>();
        }
        return this.istFahrspurZu;
    }

    /**
     * Gets the value of the hatQuerneigungsband property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getHatQuerneigungsband() {
        return hatQuerneigungsband;
    }

    /**
     * Sets the value of the hatQuerneigungsband property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setHatQuerneigungsband(ObjectRefType value) {
        this.hatQuerneigungsband = value;
    }

    /**
     * Gets the value of the hatHoehenzug property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getHatHoehenzug() {
        return hatHoehenzug;
    }

    /**
     * Sets the value of the hatHoehenzug property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setHatHoehenzug(ObjectRefType value) {
        this.hatHoehenzug = value;
    }

    /**
     * Gets the value of the hatBreitenband property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getHatBreitenband() {
        return hatBreitenband;
    }

    /**
     * Sets the value of the hatBreitenband property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setHatBreitenband(ObjectRefType value) {
        this.hatBreitenband = value;
    }

}