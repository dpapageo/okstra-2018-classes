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
 * <p>Java class for VerkehrsnutzungsbereichType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerkehrsnutzungsbereichType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Hausnummer" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="zu_Hausnummernbereich" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="zu_Hausnummernblock" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="Art_der_Verkehrsnutzung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Geometrie_Streckenobjekt" type="{http://www.opengis.net/gml/3.2}CurvePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="OpenLR_Streckenobjekt" type="{http://www.okstra.de/okstra/2.018.2}OpenLR_LineLocationReferencePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="TMC_Streckenobjekt" type="{http://www.okstra.de/okstra/2.018.2}TMC_StreckenreferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Strecke" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gilt_fuer_Verkehrsrichtung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="entspricht_Nutzungsflaeche" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerkehrsnutzungsbereichType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "zuHausnummer",
    "zuHausnummernbereich",
    "zuHausnummernblock",
    "artDerVerkehrsnutzung",
    "geometrieStreckenobjekt",
    "openLRStreckenobjekt",
    "tmcStreckenobjekt",
    "hatStrecke",
    "giltFuerVerkehrsrichtung",
    "entsprichtNutzungsflaeche"
})
public class VerkehrsnutzungsbereichType
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
    @XmlElement(name = "zu_Hausnummer")
    protected ObjectRefType zuHausnummer;
    @XmlElement(name = "zu_Hausnummernbereich")
    protected ObjectRefType zuHausnummernbereich;
    @XmlElement(name = "zu_Hausnummernblock")
    protected ObjectRefType zuHausnummernblock;
    @XmlElement(name = "Art_der_Verkehrsnutzung", required = true)
    protected List<KeyValuePropertyType> artDerVerkehrsnutzung;
    @XmlElement(name = "Geometrie_Streckenobjekt")
    protected CurvePropertyType geometrieStreckenobjekt;
    @XmlElement(name = "OpenLR_Streckenobjekt")
    protected OpenLRLineLocationReferencePropertyType openLRStreckenobjekt;
    @XmlElement(name = "TMC_Streckenobjekt")
    protected List<TMCStreckenreferenzPropertyType> tmcStreckenobjekt;
    @XmlElement(name = "hat_Strecke")
    protected List<ObjectRefType> hatStrecke;
    @XmlElement(name = "gilt_fuer_Verkehrsrichtung")
    protected KeyValuePropertyType giltFuerVerkehrsrichtung;
    @XmlElement(name = "entspricht_Nutzungsflaeche")
    protected List<ObjectRefType> entsprichtNutzungsflaeche;

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
     * Gets the value of the zuHausnummer property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getZuHausnummer() {
        return zuHausnummer;
    }

    /**
     * Sets the value of the zuHausnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setZuHausnummer(ObjectRefType value) {
        this.zuHausnummer = value;
    }

    /**
     * Gets the value of the zuHausnummernbereich property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getZuHausnummernbereich() {
        return zuHausnummernbereich;
    }

    /**
     * Sets the value of the zuHausnummernbereich property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setZuHausnummernbereich(ObjectRefType value) {
        this.zuHausnummernbereich = value;
    }

    /**
     * Gets the value of the zuHausnummernblock property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getZuHausnummernblock() {
        return zuHausnummernblock;
    }

    /**
     * Sets the value of the zuHausnummernblock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setZuHausnummernblock(ObjectRefType value) {
        this.zuHausnummernblock = value;
    }

    /**
     * Gets the value of the artDerVerkehrsnutzung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artDerVerkehrsnutzung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtDerVerkehrsnutzung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getArtDerVerkehrsnutzung() {
        if (artDerVerkehrsnutzung == null) {
            artDerVerkehrsnutzung = new ArrayList<KeyValuePropertyType>();
        }
        return this.artDerVerkehrsnutzung;
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
     * Gets the value of the entsprichtNutzungsflaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entsprichtNutzungsflaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntsprichtNutzungsflaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getEntsprichtNutzungsflaeche() {
        if (entsprichtNutzungsflaeche == null) {
            entsprichtNutzungsflaeche = new ArrayList<ObjectRefType>();
        }
        return this.entsprichtNutzungsflaeche;
    }

}
