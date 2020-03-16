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
 * <p>Java class for LichtsignalanlageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LichtsignalanlageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bei_Strassenpunkt" type="{http://www.okstra.de/okstra/2.018.2}StrassenpunktPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bei_Strassenelementpunkt" type="{http://www.okstra.de/okstra/2.018.2}StrassenelementpunktPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Geometrie_Punktobjekt" type="{http://www.opengis.net/gml/3.2}PointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="OpenLR_Punktobjekt" type="{http://www.okstra.de/okstra/2.018.2}OpenLR_PointLocationReferencePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="TMC_Punktobjekt" type="{http://www.okstra.de/okstra/2.018.2}TMC_PunktreferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Strasse" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Segment_kommunale_Strasse" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_kommunale_Strasse" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="hat_Softwarekomponenten" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_Rotlichtueberwachung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_uebergeordnete_Zentrale" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Hardwarekomponenten" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_Grundl_u_Inbetriebn_daten" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_Angaben_zum_Knotenpunkt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_Angaben_zu_Verkehrsdaten" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LichtsignalanlageType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "beiStrassenpunkt",
    "beiStrassenelementpunkt",
    "geometriePunktobjekt",
    "openLRPunktobjekt",
    "tmcPunktobjekt",
    "zuStrasse",
    "zuSegmentKommunaleStrasse",
    "zuKommunaleStrasse",
    "hatSoftwarekomponenten",
    "hatRotlichtueberwachung",
    "hatUebergeordneteZentrale",
    "hatHardwarekomponenten",
    "hatGrundlUInbetriebnDaten",
    "hatAngabenZumKnotenpunkt",
    "hatAngabenZuVerkehrsdaten"
})
public class LichtsignalanlageType
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
    @XmlElement(name = "bei_Strassenpunkt")
    protected List<StrassenpunktPropertyType> beiStrassenpunkt;
    @XmlElement(name = "bei_Strassenelementpunkt")
    protected List<StrassenelementpunktPropertyType> beiStrassenelementpunkt;
    @XmlElement(name = "Geometrie_Punktobjekt")
    protected PointPropertyType geometriePunktobjekt;
    @XmlElement(name = "OpenLR_Punktobjekt")
    protected OpenLRPointLocationReferencePropertyType openLRPunktobjekt;
    @XmlElement(name = "TMC_Punktobjekt")
    protected List<TMCPunktreferenzPropertyType> tmcPunktobjekt;
    @XmlElement(name = "zu_Strasse")
    protected List<ObjectRefType> zuStrasse;
    @XmlElement(name = "zu_Segment_kommunale_Strasse")
    protected List<ObjectRefType> zuSegmentKommunaleStrasse;
    @XmlElement(name = "zu_kommunale_Strasse")
    protected ObjectRefType zuKommunaleStrasse;
    @XmlElement(name = "hat_Softwarekomponenten", required = true)
    protected List<ObjectRefType> hatSoftwarekomponenten;
    @XmlElement(name = "hat_Rotlichtueberwachung", required = true)
    protected List<ObjectRefType> hatRotlichtueberwachung;
    @XmlElement(name = "hat_uebergeordnete_Zentrale")
    protected List<ObjectRefType> hatUebergeordneteZentrale;
    @XmlElement(name = "hat_Hardwarekomponenten", required = true)
    protected List<ObjectRefType> hatHardwarekomponenten;
    @XmlElement(name = "hat_Grundl_u_Inbetriebn_daten", required = true)
    protected List<ObjectRefType> hatGrundlUInbetriebnDaten;
    @XmlElement(name = "hat_Angaben_zum_Knotenpunkt", required = true)
    protected List<ObjectRefType> hatAngabenZumKnotenpunkt;
    @XmlElement(name = "hat_Angaben_zu_Verkehrsdaten")
    protected List<ObjectRefType> hatAngabenZuVerkehrsdaten;

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
     * Gets the value of the beiStrassenpunkt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beiStrassenpunkt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeiStrassenpunkt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrassenpunktPropertyType }
     * 
     * 
     */
    public List<StrassenpunktPropertyType> getBeiStrassenpunkt() {
        if (beiStrassenpunkt == null) {
            beiStrassenpunkt = new ArrayList<StrassenpunktPropertyType>();
        }
        return this.beiStrassenpunkt;
    }

    /**
     * Gets the value of the beiStrassenelementpunkt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beiStrassenelementpunkt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeiStrassenelementpunkt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrassenelementpunktPropertyType }
     * 
     * 
     */
    public List<StrassenelementpunktPropertyType> getBeiStrassenelementpunkt() {
        if (beiStrassenelementpunkt == null) {
            beiStrassenelementpunkt = new ArrayList<StrassenelementpunktPropertyType>();
        }
        return this.beiStrassenelementpunkt;
    }

    /**
     * Gets the value of the geometriePunktobjekt property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getGeometriePunktobjekt() {
        return geometriePunktobjekt;
    }

    /**
     * Sets the value of the geometriePunktobjekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setGeometriePunktobjekt(PointPropertyType value) {
        this.geometriePunktobjekt = value;
    }

    /**
     * Gets the value of the openLRPunktobjekt property.
     * 
     * @return
     *     possible object is
     *     {@link OpenLRPointLocationReferencePropertyType }
     *     
     */
    public OpenLRPointLocationReferencePropertyType getOpenLRPunktobjekt() {
        return openLRPunktobjekt;
    }

    /**
     * Sets the value of the openLRPunktobjekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenLRPointLocationReferencePropertyType }
     *     
     */
    public void setOpenLRPunktobjekt(OpenLRPointLocationReferencePropertyType value) {
        this.openLRPunktobjekt = value;
    }

    /**
     * Gets the value of the tmcPunktobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmcPunktobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTMCPunktobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMCPunktreferenzPropertyType }
     * 
     * 
     */
    public List<TMCPunktreferenzPropertyType> getTMCPunktobjekt() {
        if (tmcPunktobjekt == null) {
            tmcPunktobjekt = new ArrayList<TMCPunktreferenzPropertyType>();
        }
        return this.tmcPunktobjekt;
    }

    /**
     * Gets the value of the zuStrasse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zuStrasse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZuStrasse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getZuStrasse() {
        if (zuStrasse == null) {
            zuStrasse = new ArrayList<ObjectRefType>();
        }
        return this.zuStrasse;
    }

    /**
     * Gets the value of the zuSegmentKommunaleStrasse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zuSegmentKommunaleStrasse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZuSegmentKommunaleStrasse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getZuSegmentKommunaleStrasse() {
        if (zuSegmentKommunaleStrasse == null) {
            zuSegmentKommunaleStrasse = new ArrayList<ObjectRefType>();
        }
        return this.zuSegmentKommunaleStrasse;
    }

    /**
     * Gets the value of the zuKommunaleStrasse property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getZuKommunaleStrasse() {
        return zuKommunaleStrasse;
    }

    /**
     * Sets the value of the zuKommunaleStrasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setZuKommunaleStrasse(ObjectRefType value) {
        this.zuKommunaleStrasse = value;
    }

    /**
     * Gets the value of the hatSoftwarekomponenten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatSoftwarekomponenten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatSoftwarekomponenten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatSoftwarekomponenten() {
        if (hatSoftwarekomponenten == null) {
            hatSoftwarekomponenten = new ArrayList<ObjectRefType>();
        }
        return this.hatSoftwarekomponenten;
    }

    /**
     * Gets the value of the hatRotlichtueberwachung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatRotlichtueberwachung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatRotlichtueberwachung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatRotlichtueberwachung() {
        if (hatRotlichtueberwachung == null) {
            hatRotlichtueberwachung = new ArrayList<ObjectRefType>();
        }
        return this.hatRotlichtueberwachung;
    }

    /**
     * Gets the value of the hatUebergeordneteZentrale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatUebergeordneteZentrale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatUebergeordneteZentrale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatUebergeordneteZentrale() {
        if (hatUebergeordneteZentrale == null) {
            hatUebergeordneteZentrale = new ArrayList<ObjectRefType>();
        }
        return this.hatUebergeordneteZentrale;
    }

    /**
     * Gets the value of the hatHardwarekomponenten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatHardwarekomponenten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatHardwarekomponenten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatHardwarekomponenten() {
        if (hatHardwarekomponenten == null) {
            hatHardwarekomponenten = new ArrayList<ObjectRefType>();
        }
        return this.hatHardwarekomponenten;
    }

    /**
     * Gets the value of the hatGrundlUInbetriebnDaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatGrundlUInbetriebnDaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatGrundlUInbetriebnDaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatGrundlUInbetriebnDaten() {
        if (hatGrundlUInbetriebnDaten == null) {
            hatGrundlUInbetriebnDaten = new ArrayList<ObjectRefType>();
        }
        return this.hatGrundlUInbetriebnDaten;
    }

    /**
     * Gets the value of the hatAngabenZumKnotenpunkt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatAngabenZumKnotenpunkt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatAngabenZumKnotenpunkt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatAngabenZumKnotenpunkt() {
        if (hatAngabenZumKnotenpunkt == null) {
            hatAngabenZumKnotenpunkt = new ArrayList<ObjectRefType>();
        }
        return this.hatAngabenZumKnotenpunkt;
    }

    /**
     * Gets the value of the hatAngabenZuVerkehrsdaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatAngabenZuVerkehrsdaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatAngabenZuVerkehrsdaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatAngabenZuVerkehrsdaten() {
        if (hatAngabenZuVerkehrsdaten == null) {
            hatAngabenZuVerkehrsdaten = new ArrayList<ObjectRefType>();
        }
        return this.hatAngabenZuVerkehrsdaten;
    }

}
