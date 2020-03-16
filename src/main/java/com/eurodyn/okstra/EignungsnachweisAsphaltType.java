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
 * <p>Java class for Eignungsnachweis_AsphaltType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Eignungsnachweis_AsphaltType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Erstpruefungsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Datum_Erstpruefung" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Eignungsnachweisnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Geliefert_nach_Regelwerk" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Projektbezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Datum_Eignungsnachweis" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Asphaltmischgut" type="{http://www.okstra.de/okstra/2.018.2}AsphaltmischgutPropertyType"/&gt;
 *         &lt;element name="Asphaltgranulat" type="{http://www.okstra.de/okstra/2.018.2}AsphaltgranulatPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Bindemittel" type="{http://www.okstra.de/okstra/2.018.2}BindemittelPropertyType"/&gt;
 *         &lt;element name="Fueller" type="{http://www.okstra.de/okstra/2.018.2}FuellerPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Gesteinskoernung" type="{http://www.okstra.de/okstra/2.018.2}GesteinskoernungPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Korngroessenanteil" type="{http://www.okstra.de/okstra/2.018.2}KorngroessePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Aufhellungsgestein" type="{http://www.okstra.de/okstra/2.018.2}AufhellungsgesteinPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Eignungsnachweisdokument" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="von_Teilmassnahme" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Asphaltmischwerk" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType"/&gt;
 *         &lt;element name="Einbaufirma" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType"/&gt;
 *         &lt;element name="Pruefstelle" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Eignungsnachweis_AsphaltType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "erstpruefungsnummer",
    "datumErstpruefung",
    "eignungsnachweisnummer",
    "geliefertNachRegelwerk",
    "projektbezeichnung",
    "datumEignungsnachweis",
    "asphaltmischgut",
    "asphaltgranulat",
    "bindemittel",
    "fueller",
    "gesteinskoernung",
    "korngroessenanteil",
    "aufhellungsgestein",
    "eignungsnachweisdokument",
    "vonTeilmassnahme",
    "asphaltmischwerk",
    "einbaufirma",
    "pruefstelle"
})
public class EignungsnachweisAsphaltType
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
    @XmlElement(name = "Erstpruefungsnummer", required = true)
    protected String erstpruefungsnummer;
    @XmlElement(name = "Datum_Erstpruefung", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumErstpruefung;
    @XmlElement(name = "Eignungsnachweisnummer", required = true)
    protected String eignungsnachweisnummer;
    @XmlElement(name = "Geliefert_nach_Regelwerk", required = true)
    protected String geliefertNachRegelwerk;
    @XmlElement(name = "Projektbezeichnung", required = true)
    protected String projektbezeichnung;
    @XmlElement(name = "Datum_Eignungsnachweis", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumEignungsnachweis;
    @XmlElement(name = "Asphaltmischgut", required = true)
    protected AsphaltmischgutPropertyType asphaltmischgut;
    @XmlElement(name = "Asphaltgranulat")
    protected AsphaltgranulatPropertyType asphaltgranulat;
    @XmlElement(name = "Bindemittel", required = true)
    protected BindemittelPropertyType bindemittel;
    @XmlElement(name = "Fueller")
    protected FuellerPropertyType fueller;
    @XmlElement(name = "Gesteinskoernung")
    protected List<GesteinskoernungPropertyType> gesteinskoernung;
    @XmlElement(name = "Korngroessenanteil")
    protected List<KorngroessePropertyType> korngroessenanteil;
    @XmlElement(name = "Aufhellungsgestein")
    protected List<AufhellungsgesteinPropertyType> aufhellungsgestein;
    @XmlElement(name = "Eignungsnachweisdokument", required = true)
    protected List<ObjectRefType> eignungsnachweisdokument;
    @XmlElement(name = "von_Teilmassnahme")
    protected List<ObjectRefType> vonTeilmassnahme;
    @XmlElement(name = "Asphaltmischwerk", required = true)
    protected ObjectRefType asphaltmischwerk;
    @XmlElement(name = "Einbaufirma", required = true)
    protected ObjectRefType einbaufirma;
    @XmlElement(name = "Pruefstelle")
    protected ObjectRefType pruefstelle;

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
     * Gets the value of the erstpruefungsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErstpruefungsnummer() {
        return erstpruefungsnummer;
    }

    /**
     * Sets the value of the erstpruefungsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErstpruefungsnummer(String value) {
        this.erstpruefungsnummer = value;
    }

    /**
     * Gets the value of the datumErstpruefung property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumErstpruefung() {
        return datumErstpruefung;
    }

    /**
     * Sets the value of the datumErstpruefung property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumErstpruefung(XMLGregorianCalendar value) {
        this.datumErstpruefung = value;
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
     * Gets the value of the geliefertNachRegelwerk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeliefertNachRegelwerk() {
        return geliefertNachRegelwerk;
    }

    /**
     * Sets the value of the geliefertNachRegelwerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeliefertNachRegelwerk(String value) {
        this.geliefertNachRegelwerk = value;
    }

    /**
     * Gets the value of the projektbezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjektbezeichnung() {
        return projektbezeichnung;
    }

    /**
     * Sets the value of the projektbezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjektbezeichnung(String value) {
        this.projektbezeichnung = value;
    }

    /**
     * Gets the value of the datumEignungsnachweis property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumEignungsnachweis() {
        return datumEignungsnachweis;
    }

    /**
     * Sets the value of the datumEignungsnachweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumEignungsnachweis(XMLGregorianCalendar value) {
        this.datumEignungsnachweis = value;
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
     * Gets the value of the asphaltgranulat property.
     * 
     * @return
     *     possible object is
     *     {@link AsphaltgranulatPropertyType }
     *     
     */
    public AsphaltgranulatPropertyType getAsphaltgranulat() {
        return asphaltgranulat;
    }

    /**
     * Sets the value of the asphaltgranulat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsphaltgranulatPropertyType }
     *     
     */
    public void setAsphaltgranulat(AsphaltgranulatPropertyType value) {
        this.asphaltgranulat = value;
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
     * Gets the value of the fueller property.
     * 
     * @return
     *     possible object is
     *     {@link FuellerPropertyType }
     *     
     */
    public FuellerPropertyType getFueller() {
        return fueller;
    }

    /**
     * Sets the value of the fueller property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuellerPropertyType }
     *     
     */
    public void setFueller(FuellerPropertyType value) {
        this.fueller = value;
    }

    /**
     * Gets the value of the gesteinskoernung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gesteinskoernung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGesteinskoernung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GesteinskoernungPropertyType }
     * 
     * 
     */
    public List<GesteinskoernungPropertyType> getGesteinskoernung() {
        if (gesteinskoernung == null) {
            gesteinskoernung = new ArrayList<GesteinskoernungPropertyType>();
        }
        return this.gesteinskoernung;
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
     * Gets the value of the aufhellungsgestein property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aufhellungsgestein property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAufhellungsgestein().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AufhellungsgesteinPropertyType }
     * 
     * 
     */
    public List<AufhellungsgesteinPropertyType> getAufhellungsgestein() {
        if (aufhellungsgestein == null) {
            aufhellungsgestein = new ArrayList<AufhellungsgesteinPropertyType>();
        }
        return this.aufhellungsgestein;
    }

    /**
     * Gets the value of the eignungsnachweisdokument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eignungsnachweisdokument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEignungsnachweisdokument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getEignungsnachweisdokument() {
        if (eignungsnachweisdokument == null) {
            eignungsnachweisdokument = new ArrayList<ObjectRefType>();
        }
        return this.eignungsnachweisdokument;
    }

    /**
     * Gets the value of the vonTeilmassnahme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vonTeilmassnahme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVonTeilmassnahme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getVonTeilmassnahme() {
        if (vonTeilmassnahme == null) {
            vonTeilmassnahme = new ArrayList<ObjectRefType>();
        }
        return this.vonTeilmassnahme;
    }

    /**
     * Gets the value of the asphaltmischwerk property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getAsphaltmischwerk() {
        return asphaltmischwerk;
    }

    /**
     * Sets the value of the asphaltmischwerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setAsphaltmischwerk(ObjectRefType value) {
        this.asphaltmischwerk = value;
    }

    /**
     * Gets the value of the einbaufirma property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getEinbaufirma() {
        return einbaufirma;
    }

    /**
     * Sets the value of the einbaufirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setEinbaufirma(ObjectRefType value) {
        this.einbaufirma = value;
    }

    /**
     * Gets the value of the pruefstelle property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getPruefstelle() {
        return pruefstelle;
    }

    /**
     * Sets the value of the pruefstelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setPruefstelle(ObjectRefType value) {
        this.pruefstelle = value;
    }

}
