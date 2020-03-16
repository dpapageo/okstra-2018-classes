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
 * <p>Java class for TunnelsicherheitsinfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TunnelsicherheitsinfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zufahrten_im_Tunnel" type="{http://www.okstra.de/okstra/2.018.2}Anzahl_unscharfPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Abfahrten_im_Tunnel" type="{http://www.okstra.de/okstra/2.018.2}Anzahl_unscharfPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Mittelstreifenueberfahrten_vor_Portal" type="{http://www.okstra.de/okstra/2.018.2}Anzahl_unscharfPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Abstand_Mittelstreifenueberfahrten_vor_Portal" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Ueberfahrten_im_Tunnel" type="{http://www.okstra.de/okstra/2.018.2}Anzahl_unscharfPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Abstand_Ueberfahrten_im_Tunnel" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Seitenstreifen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Pannenbuchten" type="{http://www.okstra.de/okstra/2.018.2}Anzahl_unscharfPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Abstand_Pannenbuchten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Wendebuchten" type="{http://www.okstra.de/okstra/2.018.2}Anzahl_unscharfPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Abstand_Wendebuchten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Notausgaenge" type="{http://www.okstra.de/okstra/2.018.2}Anzahl_unscharfPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Abstand_Notausgaenge" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Art_Notausgaenge" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Notgehwege" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Bordhoehe_Notgehwege" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Hoehenkontrolle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Leiteinrichtungen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Art_Leiteinrichtungen" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Notrufstationen" type="{http://www.okstra.de/okstra/2.018.2}Anzahl_unscharfPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Abstand_Notrufstationen" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Videoueberwachung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Bildauswertung_Videoueberwachung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Funk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Funkmast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Uebertragungsverfahren_BOS_Funk" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Uebertragungsverfahren_Betriebsfunk" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Verkehrsfunk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Mobilfunk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Lautsprecher" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Brandmeldeanlage" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Loeschwasserentnahmestellen" type="{http://www.okstra.de/okstra/2.018.2}Anzahl_unscharfPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Abstand_Loeschwasserentnahmestellen" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Lage_Loeschwasserentnahmestellen" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Versorgungsart_Loeschwasserentnahmestelle" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Brandbekaempfungsanlage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Fluchtwegkennzeichnung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Orientierungsbeleuchtung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Zulaessigkeit_Guetertransport_ADR" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Bemerkung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TunnelsicherheitsinfoType", propOrder = {
    "zufahrtenImTunnel",
    "abfahrtenImTunnel",
    "mittelstreifenueberfahrtenVorPortal",
    "abstandMittelstreifenueberfahrtenVorPortal",
    "ueberfahrtenImTunnel",
    "abstandUeberfahrtenImTunnel",
    "seitenstreifen",
    "pannenbuchten",
    "abstandPannenbuchten",
    "wendebuchten",
    "abstandWendebuchten",
    "notausgaenge",
    "abstandNotausgaenge",
    "artNotausgaenge",
    "notgehwege",
    "bordhoeheNotgehwege",
    "hoehenkontrolle",
    "leiteinrichtungen",
    "artLeiteinrichtungen",
    "notrufstationen",
    "abstandNotrufstationen",
    "videoueberwachung",
    "bildauswertungVideoueberwachung",
    "funk",
    "funkmast",
    "uebertragungsverfahrenBOSFunk",
    "uebertragungsverfahrenBetriebsfunk",
    "verkehrsfunk",
    "mobilfunk",
    "lautsprecher",
    "brandmeldeanlage",
    "loeschwasserentnahmestellen",
    "abstandLoeschwasserentnahmestellen",
    "lageLoeschwasserentnahmestellen",
    "versorgungsartLoeschwasserentnahmestelle",
    "brandbekaempfungsanlage",
    "fluchtwegkennzeichnung",
    "orientierungsbeleuchtung",
    "zulaessigkeitGuetertransportADR",
    "bemerkung"
})
public class TunnelsicherheitsinfoType {

    @XmlElement(name = "Zufahrten_im_Tunnel")
    protected AnzahlUnscharfPropertyType zufahrtenImTunnel;
    @XmlElement(name = "Abfahrten_im_Tunnel")
    protected AnzahlUnscharfPropertyType abfahrtenImTunnel;
    @XmlElement(name = "Mittelstreifenueberfahrten_vor_Portal")
    protected AnzahlUnscharfPropertyType mittelstreifenueberfahrtenVorPortal;
    @XmlElement(name = "Abstand_Mittelstreifenueberfahrten_vor_Portal")
    protected Meter abstandMittelstreifenueberfahrtenVorPortal;
    @XmlElement(name = "Ueberfahrten_im_Tunnel")
    protected AnzahlUnscharfPropertyType ueberfahrtenImTunnel;
    @XmlElement(name = "Abstand_Ueberfahrten_im_Tunnel")
    protected Meter abstandUeberfahrtenImTunnel;
    @XmlElement(name = "Seitenstreifen")
    protected Boolean seitenstreifen;
    @XmlElement(name = "Pannenbuchten")
    protected AnzahlUnscharfPropertyType pannenbuchten;
    @XmlElement(name = "Abstand_Pannenbuchten")
    protected Meter abstandPannenbuchten;
    @XmlElement(name = "Wendebuchten")
    protected AnzahlUnscharfPropertyType wendebuchten;
    @XmlElement(name = "Abstand_Wendebuchten")
    protected Meter abstandWendebuchten;
    @XmlElement(name = "Notausgaenge")
    protected AnzahlUnscharfPropertyType notausgaenge;
    @XmlElement(name = "Abstand_Notausgaenge")
    protected Meter abstandNotausgaenge;
    @XmlElement(name = "Art_Notausgaenge")
    protected List<KeyValuePropertyType> artNotausgaenge;
    @XmlElement(name = "Notgehwege")
    protected Boolean notgehwege;
    @XmlElement(name = "Bordhoehe_Notgehwege")
    protected Meter bordhoeheNotgehwege;
    @XmlElement(name = "Hoehenkontrolle")
    protected Boolean hoehenkontrolle;
    @XmlElement(name = "Leiteinrichtungen")
    protected Boolean leiteinrichtungen;
    @XmlElement(name = "Art_Leiteinrichtungen")
    protected List<KeyValuePropertyType> artLeiteinrichtungen;
    @XmlElement(name = "Notrufstationen")
    protected AnzahlUnscharfPropertyType notrufstationen;
    @XmlElement(name = "Abstand_Notrufstationen")
    protected Meter abstandNotrufstationen;
    @XmlElement(name = "Videoueberwachung")
    protected Boolean videoueberwachung;
    @XmlElement(name = "Bildauswertung_Videoueberwachung")
    protected List<KeyValuePropertyType> bildauswertungVideoueberwachung;
    @XmlElement(name = "Funk")
    protected Boolean funk;
    @XmlElement(name = "Funkmast")
    protected Boolean funkmast;
    @XmlElement(name = "Uebertragungsverfahren_BOS_Funk")
    protected KeyValuePropertyType uebertragungsverfahrenBOSFunk;
    @XmlElement(name = "Uebertragungsverfahren_Betriebsfunk")
    protected KeyValuePropertyType uebertragungsverfahrenBetriebsfunk;
    @XmlElement(name = "Verkehrsfunk")
    protected Boolean verkehrsfunk;
    @XmlElement(name = "Mobilfunk")
    protected Boolean mobilfunk;
    @XmlElement(name = "Lautsprecher")
    protected Boolean lautsprecher;
    @XmlElement(name = "Brandmeldeanlage")
    protected List<KeyValuePropertyType> brandmeldeanlage;
    @XmlElement(name = "Loeschwasserentnahmestellen")
    protected AnzahlUnscharfPropertyType loeschwasserentnahmestellen;
    @XmlElement(name = "Abstand_Loeschwasserentnahmestellen")
    protected Meter abstandLoeschwasserentnahmestellen;
    @XmlElement(name = "Lage_Loeschwasserentnahmestellen")
    protected List<KeyValuePropertyType> lageLoeschwasserentnahmestellen;
    @XmlElement(name = "Versorgungsart_Loeschwasserentnahmestelle")
    protected List<KeyValuePropertyType> versorgungsartLoeschwasserentnahmestelle;
    @XmlElement(name = "Brandbekaempfungsanlage")
    protected Boolean brandbekaempfungsanlage;
    @XmlElement(name = "Fluchtwegkennzeichnung")
    protected Boolean fluchtwegkennzeichnung;
    @XmlElement(name = "Orientierungsbeleuchtung")
    protected Boolean orientierungsbeleuchtung;
    @XmlElement(name = "Zulaessigkeit_Guetertransport_ADR")
    protected KeyValuePropertyType zulaessigkeitGuetertransportADR;
    @XmlElement(name = "Bemerkung")
    protected String bemerkung;

    /**
     * Gets the value of the zufahrtenImTunnel property.
     * 
     * @return
     *     possible object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public AnzahlUnscharfPropertyType getZufahrtenImTunnel() {
        return zufahrtenImTunnel;
    }

    /**
     * Sets the value of the zufahrtenImTunnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public void setZufahrtenImTunnel(AnzahlUnscharfPropertyType value) {
        this.zufahrtenImTunnel = value;
    }

    /**
     * Gets the value of the abfahrtenImTunnel property.
     * 
     * @return
     *     possible object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public AnzahlUnscharfPropertyType getAbfahrtenImTunnel() {
        return abfahrtenImTunnel;
    }

    /**
     * Sets the value of the abfahrtenImTunnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public void setAbfahrtenImTunnel(AnzahlUnscharfPropertyType value) {
        this.abfahrtenImTunnel = value;
    }

    /**
     * Gets the value of the mittelstreifenueberfahrtenVorPortal property.
     * 
     * @return
     *     possible object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public AnzahlUnscharfPropertyType getMittelstreifenueberfahrtenVorPortal() {
        return mittelstreifenueberfahrtenVorPortal;
    }

    /**
     * Sets the value of the mittelstreifenueberfahrtenVorPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public void setMittelstreifenueberfahrtenVorPortal(AnzahlUnscharfPropertyType value) {
        this.mittelstreifenueberfahrtenVorPortal = value;
    }

    /**
     * Gets the value of the abstandMittelstreifenueberfahrtenVorPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getAbstandMittelstreifenueberfahrtenVorPortal() {
        return abstandMittelstreifenueberfahrtenVorPortal;
    }

    /**
     * Sets the value of the abstandMittelstreifenueberfahrtenVorPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setAbstandMittelstreifenueberfahrtenVorPortal(Meter value) {
        this.abstandMittelstreifenueberfahrtenVorPortal = value;
    }

    /**
     * Gets the value of the ueberfahrtenImTunnel property.
     * 
     * @return
     *     possible object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public AnzahlUnscharfPropertyType getUeberfahrtenImTunnel() {
        return ueberfahrtenImTunnel;
    }

    /**
     * Sets the value of the ueberfahrtenImTunnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public void setUeberfahrtenImTunnel(AnzahlUnscharfPropertyType value) {
        this.ueberfahrtenImTunnel = value;
    }

    /**
     * Gets the value of the abstandUeberfahrtenImTunnel property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getAbstandUeberfahrtenImTunnel() {
        return abstandUeberfahrtenImTunnel;
    }

    /**
     * Sets the value of the abstandUeberfahrtenImTunnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setAbstandUeberfahrtenImTunnel(Meter value) {
        this.abstandUeberfahrtenImTunnel = value;
    }

    /**
     * Gets the value of the seitenstreifen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeitenstreifen() {
        return seitenstreifen;
    }

    /**
     * Sets the value of the seitenstreifen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeitenstreifen(Boolean value) {
        this.seitenstreifen = value;
    }

    /**
     * Gets the value of the pannenbuchten property.
     * 
     * @return
     *     possible object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public AnzahlUnscharfPropertyType getPannenbuchten() {
        return pannenbuchten;
    }

    /**
     * Sets the value of the pannenbuchten property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public void setPannenbuchten(AnzahlUnscharfPropertyType value) {
        this.pannenbuchten = value;
    }

    /**
     * Gets the value of the abstandPannenbuchten property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getAbstandPannenbuchten() {
        return abstandPannenbuchten;
    }

    /**
     * Sets the value of the abstandPannenbuchten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setAbstandPannenbuchten(Meter value) {
        this.abstandPannenbuchten = value;
    }

    /**
     * Gets the value of the wendebuchten property.
     * 
     * @return
     *     possible object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public AnzahlUnscharfPropertyType getWendebuchten() {
        return wendebuchten;
    }

    /**
     * Sets the value of the wendebuchten property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public void setWendebuchten(AnzahlUnscharfPropertyType value) {
        this.wendebuchten = value;
    }

    /**
     * Gets the value of the abstandWendebuchten property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getAbstandWendebuchten() {
        return abstandWendebuchten;
    }

    /**
     * Sets the value of the abstandWendebuchten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setAbstandWendebuchten(Meter value) {
        this.abstandWendebuchten = value;
    }

    /**
     * Gets the value of the notausgaenge property.
     * 
     * @return
     *     possible object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public AnzahlUnscharfPropertyType getNotausgaenge() {
        return notausgaenge;
    }

    /**
     * Sets the value of the notausgaenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public void setNotausgaenge(AnzahlUnscharfPropertyType value) {
        this.notausgaenge = value;
    }

    /**
     * Gets the value of the abstandNotausgaenge property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getAbstandNotausgaenge() {
        return abstandNotausgaenge;
    }

    /**
     * Sets the value of the abstandNotausgaenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setAbstandNotausgaenge(Meter value) {
        this.abstandNotausgaenge = value;
    }

    /**
     * Gets the value of the artNotausgaenge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artNotausgaenge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtNotausgaenge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getArtNotausgaenge() {
        if (artNotausgaenge == null) {
            artNotausgaenge = new ArrayList<KeyValuePropertyType>();
        }
        return this.artNotausgaenge;
    }

    /**
     * Gets the value of the notgehwege property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotgehwege() {
        return notgehwege;
    }

    /**
     * Sets the value of the notgehwege property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotgehwege(Boolean value) {
        this.notgehwege = value;
    }

    /**
     * Gets the value of the bordhoeheNotgehwege property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getBordhoeheNotgehwege() {
        return bordhoeheNotgehwege;
    }

    /**
     * Sets the value of the bordhoeheNotgehwege property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setBordhoeheNotgehwege(Meter value) {
        this.bordhoeheNotgehwege = value;
    }

    /**
     * Gets the value of the hoehenkontrolle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoehenkontrolle() {
        return hoehenkontrolle;
    }

    /**
     * Sets the value of the hoehenkontrolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoehenkontrolle(Boolean value) {
        this.hoehenkontrolle = value;
    }

    /**
     * Gets the value of the leiteinrichtungen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeiteinrichtungen() {
        return leiteinrichtungen;
    }

    /**
     * Sets the value of the leiteinrichtungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeiteinrichtungen(Boolean value) {
        this.leiteinrichtungen = value;
    }

    /**
     * Gets the value of the artLeiteinrichtungen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artLeiteinrichtungen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtLeiteinrichtungen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getArtLeiteinrichtungen() {
        if (artLeiteinrichtungen == null) {
            artLeiteinrichtungen = new ArrayList<KeyValuePropertyType>();
        }
        return this.artLeiteinrichtungen;
    }

    /**
     * Gets the value of the notrufstationen property.
     * 
     * @return
     *     possible object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public AnzahlUnscharfPropertyType getNotrufstationen() {
        return notrufstationen;
    }

    /**
     * Sets the value of the notrufstationen property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public void setNotrufstationen(AnzahlUnscharfPropertyType value) {
        this.notrufstationen = value;
    }

    /**
     * Gets the value of the abstandNotrufstationen property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getAbstandNotrufstationen() {
        return abstandNotrufstationen;
    }

    /**
     * Sets the value of the abstandNotrufstationen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setAbstandNotrufstationen(Meter value) {
        this.abstandNotrufstationen = value;
    }

    /**
     * Gets the value of the videoueberwachung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVideoueberwachung() {
        return videoueberwachung;
    }

    /**
     * Sets the value of the videoueberwachung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVideoueberwachung(Boolean value) {
        this.videoueberwachung = value;
    }

    /**
     * Gets the value of the bildauswertungVideoueberwachung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bildauswertungVideoueberwachung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBildauswertungVideoueberwachung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getBildauswertungVideoueberwachung() {
        if (bildauswertungVideoueberwachung == null) {
            bildauswertungVideoueberwachung = new ArrayList<KeyValuePropertyType>();
        }
        return this.bildauswertungVideoueberwachung;
    }

    /**
     * Gets the value of the funk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFunk() {
        return funk;
    }

    /**
     * Sets the value of the funk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFunk(Boolean value) {
        this.funk = value;
    }

    /**
     * Gets the value of the funkmast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFunkmast() {
        return funkmast;
    }

    /**
     * Sets the value of the funkmast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFunkmast(Boolean value) {
        this.funkmast = value;
    }

    /**
     * Gets the value of the uebertragungsverfahrenBOSFunk property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getUebertragungsverfahrenBOSFunk() {
        return uebertragungsverfahrenBOSFunk;
    }

    /**
     * Sets the value of the uebertragungsverfahrenBOSFunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setUebertragungsverfahrenBOSFunk(KeyValuePropertyType value) {
        this.uebertragungsverfahrenBOSFunk = value;
    }

    /**
     * Gets the value of the uebertragungsverfahrenBetriebsfunk property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getUebertragungsverfahrenBetriebsfunk() {
        return uebertragungsverfahrenBetriebsfunk;
    }

    /**
     * Sets the value of the uebertragungsverfahrenBetriebsfunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setUebertragungsverfahrenBetriebsfunk(KeyValuePropertyType value) {
        this.uebertragungsverfahrenBetriebsfunk = value;
    }

    /**
     * Gets the value of the verkehrsfunk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerkehrsfunk() {
        return verkehrsfunk;
    }

    /**
     * Sets the value of the verkehrsfunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerkehrsfunk(Boolean value) {
        this.verkehrsfunk = value;
    }

    /**
     * Gets the value of the mobilfunk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobilfunk() {
        return mobilfunk;
    }

    /**
     * Sets the value of the mobilfunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobilfunk(Boolean value) {
        this.mobilfunk = value;
    }

    /**
     * Gets the value of the lautsprecher property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLautsprecher() {
        return lautsprecher;
    }

    /**
     * Sets the value of the lautsprecher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLautsprecher(Boolean value) {
        this.lautsprecher = value;
    }

    /**
     * Gets the value of the brandmeldeanlage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandmeldeanlage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandmeldeanlage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getBrandmeldeanlage() {
        if (brandmeldeanlage == null) {
            brandmeldeanlage = new ArrayList<KeyValuePropertyType>();
        }
        return this.brandmeldeanlage;
    }

    /**
     * Gets the value of the loeschwasserentnahmestellen property.
     * 
     * @return
     *     possible object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public AnzahlUnscharfPropertyType getLoeschwasserentnahmestellen() {
        return loeschwasserentnahmestellen;
    }

    /**
     * Sets the value of the loeschwasserentnahmestellen property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnzahlUnscharfPropertyType }
     *     
     */
    public void setLoeschwasserentnahmestellen(AnzahlUnscharfPropertyType value) {
        this.loeschwasserentnahmestellen = value;
    }

    /**
     * Gets the value of the abstandLoeschwasserentnahmestellen property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getAbstandLoeschwasserentnahmestellen() {
        return abstandLoeschwasserentnahmestellen;
    }

    /**
     * Sets the value of the abstandLoeschwasserentnahmestellen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setAbstandLoeschwasserentnahmestellen(Meter value) {
        this.abstandLoeschwasserentnahmestellen = value;
    }

    /**
     * Gets the value of the lageLoeschwasserentnahmestellen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lageLoeschwasserentnahmestellen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLageLoeschwasserentnahmestellen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getLageLoeschwasserentnahmestellen() {
        if (lageLoeschwasserentnahmestellen == null) {
            lageLoeschwasserentnahmestellen = new ArrayList<KeyValuePropertyType>();
        }
        return this.lageLoeschwasserentnahmestellen;
    }

    /**
     * Gets the value of the versorgungsartLoeschwasserentnahmestelle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versorgungsartLoeschwasserentnahmestelle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersorgungsartLoeschwasserentnahmestelle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getVersorgungsartLoeschwasserentnahmestelle() {
        if (versorgungsartLoeschwasserentnahmestelle == null) {
            versorgungsartLoeschwasserentnahmestelle = new ArrayList<KeyValuePropertyType>();
        }
        return this.versorgungsartLoeschwasserentnahmestelle;
    }

    /**
     * Gets the value of the brandbekaempfungsanlage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrandbekaempfungsanlage() {
        return brandbekaempfungsanlage;
    }

    /**
     * Sets the value of the brandbekaempfungsanlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrandbekaempfungsanlage(Boolean value) {
        this.brandbekaempfungsanlage = value;
    }

    /**
     * Gets the value of the fluchtwegkennzeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFluchtwegkennzeichnung() {
        return fluchtwegkennzeichnung;
    }

    /**
     * Sets the value of the fluchtwegkennzeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFluchtwegkennzeichnung(Boolean value) {
        this.fluchtwegkennzeichnung = value;
    }

    /**
     * Gets the value of the orientierungsbeleuchtung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrientierungsbeleuchtung() {
        return orientierungsbeleuchtung;
    }

    /**
     * Sets the value of the orientierungsbeleuchtung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrientierungsbeleuchtung(Boolean value) {
        this.orientierungsbeleuchtung = value;
    }

    /**
     * Gets the value of the zulaessigkeitGuetertransportADR property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getZulaessigkeitGuetertransportADR() {
        return zulaessigkeitGuetertransportADR;
    }

    /**
     * Sets the value of the zulaessigkeitGuetertransportADR property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setZulaessigkeitGuetertransportADR(KeyValuePropertyType value) {
        this.zulaessigkeitGuetertransportADR = value;
    }

    /**
     * Gets the value of the bemerkung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the value of the bemerkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBemerkung(String value) {
        this.bemerkung = value;
    }

}
