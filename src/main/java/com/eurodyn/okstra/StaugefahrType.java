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
 * <p>Java class for StaugefahrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaugefahrType"&gt;
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
 *         &lt;element name="im_Zeitraum" type="{http://www.okstra.de/okstra/2.018.2}ZeitraumPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="gilt_fuer_Verkehrsrichtung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="gilt_fuer_Fahrzeugart" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gilt_fuer_Fahrstreifen" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Staugefahr" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaugefahrType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "geometrieStreckenobjekt",
    "openLRStreckenobjekt",
    "tmcStreckenobjekt",
    "hatStrecke",
    "imZeitraum",
    "giltFuerVerkehrsrichtung",
    "giltFuerFahrzeugart",
    "giltFuerFahrstreifen",
    "staugefahr"
})
public class StaugefahrType
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
    @XmlElement(name = "im_Zeitraum")
    protected ZeitraumPropertyType imZeitraum;
    @XmlElement(name = "gilt_fuer_Verkehrsrichtung")
    protected KeyValuePropertyType giltFuerVerkehrsrichtung;
    @XmlElement(name = "gilt_fuer_Fahrzeugart")
    protected List<KeyValuePropertyType> giltFuerFahrzeugart;
    @XmlElement(name = "gilt_fuer_Fahrstreifen")
    protected List<ObjectRefType> giltFuerFahrstreifen;
    @XmlElement(name = "Staugefahr")
    protected boolean staugefahr;

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
     * Gets the value of the imZeitraum property.
     * 
     * @return
     *     possible object is
     *     {@link ZeitraumPropertyType }
     *     
     */
    public ZeitraumPropertyType getImZeitraum() {
        return imZeitraum;
    }

    /**
     * Sets the value of the imZeitraum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeitraumPropertyType }
     *     
     */
    public void setImZeitraum(ZeitraumPropertyType value) {
        this.imZeitraum = value;
    }

    /**
     * Gets the value of the giltFuerVerkehrsrichtung property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getGiltFuerVerkehrsrichtung() {
        return giltFuerVerkehrsrichtung;
    }

    /**
     * Sets the value of the giltFuerVerkehrsrichtung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setGiltFuerVerkehrsrichtung(KeyValuePropertyType value) {
        this.giltFuerVerkehrsrichtung = value;
    }

    /**
     * Gets the value of the giltFuerFahrzeugart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giltFuerFahrzeugart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiltFuerFahrzeugart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getGiltFuerFahrzeugart() {
        if (giltFuerFahrzeugart == null) {
            giltFuerFahrzeugart = new ArrayList<KeyValuePropertyType>();
        }
        return this.giltFuerFahrzeugart;
    }

    /**
     * Gets the value of the giltFuerFahrstreifen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giltFuerFahrstreifen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiltFuerFahrstreifen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getGiltFuerFahrstreifen() {
        if (giltFuerFahrstreifen == null) {
            giltFuerFahrstreifen = new ArrayList<ObjectRefType>();
        }
        return this.giltFuerFahrstreifen;
    }

    /**
     * Gets the value of the staugefahr property.
     * 
     */
    public boolean isStaugefahr() {
        return staugefahr;
    }

    /**
     * Sets the value of the staugefahr property.
     * 
     */
    public void setStaugefahr(boolean value) {
        this.staugefahr = value;
    }

}
