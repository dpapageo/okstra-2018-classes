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
 * <p>Java class for ReferenzstationspunktType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenzstationspunktType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Punktkennung" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="gueltig_von" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="gueltig_bis" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="hat_Vorgaenger_hist_Objekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="hat_Nachfolger_hist_Objekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="erzeugt_von_Ereignis" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="geloescht_von_Ereignis" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="hat_Objekt_ID" type="{http://www.okstra.de/okstra/2.018.2}Objekt_IDPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name_Lage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interne_Bemerkungen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nutzerspezifische_Bemerkungen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="letzte_oertliche_Ueberpruefung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Befund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="historische_Unterlagen" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Punktvermarkung" type="{http://www.okstra.de/okstra/2.018.2}PunktvermarkungPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="liegt_in_Bundesland" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ist_Grenzpunkt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_weiteren_Punkt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ist_weiterer_Punkt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Skizze" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Punktort" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="hat_Hoehe" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Funktion_in_einer_Punktgruppe" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Zeitraum_permanente_Messungen" type="{http://www.okstra.de/okstra/2.018.2}ZeitraumPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Offset_N_L1" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Offset_E_L1" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Offset_H_L1" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Offset_N_L2" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Offset_E_L2" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="Offset_H_L2" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Meter" minOccurs="0"/&gt;
 *         &lt;element name="ISDN_Nummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Funkfrequenz" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Megahertz" minOccurs="0"/&gt;
 *         &lt;element name="PCV_L1" type="{http://www.okstra.de/okstra/2.018.2}PCVPropertyType" maxOccurs="72" minOccurs="0"/&gt;
 *         &lt;element name="PCV_L2" type="{http://www.okstra.de/okstra/2.018.2}PCVPropertyType" maxOccurs="72" minOccurs="0"/&gt;
 *         &lt;element name="hat_GPS_Empfaenger" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="hat_GPS_Antenne" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenzstationspunktType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "punktkennung",
    "gueltigVon",
    "gueltigBis",
    "hatVorgaengerHistObjekt",
    "hatNachfolgerHistObjekt",
    "erzeugtVonEreignis",
    "geloeschtVonEreignis",
    "hatObjektID",
    "nameLage",
    "interneBemerkungen",
    "nutzerspezifischeBemerkungen",
    "letzteOertlicheUeberpruefung",
    "befund",
    "historischeUnterlagen",
    "hatPunktvermarkung",
    "liegtInBundesland",
    "istGrenzpunkt",
    "hatWeiterenPunkt",
    "istWeitererPunkt",
    "hatSkizze",
    "hatPunktort",
    "hatHoehe",
    "funktionInEinerPunktgruppe",
    "zeitraumPermanenteMessungen",
    "offsetNL1",
    "offsetEL1",
    "offsetHL1",
    "offsetNL2",
    "offsetEL2",
    "offsetHL2",
    "isdnNummer",
    "funkfrequenz",
    "pcvl1",
    "pcvl2",
    "hatGPSEmpfaenger",
    "hatGPSAntenne"
})
public class ReferenzstationspunktType
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
    @XmlElement(name = "Punktkennung", required = true)
    protected BigInteger punktkennung;
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
    @XmlElement(name = "hat_Objekt_ID")
    protected List<ObjektIDPropertyType> hatObjektID;
    @XmlElement(name = "Name_Lage")
    protected String nameLage;
    @XmlElement(name = "interne_Bemerkungen")
    protected String interneBemerkungen;
    @XmlElement(name = "Nutzerspezifische_Bemerkungen")
    protected String nutzerspezifischeBemerkungen;
    @XmlElement(name = "letzte_oertliche_Ueberpruefung")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar letzteOertlicheUeberpruefung;
    @XmlElement(name = "Befund")
    protected String befund;
    @XmlElement(name = "historische_Unterlagen")
    protected List<String> historischeUnterlagen;
    @XmlElement(name = "hat_Punktvermarkung")
    protected PunktvermarkungPropertyType hatPunktvermarkung;
    @XmlElement(name = "liegt_in_Bundesland")
    protected List<ObjectRefType> liegtInBundesland;
    @XmlElement(name = "ist_Grenzpunkt")
    protected List<ObjectRefType> istGrenzpunkt;
    @XmlElement(name = "hat_weiteren_Punkt")
    protected List<ObjectRefType> hatWeiterenPunkt;
    @XmlElement(name = "ist_weiterer_Punkt")
    protected List<ObjectRefType> istWeitererPunkt;
    @XmlElement(name = "hat_Skizze")
    protected List<ObjectRefType> hatSkizze;
    @XmlElement(name = "hat_Punktort", required = true)
    protected List<ObjectRefType> hatPunktort;
    @XmlElement(name = "hat_Hoehe")
    protected List<ObjectRefType> hatHoehe;
    @XmlElement(name = "Funktion_in_einer_Punktgruppe")
    protected KeyValuePropertyType funktionInEinerPunktgruppe;
    @XmlElement(name = "Zeitraum_permanente_Messungen")
    protected ZeitraumPropertyType zeitraumPermanenteMessungen;
    @XmlElement(name = "Offset_N_L1")
    protected Meter offsetNL1;
    @XmlElement(name = "Offset_E_L1")
    protected Meter offsetEL1;
    @XmlElement(name = "Offset_H_L1")
    protected Meter offsetHL1;
    @XmlElement(name = "Offset_N_L2")
    protected Meter offsetNL2;
    @XmlElement(name = "Offset_E_L2")
    protected Meter offsetEL2;
    @XmlElement(name = "Offset_H_L2")
    protected Meter offsetHL2;
    @XmlElement(name = "ISDN_Nummer")
    protected String isdnNummer;
    @XmlElement(name = "Funkfrequenz")
    protected Megahertz funkfrequenz;
    @XmlElement(name = "PCV_L1")
    protected List<PCVPropertyType> pcvl1;
    @XmlElement(name = "PCV_L2")
    protected List<PCVPropertyType> pcvl2;
    @XmlElement(name = "hat_GPS_Empfaenger")
    protected ObjectRefType hatGPSEmpfaenger;
    @XmlElement(name = "hat_GPS_Antenne")
    protected ObjectRefType hatGPSAntenne;

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
     * Gets the value of the punktkennung property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPunktkennung() {
        return punktkennung;
    }

    /**
     * Sets the value of the punktkennung property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPunktkennung(BigInteger value) {
        this.punktkennung = value;
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
     * Gets the value of the hatObjektID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatObjektID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatObjektID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjektIDPropertyType }
     * 
     * 
     */
    public List<ObjektIDPropertyType> getHatObjektID() {
        if (hatObjektID == null) {
            hatObjektID = new ArrayList<ObjektIDPropertyType>();
        }
        return this.hatObjektID;
    }

    /**
     * Gets the value of the nameLage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLage() {
        return nameLage;
    }

    /**
     * Sets the value of the nameLage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLage(String value) {
        this.nameLage = value;
    }

    /**
     * Gets the value of the interneBemerkungen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterneBemerkungen() {
        return interneBemerkungen;
    }

    /**
     * Sets the value of the interneBemerkungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterneBemerkungen(String value) {
        this.interneBemerkungen = value;
    }

    /**
     * Gets the value of the nutzerspezifischeBemerkungen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutzerspezifischeBemerkungen() {
        return nutzerspezifischeBemerkungen;
    }

    /**
     * Sets the value of the nutzerspezifischeBemerkungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutzerspezifischeBemerkungen(String value) {
        this.nutzerspezifischeBemerkungen = value;
    }

    /**
     * Gets the value of the letzteOertlicheUeberpruefung property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLetzteOertlicheUeberpruefung() {
        return letzteOertlicheUeberpruefung;
    }

    /**
     * Sets the value of the letzteOertlicheUeberpruefung property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLetzteOertlicheUeberpruefung(XMLGregorianCalendar value) {
        this.letzteOertlicheUeberpruefung = value;
    }

    /**
     * Gets the value of the befund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBefund() {
        return befund;
    }

    /**
     * Sets the value of the befund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBefund(String value) {
        this.befund = value;
    }

    /**
     * Gets the value of the historischeUnterlagen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historischeUnterlagen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistorischeUnterlagen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHistorischeUnterlagen() {
        if (historischeUnterlagen == null) {
            historischeUnterlagen = new ArrayList<String>();
        }
        return this.historischeUnterlagen;
    }

    /**
     * Gets the value of the hatPunktvermarkung property.
     * 
     * @return
     *     possible object is
     *     {@link PunktvermarkungPropertyType }
     *     
     */
    public PunktvermarkungPropertyType getHatPunktvermarkung() {
        return hatPunktvermarkung;
    }

    /**
     * Sets the value of the hatPunktvermarkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link PunktvermarkungPropertyType }
     *     
     */
    public void setHatPunktvermarkung(PunktvermarkungPropertyType value) {
        this.hatPunktvermarkung = value;
    }

    /**
     * Gets the value of the liegtInBundesland property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liegtInBundesland property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiegtInBundesland().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getLiegtInBundesland() {
        if (liegtInBundesland == null) {
            liegtInBundesland = new ArrayList<ObjectRefType>();
        }
        return this.liegtInBundesland;
    }

    /**
     * Gets the value of the istGrenzpunkt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the istGrenzpunkt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIstGrenzpunkt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getIstGrenzpunkt() {
        if (istGrenzpunkt == null) {
            istGrenzpunkt = new ArrayList<ObjectRefType>();
        }
        return this.istGrenzpunkt;
    }

    /**
     * Gets the value of the hatWeiterenPunkt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatWeiterenPunkt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatWeiterenPunkt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatWeiterenPunkt() {
        if (hatWeiterenPunkt == null) {
            hatWeiterenPunkt = new ArrayList<ObjectRefType>();
        }
        return this.hatWeiterenPunkt;
    }

    /**
     * Gets the value of the istWeitererPunkt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the istWeitererPunkt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIstWeitererPunkt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getIstWeitererPunkt() {
        if (istWeitererPunkt == null) {
            istWeitererPunkt = new ArrayList<ObjectRefType>();
        }
        return this.istWeitererPunkt;
    }

    /**
     * Gets the value of the hatSkizze property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatSkizze property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatSkizze().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatSkizze() {
        if (hatSkizze == null) {
            hatSkizze = new ArrayList<ObjectRefType>();
        }
        return this.hatSkizze;
    }

    /**
     * Gets the value of the hatPunktort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatPunktort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatPunktort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatPunktort() {
        if (hatPunktort == null) {
            hatPunktort = new ArrayList<ObjectRefType>();
        }
        return this.hatPunktort;
    }

    /**
     * Gets the value of the hatHoehe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatHoehe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatHoehe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatHoehe() {
        if (hatHoehe == null) {
            hatHoehe = new ArrayList<ObjectRefType>();
        }
        return this.hatHoehe;
    }

    /**
     * Gets the value of the funktionInEinerPunktgruppe property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getFunktionInEinerPunktgruppe() {
        return funktionInEinerPunktgruppe;
    }

    /**
     * Sets the value of the funktionInEinerPunktgruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setFunktionInEinerPunktgruppe(KeyValuePropertyType value) {
        this.funktionInEinerPunktgruppe = value;
    }

    /**
     * Gets the value of the zeitraumPermanenteMessungen property.
     * 
     * @return
     *     possible object is
     *     {@link ZeitraumPropertyType }
     *     
     */
    public ZeitraumPropertyType getZeitraumPermanenteMessungen() {
        return zeitraumPermanenteMessungen;
    }

    /**
     * Sets the value of the zeitraumPermanenteMessungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeitraumPropertyType }
     *     
     */
    public void setZeitraumPermanenteMessungen(ZeitraumPropertyType value) {
        this.zeitraumPermanenteMessungen = value;
    }

    /**
     * Gets the value of the offsetNL1 property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getOffsetNL1() {
        return offsetNL1;
    }

    /**
     * Sets the value of the offsetNL1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setOffsetNL1(Meter value) {
        this.offsetNL1 = value;
    }

    /**
     * Gets the value of the offsetEL1 property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getOffsetEL1() {
        return offsetEL1;
    }

    /**
     * Sets the value of the offsetEL1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setOffsetEL1(Meter value) {
        this.offsetEL1 = value;
    }

    /**
     * Gets the value of the offsetHL1 property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getOffsetHL1() {
        return offsetHL1;
    }

    /**
     * Sets the value of the offsetHL1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setOffsetHL1(Meter value) {
        this.offsetHL1 = value;
    }

    /**
     * Gets the value of the offsetNL2 property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getOffsetNL2() {
        return offsetNL2;
    }

    /**
     * Sets the value of the offsetNL2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setOffsetNL2(Meter value) {
        this.offsetNL2 = value;
    }

    /**
     * Gets the value of the offsetEL2 property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getOffsetEL2() {
        return offsetEL2;
    }

    /**
     * Sets the value of the offsetEL2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setOffsetEL2(Meter value) {
        this.offsetEL2 = value;
    }

    /**
     * Gets the value of the offsetHL2 property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getOffsetHL2() {
        return offsetHL2;
    }

    /**
     * Sets the value of the offsetHL2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setOffsetHL2(Meter value) {
        this.offsetHL2 = value;
    }

    /**
     * Gets the value of the isdnNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNNummer() {
        return isdnNummer;
    }

    /**
     * Sets the value of the isdnNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNNummer(String value) {
        this.isdnNummer = value;
    }

    /**
     * Gets the value of the funkfrequenz property.
     * 
     * @return
     *     possible object is
     *     {@link Megahertz }
     *     
     */
    public Megahertz getFunkfrequenz() {
        return funkfrequenz;
    }

    /**
     * Sets the value of the funkfrequenz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Megahertz }
     *     
     */
    public void setFunkfrequenz(Megahertz value) {
        this.funkfrequenz = value;
    }

    /**
     * Gets the value of the pcvl1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pcvl1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPCVL1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PCVPropertyType }
     * 
     * 
     */
    public List<PCVPropertyType> getPCVL1() {
        if (pcvl1 == null) {
            pcvl1 = new ArrayList<PCVPropertyType>();
        }
        return this.pcvl1;
    }

    /**
     * Gets the value of the pcvl2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pcvl2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPCVL2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PCVPropertyType }
     * 
     * 
     */
    public List<PCVPropertyType> getPCVL2() {
        if (pcvl2 == null) {
            pcvl2 = new ArrayList<PCVPropertyType>();
        }
        return this.pcvl2;
    }

    /**
     * Gets the value of the hatGPSEmpfaenger property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getHatGPSEmpfaenger() {
        return hatGPSEmpfaenger;
    }

    /**
     * Sets the value of the hatGPSEmpfaenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setHatGPSEmpfaenger(ObjectRefType value) {
        this.hatGPSEmpfaenger = value;
    }

    /**
     * Gets the value of the hatGPSAntenne property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getHatGPSAntenne() {
        return hatGPSAntenne;
    }

    /**
     * Sets the value of the hatGPSAntenne property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setHatGPSAntenne(ObjectRefType value) {
        this.hatGPSAntenne = value;
    }

}
