//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.09 at 04:49:50 PM EET 
//


package com.eurodyn.okstra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fertige_SchichtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fertige_SchichtType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Schichtdicke" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Zentimeter"/&gt;
 *         &lt;element name="Hohlraumgehalt" type="{http://www.okstra.de/okstra/2.018.2}HohlraumgehaltPropertyType"/&gt;
 *         &lt;element name="Verdichtungsgrad" type="{http://www.okstra.de/okstra/2.018.2}VerdichtungsgradPropertyType"/&gt;
 *         &lt;element name="Schichtenverbund" type="{http://www.okstra.de/okstra/2.018.2}SchichtenverbundPropertyType"/&gt;
 *         &lt;element name="Raumdichte_BK" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Gramm_pro_Kubikzentimeter"/&gt;
 *         &lt;element name="Einbaumenge" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Kilogramm_pro_Quadratmeter" minOccurs="0"/&gt;
 *         &lt;element name="Ermuedung" type="{http://www.okstra.de/okstra/2.018.2}ErmuedungPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Kaelteeigenschaften" type="{http://www.okstra.de/okstra/2.018.2}KaelteeigenschaftenPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Mittlere_Texturtiefe" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Millimeter" minOccurs="0"/&gt;
 *         &lt;element name="Verformungsbestaendigkeit" type="{http://www.okstra.de/okstra/2.018.2}VerformungsbestaendigkeitPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fertige_SchichtType", propOrder = {
    "schichtdicke",
    "hohlraumgehalt",
    "verdichtungsgrad",
    "schichtenverbund",
    "raumdichteBK",
    "einbaumenge",
    "ermuedung",
    "kaelteeigenschaften",
    "mittlereTexturtiefe",
    "verformungsbestaendigkeit"
})
public class FertigeSchichtType {

    @XmlElement(name = "Schichtdicke", required = true)
    protected Zentimeter schichtdicke;
    @XmlElement(name = "Hohlraumgehalt", required = true)
    protected HohlraumgehaltPropertyType hohlraumgehalt;
    @XmlElement(name = "Verdichtungsgrad", required = true)
    protected VerdichtungsgradPropertyType verdichtungsgrad;
    @XmlElement(name = "Schichtenverbund", required = true)
    protected SchichtenverbundPropertyType schichtenverbund;
    @XmlElement(name = "Raumdichte_BK", required = true)
    protected GrammProKubikzentimeter raumdichteBK;
    @XmlElement(name = "Einbaumenge")
    protected KilogrammProQuadratmeter einbaumenge;
    @XmlElement(name = "Ermuedung")
    protected ErmuedungPropertyType ermuedung;
    @XmlElement(name = "Kaelteeigenschaften")
    protected KaelteeigenschaftenPropertyType kaelteeigenschaften;
    @XmlElement(name = "Mittlere_Texturtiefe")
    protected Millimeter mittlereTexturtiefe;
    @XmlElement(name = "Verformungsbestaendigkeit")
    protected VerformungsbestaendigkeitPropertyType verformungsbestaendigkeit;

    /**
     * Gets the value of the schichtdicke property.
     * 
     * @return
     *     possible object is
     *     {@link Zentimeter }
     *     
     */
    public Zentimeter getSchichtdicke() {
        return schichtdicke;
    }

    /**
     * Sets the value of the schichtdicke property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zentimeter }
     *     
     */
    public void setSchichtdicke(Zentimeter value) {
        this.schichtdicke = value;
    }

    /**
     * Gets the value of the hohlraumgehalt property.
     * 
     * @return
     *     possible object is
     *     {@link HohlraumgehaltPropertyType }
     *     
     */
    public HohlraumgehaltPropertyType getHohlraumgehalt() {
        return hohlraumgehalt;
    }

    /**
     * Sets the value of the hohlraumgehalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link HohlraumgehaltPropertyType }
     *     
     */
    public void setHohlraumgehalt(HohlraumgehaltPropertyType value) {
        this.hohlraumgehalt = value;
    }

    /**
     * Gets the value of the verdichtungsgrad property.
     * 
     * @return
     *     possible object is
     *     {@link VerdichtungsgradPropertyType }
     *     
     */
    public VerdichtungsgradPropertyType getVerdichtungsgrad() {
        return verdichtungsgrad;
    }

    /**
     * Sets the value of the verdichtungsgrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerdichtungsgradPropertyType }
     *     
     */
    public void setVerdichtungsgrad(VerdichtungsgradPropertyType value) {
        this.verdichtungsgrad = value;
    }

    /**
     * Gets the value of the schichtenverbund property.
     * 
     * @return
     *     possible object is
     *     {@link SchichtenverbundPropertyType }
     *     
     */
    public SchichtenverbundPropertyType getSchichtenverbund() {
        return schichtenverbund;
    }

    /**
     * Sets the value of the schichtenverbund property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchichtenverbundPropertyType }
     *     
     */
    public void setSchichtenverbund(SchichtenverbundPropertyType value) {
        this.schichtenverbund = value;
    }

    /**
     * Gets the value of the raumdichteBK property.
     * 
     * @return
     *     possible object is
     *     {@link GrammProKubikzentimeter }
     *     
     */
    public GrammProKubikzentimeter getRaumdichteBK() {
        return raumdichteBK;
    }

    /**
     * Sets the value of the raumdichteBK property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrammProKubikzentimeter }
     *     
     */
    public void setRaumdichteBK(GrammProKubikzentimeter value) {
        this.raumdichteBK = value;
    }

    /**
     * Gets the value of the einbaumenge property.
     * 
     * @return
     *     possible object is
     *     {@link KilogrammProQuadratmeter }
     *     
     */
    public KilogrammProQuadratmeter getEinbaumenge() {
        return einbaumenge;
    }

    /**
     * Sets the value of the einbaumenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link KilogrammProQuadratmeter }
     *     
     */
    public void setEinbaumenge(KilogrammProQuadratmeter value) {
        this.einbaumenge = value;
    }

    /**
     * Gets the value of the ermuedung property.
     * 
     * @return
     *     possible object is
     *     {@link ErmuedungPropertyType }
     *     
     */
    public ErmuedungPropertyType getErmuedung() {
        return ermuedung;
    }

    /**
     * Sets the value of the ermuedung property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErmuedungPropertyType }
     *     
     */
    public void setErmuedung(ErmuedungPropertyType value) {
        this.ermuedung = value;
    }

    /**
     * Gets the value of the kaelteeigenschaften property.
     * 
     * @return
     *     possible object is
     *     {@link KaelteeigenschaftenPropertyType }
     *     
     */
    public KaelteeigenschaftenPropertyType getKaelteeigenschaften() {
        return kaelteeigenschaften;
    }

    /**
     * Sets the value of the kaelteeigenschaften property.
     * 
     * @param value
     *     allowed object is
     *     {@link KaelteeigenschaftenPropertyType }
     *     
     */
    public void setKaelteeigenschaften(KaelteeigenschaftenPropertyType value) {
        this.kaelteeigenschaften = value;
    }

    /**
     * Gets the value of the mittlereTexturtiefe property.
     * 
     * @return
     *     possible object is
     *     {@link Millimeter }
     *     
     */
    public Millimeter getMittlereTexturtiefe() {
        return mittlereTexturtiefe;
    }

    /**
     * Sets the value of the mittlereTexturtiefe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Millimeter }
     *     
     */
    public void setMittlereTexturtiefe(Millimeter value) {
        this.mittlereTexturtiefe = value;
    }

    /**
     * Gets the value of the verformungsbestaendigkeit property.
     * 
     * @return
     *     possible object is
     *     {@link VerformungsbestaendigkeitPropertyType }
     *     
     */
    public VerformungsbestaendigkeitPropertyType getVerformungsbestaendigkeit() {
        return verformungsbestaendigkeit;
    }

    /**
     * Sets the value of the verformungsbestaendigkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerformungsbestaendigkeitPropertyType }
     *     
     */
    public void setVerformungsbestaendigkeit(VerformungsbestaendigkeitPropertyType value) {
        this.verformungsbestaendigkeit = value;
    }

}
