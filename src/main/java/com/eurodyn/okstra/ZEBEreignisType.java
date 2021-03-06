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
 * <p>Java class for ZEB_EreignisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZEB_EreignisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Kurzbezeichnung_ZEB_Ereignis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZEB_Ereignis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zeitabschnitt" type="{http://www.okstra.de/okstra/2.018.2}ZeitabschnittPropertyType"/&gt;
 *         &lt;element name="hat_ZEB_Subjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_ZEB_Dokument" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_ZEB_Parameterwert" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="von_ZEB_Projekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZEB_EreignisType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "kurzbezeichnungZEBEreignis",
    "zebEreignis",
    "zeitabschnitt",
    "hatZEBSubjekt",
    "hatZEBDokument",
    "hatZEBParameterwert",
    "vonZEBProjekt"
})
public class ZEBEreignisType
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
    @XmlElement(name = "Kurzbezeichnung_ZEB_Ereignis")
    protected String kurzbezeichnungZEBEreignis;
    @XmlElement(name = "ZEB_Ereignis")
    protected String zebEreignis;
    @XmlElement(name = "Zeitabschnitt", required = true)
    protected ZeitabschnittPropertyType zeitabschnitt;
    @XmlElement(name = "hat_ZEB_Subjekt", required = true)
    protected List<ObjectRefType> hatZEBSubjekt;
    @XmlElement(name = "hat_ZEB_Dokument")
    protected List<ObjectRefType> hatZEBDokument;
    @XmlElement(name = "hat_ZEB_Parameterwert", required = true)
    protected List<ObjectRefType> hatZEBParameterwert;
    @XmlElement(name = "von_ZEB_Projekt")
    protected List<ObjectRefType> vonZEBProjekt;

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
     * Gets the value of the kurzbezeichnungZEBEreignis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurzbezeichnungZEBEreignis() {
        return kurzbezeichnungZEBEreignis;
    }

    /**
     * Sets the value of the kurzbezeichnungZEBEreignis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurzbezeichnungZEBEreignis(String value) {
        this.kurzbezeichnungZEBEreignis = value;
    }

    /**
     * Gets the value of the zebEreignis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEBEreignis() {
        return zebEreignis;
    }

    /**
     * Sets the value of the zebEreignis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEBEreignis(String value) {
        this.zebEreignis = value;
    }

    /**
     * Gets the value of the zeitabschnitt property.
     * 
     * @return
     *     possible object is
     *     {@link ZeitabschnittPropertyType }
     *     
     */
    public ZeitabschnittPropertyType getZeitabschnitt() {
        return zeitabschnitt;
    }

    /**
     * Sets the value of the zeitabschnitt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeitabschnittPropertyType }
     *     
     */
    public void setZeitabschnitt(ZeitabschnittPropertyType value) {
        this.zeitabschnitt = value;
    }

    /**
     * Gets the value of the hatZEBSubjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatZEBSubjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatZEBSubjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatZEBSubjekt() {
        if (hatZEBSubjekt == null) {
            hatZEBSubjekt = new ArrayList<ObjectRefType>();
        }
        return this.hatZEBSubjekt;
    }

    /**
     * Gets the value of the hatZEBDokument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatZEBDokument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatZEBDokument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatZEBDokument() {
        if (hatZEBDokument == null) {
            hatZEBDokument = new ArrayList<ObjectRefType>();
        }
        return this.hatZEBDokument;
    }

    /**
     * Gets the value of the hatZEBParameterwert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatZEBParameterwert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatZEBParameterwert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatZEBParameterwert() {
        if (hatZEBParameterwert == null) {
            hatZEBParameterwert = new ArrayList<ObjectRefType>();
        }
        return this.hatZEBParameterwert;
    }

    /**
     * Gets the value of the vonZEBProjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vonZEBProjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVonZEBProjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getVonZEBProjekt() {
        if (vonZEBProjekt == null) {
            vonZEBProjekt = new ArrayList<ObjectRefType>();
        }
        return this.vonZEBProjekt;
    }

}
