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
 * <p>Java class for Art_SpannstahlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Art_SpannstahlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kennung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Zulassung" type="{http://www.okstra.de/okstra/2.018.2}ZulassungPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Hersteller" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Typenbezeichnung_Spannstahl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Geltungsdauer_Bis" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Streckgrenze" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Newton_pro_Quadratmeter"/&gt;
 *         &lt;element name="Bruchgrenze" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Newton_pro_Quadratmeter"/&gt;
 *         &lt;element name="Spannungsrisskorrosionsgefaehrdet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Art_SpannstahlType", propOrder = {
    "kennung",
    "zulassung",
    "hersteller",
    "typenbezeichnungSpannstahl",
    "geltungsdauerBis",
    "streckgrenze",
    "bruchgrenze",
    "spannungsrisskorrosionsgefaehrdet"
})
public class ArtSpannstahlType {

    @XmlElement(name = "Kennung", required = true)
    protected String kennung;
    @XmlElement(name = "Zulassung")
    protected List<ZulassungPropertyType> zulassung;
    @XmlElement(name = "Hersteller", required = true)
    protected String hersteller;
    @XmlElement(name = "Typenbezeichnung_Spannstahl", required = true)
    protected String typenbezeichnungSpannstahl;
    @XmlElement(name = "Geltungsdauer_Bis", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar geltungsdauerBis;
    @XmlElement(name = "Streckgrenze", required = true)
    protected NewtonProQuadratmeter streckgrenze;
    @XmlElement(name = "Bruchgrenze", required = true)
    protected NewtonProQuadratmeter bruchgrenze;
    @XmlElement(name = "Spannungsrisskorrosionsgefaehrdet")
    protected boolean spannungsrisskorrosionsgefaehrdet;

    /**
     * Gets the value of the kennung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKennung() {
        return kennung;
    }

    /**
     * Sets the value of the kennung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKennung(String value) {
        this.kennung = value;
    }

    /**
     * Gets the value of the zulassung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zulassung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZulassung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZulassungPropertyType }
     * 
     * 
     */
    public List<ZulassungPropertyType> getZulassung() {
        if (zulassung == null) {
            zulassung = new ArrayList<ZulassungPropertyType>();
        }
        return this.zulassung;
    }

    /**
     * Gets the value of the hersteller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHersteller() {
        return hersteller;
    }

    /**
     * Sets the value of the hersteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHersteller(String value) {
        this.hersteller = value;
    }

    /**
     * Gets the value of the typenbezeichnungSpannstahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypenbezeichnungSpannstahl() {
        return typenbezeichnungSpannstahl;
    }

    /**
     * Sets the value of the typenbezeichnungSpannstahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypenbezeichnungSpannstahl(String value) {
        this.typenbezeichnungSpannstahl = value;
    }

    /**
     * Gets the value of the geltungsdauerBis property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeltungsdauerBis() {
        return geltungsdauerBis;
    }

    /**
     * Sets the value of the geltungsdauerBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeltungsdauerBis(XMLGregorianCalendar value) {
        this.geltungsdauerBis = value;
    }

    /**
     * Gets the value of the streckgrenze property.
     * 
     * @return
     *     possible object is
     *     {@link NewtonProQuadratmeter }
     *     
     */
    public NewtonProQuadratmeter getStreckgrenze() {
        return streckgrenze;
    }

    /**
     * Sets the value of the streckgrenze property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewtonProQuadratmeter }
     *     
     */
    public void setStreckgrenze(NewtonProQuadratmeter value) {
        this.streckgrenze = value;
    }

    /**
     * Gets the value of the bruchgrenze property.
     * 
     * @return
     *     possible object is
     *     {@link NewtonProQuadratmeter }
     *     
     */
    public NewtonProQuadratmeter getBruchgrenze() {
        return bruchgrenze;
    }

    /**
     * Sets the value of the bruchgrenze property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewtonProQuadratmeter }
     *     
     */
    public void setBruchgrenze(NewtonProQuadratmeter value) {
        this.bruchgrenze = value;
    }

    /**
     * Gets the value of the spannungsrisskorrosionsgefaehrdet property.
     * 
     */
    public boolean isSpannungsrisskorrosionsgefaehrdet() {
        return spannungsrisskorrosionsgefaehrdet;
    }

    /**
     * Sets the value of the spannungsrisskorrosionsgefaehrdet property.
     * 
     */
    public void setSpannungsrisskorrosionsgefaehrdet(boolean value) {
        this.spannungsrisskorrosionsgefaehrdet = value;
    }

}
