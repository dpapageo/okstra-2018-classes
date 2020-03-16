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
 * <p>Java class for Angaben_zum_UnfallgeschehenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Angaben_zum_UnfallgeschehenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Unfallart" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="vorlaeufige_Unfallursache" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="Unfallkategorie" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Unfalltyp" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Gesamtsachschaden" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}EURO" minOccurs="0"/&gt;
 *         &lt;element name="Waehrung_Gesamtsachschaden" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Kfz_fahrbereit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="von_Unfall" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Angaben_zum_UnfallgeschehenType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "unfallart",
    "vorlaeufigeUnfallursache",
    "unfallkategorie",
    "unfalltyp",
    "gesamtsachschaden",
    "waehrungGesamtsachschaden",
    "kfzFahrbereit",
    "vonUnfall"
})
public class AngabenZumUnfallgeschehenType
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
    @XmlElement(name = "Unfallart", required = true)
    protected KeyValuePropertyType unfallart;
    @XmlElement(name = "vorlaeufige_Unfallursache")
    protected List<KeyValuePropertyType> vorlaeufigeUnfallursache;
    @XmlElement(name = "Unfallkategorie", required = true)
    protected KeyValuePropertyType unfallkategorie;
    @XmlElement(name = "Unfalltyp", required = true)
    protected KeyValuePropertyType unfalltyp;
    @XmlElement(name = "Gesamtsachschaden")
    protected EURO gesamtsachschaden;
    @XmlElement(name = "Waehrung_Gesamtsachschaden")
    protected KeyValuePropertyType waehrungGesamtsachschaden;
    @XmlElement(name = "Kfz_fahrbereit")
    protected Boolean kfzFahrbereit;
    @XmlElement(name = "von_Unfall", required = true)
    protected ObjectRefType vonUnfall;

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
     * Gets the value of the unfallart property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getUnfallart() {
        return unfallart;
    }

    /**
     * Sets the value of the unfallart property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setUnfallart(KeyValuePropertyType value) {
        this.unfallart = value;
    }

    /**
     * Gets the value of the vorlaeufigeUnfallursache property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vorlaeufigeUnfallursache property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVorlaeufigeUnfallursache().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getVorlaeufigeUnfallursache() {
        if (vorlaeufigeUnfallursache == null) {
            vorlaeufigeUnfallursache = new ArrayList<KeyValuePropertyType>();
        }
        return this.vorlaeufigeUnfallursache;
    }

    /**
     * Gets the value of the unfallkategorie property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getUnfallkategorie() {
        return unfallkategorie;
    }

    /**
     * Sets the value of the unfallkategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setUnfallkategorie(KeyValuePropertyType value) {
        this.unfallkategorie = value;
    }

    /**
     * Gets the value of the unfalltyp property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getUnfalltyp() {
        return unfalltyp;
    }

    /**
     * Sets the value of the unfalltyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setUnfalltyp(KeyValuePropertyType value) {
        this.unfalltyp = value;
    }

    /**
     * Gets the value of the gesamtsachschaden property.
     * 
     * @return
     *     possible object is
     *     {@link EURO }
     *     
     */
    public EURO getGesamtsachschaden() {
        return gesamtsachschaden;
    }

    /**
     * Sets the value of the gesamtsachschaden property.
     * 
     * @param value
     *     allowed object is
     *     {@link EURO }
     *     
     */
    public void setGesamtsachschaden(EURO value) {
        this.gesamtsachschaden = value;
    }

    /**
     * Gets the value of the waehrungGesamtsachschaden property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getWaehrungGesamtsachschaden() {
        return waehrungGesamtsachschaden;
    }

    /**
     * Sets the value of the waehrungGesamtsachschaden property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setWaehrungGesamtsachschaden(KeyValuePropertyType value) {
        this.waehrungGesamtsachschaden = value;
    }

    /**
     * Gets the value of the kfzFahrbereit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKfzFahrbereit() {
        return kfzFahrbereit;
    }

    /**
     * Sets the value of the kfzFahrbereit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKfzFahrbereit(Boolean value) {
        this.kfzFahrbereit = value;
    }

    /**
     * Gets the value of the vonUnfall property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getVonUnfall() {
        return vonUnfall;
    }

    /**
     * Sets the value of the vonUnfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setVonUnfall(ObjectRefType value) {
        this.vonUnfall = value;
    }

}