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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Hoehenpasspunkt_SBVType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hoehenpasspunkt_SBVType"&gt;
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
 *         &lt;element name="Katasteramt_Stellart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Katasteramt_Schluessel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GPS_Tauglichkeit" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="liegt_in_Gemarkung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="vermutete_Hoehenstabilitaet" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Guete_des_Vermarkungstraegers" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Topographie_und_Umwelt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Guete_des_Baugrundes" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="geologische_Stabilitaet" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Grundwasserstand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Grundwasserschwankung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Hoehenstabilitaet_aus_Wdhmessg" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Punktnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hoehenpasspunkt_SBVType", propOrder = {
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
    "katasteramtStellart",
    "katasteramtSchluessel",
    "gpsTauglichkeit",
    "liegtInGemarkung",
    "vermuteteHoehenstabilitaet",
    "gueteDesVermarkungstraegers",
    "topographieUndUmwelt",
    "gueteDesBaugrundes",
    "geologischeStabilitaet",
    "grundwasserstand",
    "grundwasserschwankung",
    "hoehenstabilitaetAusWdhmessg",
    "punktnummer"
})
public class HoehenpasspunktSBVType
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
    @XmlElement(name = "Katasteramt_Stellart")
    protected String katasteramtStellart;
    @XmlElement(name = "Katasteramt_Schluessel")
    protected String katasteramtSchluessel;
    @XmlElement(name = "GPS_Tauglichkeit")
    protected KeyValuePropertyType gpsTauglichkeit;
    @XmlElement(name = "liegt_in_Gemarkung")
    protected ObjectRefType liegtInGemarkung;
    @XmlElement(name = "vermutete_Hoehenstabilitaet")
    protected KeyValuePropertyType vermuteteHoehenstabilitaet;
    @XmlElement(name = "Guete_des_Vermarkungstraegers")
    protected KeyValuePropertyType gueteDesVermarkungstraegers;
    @XmlElement(name = "Topographie_und_Umwelt")
    protected KeyValuePropertyType topographieUndUmwelt;
    @XmlElement(name = "Guete_des_Baugrundes")
    protected KeyValuePropertyType gueteDesBaugrundes;
    @XmlElement(name = "geologische_Stabilitaet")
    protected KeyValuePropertyType geologischeStabilitaet;
    @XmlElement(name = "Grundwasserstand")
    protected KeyValuePropertyType grundwasserstand;
    @XmlElement(name = "Grundwasserschwankung")
    protected KeyValuePropertyType grundwasserschwankung;
    @XmlElement(name = "Hoehenstabilitaet_aus_Wdhmessg")
    protected KeyValuePropertyType hoehenstabilitaetAusWdhmessg;
    @XmlElement(name = "Punktnummer", required = true)
    protected String punktnummer;

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
     * Gets the value of the katasteramtStellart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatasteramtStellart() {
        return katasteramtStellart;
    }

    /**
     * Sets the value of the katasteramtStellart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatasteramtStellart(String value) {
        this.katasteramtStellart = value;
    }

    /**
     * Gets the value of the katasteramtSchluessel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatasteramtSchluessel() {
        return katasteramtSchluessel;
    }

    /**
     * Sets the value of the katasteramtSchluessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatasteramtSchluessel(String value) {
        this.katasteramtSchluessel = value;
    }

    /**
     * Gets the value of the gpsTauglichkeit property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getGPSTauglichkeit() {
        return gpsTauglichkeit;
    }

    /**
     * Sets the value of the gpsTauglichkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setGPSTauglichkeit(KeyValuePropertyType value) {
        this.gpsTauglichkeit = value;
    }

    /**
     * Gets the value of the liegtInGemarkung property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getLiegtInGemarkung() {
        return liegtInGemarkung;
    }

    /**
     * Sets the value of the liegtInGemarkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setLiegtInGemarkung(ObjectRefType value) {
        this.liegtInGemarkung = value;
    }

    /**
     * Gets the value of the vermuteteHoehenstabilitaet property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getVermuteteHoehenstabilitaet() {
        return vermuteteHoehenstabilitaet;
    }

    /**
     * Sets the value of the vermuteteHoehenstabilitaet property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setVermuteteHoehenstabilitaet(KeyValuePropertyType value) {
        this.vermuteteHoehenstabilitaet = value;
    }

    /**
     * Gets the value of the gueteDesVermarkungstraegers property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getGueteDesVermarkungstraegers() {
        return gueteDesVermarkungstraegers;
    }

    /**
     * Sets the value of the gueteDesVermarkungstraegers property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setGueteDesVermarkungstraegers(KeyValuePropertyType value) {
        this.gueteDesVermarkungstraegers = value;
    }

    /**
     * Gets the value of the topographieUndUmwelt property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getTopographieUndUmwelt() {
        return topographieUndUmwelt;
    }

    /**
     * Sets the value of the topographieUndUmwelt property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setTopographieUndUmwelt(KeyValuePropertyType value) {
        this.topographieUndUmwelt = value;
    }

    /**
     * Gets the value of the gueteDesBaugrundes property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getGueteDesBaugrundes() {
        return gueteDesBaugrundes;
    }

    /**
     * Sets the value of the gueteDesBaugrundes property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setGueteDesBaugrundes(KeyValuePropertyType value) {
        this.gueteDesBaugrundes = value;
    }

    /**
     * Gets the value of the geologischeStabilitaet property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getGeologischeStabilitaet() {
        return geologischeStabilitaet;
    }

    /**
     * Sets the value of the geologischeStabilitaet property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setGeologischeStabilitaet(KeyValuePropertyType value) {
        this.geologischeStabilitaet = value;
    }

    /**
     * Gets the value of the grundwasserstand property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getGrundwasserstand() {
        return grundwasserstand;
    }

    /**
     * Sets the value of the grundwasserstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setGrundwasserstand(KeyValuePropertyType value) {
        this.grundwasserstand = value;
    }

    /**
     * Gets the value of the grundwasserschwankung property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getGrundwasserschwankung() {
        return grundwasserschwankung;
    }

    /**
     * Sets the value of the grundwasserschwankung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setGrundwasserschwankung(KeyValuePropertyType value) {
        this.grundwasserschwankung = value;
    }

    /**
     * Gets the value of the hoehenstabilitaetAusWdhmessg property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getHoehenstabilitaetAusWdhmessg() {
        return hoehenstabilitaetAusWdhmessg;
    }

    /**
     * Sets the value of the hoehenstabilitaetAusWdhmessg property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setHoehenstabilitaetAusWdhmessg(KeyValuePropertyType value) {
        this.hoehenstabilitaetAusWdhmessg = value;
    }

    /**
     * Gets the value of the punktnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunktnummer() {
        return punktnummer;
    }

    /**
     * Sets the value of the punktnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunktnummer(String value) {
        this.punktnummer = value;
    }

}