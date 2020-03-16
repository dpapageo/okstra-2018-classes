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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SWIS_GMA_MessstelleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWIS_GMA_MessstelleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gueltig_von" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="gueltig_bis" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="hat_Vorgaenger_hist_Objekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="hat_Nachfolger_hist_Objekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="erzeugt_von_Ereignis" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="geloescht_von_Ereignis" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="bei_Strassenpunkt" type="{http://www.okstra.de/okstra/2.018.2}StrassenpunktPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bei_Strassenelementpunkt" type="{http://www.okstra.de/okstra/2.018.2}StrassenelementpunktPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Geometrie_Punktobjekt" type="{http://www.opengis.net/gml/3.2}PointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="OpenLR_Punktobjekt" type="{http://www.okstra.de/okstra/2.018.2}OpenLR_PointLocationReferencePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="TMC_Punktobjekt" type="{http://www.okstra.de/okstra/2.018.2}TMC_PunktreferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Strasse" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Segment_kommunale_Strasse" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_kommunale_Strasse" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="Geometrie_Streckenobjekt" type="{http://www.opengis.net/gml/3.2}CurvePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="OpenLR_Streckenobjekt" type="{http://www.okstra.de/okstra/2.018.2}OpenLR_LineLocationReferencePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="TMC_Streckenobjekt" type="{http://www.okstra.de/okstra/2.018.2}TMC_StreckenreferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Strecke" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Nummer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Messeinricht_Schadstoffimmiss" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Lage_der_Sensoren" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Beginn_Erfassung" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Ende_Erfassung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="zu_Baudienststelle" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="in_Verwaltungsbezirk" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_Messdaten" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_Detektoren_Umfelddatenerfg" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Nutzungsart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWIS_GMA_MessstelleType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "gueltigVon",
    "gueltigBis",
    "hatVorgaengerHistObjekt",
    "hatNachfolgerHistObjekt",
    "erzeugtVonEreignis",
    "geloeschtVonEreignis",
    "beiStrassenpunkt",
    "beiStrassenelementpunkt",
    "geometriePunktobjekt",
    "openLRPunktobjekt",
    "tmcPunktobjekt",
    "zuStrasse",
    "zuSegmentKommunaleStrasse",
    "zuKommunaleStrasse",
    "geometrieStreckenobjekt",
    "openLRStreckenobjekt",
    "tmcStreckenobjekt",
    "hatStrecke",
    "nummer",
    "messeinrichtSchadstoffimmiss",
    "lageDerSensoren",
    "beginnErfassung",
    "endeErfassung",
    "zuBaudienststelle",
    "inVerwaltungsbezirk",
    "hatMessdaten",
    "hatDetektorenUmfelddatenerfg",
    "nutzungsart"
})
public class SWISGMAMessstelleType
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
    @XmlElement(name = "gueltig_von")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gueltigVon;
    @XmlElement(name = "gueltig_bis")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gueltigBis;
    @XmlElement(name = "hat_Vorgaenger_hist_Objekt")
    protected ObjectRefType hatVorgaengerHistObjekt;
    @XmlElement(name = "hat_Nachfolger_hist_Objekt")
    protected ObjectRefType hatNachfolgerHistObjekt;
    @XmlElement(name = "erzeugt_von_Ereignis")
    protected ObjectRefType erzeugtVonEreignis;
    @XmlElement(name = "geloescht_von_Ereignis")
    protected ObjectRefType geloeschtVonEreignis;
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
    @XmlElement(name = "Geometrie_Streckenobjekt")
    protected CurvePropertyType geometrieStreckenobjekt;
    @XmlElement(name = "OpenLR_Streckenobjekt")
    protected OpenLRLineLocationReferencePropertyType openLRStreckenobjekt;
    @XmlElement(name = "TMC_Streckenobjekt")
    protected List<TMCStreckenreferenzPropertyType> tmcStreckenobjekt;
    @XmlElement(name = "hat_Strecke")
    protected List<ObjectRefType> hatStrecke;
    @XmlElement(name = "Nummer", required = true)
    protected BigInteger nummer;
    @XmlElement(name = "Messeinricht_Schadstoffimmiss")
    protected List<String> messeinrichtSchadstoffimmiss;
    @XmlElement(name = "Lage_der_Sensoren", required = true)
    protected KeyValuePropertyType lageDerSensoren;
    @XmlElement(name = "Beginn_Erfassung", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginnErfassung;
    @XmlElement(name = "Ende_Erfassung")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endeErfassung;
    @XmlElement(name = "zu_Baudienststelle", required = true)
    protected List<ObjectRefType> zuBaudienststelle;
    @XmlElement(name = "in_Verwaltungsbezirk", required = true)
    protected List<ObjectRefType> inVerwaltungsbezirk;
    @XmlElement(name = "hat_Messdaten", required = true)
    protected List<ObjectRefType> hatMessdaten;
    @XmlElement(name = "hat_Detektoren_Umfelddatenerfg", required = true)
    protected List<ObjectRefType> hatDetektorenUmfelddatenerfg;
    @XmlElement(name = "Nutzungsart")
    protected String nutzungsart;

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
     * Gets the value of the gueltigVon property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGueltigVon() {
        return gueltigVon;
    }

    /**
     * Sets the value of the gueltigVon property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGueltigVon(XMLGregorianCalendar value) {
        this.gueltigVon = value;
    }

    /**
     * Gets the value of the gueltigBis property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGueltigBis() {
        return gueltigBis;
    }

    /**
     * Sets the value of the gueltigBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGueltigBis(XMLGregorianCalendar value) {
        this.gueltigBis = value;
    }

    /**
     * Gets the value of the hatVorgaengerHistObjekt property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getHatVorgaengerHistObjekt() {
        return hatVorgaengerHistObjekt;
    }

    /**
     * Sets the value of the hatVorgaengerHistObjekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setHatVorgaengerHistObjekt(ObjectRefType value) {
        this.hatVorgaengerHistObjekt = value;
    }

    /**
     * Gets the value of the hatNachfolgerHistObjekt property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getHatNachfolgerHistObjekt() {
        return hatNachfolgerHistObjekt;
    }

    /**
     * Sets the value of the hatNachfolgerHistObjekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setHatNachfolgerHistObjekt(ObjectRefType value) {
        this.hatNachfolgerHistObjekt = value;
    }

    /**
     * Gets the value of the erzeugtVonEreignis property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getErzeugtVonEreignis() {
        return erzeugtVonEreignis;
    }

    /**
     * Sets the value of the erzeugtVonEreignis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setErzeugtVonEreignis(ObjectRefType value) {
        this.erzeugtVonEreignis = value;
    }

    /**
     * Gets the value of the geloeschtVonEreignis property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getGeloeschtVonEreignis() {
        return geloeschtVonEreignis;
    }

    /**
     * Sets the value of the geloeschtVonEreignis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setGeloeschtVonEreignis(ObjectRefType value) {
        this.geloeschtVonEreignis = value;
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
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNummer(BigInteger value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the messeinrichtSchadstoffimmiss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messeinrichtSchadstoffimmiss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMesseinrichtSchadstoffimmiss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMesseinrichtSchadstoffimmiss() {
        if (messeinrichtSchadstoffimmiss == null) {
            messeinrichtSchadstoffimmiss = new ArrayList<String>();
        }
        return this.messeinrichtSchadstoffimmiss;
    }

    /**
     * Gets the value of the lageDerSensoren property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getLageDerSensoren() {
        return lageDerSensoren;
    }

    /**
     * Sets the value of the lageDerSensoren property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setLageDerSensoren(KeyValuePropertyType value) {
        this.lageDerSensoren = value;
    }

    /**
     * Gets the value of the beginnErfassung property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginnErfassung() {
        return beginnErfassung;
    }

    /**
     * Sets the value of the beginnErfassung property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginnErfassung(XMLGregorianCalendar value) {
        this.beginnErfassung = value;
    }

    /**
     * Gets the value of the endeErfassung property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndeErfassung() {
        return endeErfassung;
    }

    /**
     * Sets the value of the endeErfassung property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndeErfassung(XMLGregorianCalendar value) {
        this.endeErfassung = value;
    }

    /**
     * Gets the value of the zuBaudienststelle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zuBaudienststelle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZuBaudienststelle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getZuBaudienststelle() {
        if (zuBaudienststelle == null) {
            zuBaudienststelle = new ArrayList<ObjectRefType>();
        }
        return this.zuBaudienststelle;
    }

    /**
     * Gets the value of the inVerwaltungsbezirk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inVerwaltungsbezirk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInVerwaltungsbezirk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getInVerwaltungsbezirk() {
        if (inVerwaltungsbezirk == null) {
            inVerwaltungsbezirk = new ArrayList<ObjectRefType>();
        }
        return this.inVerwaltungsbezirk;
    }

    /**
     * Gets the value of the hatMessdaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatMessdaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatMessdaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatMessdaten() {
        if (hatMessdaten == null) {
            hatMessdaten = new ArrayList<ObjectRefType>();
        }
        return this.hatMessdaten;
    }

    /**
     * Gets the value of the hatDetektorenUmfelddatenerfg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatDetektorenUmfelddatenerfg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatDetektorenUmfelddatenerfg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatDetektorenUmfelddatenerfg() {
        if (hatDetektorenUmfelddatenerfg == null) {
            hatDetektorenUmfelddatenerfg = new ArrayList<ObjectRefType>();
        }
        return this.hatDetektorenUmfelddatenerfg;
    }

    /**
     * Gets the value of the nutzungsart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutzungsart() {
        return nutzungsart;
    }

    /**
     * Sets the value of the nutzungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutzungsart(String value) {
        this.nutzungsart = value;
    }

}