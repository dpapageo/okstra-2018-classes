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
 * <p>Java class for Angaben_zu_UnfallbeteiligtenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Angaben_zu_UnfallbeteiligtenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Anzahl_der_Beteiligten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl_zweistellig"/&gt;
 *         &lt;element name="Anzahl_der_Getoeteten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl_zweistellig"/&gt;
 *         &lt;element name="Anzahl_der_Schwerverletzten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl_zweistellig"/&gt;
 *         &lt;element name="Anzahl_der_Leichtverletzten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl_zweistellig"/&gt;
 *         &lt;element name="hat_Unfallbeteiligte" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "Angaben_zu_UnfallbeteiligtenType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "anzahlDerBeteiligten",
    "anzahlDerGetoeteten",
    "anzahlDerSchwerverletzten",
    "anzahlDerLeichtverletzten",
    "hatUnfallbeteiligte",
    "vonUnfall"
})
public class AngabenZuUnfallbeteiligtenType
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
    @XmlElement(name = "Anzahl_der_Beteiligten", required = true)
    protected BigInteger anzahlDerBeteiligten;
    @XmlElement(name = "Anzahl_der_Getoeteten", required = true)
    protected BigInteger anzahlDerGetoeteten;
    @XmlElement(name = "Anzahl_der_Schwerverletzten", required = true)
    protected BigInteger anzahlDerSchwerverletzten;
    @XmlElement(name = "Anzahl_der_Leichtverletzten", required = true)
    protected BigInteger anzahlDerLeichtverletzten;
    @XmlElement(name = "hat_Unfallbeteiligte")
    protected List<ObjectRefType> hatUnfallbeteiligte;
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
     * Gets the value of the anzahlDerBeteiligten property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlDerBeteiligten() {
        return anzahlDerBeteiligten;
    }

    /**
     * Sets the value of the anzahlDerBeteiligten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlDerBeteiligten(BigInteger value) {
        this.anzahlDerBeteiligten = value;
    }

    /**
     * Gets the value of the anzahlDerGetoeteten property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlDerGetoeteten() {
        return anzahlDerGetoeteten;
    }

    /**
     * Sets the value of the anzahlDerGetoeteten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlDerGetoeteten(BigInteger value) {
        this.anzahlDerGetoeteten = value;
    }

    /**
     * Gets the value of the anzahlDerSchwerverletzten property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlDerSchwerverletzten() {
        return anzahlDerSchwerverletzten;
    }

    /**
     * Sets the value of the anzahlDerSchwerverletzten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlDerSchwerverletzten(BigInteger value) {
        this.anzahlDerSchwerverletzten = value;
    }

    /**
     * Gets the value of the anzahlDerLeichtverletzten property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlDerLeichtverletzten() {
        return anzahlDerLeichtverletzten;
    }

    /**
     * Sets the value of the anzahlDerLeichtverletzten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlDerLeichtverletzten(BigInteger value) {
        this.anzahlDerLeichtverletzten = value;
    }

    /**
     * Gets the value of the hatUnfallbeteiligte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatUnfallbeteiligte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatUnfallbeteiligte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatUnfallbeteiligte() {
        if (hatUnfallbeteiligte == null) {
            hatUnfallbeteiligte = new ArrayList<ObjectRefType>();
        }
        return this.hatUnfallbeteiligte;
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