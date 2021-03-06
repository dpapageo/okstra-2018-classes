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
 * <p>Java class for EBWH_Untergruppe_Tunnel_bergmaennischType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EBWH_Untergruppe_Tunnel_bergmaennischType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KBK_Nummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="zu_Formblatt_EBWH" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType"/&gt;
 *         &lt;element name="Baustelleneinrichtung" type="{http://www.okstra.de/okstra/2.018.2}KostenbeschreibungPropertyType"/&gt;
 *         &lt;element name="Verkehrssicherung" type="{http://www.okstra.de/okstra/2.018.2}KostenbeschreibungPropertyType"/&gt;
 *         &lt;element name="Gruendung" type="{http://www.okstra.de/okstra/2.018.2}KostenbeschreibungPropertyType"/&gt;
 *         &lt;element name="Technische_Bearbeitung" type="{http://www.okstra.de/okstra/2.018.2}KostenbeschreibungPropertyType"/&gt;
 *         &lt;element name="Baugruben" type="{http://www.okstra.de/okstra/2.018.2}KostenbeschreibungPropertyType"/&gt;
 *         &lt;element name="Gerueste" type="{http://www.okstra.de/okstra/2.018.2}KostenbeschreibungPropertyType"/&gt;
 *         &lt;element name="Innenausbau_Strassenaufbau" type="{http://www.okstra.de/okstra/2.018.2}KostenbeschreibungPropertyType"/&gt;
 *         &lt;element name="Entwaesserung" type="{http://www.okstra.de/okstra/2.018.2}KostenbeschreibungPropertyType"/&gt;
 *         &lt;element name="Pannenbuchten" type="{http://www.okstra.de/okstra/2.018.2}KostenbeschreibungPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Tunnelinnenschale_Portale" type="{http://www.okstra.de/okstra/2.018.2}KostenbeschreibungPropertyType"/&gt;
 *         &lt;element name="Rettungsstollen" type="{http://www.okstra.de/okstra/2.018.2}KostenbeschreibungPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Betriebsgebaeude" type="{http://www.okstra.de/okstra/2.018.2}KostenbeschreibungPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBWH_Untergruppe_Tunnel_bergmaennischType", propOrder = {
    "okstraid",
    "zuBeschriftung",
    "referenziertFremddatenbestand",
    "referenziertFremdobjekt",
    "zuKommunikationsobjekt",
    "kbkNummer",
    "zuFormblattEBWH",
    "baustelleneinrichtung",
    "verkehrssicherung",
    "gruendung",
    "technischeBearbeitung",
    "baugruben",
    "gerueste",
    "innenausbauStrassenaufbau",
    "entwaesserung",
    "pannenbuchten",
    "tunnelinnenschalePortale",
    "rettungsstollen",
    "betriebsgebaeude"
})
public class EBWHUntergruppeTunnelBergmaennischType
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
    @XmlElement(name = "KBK_Nummer", required = true)
    protected String kbkNummer;
    @XmlElement(name = "zu_Formblatt_EBWH", required = true)
    protected ObjectRefType zuFormblattEBWH;
    @XmlElement(name = "Baustelleneinrichtung", required = true)
    protected KostenbeschreibungPropertyType baustelleneinrichtung;
    @XmlElement(name = "Verkehrssicherung", required = true)
    protected KostenbeschreibungPropertyType verkehrssicherung;
    @XmlElement(name = "Gruendung", required = true)
    protected KostenbeschreibungPropertyType gruendung;
    @XmlElement(name = "Technische_Bearbeitung", required = true)
    protected KostenbeschreibungPropertyType technischeBearbeitung;
    @XmlElement(name = "Baugruben", required = true)
    protected KostenbeschreibungPropertyType baugruben;
    @XmlElement(name = "Gerueste", required = true)
    protected KostenbeschreibungPropertyType gerueste;
    @XmlElement(name = "Innenausbau_Strassenaufbau", required = true)
    protected KostenbeschreibungPropertyType innenausbauStrassenaufbau;
    @XmlElement(name = "Entwaesserung", required = true)
    protected KostenbeschreibungPropertyType entwaesserung;
    @XmlElement(name = "Pannenbuchten")
    protected KostenbeschreibungPropertyType pannenbuchten;
    @XmlElement(name = "Tunnelinnenschale_Portale", required = true)
    protected KostenbeschreibungPropertyType tunnelinnenschalePortale;
    @XmlElement(name = "Rettungsstollen")
    protected KostenbeschreibungPropertyType rettungsstollen;
    @XmlElement(name = "Betriebsgebaeude")
    protected KostenbeschreibungPropertyType betriebsgebaeude;

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
     * Gets the value of the kbkNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBKNummer() {
        return kbkNummer;
    }

    /**
     * Sets the value of the kbkNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBKNummer(String value) {
        this.kbkNummer = value;
    }

    /**
     * Gets the value of the zuFormblattEBWH property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getZuFormblattEBWH() {
        return zuFormblattEBWH;
    }

    /**
     * Sets the value of the zuFormblattEBWH property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setZuFormblattEBWH(ObjectRefType value) {
        this.zuFormblattEBWH = value;
    }

    /**
     * Gets the value of the baustelleneinrichtung property.
     * 
     * @return
     *     possible object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public KostenbeschreibungPropertyType getBaustelleneinrichtung() {
        return baustelleneinrichtung;
    }

    /**
     * Sets the value of the baustelleneinrichtung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public void setBaustelleneinrichtung(KostenbeschreibungPropertyType value) {
        this.baustelleneinrichtung = value;
    }

    /**
     * Gets the value of the verkehrssicherung property.
     * 
     * @return
     *     possible object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public KostenbeschreibungPropertyType getVerkehrssicherung() {
        return verkehrssicherung;
    }

    /**
     * Sets the value of the verkehrssicherung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public void setVerkehrssicherung(KostenbeschreibungPropertyType value) {
        this.verkehrssicherung = value;
    }

    /**
     * Gets the value of the gruendung property.
     * 
     * @return
     *     possible object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public KostenbeschreibungPropertyType getGruendung() {
        return gruendung;
    }

    /**
     * Sets the value of the gruendung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public void setGruendung(KostenbeschreibungPropertyType value) {
        this.gruendung = value;
    }

    /**
     * Gets the value of the technischeBearbeitung property.
     * 
     * @return
     *     possible object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public KostenbeschreibungPropertyType getTechnischeBearbeitung() {
        return technischeBearbeitung;
    }

    /**
     * Sets the value of the technischeBearbeitung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public void setTechnischeBearbeitung(KostenbeschreibungPropertyType value) {
        this.technischeBearbeitung = value;
    }

    /**
     * Gets the value of the baugruben property.
     * 
     * @return
     *     possible object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public KostenbeschreibungPropertyType getBaugruben() {
        return baugruben;
    }

    /**
     * Sets the value of the baugruben property.
     * 
     * @param value
     *     allowed object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public void setBaugruben(KostenbeschreibungPropertyType value) {
        this.baugruben = value;
    }

    /**
     * Gets the value of the gerueste property.
     * 
     * @return
     *     possible object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public KostenbeschreibungPropertyType getGerueste() {
        return gerueste;
    }

    /**
     * Sets the value of the gerueste property.
     * 
     * @param value
     *     allowed object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public void setGerueste(KostenbeschreibungPropertyType value) {
        this.gerueste = value;
    }

    /**
     * Gets the value of the innenausbauStrassenaufbau property.
     * 
     * @return
     *     possible object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public KostenbeschreibungPropertyType getInnenausbauStrassenaufbau() {
        return innenausbauStrassenaufbau;
    }

    /**
     * Sets the value of the innenausbauStrassenaufbau property.
     * 
     * @param value
     *     allowed object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public void setInnenausbauStrassenaufbau(KostenbeschreibungPropertyType value) {
        this.innenausbauStrassenaufbau = value;
    }

    /**
     * Gets the value of the entwaesserung property.
     * 
     * @return
     *     possible object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public KostenbeschreibungPropertyType getEntwaesserung() {
        return entwaesserung;
    }

    /**
     * Sets the value of the entwaesserung property.
     * 
     * @param value
     *     allowed object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public void setEntwaesserung(KostenbeschreibungPropertyType value) {
        this.entwaesserung = value;
    }

    /**
     * Gets the value of the pannenbuchten property.
     * 
     * @return
     *     possible object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public KostenbeschreibungPropertyType getPannenbuchten() {
        return pannenbuchten;
    }

    /**
     * Sets the value of the pannenbuchten property.
     * 
     * @param value
     *     allowed object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public void setPannenbuchten(KostenbeschreibungPropertyType value) {
        this.pannenbuchten = value;
    }

    /**
     * Gets the value of the tunnelinnenschalePortale property.
     * 
     * @return
     *     possible object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public KostenbeschreibungPropertyType getTunnelinnenschalePortale() {
        return tunnelinnenschalePortale;
    }

    /**
     * Sets the value of the tunnelinnenschalePortale property.
     * 
     * @param value
     *     allowed object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public void setTunnelinnenschalePortale(KostenbeschreibungPropertyType value) {
        this.tunnelinnenschalePortale = value;
    }

    /**
     * Gets the value of the rettungsstollen property.
     * 
     * @return
     *     possible object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public KostenbeschreibungPropertyType getRettungsstollen() {
        return rettungsstollen;
    }

    /**
     * Sets the value of the rettungsstollen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public void setRettungsstollen(KostenbeschreibungPropertyType value) {
        this.rettungsstollen = value;
    }

    /**
     * Gets the value of the betriebsgebaeude property.
     * 
     * @return
     *     possible object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public KostenbeschreibungPropertyType getBetriebsgebaeude() {
        return betriebsgebaeude;
    }

    /**
     * Sets the value of the betriebsgebaeude property.
     * 
     * @param value
     *     allowed object is
     *     {@link KostenbeschreibungPropertyType }
     *     
     */
    public void setBetriebsgebaeude(KostenbeschreibungPropertyType value) {
        this.betriebsgebaeude = value;
    }

}
