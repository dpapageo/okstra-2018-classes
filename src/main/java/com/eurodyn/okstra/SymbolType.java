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
 * <p>Java class for SymbolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SymbolType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Punktgeometrie" type="{http://www.opengis.net/gml/3.2}PointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Symbolbedeutung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Breite_links" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Groesse"/&gt;
 *         &lt;element name="Breite_rechts" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Groesse"/&gt;
 *         &lt;element name="Hoehe_oben" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Groesse"/&gt;
 *         &lt;element name="Hoehe_unten" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Groesse"/&gt;
 *         &lt;element name="Einheit" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Drehwinkel" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Radiant"/&gt;
 *         &lt;element name="mit_Bezug_auf_allg_Punktobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymbolType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "punktgeometrie",
    "symbolbedeutung",
    "breiteLinks",
    "breiteRechts",
    "hoeheOben",
    "hoeheUnten",
    "einheit",
    "drehwinkel",
    "mitBezugAufAllgPunktobjekt"
})
public class SymbolType
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
    @XmlElement(name = "Punktgeometrie")
    protected PointPropertyType punktgeometrie;
    @XmlElement(name = "Symbolbedeutung", required = true)
    protected String symbolbedeutung;
    @XmlElement(name = "Breite_links")
    protected double breiteLinks;
    @XmlElement(name = "Breite_rechts")
    protected double breiteRechts;
    @XmlElement(name = "Hoehe_oben")
    protected double hoeheOben;
    @XmlElement(name = "Hoehe_unten")
    protected double hoeheUnten;
    @XmlElement(name = "Einheit", required = true)
    protected KeyValuePropertyType einheit;
    @XmlElement(name = "Drehwinkel", required = true)
    protected Radiant drehwinkel;
    @XmlElement(name = "mit_Bezug_auf_allg_Punktobjekt", required = true)
    protected ObjectRefType mitBezugAufAllgPunktobjekt;

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
     * Gets the value of the punktgeometrie property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPunktgeometrie() {
        return punktgeometrie;
    }

    /**
     * Sets the value of the punktgeometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPunktgeometrie(PointPropertyType value) {
        this.punktgeometrie = value;
    }

    /**
     * Gets the value of the symbolbedeutung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolbedeutung() {
        return symbolbedeutung;
    }

    /**
     * Sets the value of the symbolbedeutung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolbedeutung(String value) {
        this.symbolbedeutung = value;
    }

    /**
     * Gets the value of the breiteLinks property.
     * 
     */
    public double getBreiteLinks() {
        return breiteLinks;
    }

    /**
     * Sets the value of the breiteLinks property.
     * 
     */
    public void setBreiteLinks(double value) {
        this.breiteLinks = value;
    }

    /**
     * Gets the value of the breiteRechts property.
     * 
     */
    public double getBreiteRechts() {
        return breiteRechts;
    }

    /**
     * Sets the value of the breiteRechts property.
     * 
     */
    public void setBreiteRechts(double value) {
        this.breiteRechts = value;
    }

    /**
     * Gets the value of the hoeheOben property.
     * 
     */
    public double getHoeheOben() {
        return hoeheOben;
    }

    /**
     * Sets the value of the hoeheOben property.
     * 
     */
    public void setHoeheOben(double value) {
        this.hoeheOben = value;
    }

    /**
     * Gets the value of the hoeheUnten property.
     * 
     */
    public double getHoeheUnten() {
        return hoeheUnten;
    }

    /**
     * Sets the value of the hoeheUnten property.
     * 
     */
    public void setHoeheUnten(double value) {
        this.hoeheUnten = value;
    }

    /**
     * Gets the value of the einheit property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getEinheit() {
        return einheit;
    }

    /**
     * Sets the value of the einheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setEinheit(KeyValuePropertyType value) {
        this.einheit = value;
    }

    /**
     * Gets the value of the drehwinkel property.
     * 
     * @return
     *     possible object is
     *     {@link Radiant }
     *     
     */
    public Radiant getDrehwinkel() {
        return drehwinkel;
    }

    /**
     * Sets the value of the drehwinkel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Radiant }
     *     
     */
    public void setDrehwinkel(Radiant value) {
        this.drehwinkel = value;
    }

    /**
     * Gets the value of the mitBezugAufAllgPunktobjekt property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getMitBezugAufAllgPunktobjekt() {
        return mitBezugAufAllgPunktobjekt;
    }

    /**
     * Sets the value of the mitBezugAufAllgPunktobjekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setMitBezugAufAllgPunktobjekt(ObjectRefType value) {
        this.mitBezugAufAllgPunktobjekt = value;
    }

}
