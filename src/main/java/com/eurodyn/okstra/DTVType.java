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
 * <p>Java class for DTVType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTVType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Geometrie_Streckenobjekt" type="{http://www.opengis.net/gml/3.2}CurvePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="OpenLR_Streckenobjekt" type="{http://www.okstra.de/okstra/2.018.2}OpenLR_LineLocationReferencePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="TMC_Streckenobjekt" type="{http://www.okstra.de/okstra/2.018.2}TMC_StreckenreferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Strecke" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Fahrzeuge_pro_24h" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Bezugsjahr" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Jahr" minOccurs="0"/&gt;
 *         &lt;element name="Bezugsmonat" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Fahrzeugart" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Fahrzeuggruppe" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Tagesgruppe" type="{http://www.okstra.de/okstra/2.018.2}TagesgruppePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Zaehltage" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl" minOccurs="0"/&gt;
 *         &lt;element name="Gesamtstunden" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl" minOccurs="0"/&gt;
 *         &lt;element name="Schaetzwert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hat_Bezugsrichtung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="zu_Sachverhalt_Strasse_Weg" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="fuer_Fahrstreifen" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="aus_Zaehlstelle" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="zu_Unfallumstaenden" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTVType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "geometrieStreckenobjekt",
    "openLRStreckenobjekt",
    "tmcStreckenobjekt",
    "hatStrecke",
    "fahrzeugePro24H",
    "bezugsjahr",
    "bezugsmonat",
    "fahrzeugart",
    "fahrzeuggruppe",
    "tagesgruppe",
    "zaehltage",
    "gesamtstunden",
    "schaetzwert",
    "hatBezugsrichtung",
    "zuSachverhaltStrasseWeg",
    "fuerFahrstreifen",
    "ausZaehlstelle",
    "zuUnfallumstaenden"
})
public class DTVType
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
    @XmlElement(name = "Geometrie_Streckenobjekt")
    protected CurvePropertyType geometrieStreckenobjekt;
    @XmlElement(name = "OpenLR_Streckenobjekt")
    protected OpenLRLineLocationReferencePropertyType openLRStreckenobjekt;
    @XmlElement(name = "TMC_Streckenobjekt")
    protected List<TMCStreckenreferenzPropertyType> tmcStreckenobjekt;
    @XmlElement(name = "hat_Strecke")
    protected List<ObjectRefType> hatStrecke;
    @XmlElement(name = "Fahrzeuge_pro_24h", required = true)
    protected BigInteger fahrzeugePro24H;
    @XmlElement(name = "Bezugsjahr")
    protected BigInteger bezugsjahr;
    @XmlElement(name = "Bezugsmonat")
    protected KeyValuePropertyType bezugsmonat;
    @XmlElement(name = "Fahrzeugart")
    protected KeyValuePropertyType fahrzeugart;
    @XmlElement(name = "Fahrzeuggruppe")
    protected KeyValuePropertyType fahrzeuggruppe;
    @XmlElement(name = "Tagesgruppe")
    protected TagesgruppePropertyType tagesgruppe;
    @XmlElement(name = "Zaehltage")
    protected BigInteger zaehltage;
    @XmlElement(name = "Gesamtstunden")
    protected BigInteger gesamtstunden;
    @XmlElement(name = "Schaetzwert")
    protected Boolean schaetzwert;
    @XmlElement(name = "hat_Bezugsrichtung")
    protected KeyValuePropertyType hatBezugsrichtung;
    @XmlElement(name = "zu_Sachverhalt_Strasse_Weg")
    protected ObjectRefType zuSachverhaltStrasseWeg;
    @XmlElement(name = "fuer_Fahrstreifen")
    protected List<ObjectRefType> fuerFahrstreifen;
    @XmlElement(name = "aus_Zaehlstelle", required = true)
    protected List<ObjectRefType> ausZaehlstelle;
    @XmlElement(name = "zu_Unfallumstaenden")
    protected List<ObjectRefType> zuUnfallumstaenden;

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
     * Gets the value of the geometrieStreckenobjekt property.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getGeometrieStreckenobjekt() {
        return geometrieStreckenobjekt;
    }

    /**
     * Sets the value of the geometrieStreckenobjekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setGeometrieStreckenobjekt(CurvePropertyType value) {
        this.geometrieStreckenobjekt = value;
    }

    /**
     * Gets the value of the openLRStreckenobjekt property.
     * 
     * @return
     *     possible object is
     *     {@link OpenLRLineLocationReferencePropertyType }
     *     
     */
    public OpenLRLineLocationReferencePropertyType getOpenLRStreckenobjekt() {
        return openLRStreckenobjekt;
    }

    /**
     * Sets the value of the openLRStreckenobjekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenLRLineLocationReferencePropertyType }
     *     
     */
    public void setOpenLRStreckenobjekt(OpenLRLineLocationReferencePropertyType value) {
        this.openLRStreckenobjekt = value;
    }

    /**
     * Gets the value of the tmcStreckenobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmcStreckenobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTMCStreckenobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMCStreckenreferenzPropertyType }
     * 
     * 
     */
    public List<TMCStreckenreferenzPropertyType> getTMCStreckenobjekt() {
        if (tmcStreckenobjekt == null) {
            tmcStreckenobjekt = new ArrayList<TMCStreckenreferenzPropertyType>();
        }
        return this.tmcStreckenobjekt;
    }

    /**
     * Gets the value of the hatStrecke property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatStrecke property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatStrecke().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatStrecke() {
        if (hatStrecke == null) {
            hatStrecke = new ArrayList<ObjectRefType>();
        }
        return this.hatStrecke;
    }

    /**
     * Gets the value of the fahrzeugePro24H property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFahrzeugePro24H() {
        return fahrzeugePro24H;
    }

    /**
     * Sets the value of the fahrzeugePro24H property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFahrzeugePro24H(BigInteger value) {
        this.fahrzeugePro24H = value;
    }

    /**
     * Gets the value of the bezugsjahr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBezugsjahr() {
        return bezugsjahr;
    }

    /**
     * Sets the value of the bezugsjahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBezugsjahr(BigInteger value) {
        this.bezugsjahr = value;
    }

    /**
     * Gets the value of the bezugsmonat property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getBezugsmonat() {
        return bezugsmonat;
    }

    /**
     * Sets the value of the bezugsmonat property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setBezugsmonat(KeyValuePropertyType value) {
        this.bezugsmonat = value;
    }

    /**
     * Gets the value of the fahrzeugart property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getFahrzeugart() {
        return fahrzeugart;
    }

    /**
     * Sets the value of the fahrzeugart property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setFahrzeugart(KeyValuePropertyType value) {
        this.fahrzeugart = value;
    }

    /**
     * Gets the value of the fahrzeuggruppe property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getFahrzeuggruppe() {
        return fahrzeuggruppe;
    }

    /**
     * Sets the value of the fahrzeuggruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setFahrzeuggruppe(KeyValuePropertyType value) {
        this.fahrzeuggruppe = value;
    }

    /**
     * Gets the value of the tagesgruppe property.
     * 
     * @return
     *     possible object is
     *     {@link TagesgruppePropertyType }
     *     
     */
    public TagesgruppePropertyType getTagesgruppe() {
        return tagesgruppe;
    }

    /**
     * Sets the value of the tagesgruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagesgruppePropertyType }
     *     
     */
    public void setTagesgruppe(TagesgruppePropertyType value) {
        this.tagesgruppe = value;
    }

    /**
     * Gets the value of the zaehltage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZaehltage() {
        return zaehltage;
    }

    /**
     * Sets the value of the zaehltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZaehltage(BigInteger value) {
        this.zaehltage = value;
    }

    /**
     * Gets the value of the gesamtstunden property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGesamtstunden() {
        return gesamtstunden;
    }

    /**
     * Sets the value of the gesamtstunden property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGesamtstunden(BigInteger value) {
        this.gesamtstunden = value;
    }

    /**
     * Gets the value of the schaetzwert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSchaetzwert() {
        return schaetzwert;
    }

    /**
     * Sets the value of the schaetzwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchaetzwert(Boolean value) {
        this.schaetzwert = value;
    }

    /**
     * Gets the value of the hatBezugsrichtung property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getHatBezugsrichtung() {
        return hatBezugsrichtung;
    }

    /**
     * Sets the value of the hatBezugsrichtung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setHatBezugsrichtung(KeyValuePropertyType value) {
        this.hatBezugsrichtung = value;
    }

    /**
     * Gets the value of the zuSachverhaltStrasseWeg property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getZuSachverhaltStrasseWeg() {
        return zuSachverhaltStrasseWeg;
    }

    /**
     * Sets the value of the zuSachverhaltStrasseWeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setZuSachverhaltStrasseWeg(ObjectRefType value) {
        this.zuSachverhaltStrasseWeg = value;
    }

    /**
     * Gets the value of the fuerFahrstreifen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fuerFahrstreifen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuerFahrstreifen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getFuerFahrstreifen() {
        if (fuerFahrstreifen == null) {
            fuerFahrstreifen = new ArrayList<ObjectRefType>();
        }
        return this.fuerFahrstreifen;
    }

    /**
     * Gets the value of the ausZaehlstelle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ausZaehlstelle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAusZaehlstelle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getAusZaehlstelle() {
        if (ausZaehlstelle == null) {
            ausZaehlstelle = new ArrayList<ObjectRefType>();
        }
        return this.ausZaehlstelle;
    }

    /**
     * Gets the value of the zuUnfallumstaenden property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zuUnfallumstaenden property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZuUnfallumstaenden().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getZuUnfallumstaenden() {
        if (zuUnfallumstaenden == null) {
            zuUnfallumstaenden = new ArrayList<ObjectRefType>();
        }
        return this.zuUnfallumstaenden;
    }

}