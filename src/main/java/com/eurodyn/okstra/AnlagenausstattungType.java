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
 * <p>Java class for AnlagenausstattungType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnlagenausstattungType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Steuerung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_Datenuebertragungssystem" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Ueberwachung_der_Anlage" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_Art_der_Stromversorgung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_Unterzentrale" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Verkehrsrechnerzentrale" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Datenerfassungseinrichtgen" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_Anzeigesystem" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType"/&gt;
 *         &lt;element name="von_dynam_verkehrsreg_Beschild" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnlagenausstattungType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "hatSteuerung",
    "hatDatenuebertragungssystem",
    "hatUeberwachungDerAnlage",
    "hatArtDerStromversorgung",
    "hatUnterzentrale",
    "hatVerkehrsrechnerzentrale",
    "hatDatenerfassungseinrichtgen",
    "hatAnzeigesystem",
    "vonDynamVerkehrsregBeschild"
})
public class AnlagenausstattungType
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
    @XmlElement(name = "hat_Steuerung", required = true)
    protected List<ObjectRefType> hatSteuerung;
    @XmlElement(name = "hat_Datenuebertragungssystem")
    protected List<ObjectRefType> hatDatenuebertragungssystem;
    @XmlElement(name = "hat_Ueberwachung_der_Anlage", required = true)
    protected List<ObjectRefType> hatUeberwachungDerAnlage;
    @XmlElement(name = "hat_Art_der_Stromversorgung", required = true)
    protected List<ObjectRefType> hatArtDerStromversorgung;
    @XmlElement(name = "hat_Unterzentrale")
    protected List<ObjectRefType> hatUnterzentrale;
    @XmlElement(name = "hat_Verkehrsrechnerzentrale")
    protected List<ObjectRefType> hatVerkehrsrechnerzentrale;
    @XmlElement(name = "hat_Datenerfassungseinrichtgen", required = true)
    protected List<ObjectRefType> hatDatenerfassungseinrichtgen;
    @XmlElement(name = "hat_Anzeigesystem", required = true)
    protected ObjectRefType hatAnzeigesystem;
    @XmlElement(name = "von_dynam_verkehrsreg_Beschild")
    protected List<ObjectRefType> vonDynamVerkehrsregBeschild;

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
     * Gets the value of the hatSteuerung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatSteuerung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatSteuerung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatSteuerung() {
        if (hatSteuerung == null) {
            hatSteuerung = new ArrayList<ObjectRefType>();
        }
        return this.hatSteuerung;
    }

    /**
     * Gets the value of the hatDatenuebertragungssystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatDatenuebertragungssystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatDatenuebertragungssystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatDatenuebertragungssystem() {
        if (hatDatenuebertragungssystem == null) {
            hatDatenuebertragungssystem = new ArrayList<ObjectRefType>();
        }
        return this.hatDatenuebertragungssystem;
    }

    /**
     * Gets the value of the hatUeberwachungDerAnlage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatUeberwachungDerAnlage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatUeberwachungDerAnlage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatUeberwachungDerAnlage() {
        if (hatUeberwachungDerAnlage == null) {
            hatUeberwachungDerAnlage = new ArrayList<ObjectRefType>();
        }
        return this.hatUeberwachungDerAnlage;
    }

    /**
     * Gets the value of the hatArtDerStromversorgung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatArtDerStromversorgung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatArtDerStromversorgung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatArtDerStromversorgung() {
        if (hatArtDerStromversorgung == null) {
            hatArtDerStromversorgung = new ArrayList<ObjectRefType>();
        }
        return this.hatArtDerStromversorgung;
    }

    /**
     * Gets the value of the hatUnterzentrale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatUnterzentrale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatUnterzentrale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatUnterzentrale() {
        if (hatUnterzentrale == null) {
            hatUnterzentrale = new ArrayList<ObjectRefType>();
        }
        return this.hatUnterzentrale;
    }

    /**
     * Gets the value of the hatVerkehrsrechnerzentrale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatVerkehrsrechnerzentrale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatVerkehrsrechnerzentrale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatVerkehrsrechnerzentrale() {
        if (hatVerkehrsrechnerzentrale == null) {
            hatVerkehrsrechnerzentrale = new ArrayList<ObjectRefType>();
        }
        return this.hatVerkehrsrechnerzentrale;
    }

    /**
     * Gets the value of the hatDatenerfassungseinrichtgen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatDatenerfassungseinrichtgen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatDatenerfassungseinrichtgen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatDatenerfassungseinrichtgen() {
        if (hatDatenerfassungseinrichtgen == null) {
            hatDatenerfassungseinrichtgen = new ArrayList<ObjectRefType>();
        }
        return this.hatDatenerfassungseinrichtgen;
    }

    /**
     * Gets the value of the hatAnzeigesystem property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getHatAnzeigesystem() {
        return hatAnzeigesystem;
    }

    /**
     * Sets the value of the hatAnzeigesystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setHatAnzeigesystem(ObjectRefType value) {
        this.hatAnzeigesystem = value;
    }

    /**
     * Gets the value of the vonDynamVerkehrsregBeschild property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vonDynamVerkehrsregBeschild property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVonDynamVerkehrsregBeschild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getVonDynamVerkehrsregBeschild() {
        if (vonDynamVerkehrsregBeschild == null) {
            vonDynamVerkehrsregBeschild = new ArrayList<ObjectRefType>();
        }
        return this.vonDynamVerkehrsregBeschild;
    }

}
