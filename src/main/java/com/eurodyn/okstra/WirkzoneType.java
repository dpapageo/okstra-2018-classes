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
 * <p>Java class for WirkzoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WirkzoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Flaechengeometrie" type="{http://www.opengis.net/gml/3.2}SurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Art" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="Sonstige_Art_Wirkzone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Unterer_Grenzwert" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Oberer_Grenzwert" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Einheit" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Beschreibung_Wirkung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="verursacht_Konflikt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WirkzoneType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "flaechengeometrie",
    "art",
    "sonstigeArtWirkzone",
    "untererGrenzwert",
    "obererGrenzwert",
    "einheit",
    "beschreibungWirkung",
    "verursachtKonflikt"
})
public class WirkzoneType
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
    @XmlElement(name = "Flaechengeometrie")
    protected SurfacePropertyType flaechengeometrie;
    @XmlElement(name = "Art", required = true)
    protected KeyValuePropertyType art;
    @XmlElement(name = "Sonstige_Art_Wirkzone")
    protected String sonstigeArtWirkzone;
    @XmlElement(name = "Unterer_Grenzwert")
    protected Double untererGrenzwert;
    @XmlElement(name = "Oberer_Grenzwert")
    protected Double obererGrenzwert;
    @XmlElement(name = "Einheit")
    protected KeyValuePropertyType einheit;
    @XmlElement(name = "Beschreibung_Wirkung")
    protected String beschreibungWirkung;
    @XmlElement(name = "verursacht_Konflikt")
    protected List<ObjectRefType> verursachtKonflikt;

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
     * Gets the value of the flaechengeometrie property.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyType }
     *     
     */
    public SurfacePropertyType getFlaechengeometrie() {
        return flaechengeometrie;
    }

    /**
     * Sets the value of the flaechengeometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyType }
     *     
     */
    public void setFlaechengeometrie(SurfacePropertyType value) {
        this.flaechengeometrie = value;
    }

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setArt(KeyValuePropertyType value) {
        this.art = value;
    }

    /**
     * Gets the value of the sonstigeArtWirkzone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonstigeArtWirkzone() {
        return sonstigeArtWirkzone;
    }

    /**
     * Sets the value of the sonstigeArtWirkzone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonstigeArtWirkzone(String value) {
        this.sonstigeArtWirkzone = value;
    }

    /**
     * Gets the value of the untererGrenzwert property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUntererGrenzwert() {
        return untererGrenzwert;
    }

    /**
     * Sets the value of the untererGrenzwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUntererGrenzwert(Double value) {
        this.untererGrenzwert = value;
    }

    /**
     * Gets the value of the obererGrenzwert property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getObererGrenzwert() {
        return obererGrenzwert;
    }

    /**
     * Sets the value of the obererGrenzwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setObererGrenzwert(Double value) {
        this.obererGrenzwert = value;
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
     * Gets the value of the beschreibungWirkung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibungWirkung() {
        return beschreibungWirkung;
    }

    /**
     * Sets the value of the beschreibungWirkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibungWirkung(String value) {
        this.beschreibungWirkung = value;
    }

    /**
     * Gets the value of the verursachtKonflikt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verursachtKonflikt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerursachtKonflikt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getVerursachtKonflikt() {
        if (verursachtKonflikt == null) {
            verursachtKonflikt = new ArrayList<ObjectRefType>();
        }
        return this.verursachtKonflikt;
    }

}