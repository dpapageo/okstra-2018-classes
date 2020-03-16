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
 * <p>Java class for VEMAGS_BerechnungsgrundlageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VEMAGS_BerechnungsgrundlageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Ersatzsystem_Bogenbauwerke" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Abmind_faktor_Temp_Innenfeld" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Abmind_faktor_Temp_Stuetze" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Abmind_faktor_Grenzjahr" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Jahr" minOccurs="0"/&gt;
 *         &lt;element name="Zustandsnote" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="max_Standsicherheitsnote_ab" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Stand" type="{http://www.okstra.de/okstra/2.018.2}ZeitpunktPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="definiert_durch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mit_Auslastungsgrad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Mit_Ueberlastungsfaktor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="von_Berechnungsergebnis" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Lastbild_Definition" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VEMAGS_BerechnungsgrundlageType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "ersatzsystemBogenbauwerke",
    "abmindFaktorTempInnenfeld",
    "abmindFaktorTempStuetze",
    "abmindFaktorGrenzjahr",
    "zustandsnote",
    "maxStandsicherheitsnoteAb",
    "stand",
    "definiertDurch",
    "mitAuslastungsgrad",
    "mitUeberlastungsfaktor",
    "vonBerechnungsergebnis",
    "hatLastbildDefinition"
})
public class VEMAGSBerechnungsgrundlageType
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
    @XmlElement(name = "Ersatzsystem_Bogenbauwerke")
    protected Boolean ersatzsystemBogenbauwerke;
    @XmlElement(name = "Abmind_faktor_Temp_Innenfeld")
    protected Double abmindFaktorTempInnenfeld;
    @XmlElement(name = "Abmind_faktor_Temp_Stuetze")
    protected Double abmindFaktorTempStuetze;
    @XmlElement(name = "Abmind_faktor_Grenzjahr")
    protected BigInteger abmindFaktorGrenzjahr;
    @XmlElement(name = "Zustandsnote")
    protected Double zustandsnote;
    @XmlElement(name = "max_Standsicherheitsnote_ab")
    protected BigInteger maxStandsicherheitsnoteAb;
    @XmlElement(name = "Stand")
    protected ZeitpunktPropertyType stand;
    @XmlElement(name = "definiert_durch")
    protected String definiertDurch;
    @XmlElement(name = "Mit_Auslastungsgrad")
    protected Boolean mitAuslastungsgrad;
    @XmlElement(name = "Mit_Ueberlastungsfaktor")
    protected Boolean mitUeberlastungsfaktor;
    @XmlElement(name = "von_Berechnungsergebnis")
    protected List<ObjectRefType> vonBerechnungsergebnis;
    @XmlElement(name = "hat_Lastbild_Definition")
    protected List<ObjectRefType> hatLastbildDefinition;

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
     * Gets the value of the ersatzsystemBogenbauwerke property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErsatzsystemBogenbauwerke() {
        return ersatzsystemBogenbauwerke;
    }

    /**
     * Sets the value of the ersatzsystemBogenbauwerke property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErsatzsystemBogenbauwerke(Boolean value) {
        this.ersatzsystemBogenbauwerke = value;
    }

    /**
     * Gets the value of the abmindFaktorTempInnenfeld property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAbmindFaktorTempInnenfeld() {
        return abmindFaktorTempInnenfeld;
    }

    /**
     * Sets the value of the abmindFaktorTempInnenfeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAbmindFaktorTempInnenfeld(Double value) {
        this.abmindFaktorTempInnenfeld = value;
    }

    /**
     * Gets the value of the abmindFaktorTempStuetze property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAbmindFaktorTempStuetze() {
        return abmindFaktorTempStuetze;
    }

    /**
     * Sets the value of the abmindFaktorTempStuetze property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAbmindFaktorTempStuetze(Double value) {
        this.abmindFaktorTempStuetze = value;
    }

    /**
     * Gets the value of the abmindFaktorGrenzjahr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAbmindFaktorGrenzjahr() {
        return abmindFaktorGrenzjahr;
    }

    /**
     * Sets the value of the abmindFaktorGrenzjahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAbmindFaktorGrenzjahr(BigInteger value) {
        this.abmindFaktorGrenzjahr = value;
    }

    /**
     * Gets the value of the zustandsnote property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZustandsnote() {
        return zustandsnote;
    }

    /**
     * Sets the value of the zustandsnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZustandsnote(Double value) {
        this.zustandsnote = value;
    }

    /**
     * Gets the value of the maxStandsicherheitsnoteAb property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxStandsicherheitsnoteAb() {
        return maxStandsicherheitsnoteAb;
    }

    /**
     * Sets the value of the maxStandsicherheitsnoteAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxStandsicherheitsnoteAb(BigInteger value) {
        this.maxStandsicherheitsnoteAb = value;
    }

    /**
     * Gets the value of the stand property.
     * 
     * @return
     *     possible object is
     *     {@link ZeitpunktPropertyType }
     *     
     */
    public ZeitpunktPropertyType getStand() {
        return stand;
    }

    /**
     * Sets the value of the stand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeitpunktPropertyType }
     *     
     */
    public void setStand(ZeitpunktPropertyType value) {
        this.stand = value;
    }

    /**
     * Gets the value of the definiertDurch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefiniertDurch() {
        return definiertDurch;
    }

    /**
     * Sets the value of the definiertDurch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefiniertDurch(String value) {
        this.definiertDurch = value;
    }

    /**
     * Gets the value of the mitAuslastungsgrad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMitAuslastungsgrad() {
        return mitAuslastungsgrad;
    }

    /**
     * Sets the value of the mitAuslastungsgrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMitAuslastungsgrad(Boolean value) {
        this.mitAuslastungsgrad = value;
    }

    /**
     * Gets the value of the mitUeberlastungsfaktor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMitUeberlastungsfaktor() {
        return mitUeberlastungsfaktor;
    }

    /**
     * Sets the value of the mitUeberlastungsfaktor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMitUeberlastungsfaktor(Boolean value) {
        this.mitUeberlastungsfaktor = value;
    }

    /**
     * Gets the value of the vonBerechnungsergebnis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vonBerechnungsergebnis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVonBerechnungsergebnis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getVonBerechnungsergebnis() {
        if (vonBerechnungsergebnis == null) {
            vonBerechnungsergebnis = new ArrayList<ObjectRefType>();
        }
        return this.vonBerechnungsergebnis;
    }

    /**
     * Gets the value of the hatLastbildDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatLastbildDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatLastbildDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatLastbildDefinition() {
        if (hatLastbildDefinition == null) {
            hatLastbildDefinition = new ArrayList<ObjectRefType>();
        }
        return this.hatLastbildDefinition;
    }

}
