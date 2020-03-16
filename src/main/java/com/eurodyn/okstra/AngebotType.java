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
 * <p>Java class for AngebotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AngebotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Summe_nach_Submission" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}EURO"/&gt;
 *         &lt;element name="Summe_nachgerechnet" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}EURO"/&gt;
 *         &lt;element name="Wertungspunkte" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Wertungssumme_gesamt" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}EURO"/&gt;
 *         &lt;element name="Nachlass" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Nebenangebote_bei_Submission" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl" minOccurs="0"/&gt;
 *         &lt;element name="Nebenangebot_ohne_Hauptangebot" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Nebenangebote_nach_Wertung" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl" minOccurs="0"/&gt;
 *         &lt;element name="Rangplatz_Nachrechnung" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Rangplatz_Zuschlagserteilung" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="von_Firmenkonstrukt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType"/&gt;
 *         &lt;element name="zu_Vergabeverfahren" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AngebotType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "summeNachSubmission",
    "summeNachgerechnet",
    "wertungspunkte",
    "wertungssummeGesamt",
    "nachlass",
    "nebenangeboteBeiSubmission",
    "nebenangebotOhneHauptangebot",
    "nebenangeboteNachWertung",
    "rangplatzNachrechnung",
    "rangplatzZuschlagserteilung",
    "vonFirmenkonstrukt",
    "zuVergabeverfahren"
})
public class AngebotType
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
    @XmlElement(name = "Summe_nach_Submission", required = true)
    protected EURO summeNachSubmission;
    @XmlElement(name = "Summe_nachgerechnet", required = true)
    protected EURO summeNachgerechnet;
    @XmlElement(name = "Wertungspunkte")
    protected BigInteger wertungspunkte;
    @XmlElement(name = "Wertungssumme_gesamt", required = true)
    protected EURO wertungssummeGesamt;
    @XmlElement(name = "Nachlass")
    protected Double nachlass;
    @XmlElement(name = "Nebenangebote_bei_Submission")
    protected BigInteger nebenangeboteBeiSubmission;
    @XmlElement(name = "Nebenangebot_ohne_Hauptangebot")
    protected boolean nebenangebotOhneHauptangebot;
    @XmlElement(name = "Nebenangebote_nach_Wertung")
    protected BigInteger nebenangeboteNachWertung;
    @XmlElement(name = "Rangplatz_Nachrechnung", required = true)
    protected BigInteger rangplatzNachrechnung;
    @XmlElement(name = "Rangplatz_Zuschlagserteilung", required = true)
    protected BigInteger rangplatzZuschlagserteilung;
    @XmlElement(name = "von_Firmenkonstrukt", required = true)
    protected ObjectRefType vonFirmenkonstrukt;
    @XmlElement(name = "zu_Vergabeverfahren")
    protected ObjectRefType zuVergabeverfahren;

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
     * Gets the value of the summeNachSubmission property.
     * 
     * @return
     *     possible object is
     *     {@link EURO }
     *     
     */
    public EURO getSummeNachSubmission() {
        return summeNachSubmission;
    }

    /**
     * Sets the value of the summeNachSubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EURO }
     *     
     */
    public void setSummeNachSubmission(EURO value) {
        this.summeNachSubmission = value;
    }

    /**
     * Gets the value of the summeNachgerechnet property.
     * 
     * @return
     *     possible object is
     *     {@link EURO }
     *     
     */
    public EURO getSummeNachgerechnet() {
        return summeNachgerechnet;
    }

    /**
     * Sets the value of the summeNachgerechnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link EURO }
     *     
     */
    public void setSummeNachgerechnet(EURO value) {
        this.summeNachgerechnet = value;
    }

    /**
     * Gets the value of the wertungspunkte property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWertungspunkte() {
        return wertungspunkte;
    }

    /**
     * Sets the value of the wertungspunkte property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWertungspunkte(BigInteger value) {
        this.wertungspunkte = value;
    }

    /**
     * Gets the value of the wertungssummeGesamt property.
     * 
     * @return
     *     possible object is
     *     {@link EURO }
     *     
     */
    public EURO getWertungssummeGesamt() {
        return wertungssummeGesamt;
    }

    /**
     * Sets the value of the wertungssummeGesamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EURO }
     *     
     */
    public void setWertungssummeGesamt(EURO value) {
        this.wertungssummeGesamt = value;
    }

    /**
     * Gets the value of the nachlass property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNachlass() {
        return nachlass;
    }

    /**
     * Sets the value of the nachlass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNachlass(Double value) {
        this.nachlass = value;
    }

    /**
     * Gets the value of the nebenangeboteBeiSubmission property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNebenangeboteBeiSubmission() {
        return nebenangeboteBeiSubmission;
    }

    /**
     * Sets the value of the nebenangeboteBeiSubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNebenangeboteBeiSubmission(BigInteger value) {
        this.nebenangeboteBeiSubmission = value;
    }

    /**
     * Gets the value of the nebenangebotOhneHauptangebot property.
     * 
     */
    public boolean isNebenangebotOhneHauptangebot() {
        return nebenangebotOhneHauptangebot;
    }

    /**
     * Sets the value of the nebenangebotOhneHauptangebot property.
     * 
     */
    public void setNebenangebotOhneHauptangebot(boolean value) {
        this.nebenangebotOhneHauptangebot = value;
    }

    /**
     * Gets the value of the nebenangeboteNachWertung property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNebenangeboteNachWertung() {
        return nebenangeboteNachWertung;
    }

    /**
     * Sets the value of the nebenangeboteNachWertung property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNebenangeboteNachWertung(BigInteger value) {
        this.nebenangeboteNachWertung = value;
    }

    /**
     * Gets the value of the rangplatzNachrechnung property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRangplatzNachrechnung() {
        return rangplatzNachrechnung;
    }

    /**
     * Sets the value of the rangplatzNachrechnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRangplatzNachrechnung(BigInteger value) {
        this.rangplatzNachrechnung = value;
    }

    /**
     * Gets the value of the rangplatzZuschlagserteilung property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRangplatzZuschlagserteilung() {
        return rangplatzZuschlagserteilung;
    }

    /**
     * Sets the value of the rangplatzZuschlagserteilung property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRangplatzZuschlagserteilung(BigInteger value) {
        this.rangplatzZuschlagserteilung = value;
    }

    /**
     * Gets the value of the vonFirmenkonstrukt property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getVonFirmenkonstrukt() {
        return vonFirmenkonstrukt;
    }

    /**
     * Sets the value of the vonFirmenkonstrukt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setVonFirmenkonstrukt(ObjectRefType value) {
        this.vonFirmenkonstrukt = value;
    }

    /**
     * Gets the value of the zuVergabeverfahren property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getZuVergabeverfahren() {
        return zuVergabeverfahren;
    }

    /**
     * Sets the value of the zuVergabeverfahren property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setZuVergabeverfahren(ObjectRefType value) {
        this.zuVergabeverfahren = value;
    }

}
