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
 * <p>Java class for Fussgaenger_UeberwegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fussgaenger_UeberwegType"&gt;
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
 *         &lt;element name="hat_Signalgeber" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fuehrt_zu_Haltestelle" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="fuehrt_ueber_Querungshilfe" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fussgaenger_UeberwegType", propOrder = {
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
    "hatSignalgeber",
    "fuehrtZuHaltestelle",
    "fuehrtUeberQuerungshilfe"
})
public class FussgaengerUeberwegType
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
    @XmlElement(name = "hat_Signalgeber")
    protected List<ObjectRefType> hatSignalgeber;
    @XmlElement(name = "fuehrt_zu_Haltestelle")
    protected ObjectRefType fuehrtZuHaltestelle;
    @XmlElement(name = "fuehrt_ueber_Querungshilfe")
    protected List<ObjectRefType> fuehrtUeberQuerungshilfe;

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
     * Gets the value of the hatSignalgeber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatSignalgeber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatSignalgeber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatSignalgeber() {
        if (hatSignalgeber == null) {
            hatSignalgeber = new ArrayList<ObjectRefType>();
        }
        return this.hatSignalgeber;
    }

    /**
     * Gets the value of the fuehrtZuHaltestelle property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getFuehrtZuHaltestelle() {
        return fuehrtZuHaltestelle;
    }

    /**
     * Sets the value of the fuehrtZuHaltestelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setFuehrtZuHaltestelle(ObjectRefType value) {
        this.fuehrtZuHaltestelle = value;
    }

    /**
     * Gets the value of the fuehrtUeberQuerungshilfe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fuehrtUeberQuerungshilfe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuehrtUeberQuerungshilfe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getFuehrtUeberQuerungshilfe() {
        if (fuehrtUeberQuerungshilfe == null) {
            fuehrtUeberQuerungshilfe = new ArrayList<ObjectRefType>();
        }
        return this.fuehrtUeberQuerungshilfe;
    }

}
