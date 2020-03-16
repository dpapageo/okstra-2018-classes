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
 * <p>Java class for VEMAGS_Lastbild_DefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VEMAGS_Lastbild_DefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name_Lastbild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ASB_Tragfaehigkeitsbezug" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}ASB_ING_Schluessel" minOccurs="0"/&gt;
 *         &lt;element name="Minimaler_Auslastungsgrad" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Maximaler_Ueberlastungsfaktor" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Achsen_Hauptspur" type="{http://www.okstra.de/okstra/2.018.2}achsbezogene_DatenPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Achsen_Nebenspur" type="{http://www.okstra.de/okstra/2.018.2}achsbezogene_DatenPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Achsen_Nebenspur2" type="{http://www.okstra.de/okstra/2.018.2}achsbezogene_DatenPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Flaechenlast_Hauptspur" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Kilonewton_pro_Quadratmeter" minOccurs="0"/&gt;
 *         &lt;element name="Flaechenlast_Nebenspur" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Kilonewton_pro_Quadratmeter" minOccurs="0"/&gt;
 *         &lt;element name="Flaechenlast_Nebenspur2" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Kilonewton_pro_Quadratmeter" minOccurs="0"/&gt;
 *         &lt;element name="Ueberhang_Abstand_HS_vorn" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Ueberhang_Abstand_HS_hinten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Ueberhang_Abstand_NS_vorn" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Ueberhang_Abstand_NS_hinten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Ueberhang_Abstand_NS2_vorn" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Ueberhang_Abstand_NS2_hinten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="RGST_Bezug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="durchgehende_Flaechenlast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enthalten_in_Grundlage" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VEMAGS_Lastbild_DefinitionType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "nameLastbild",
    "asbTragfaehigkeitsbezug",
    "minimalerAuslastungsgrad",
    "maximalerUeberlastungsfaktor",
    "achsenHauptspur",
    "achsenNebenspur",
    "achsenNebenspur2",
    "flaechenlastHauptspur",
    "flaechenlastNebenspur",
    "flaechenlastNebenspur2",
    "ueberhangAbstandHSVorn",
    "ueberhangAbstandHSHinten",
    "ueberhangAbstandNSVorn",
    "ueberhangAbstandNSHinten",
    "ueberhangAbstandNS2Vorn",
    "ueberhangAbstandNS2Hinten",
    "rgstBezug",
    "durchgehendeFlaechenlast",
    "enthaltenInGrundlage"
})
public class VEMAGSLastbildDefinitionType
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
    @XmlElement(name = "Name_Lastbild")
    protected String nameLastbild;
    @XmlElement(name = "ASB_Tragfaehigkeitsbezug")
    protected String asbTragfaehigkeitsbezug;
    @XmlElement(name = "Minimaler_Auslastungsgrad")
    protected Double minimalerAuslastungsgrad;
    @XmlElement(name = "Maximaler_Ueberlastungsfaktor")
    protected Double maximalerUeberlastungsfaktor;
    @XmlElement(name = "Achsen_Hauptspur")
    protected List<AchsbezogeneDatenPropertyType> achsenHauptspur;
    @XmlElement(name = "Achsen_Nebenspur")
    protected List<AchsbezogeneDatenPropertyType> achsenNebenspur;
    @XmlElement(name = "Achsen_Nebenspur2")
    protected List<AchsbezogeneDatenPropertyType> achsenNebenspur2;
    @XmlElement(name = "Flaechenlast_Hauptspur")
    protected KilonewtonProQuadratmeter flaechenlastHauptspur;
    @XmlElement(name = "Flaechenlast_Nebenspur")
    protected KilonewtonProQuadratmeter flaechenlastNebenspur;
    @XmlElement(name = "Flaechenlast_Nebenspur2")
    protected KilonewtonProQuadratmeter flaechenlastNebenspur2;
    @XmlElement(name = "Ueberhang_Abstand_HS_vorn")
    protected Meter ueberhangAbstandHSVorn;
    @XmlElement(name = "Ueberhang_Abstand_HS_hinten")
    protected Meter ueberhangAbstandHSHinten;
    @XmlElement(name = "Ueberhang_Abstand_NS_vorn")
    protected Meter ueberhangAbstandNSVorn;
    @XmlElement(name = "Ueberhang_Abstand_NS_hinten")
    protected Meter ueberhangAbstandNSHinten;
    @XmlElement(name = "Ueberhang_Abstand_NS2_vorn")
    protected Meter ueberhangAbstandNS2Vorn;
    @XmlElement(name = "Ueberhang_Abstand_NS2_hinten")
    protected Meter ueberhangAbstandNS2Hinten;
    @XmlElement(name = "RGST_Bezug")
    protected String rgstBezug;
    @XmlElement(name = "durchgehende_Flaechenlast")
    protected Boolean durchgehendeFlaechenlast;
    @XmlElement(name = "enthalten_in_Grundlage")
    protected List<ObjectRefType> enthaltenInGrundlage;

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
     * Gets the value of the nameLastbild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLastbild() {
        return nameLastbild;
    }

    /**
     * Sets the value of the nameLastbild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLastbild(String value) {
        this.nameLastbild = value;
    }

    /**
     * Gets the value of the asbTragfaehigkeitsbezug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASBTragfaehigkeitsbezug() {
        return asbTragfaehigkeitsbezug;
    }

    /**
     * Sets the value of the asbTragfaehigkeitsbezug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASBTragfaehigkeitsbezug(String value) {
        this.asbTragfaehigkeitsbezug = value;
    }

    /**
     * Gets the value of the minimalerAuslastungsgrad property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimalerAuslastungsgrad() {
        return minimalerAuslastungsgrad;
    }

    /**
     * Sets the value of the minimalerAuslastungsgrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimalerAuslastungsgrad(Double value) {
        this.minimalerAuslastungsgrad = value;
    }

    /**
     * Gets the value of the maximalerUeberlastungsfaktor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximalerUeberlastungsfaktor() {
        return maximalerUeberlastungsfaktor;
    }

    /**
     * Sets the value of the maximalerUeberlastungsfaktor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximalerUeberlastungsfaktor(Double value) {
        this.maximalerUeberlastungsfaktor = value;
    }

    /**
     * Gets the value of the achsenHauptspur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the achsenHauptspur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAchsenHauptspur().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AchsbezogeneDatenPropertyType }
     * 
     * 
     */
    public List<AchsbezogeneDatenPropertyType> getAchsenHauptspur() {
        if (achsenHauptspur == null) {
            achsenHauptspur = new ArrayList<AchsbezogeneDatenPropertyType>();
        }
        return this.achsenHauptspur;
    }

    /**
     * Gets the value of the achsenNebenspur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the achsenNebenspur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAchsenNebenspur().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AchsbezogeneDatenPropertyType }
     * 
     * 
     */
    public List<AchsbezogeneDatenPropertyType> getAchsenNebenspur() {
        if (achsenNebenspur == null) {
            achsenNebenspur = new ArrayList<AchsbezogeneDatenPropertyType>();
        }
        return this.achsenNebenspur;
    }

    /**
     * Gets the value of the achsenNebenspur2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the achsenNebenspur2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAchsenNebenspur2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AchsbezogeneDatenPropertyType }
     * 
     * 
     */
    public List<AchsbezogeneDatenPropertyType> getAchsenNebenspur2() {
        if (achsenNebenspur2 == null) {
            achsenNebenspur2 = new ArrayList<AchsbezogeneDatenPropertyType>();
        }
        return this.achsenNebenspur2;
    }

    /**
     * Gets the value of the flaechenlastHauptspur property.
     * 
     * @return
     *     possible object is
     *     {@link KilonewtonProQuadratmeter }
     *     
     */
    public KilonewtonProQuadratmeter getFlaechenlastHauptspur() {
        return flaechenlastHauptspur;
    }

    /**
     * Sets the value of the flaechenlastHauptspur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KilonewtonProQuadratmeter }
     *     
     */
    public void setFlaechenlastHauptspur(KilonewtonProQuadratmeter value) {
        this.flaechenlastHauptspur = value;
    }

    /**
     * Gets the value of the flaechenlastNebenspur property.
     * 
     * @return
     *     possible object is
     *     {@link KilonewtonProQuadratmeter }
     *     
     */
    public KilonewtonProQuadratmeter getFlaechenlastNebenspur() {
        return flaechenlastNebenspur;
    }

    /**
     * Sets the value of the flaechenlastNebenspur property.
     * 
     * @param value
     *     allowed object is
     *     {@link KilonewtonProQuadratmeter }
     *     
     */
    public void setFlaechenlastNebenspur(KilonewtonProQuadratmeter value) {
        this.flaechenlastNebenspur = value;
    }

    /**
     * Gets the value of the flaechenlastNebenspur2 property.
     * 
     * @return
     *     possible object is
     *     {@link KilonewtonProQuadratmeter }
     *     
     */
    public KilonewtonProQuadratmeter getFlaechenlastNebenspur2() {
        return flaechenlastNebenspur2;
    }

    /**
     * Sets the value of the flaechenlastNebenspur2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link KilonewtonProQuadratmeter }
     *     
     */
    public void setFlaechenlastNebenspur2(KilonewtonProQuadratmeter value) {
        this.flaechenlastNebenspur2 = value;
    }

    /**
     * Gets the value of the ueberhangAbstandHSVorn property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getUeberhangAbstandHSVorn() {
        return ueberhangAbstandHSVorn;
    }

    /**
     * Sets the value of the ueberhangAbstandHSVorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setUeberhangAbstandHSVorn(Meter value) {
        this.ueberhangAbstandHSVorn = value;
    }

    /**
     * Gets the value of the ueberhangAbstandHSHinten property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getUeberhangAbstandHSHinten() {
        return ueberhangAbstandHSHinten;
    }

    /**
     * Sets the value of the ueberhangAbstandHSHinten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setUeberhangAbstandHSHinten(Meter value) {
        this.ueberhangAbstandHSHinten = value;
    }

    /**
     * Gets the value of the ueberhangAbstandNSVorn property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getUeberhangAbstandNSVorn() {
        return ueberhangAbstandNSVorn;
    }

    /**
     * Sets the value of the ueberhangAbstandNSVorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setUeberhangAbstandNSVorn(Meter value) {
        this.ueberhangAbstandNSVorn = value;
    }

    /**
     * Gets the value of the ueberhangAbstandNSHinten property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getUeberhangAbstandNSHinten() {
        return ueberhangAbstandNSHinten;
    }

    /**
     * Sets the value of the ueberhangAbstandNSHinten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setUeberhangAbstandNSHinten(Meter value) {
        this.ueberhangAbstandNSHinten = value;
    }

    /**
     * Gets the value of the ueberhangAbstandNS2Vorn property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getUeberhangAbstandNS2Vorn() {
        return ueberhangAbstandNS2Vorn;
    }

    /**
     * Sets the value of the ueberhangAbstandNS2Vorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setUeberhangAbstandNS2Vorn(Meter value) {
        this.ueberhangAbstandNS2Vorn = value;
    }

    /**
     * Gets the value of the ueberhangAbstandNS2Hinten property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getUeberhangAbstandNS2Hinten() {
        return ueberhangAbstandNS2Hinten;
    }

    /**
     * Sets the value of the ueberhangAbstandNS2Hinten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setUeberhangAbstandNS2Hinten(Meter value) {
        this.ueberhangAbstandNS2Hinten = value;
    }

    /**
     * Gets the value of the rgstBezug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRGSTBezug() {
        return rgstBezug;
    }

    /**
     * Sets the value of the rgstBezug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRGSTBezug(String value) {
        this.rgstBezug = value;
    }

    /**
     * Gets the value of the durchgehendeFlaechenlast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDurchgehendeFlaechenlast() {
        return durchgehendeFlaechenlast;
    }

    /**
     * Sets the value of the durchgehendeFlaechenlast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDurchgehendeFlaechenlast(Boolean value) {
        this.durchgehendeFlaechenlast = value;
    }

    /**
     * Gets the value of the enthaltenInGrundlage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enthaltenInGrundlage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnthaltenInGrundlage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getEnthaltenInGrundlage() {
        if (enthaltenInGrundlage == null) {
            enthaltenInGrundlage = new ArrayList<ObjectRefType>();
        }
        return this.enthaltenInGrundlage;
    }

}