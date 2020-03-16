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
 * <p>Java class for EinzelprobeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EinzelprobeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Schicht" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Lieferscheinnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Eignungsnachweisnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Einbaudatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Entnahmeort" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Gesteinskoernung" type="{http://www.okstra.de/okstra/2.018.2}GesteinskoernungPropertyType"/&gt;
 *         &lt;element name="Anteil_Asphaltgranulat" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Massenanteil"/&gt;
 *         &lt;element name="Fertige_Schicht" type="{http://www.okstra.de/okstra/2.018.2}Fertige_SchichtPropertyType"/&gt;
 *         &lt;element name="Korngroessenverteilung" type="{http://www.okstra.de/okstra/2.018.2}KorngroessenverteilungPropertyType"/&gt;
 *         &lt;element name="Korngroessenanteil" type="{http://www.okstra.de/okstra/2.018.2}KorngroessePropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Bindemittel" type="{http://www.okstra.de/okstra/2.018.2}BindemittelPropertyType"/&gt;
 *         &lt;element name="Asphaltmischgut" type="{http://www.okstra.de/okstra/2.018.2}AsphaltmischgutPropertyType"/&gt;
 *         &lt;element name="Abstreumaterial" type="{http://www.okstra.de/okstra/2.018.2}AbstreumaterialPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Fuellstand_Ruehrwerkkessel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Einbaudicke_Soll" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Zentimeter" minOccurs="0"/&gt;
 *         &lt;element name="liegt_auf_Bezugsflaeche" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType"/&gt;
 *         &lt;element name="hat_Aufbauschicht" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="aus_Probe" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EinzelprobeType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "schicht",
    "lieferscheinnummer",
    "eignungsnachweisnummer",
    "einbaudatum",
    "entnahmeort",
    "gesteinskoernung",
    "anteilAsphaltgranulat",
    "fertigeSchicht",
    "korngroessenverteilung",
    "korngroessenanteil",
    "bindemittel",
    "asphaltmischgut",
    "abstreumaterial",
    "fuellstandRuehrwerkkessel",
    "einbaudickeSoll",
    "liegtAufBezugsflaeche",
    "hatAufbauschicht",
    "ausProbe"
})
public class EinzelprobeType
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
    @XmlElement(name = "Schicht", required = true)
    protected KeyValuePropertyType schicht;
    @XmlElement(name = "Lieferscheinnummer")
    protected String lieferscheinnummer;
    @XmlElement(name = "Eignungsnachweisnummer", required = true)
    protected String eignungsnachweisnummer;
    @XmlElement(name = "Einbaudatum", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar einbaudatum;
    @XmlElement(name = "Entnahmeort", required = true)
    protected KeyValuePropertyType entnahmeort;
    @XmlElement(name = "Gesteinskoernung", required = true)
    protected GesteinskoernungPropertyType gesteinskoernung;
    @XmlElement(name = "Anteil_Asphaltgranulat")
    protected double anteilAsphaltgranulat;
    @XmlElement(name = "Fertige_Schicht", required = true)
    protected FertigeSchichtPropertyType fertigeSchicht;
    @XmlElement(name = "Korngroessenverteilung", required = true)
    protected KorngroessenverteilungPropertyType korngroessenverteilung;
    @XmlElement(name = "Korngroessenanteil", required = true)
    protected List<KorngroessePropertyType> korngroessenanteil;
    @XmlElement(name = "Bindemittel", required = true)
    protected BindemittelPropertyType bindemittel;
    @XmlElement(name = "Asphaltmischgut", required = true)
    protected AsphaltmischgutPropertyType asphaltmischgut;
    @XmlElement(name = "Abstreumaterial")
    protected AbstreumaterialPropertyType abstreumaterial;
    @XmlElement(name = "Fuellstand_Ruehrwerkkessel")
    protected String fuellstandRuehrwerkkessel;
    @XmlElement(name = "Einbaudicke_Soll")
    protected Zentimeter einbaudickeSoll;
    @XmlElement(name = "liegt_auf_Bezugsflaeche", required = true)
    protected ObjectRefType liegtAufBezugsflaeche;
    @XmlElement(name = "hat_Aufbauschicht")
    protected List<ObjectRefType> hatAufbauschicht;
    @XmlElement(name = "aus_Probe", required = true)
    protected List<ObjectRefType> ausProbe;

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
     * Gets the value of the schicht property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getSchicht() {
        return schicht;
    }

    /**
     * Sets the value of the schicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setSchicht(KeyValuePropertyType value) {
        this.schicht = value;
    }

    /**
     * Gets the value of the lieferscheinnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieferscheinnummer() {
        return lieferscheinnummer;
    }

    /**
     * Sets the value of the lieferscheinnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieferscheinnummer(String value) {
        this.lieferscheinnummer = value;
    }

    /**
     * Gets the value of the eignungsnachweisnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEignungsnachweisnummer() {
        return eignungsnachweisnummer;
    }

    /**
     * Sets the value of the eignungsnachweisnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEignungsnachweisnummer(String value) {
        this.eignungsnachweisnummer = value;
    }

    /**
     * Gets the value of the einbaudatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEinbaudatum() {
        return einbaudatum;
    }

    /**
     * Sets the value of the einbaudatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEinbaudatum(XMLGregorianCalendar value) {
        this.einbaudatum = value;
    }

    /**
     * Gets the value of the entnahmeort property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getEntnahmeort() {
        return entnahmeort;
    }

    /**
     * Sets the value of the entnahmeort property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setEntnahmeort(KeyValuePropertyType value) {
        this.entnahmeort = value;
    }

    /**
     * Gets the value of the gesteinskoernung property.
     * 
     * @return
     *     possible object is
     *     {@link GesteinskoernungPropertyType }
     *     
     */
    public GesteinskoernungPropertyType getGesteinskoernung() {
        return gesteinskoernung;
    }

    /**
     * Sets the value of the gesteinskoernung property.
     * 
     * @param value
     *     allowed object is
     *     {@link GesteinskoernungPropertyType }
     *     
     */
    public void setGesteinskoernung(GesteinskoernungPropertyType value) {
        this.gesteinskoernung = value;
    }

    /**
     * Gets the value of the anteilAsphaltgranulat property.
     * 
     */
    public double getAnteilAsphaltgranulat() {
        return anteilAsphaltgranulat;
    }

    /**
     * Sets the value of the anteilAsphaltgranulat property.
     * 
     */
    public void setAnteilAsphaltgranulat(double value) {
        this.anteilAsphaltgranulat = value;
    }

    /**
     * Gets the value of the fertigeSchicht property.
     * 
     * @return
     *     possible object is
     *     {@link FertigeSchichtPropertyType }
     *     
     */
    public FertigeSchichtPropertyType getFertigeSchicht() {
        return fertigeSchicht;
    }

    /**
     * Sets the value of the fertigeSchicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertigeSchichtPropertyType }
     *     
     */
    public void setFertigeSchicht(FertigeSchichtPropertyType value) {
        this.fertigeSchicht = value;
    }

    /**
     * Gets the value of the korngroessenverteilung property.
     * 
     * @return
     *     possible object is
     *     {@link KorngroessenverteilungPropertyType }
     *     
     */
    public KorngroessenverteilungPropertyType getKorngroessenverteilung() {
        return korngroessenverteilung;
    }

    /**
     * Sets the value of the korngroessenverteilung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KorngroessenverteilungPropertyType }
     *     
     */
    public void setKorngroessenverteilung(KorngroessenverteilungPropertyType value) {
        this.korngroessenverteilung = value;
    }

    /**
     * Gets the value of the korngroessenanteil property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the korngroessenanteil property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKorngroessenanteil().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KorngroessePropertyType }
     * 
     * 
     */
    public List<KorngroessePropertyType> getKorngroessenanteil() {
        if (korngroessenanteil == null) {
            korngroessenanteil = new ArrayList<KorngroessePropertyType>();
        }
        return this.korngroessenanteil;
    }

    /**
     * Gets the value of the bindemittel property.
     * 
     * @return
     *     possible object is
     *     {@link BindemittelPropertyType }
     *     
     */
    public BindemittelPropertyType getBindemittel() {
        return bindemittel;
    }

    /**
     * Sets the value of the bindemittel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindemittelPropertyType }
     *     
     */
    public void setBindemittel(BindemittelPropertyType value) {
        this.bindemittel = value;
    }

    /**
     * Gets the value of the asphaltmischgut property.
     * 
     * @return
     *     possible object is
     *     {@link AsphaltmischgutPropertyType }
     *     
     */
    public AsphaltmischgutPropertyType getAsphaltmischgut() {
        return asphaltmischgut;
    }

    /**
     * Sets the value of the asphaltmischgut property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsphaltmischgutPropertyType }
     *     
     */
    public void setAsphaltmischgut(AsphaltmischgutPropertyType value) {
        this.asphaltmischgut = value;
    }

    /**
     * Gets the value of the abstreumaterial property.
     * 
     * @return
     *     possible object is
     *     {@link AbstreumaterialPropertyType }
     *     
     */
    public AbstreumaterialPropertyType getAbstreumaterial() {
        return abstreumaterial;
    }

    /**
     * Sets the value of the abstreumaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstreumaterialPropertyType }
     *     
     */
    public void setAbstreumaterial(AbstreumaterialPropertyType value) {
        this.abstreumaterial = value;
    }

    /**
     * Gets the value of the fuellstandRuehrwerkkessel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuellstandRuehrwerkkessel() {
        return fuellstandRuehrwerkkessel;
    }

    /**
     * Sets the value of the fuellstandRuehrwerkkessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuellstandRuehrwerkkessel(String value) {
        this.fuellstandRuehrwerkkessel = value;
    }

    /**
     * Gets the value of the einbaudickeSoll property.
     * 
     * @return
     *     possible object is
     *     {@link Zentimeter }
     *     
     */
    public Zentimeter getEinbaudickeSoll() {
        return einbaudickeSoll;
    }

    /**
     * Sets the value of the einbaudickeSoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zentimeter }
     *     
     */
    public void setEinbaudickeSoll(Zentimeter value) {
        this.einbaudickeSoll = value;
    }

    /**
     * Gets the value of the liegtAufBezugsflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getLiegtAufBezugsflaeche() {
        return liegtAufBezugsflaeche;
    }

    /**
     * Sets the value of the liegtAufBezugsflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setLiegtAufBezugsflaeche(ObjectRefType value) {
        this.liegtAufBezugsflaeche = value;
    }

    /**
     * Gets the value of the hatAufbauschicht property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatAufbauschicht property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatAufbauschicht().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatAufbauschicht() {
        if (hatAufbauschicht == null) {
            hatAufbauschicht = new ArrayList<ObjectRefType>();
        }
        return this.hatAufbauschicht;
    }

    /**
     * Gets the value of the ausProbe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ausProbe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAusProbe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getAusProbe() {
        if (ausProbe == null) {
            ausProbe = new ArrayList<ObjectRefType>();
        }
        return this.ausProbe;
    }

}