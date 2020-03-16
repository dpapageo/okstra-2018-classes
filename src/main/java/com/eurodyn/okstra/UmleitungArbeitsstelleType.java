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
 * <p>Java class for Umleitung_ArbeitsstelleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Umleitung_ArbeitsstelleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Mehrkilometer" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Kilometer" minOccurs="0"/&gt;
 *         &lt;element name="Mehrzeit" type="{http://www.okstra.de/okstra/2.018.2}DauerPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bedarfsumleitung_Nummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="hat_Umleitung_Strecke" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="zu_Arbeitsstelle" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Umleitung_ArbeitsstelleType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "mehrkilometer",
    "mehrzeit",
    "beschreibung",
    "bedarfsumleitungNummer",
    "hatUmleitungStrecke",
    "zuArbeitsstelle"
})
public class UmleitungArbeitsstelleType
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
    @XmlElement(name = "Mehrkilometer")
    protected Kilometer mehrkilometer;
    @XmlElement(name = "Mehrzeit")
    protected DauerPropertyType mehrzeit;
    @XmlElement(name = "Beschreibung")
    protected String beschreibung;
    @XmlElement(name = "Bedarfsumleitung_Nummer")
    protected BigInteger bedarfsumleitungNummer;
    @XmlElement(name = "hat_Umleitung_Strecke")
    protected ObjectRefType hatUmleitungStrecke;
    @XmlElement(name = "zu_Arbeitsstelle")
    protected List<ObjectRefType> zuArbeitsstelle;

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
     * Gets the value of the mehrkilometer property.
     * 
     * @return
     *     possible object is
     *     {@link Kilometer }
     *     
     */
    public Kilometer getMehrkilometer() {
        return mehrkilometer;
    }

    /**
     * Sets the value of the mehrkilometer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kilometer }
     *     
     */
    public void setMehrkilometer(Kilometer value) {
        this.mehrkilometer = value;
    }

    /**
     * Gets the value of the mehrzeit property.
     * 
     * @return
     *     possible object is
     *     {@link DauerPropertyType }
     *     
     */
    public DauerPropertyType getMehrzeit() {
        return mehrzeit;
    }

    /**
     * Sets the value of the mehrzeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DauerPropertyType }
     *     
     */
    public void setMehrzeit(DauerPropertyType value) {
        this.mehrzeit = value;
    }

    /**
     * Gets the value of the beschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the value of the beschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

    /**
     * Gets the value of the bedarfsumleitungNummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBedarfsumleitungNummer() {
        return bedarfsumleitungNummer;
    }

    /**
     * Sets the value of the bedarfsumleitungNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBedarfsumleitungNummer(BigInteger value) {
        this.bedarfsumleitungNummer = value;
    }

    /**
     * Gets the value of the hatUmleitungStrecke property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getHatUmleitungStrecke() {
        return hatUmleitungStrecke;
    }

    /**
     * Sets the value of the hatUmleitungStrecke property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setHatUmleitungStrecke(ObjectRefType value) {
        this.hatUmleitungStrecke = value;
    }

    /**
     * Gets the value of the zuArbeitsstelle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zuArbeitsstelle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZuArbeitsstelle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getZuArbeitsstelle() {
        if (zuArbeitsstelle == null) {
            zuArbeitsstelle = new ArrayList<ObjectRefType>();
        }
        return this.zuArbeitsstelle;
    }

}
