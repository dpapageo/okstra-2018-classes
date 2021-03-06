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
 * <p>Java class for StreckenbildType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreckenbildType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="erstellt_von" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="physikalische_Aufloesung" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}dpi" minOccurs="0"/&gt;
 *         &lt;element name="Farbspektrum" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Farbtiefe" minOccurs="0"/&gt;
 *         &lt;element name="Datei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inhaltliche_Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Startdatum" type="{http://www.okstra.de/okstra/2.018.2}StartdatumPropertyType"/&gt;
 *         &lt;element name="verwendetes_Verfahren" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Aufbewahrungsort_Medium_analog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hat_Fotostandpunkt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="bei_Strassenpunkt" type="{http://www.okstra.de/okstra/2.018.2}StrassenpunktPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bei_Strassenelementpunkt" type="{http://www.okstra.de/okstra/2.018.2}StrassenelementpunktPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Geometrie_Punktobjekt" type="{http://www.opengis.net/gml/3.2}PointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="OpenLR_Punktobjekt" type="{http://www.okstra.de/okstra/2.018.2}OpenLR_PointLocationReferencePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="TMC_Punktobjekt" type="{http://www.okstra.de/okstra/2.018.2}TMC_PunktreferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Punktgeometrie" type="{http://www.opengis.net/gml/3.2}PointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Bezugsrichtung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Art_Kamera" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="sonstige_Art_Kamera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MIME_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zu_Fahrstreifen" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreckenbildType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "erstelltVon",
    "physikalischeAufloesung",
    "farbspektrum",
    "datei",
    "inhaltlicheBeschreibung",
    "startdatum",
    "verwendetesVerfahren",
    "aufbewahrungsortMediumAnalog",
    "hatFotostandpunkt",
    "beiStrassenpunkt",
    "beiStrassenelementpunkt",
    "geometriePunktobjekt",
    "openLRPunktobjekt",
    "tmcPunktobjekt",
    "punktgeometrie",
    "bezugsrichtung",
    "artKamera",
    "sonstigeArtKamera",
    "uri",
    "mimeType",
    "zuFahrstreifen"
})
public class StreckenbildType
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
    @XmlElement(name = "erstellt_von")
    protected String erstelltVon;
    @XmlElement(name = "physikalische_Aufloesung")
    protected BigInteger physikalischeAufloesung;
    @XmlElement(name = "Farbspektrum")
    protected BigInteger farbspektrum;
    @XmlElement(name = "Datei")
    protected String datei;
    @XmlElement(name = "inhaltliche_Beschreibung")
    protected String inhaltlicheBeschreibung;
    @XmlElement(name = "Startdatum", required = true)
    protected StartdatumPropertyType startdatum;
    @XmlElement(name = "verwendetes_Verfahren")
    protected KeyValuePropertyType verwendetesVerfahren;
    @XmlElement(name = "Aufbewahrungsort_Medium_analog")
    protected String aufbewahrungsortMediumAnalog;
    @XmlElement(name = "hat_Fotostandpunkt")
    protected ObjectRefType hatFotostandpunkt;
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
    @XmlElement(name = "Punktgeometrie")
    protected PointPropertyType punktgeometrie;
    @XmlElement(name = "Bezugsrichtung")
    protected KeyValuePropertyType bezugsrichtung;
    @XmlElement(name = "Art_Kamera")
    protected KeyValuePropertyType artKamera;
    @XmlElement(name = "sonstige_Art_Kamera")
    protected String sonstigeArtKamera;
    @XmlElement(name = "URI")
    protected String uri;
    @XmlElement(name = "MIME_Type")
    protected String mimeType;
    @XmlElement(name = "zu_Fahrstreifen")
    protected List<ObjectRefType> zuFahrstreifen;

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
     * Gets the value of the erstelltVon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErstelltVon() {
        return erstelltVon;
    }

    /**
     * Sets the value of the erstelltVon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErstelltVon(String value) {
        this.erstelltVon = value;
    }

    /**
     * Gets the value of the physikalischeAufloesung property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhysikalischeAufloesung() {
        return physikalischeAufloesung;
    }

    /**
     * Sets the value of the physikalischeAufloesung property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhysikalischeAufloesung(BigInteger value) {
        this.physikalischeAufloesung = value;
    }

    /**
     * Gets the value of the farbspektrum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFarbspektrum() {
        return farbspektrum;
    }

    /**
     * Sets the value of the farbspektrum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFarbspektrum(BigInteger value) {
        this.farbspektrum = value;
    }

    /**
     * Gets the value of the datei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatei() {
        return datei;
    }

    /**
     * Sets the value of the datei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatei(String value) {
        this.datei = value;
    }

    /**
     * Gets the value of the inhaltlicheBeschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhaltlicheBeschreibung() {
        return inhaltlicheBeschreibung;
    }

    /**
     * Sets the value of the inhaltlicheBeschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhaltlicheBeschreibung(String value) {
        this.inhaltlicheBeschreibung = value;
    }

    /**
     * Gets the value of the startdatum property.
     * 
     * @return
     *     possible object is
     *     {@link StartdatumPropertyType }
     *     
     */
    public StartdatumPropertyType getStartdatum() {
        return startdatum;
    }

    /**
     * Sets the value of the startdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartdatumPropertyType }
     *     
     */
    public void setStartdatum(StartdatumPropertyType value) {
        this.startdatum = value;
    }

    /**
     * Gets the value of the verwendetesVerfahren property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getVerwendetesVerfahren() {
        return verwendetesVerfahren;
    }

    /**
     * Sets the value of the verwendetesVerfahren property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setVerwendetesVerfahren(KeyValuePropertyType value) {
        this.verwendetesVerfahren = value;
    }

    /**
     * Gets the value of the aufbewahrungsortMediumAnalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAufbewahrungsortMediumAnalog() {
        return aufbewahrungsortMediumAnalog;
    }

    /**
     * Sets the value of the aufbewahrungsortMediumAnalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAufbewahrungsortMediumAnalog(String value) {
        this.aufbewahrungsortMediumAnalog = value;
    }

    /**
     * Gets the value of the hatFotostandpunkt property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getHatFotostandpunkt() {
        return hatFotostandpunkt;
    }

    /**
     * Sets the value of the hatFotostandpunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setHatFotostandpunkt(ObjectRefType value) {
        this.hatFotostandpunkt = value;
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
     * Gets the value of the punktgeometrie property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPunktgeometrie() {
        return punktgeometrie;
    }

    /**
     * Sets the value of the punktgeometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPunktgeometrie(PointPropertyType value) {
        this.punktgeometrie = value;
    }

    /**
     * Gets the value of the bezugsrichtung property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getBezugsrichtung() {
        return bezugsrichtung;
    }

    /**
     * Sets the value of the bezugsrichtung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setBezugsrichtung(KeyValuePropertyType value) {
        this.bezugsrichtung = value;
    }

    /**
     * Gets the value of the artKamera property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getArtKamera() {
        return artKamera;
    }

    /**
     * Sets the value of the artKamera property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setArtKamera(KeyValuePropertyType value) {
        this.artKamera = value;
    }

    /**
     * Gets the value of the sonstigeArtKamera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonstigeArtKamera() {
        return sonstigeArtKamera;
    }

    /**
     * Sets the value of the sonstigeArtKamera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonstigeArtKamera(String value) {
        this.sonstigeArtKamera = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMEType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMEType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the zuFahrstreifen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zuFahrstreifen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZuFahrstreifen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getZuFahrstreifen() {
        if (zuFahrstreifen == null) {
            zuFahrstreifen = new ArrayList<ObjectRefType>();
        }
        return this.zuFahrstreifen;
    }

}
