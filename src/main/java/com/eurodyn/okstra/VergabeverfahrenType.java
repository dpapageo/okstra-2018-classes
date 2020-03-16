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
 * <p>Java class for VergabeverfahrenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VergabeverfahrenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Datum_Vergabebekanntmachung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Eroeffnungstermin" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Datum_Zuschlagserteilung" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Datum_Bieterinformation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Nachpruefung_beantragt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Anzahl_Bewerber_D" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Bewerber_EU" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Bewerber_SO" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Bieter_D" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Bieter_EU" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Bieter_SO" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Bieter_ausgeschloss_D" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Bieter_ausgeschloss_EU" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Bieter_ausgeschloss_SO" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Hauptangebote_D" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Hauptangebote_EU" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Hauptangebote_SO" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Nebenangebote_D" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Nebenangebote_EU" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Anzahl_Nebenangebote_SO" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Anzahl"/&gt;
 *         &lt;element name="Wertungskriterium" type="{http://www.okstra.de/okstra/2.018.2}WertungskriteriumPropertyType"/&gt;
 *         &lt;element name="zu_Baumassnahme" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Nachpruefungsverfahren" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="an_Wertung_mitwirkende_Firma" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Angebot" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VergabeverfahrenType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "datumVergabebekanntmachung",
    "eroeffnungstermin",
    "datumZuschlagserteilung",
    "datumBieterinformation",
    "nachpruefungBeantragt",
    "anzahlBewerberD",
    "anzahlBewerberEU",
    "anzahlBewerberSO",
    "anzahlBieterD",
    "anzahlBieterEU",
    "anzahlBieterSO",
    "anzahlBieterAusgeschlossD",
    "anzahlBieterAusgeschlossEU",
    "anzahlBieterAusgeschlossSO",
    "anzahlHauptangeboteD",
    "anzahlHauptangeboteEU",
    "anzahlHauptangeboteSO",
    "anzahlNebenangeboteD",
    "anzahlNebenangeboteEU",
    "anzahlNebenangeboteSO",
    "wertungskriterium",
    "zuBaumassnahme",
    "hatNachpruefungsverfahren",
    "anWertungMitwirkendeFirma",
    "hatAngebot"
})
public class VergabeverfahrenType
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
    @XmlElement(name = "Datum_Vergabebekanntmachung")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVergabebekanntmachung;
    @XmlElement(name = "Eroeffnungstermin")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eroeffnungstermin;
    @XmlElement(name = "Datum_Zuschlagserteilung", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZuschlagserteilung;
    @XmlElement(name = "Datum_Bieterinformation")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumBieterinformation;
    @XmlElement(name = "Nachpruefung_beantragt")
    protected boolean nachpruefungBeantragt;
    @XmlElement(name = "Anzahl_Bewerber_D", required = true)
    protected BigInteger anzahlBewerberD;
    @XmlElement(name = "Anzahl_Bewerber_EU", required = true)
    protected BigInteger anzahlBewerberEU;
    @XmlElement(name = "Anzahl_Bewerber_SO", required = true)
    protected BigInteger anzahlBewerberSO;
    @XmlElement(name = "Anzahl_Bieter_D", required = true)
    protected BigInteger anzahlBieterD;
    @XmlElement(name = "Anzahl_Bieter_EU", required = true)
    protected BigInteger anzahlBieterEU;
    @XmlElement(name = "Anzahl_Bieter_SO", required = true)
    protected BigInteger anzahlBieterSO;
    @XmlElement(name = "Anzahl_Bieter_ausgeschloss_D", required = true)
    protected BigInteger anzahlBieterAusgeschlossD;
    @XmlElement(name = "Anzahl_Bieter_ausgeschloss_EU", required = true)
    protected BigInteger anzahlBieterAusgeschlossEU;
    @XmlElement(name = "Anzahl_Bieter_ausgeschloss_SO", required = true)
    protected BigInteger anzahlBieterAusgeschlossSO;
    @XmlElement(name = "Anzahl_Hauptangebote_D", required = true)
    protected BigInteger anzahlHauptangeboteD;
    @XmlElement(name = "Anzahl_Hauptangebote_EU", required = true)
    protected BigInteger anzahlHauptangeboteEU;
    @XmlElement(name = "Anzahl_Hauptangebote_SO", required = true)
    protected BigInteger anzahlHauptangeboteSO;
    @XmlElement(name = "Anzahl_Nebenangebote_D", required = true)
    protected BigInteger anzahlNebenangeboteD;
    @XmlElement(name = "Anzahl_Nebenangebote_EU", required = true)
    protected BigInteger anzahlNebenangeboteEU;
    @XmlElement(name = "Anzahl_Nebenangebote_SO", required = true)
    protected BigInteger anzahlNebenangeboteSO;
    @XmlElement(name = "Wertungskriterium", required = true)
    protected WertungskriteriumPropertyType wertungskriterium;
    @XmlElement(name = "zu_Baumassnahme")
    protected List<ObjectRefType> zuBaumassnahme;
    @XmlElement(name = "hat_Nachpruefungsverfahren")
    protected List<ObjectRefType> hatNachpruefungsverfahren;
    @XmlElement(name = "an_Wertung_mitwirkende_Firma")
    protected List<ObjectRefType> anWertungMitwirkendeFirma;
    @XmlElement(name = "hat_Angebot")
    protected List<ObjectRefType> hatAngebot;

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
     * Gets the value of the datumVergabebekanntmachung property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVergabebekanntmachung() {
        return datumVergabebekanntmachung;
    }

    /**
     * Sets the value of the datumVergabebekanntmachung property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVergabebekanntmachung(XMLGregorianCalendar value) {
        this.datumVergabebekanntmachung = value;
    }

    /**
     * Gets the value of the eroeffnungstermin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEroeffnungstermin() {
        return eroeffnungstermin;
    }

    /**
     * Sets the value of the eroeffnungstermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEroeffnungstermin(XMLGregorianCalendar value) {
        this.eroeffnungstermin = value;
    }

    /**
     * Gets the value of the datumZuschlagserteilung property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZuschlagserteilung() {
        return datumZuschlagserteilung;
    }

    /**
     * Sets the value of the datumZuschlagserteilung property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZuschlagserteilung(XMLGregorianCalendar value) {
        this.datumZuschlagserteilung = value;
    }

    /**
     * Gets the value of the datumBieterinformation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumBieterinformation() {
        return datumBieterinformation;
    }

    /**
     * Sets the value of the datumBieterinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumBieterinformation(XMLGregorianCalendar value) {
        this.datumBieterinformation = value;
    }

    /**
     * Gets the value of the nachpruefungBeantragt property.
     * 
     */
    public boolean isNachpruefungBeantragt() {
        return nachpruefungBeantragt;
    }

    /**
     * Sets the value of the nachpruefungBeantragt property.
     * 
     */
    public void setNachpruefungBeantragt(boolean value) {
        this.nachpruefungBeantragt = value;
    }

    /**
     * Gets the value of the anzahlBewerberD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlBewerberD() {
        return anzahlBewerberD;
    }

    /**
     * Sets the value of the anzahlBewerberD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlBewerberD(BigInteger value) {
        this.anzahlBewerberD = value;
    }

    /**
     * Gets the value of the anzahlBewerberEU property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlBewerberEU() {
        return anzahlBewerberEU;
    }

    /**
     * Sets the value of the anzahlBewerberEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlBewerberEU(BigInteger value) {
        this.anzahlBewerberEU = value;
    }

    /**
     * Gets the value of the anzahlBewerberSO property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlBewerberSO() {
        return anzahlBewerberSO;
    }

    /**
     * Sets the value of the anzahlBewerberSO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlBewerberSO(BigInteger value) {
        this.anzahlBewerberSO = value;
    }

    /**
     * Gets the value of the anzahlBieterD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlBieterD() {
        return anzahlBieterD;
    }

    /**
     * Sets the value of the anzahlBieterD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlBieterD(BigInteger value) {
        this.anzahlBieterD = value;
    }

    /**
     * Gets the value of the anzahlBieterEU property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlBieterEU() {
        return anzahlBieterEU;
    }

    /**
     * Sets the value of the anzahlBieterEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlBieterEU(BigInteger value) {
        this.anzahlBieterEU = value;
    }

    /**
     * Gets the value of the anzahlBieterSO property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlBieterSO() {
        return anzahlBieterSO;
    }

    /**
     * Sets the value of the anzahlBieterSO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlBieterSO(BigInteger value) {
        this.anzahlBieterSO = value;
    }

    /**
     * Gets the value of the anzahlBieterAusgeschlossD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlBieterAusgeschlossD() {
        return anzahlBieterAusgeschlossD;
    }

    /**
     * Sets the value of the anzahlBieterAusgeschlossD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlBieterAusgeschlossD(BigInteger value) {
        this.anzahlBieterAusgeschlossD = value;
    }

    /**
     * Gets the value of the anzahlBieterAusgeschlossEU property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlBieterAusgeschlossEU() {
        return anzahlBieterAusgeschlossEU;
    }

    /**
     * Sets the value of the anzahlBieterAusgeschlossEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlBieterAusgeschlossEU(BigInteger value) {
        this.anzahlBieterAusgeschlossEU = value;
    }

    /**
     * Gets the value of the anzahlBieterAusgeschlossSO property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlBieterAusgeschlossSO() {
        return anzahlBieterAusgeschlossSO;
    }

    /**
     * Sets the value of the anzahlBieterAusgeschlossSO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlBieterAusgeschlossSO(BigInteger value) {
        this.anzahlBieterAusgeschlossSO = value;
    }

    /**
     * Gets the value of the anzahlHauptangeboteD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlHauptangeboteD() {
        return anzahlHauptangeboteD;
    }

    /**
     * Sets the value of the anzahlHauptangeboteD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlHauptangeboteD(BigInteger value) {
        this.anzahlHauptangeboteD = value;
    }

    /**
     * Gets the value of the anzahlHauptangeboteEU property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlHauptangeboteEU() {
        return anzahlHauptangeboteEU;
    }

    /**
     * Sets the value of the anzahlHauptangeboteEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlHauptangeboteEU(BigInteger value) {
        this.anzahlHauptangeboteEU = value;
    }

    /**
     * Gets the value of the anzahlHauptangeboteSO property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlHauptangeboteSO() {
        return anzahlHauptangeboteSO;
    }

    /**
     * Sets the value of the anzahlHauptangeboteSO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlHauptangeboteSO(BigInteger value) {
        this.anzahlHauptangeboteSO = value;
    }

    /**
     * Gets the value of the anzahlNebenangeboteD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlNebenangeboteD() {
        return anzahlNebenangeboteD;
    }

    /**
     * Sets the value of the anzahlNebenangeboteD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlNebenangeboteD(BigInteger value) {
        this.anzahlNebenangeboteD = value;
    }

    /**
     * Gets the value of the anzahlNebenangeboteEU property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlNebenangeboteEU() {
        return anzahlNebenangeboteEU;
    }

    /**
     * Sets the value of the anzahlNebenangeboteEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlNebenangeboteEU(BigInteger value) {
        this.anzahlNebenangeboteEU = value;
    }

    /**
     * Gets the value of the anzahlNebenangeboteSO property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlNebenangeboteSO() {
        return anzahlNebenangeboteSO;
    }

    /**
     * Sets the value of the anzahlNebenangeboteSO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlNebenangeboteSO(BigInteger value) {
        this.anzahlNebenangeboteSO = value;
    }

    /**
     * Gets the value of the wertungskriterium property.
     * 
     * @return
     *     possible object is
     *     {@link WertungskriteriumPropertyType }
     *     
     */
    public WertungskriteriumPropertyType getWertungskriterium() {
        return wertungskriterium;
    }

    /**
     * Sets the value of the wertungskriterium property.
     * 
     * @param value
     *     allowed object is
     *     {@link WertungskriteriumPropertyType }
     *     
     */
    public void setWertungskriterium(WertungskriteriumPropertyType value) {
        this.wertungskriterium = value;
    }

    /**
     * Gets the value of the zuBaumassnahme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zuBaumassnahme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZuBaumassnahme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getZuBaumassnahme() {
        if (zuBaumassnahme == null) {
            zuBaumassnahme = new ArrayList<ObjectRefType>();
        }
        return this.zuBaumassnahme;
    }

    /**
     * Gets the value of the hatNachpruefungsverfahren property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatNachpruefungsverfahren property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatNachpruefungsverfahren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatNachpruefungsverfahren() {
        if (hatNachpruefungsverfahren == null) {
            hatNachpruefungsverfahren = new ArrayList<ObjectRefType>();
        }
        return this.hatNachpruefungsverfahren;
    }

    /**
     * Gets the value of the anWertungMitwirkendeFirma property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anWertungMitwirkendeFirma property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnWertungMitwirkendeFirma().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getAnWertungMitwirkendeFirma() {
        if (anWertungMitwirkendeFirma == null) {
            anWertungMitwirkendeFirma = new ArrayList<ObjectRefType>();
        }
        return this.anWertungMitwirkendeFirma;
    }

    /**
     * Gets the value of the hatAngebot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatAngebot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatAngebot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getHatAngebot() {
        if (hatAngebot == null) {
            hatAngebot = new ArrayList<ObjectRefType>();
        }
        return this.hatAngebot;
    }

}
