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
 * <p>Java class for BaumschadenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaumschadenType"&gt;
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
 *         &lt;element name="Kronenschaeden" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Einstufung_Kronenschaeden" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Stammschaeden" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Einstufung_Stammschaeden" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Stammfussschaden" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Einstufung_Stammfussschaden" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Wurzelschaeden" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Einstufung_Wurzelschaeden" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Schadensursache" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="von_Baum" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaumschadenType", propOrder = {
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
    "kronenschaeden",
    "einstufungKronenschaeden",
    "stammschaeden",
    "einstufungStammschaeden",
    "stammfussschaden",
    "einstufungStammfussschaden",
    "wurzelschaeden",
    "einstufungWurzelschaeden",
    "schadensursache",
    "vonBaum"
})
public class BaumschadenType
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
    @XmlElement(name = "Kronenschaeden")
    protected KeyValuePropertyType kronenschaeden;
    @XmlElement(name = "Einstufung_Kronenschaeden")
    protected KeyValuePropertyType einstufungKronenschaeden;
    @XmlElement(name = "Stammschaeden")
    protected KeyValuePropertyType stammschaeden;
    @XmlElement(name = "Einstufung_Stammschaeden")
    protected KeyValuePropertyType einstufungStammschaeden;
    @XmlElement(name = "Stammfussschaden")
    protected KeyValuePropertyType stammfussschaden;
    @XmlElement(name = "Einstufung_Stammfussschaden")
    protected KeyValuePropertyType einstufungStammfussschaden;
    @XmlElement(name = "Wurzelschaeden")
    protected KeyValuePropertyType wurzelschaeden;
    @XmlElement(name = "Einstufung_Wurzelschaeden")
    protected KeyValuePropertyType einstufungWurzelschaeden;
    @XmlElement(name = "Schadensursache")
    protected KeyValuePropertyType schadensursache;
    @XmlElement(name = "von_Baum")
    protected List<ObjectRefType> vonBaum;

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
     * Gets the value of the kronenschaeden property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getKronenschaeden() {
        return kronenschaeden;
    }

    /**
     * Sets the value of the kronenschaeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setKronenschaeden(KeyValuePropertyType value) {
        this.kronenschaeden = value;
    }

    /**
     * Gets the value of the einstufungKronenschaeden property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getEinstufungKronenschaeden() {
        return einstufungKronenschaeden;
    }

    /**
     * Sets the value of the einstufungKronenschaeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setEinstufungKronenschaeden(KeyValuePropertyType value) {
        this.einstufungKronenschaeden = value;
    }

    /**
     * Gets the value of the stammschaeden property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getStammschaeden() {
        return stammschaeden;
    }

    /**
     * Sets the value of the stammschaeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setStammschaeden(KeyValuePropertyType value) {
        this.stammschaeden = value;
    }

    /**
     * Gets the value of the einstufungStammschaeden property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getEinstufungStammschaeden() {
        return einstufungStammschaeden;
    }

    /**
     * Sets the value of the einstufungStammschaeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setEinstufungStammschaeden(KeyValuePropertyType value) {
        this.einstufungStammschaeden = value;
    }

    /**
     * Gets the value of the stammfussschaden property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getStammfussschaden() {
        return stammfussschaden;
    }

    /**
     * Sets the value of the stammfussschaden property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setStammfussschaden(KeyValuePropertyType value) {
        this.stammfussschaden = value;
    }

    /**
     * Gets the value of the einstufungStammfussschaden property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getEinstufungStammfussschaden() {
        return einstufungStammfussschaden;
    }

    /**
     * Sets the value of the einstufungStammfussschaden property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setEinstufungStammfussschaden(KeyValuePropertyType value) {
        this.einstufungStammfussschaden = value;
    }

    /**
     * Gets the value of the wurzelschaeden property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getWurzelschaeden() {
        return wurzelschaeden;
    }

    /**
     * Sets the value of the wurzelschaeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setWurzelschaeden(KeyValuePropertyType value) {
        this.wurzelschaeden = value;
    }

    /**
     * Gets the value of the einstufungWurzelschaeden property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getEinstufungWurzelschaeden() {
        return einstufungWurzelschaeden;
    }

    /**
     * Sets the value of the einstufungWurzelschaeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setEinstufungWurzelschaeden(KeyValuePropertyType value) {
        this.einstufungWurzelschaeden = value;
    }

    /**
     * Gets the value of the schadensursache property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getSchadensursache() {
        return schadensursache;
    }

    /**
     * Sets the value of the schadensursache property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setSchadensursache(KeyValuePropertyType value) {
        this.schadensursache = value;
    }

    /**
     * Gets the value of the vonBaum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vonBaum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVonBaum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getVonBaum() {
        if (vonBaum == null) {
            vonBaum = new ArrayList<ObjectRefType>();
        }
        return this.vonBaum;
    }

}
