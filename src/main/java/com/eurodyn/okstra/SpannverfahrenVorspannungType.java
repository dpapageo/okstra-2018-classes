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
 * <p>Java class for Spannverfahren_VorspannungType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Spannverfahren_VorspannungType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kennung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Zulassung" type="{http://www.okstra.de/okstra/2.018.2}ZulassungPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Hersteller" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Typenbezeichnung_Spannverfahren" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Geltungsdauer_Bis" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Extern" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maximale_Spannkraft" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}Newton"/&gt;
 *         &lt;element name="Spanngliedart" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Spannverfahren_VorspannungType", propOrder = {
    "kennung",
    "zulassung",
    "hersteller",
    "typenbezeichnungSpannverfahren",
    "geltungsdauerBis",
    "extern",
    "maximaleSpannkraft",
    "spanngliedart"
})
public class SpannverfahrenVorspannungType {

    @XmlElement(name = "Kennung", required = true)
    protected String kennung;
    @XmlElement(name = "Zulassung")
    protected List<ZulassungPropertyType> zulassung;
    @XmlElement(name = "Hersteller", required = true)
    protected String hersteller;
    @XmlElement(name = "Typenbezeichnung_Spannverfahren", required = true)
    protected String typenbezeichnungSpannverfahren;
    @XmlElement(name = "Geltungsdauer_Bis", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar geltungsdauerBis;
    @XmlElement(name = "Extern")
    protected boolean extern;
    @XmlElement(name = "maximale_Spannkraft", required = true)
    protected Newton maximaleSpannkraft;
    @XmlElement(name = "Spanngliedart", required = true)
    protected KeyValuePropertyType spanngliedart;

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
     * Gets the value of the typenbezeichnungSpannverfahren property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypenbezeichnungSpannverfahren() {
        return typenbezeichnungSpannverfahren;
    }

    /**
     * Sets the value of the typenbezeichnungSpannverfahren property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypenbezeichnungSpannverfahren(String value) {
        this.typenbezeichnungSpannverfahren = value;
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
     * Gets the value of the extern property.
     * 
     */
    public boolean isExtern() {
        return extern;
    }

    /**
     * Sets the value of the extern property.
     * 
     */
    public void setExtern(boolean value) {
        this.extern = value;
    }

    /**
     * Gets the value of the maximaleSpannkraft property.
     * 
     * @return
     *     possible object is
     *     {@link Newton }
     *     
     */
    public Newton getMaximaleSpannkraft() {
        return maximaleSpannkraft;
    }

    /**
     * Sets the value of the maximaleSpannkraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Newton }
     *     
     */
    public void setMaximaleSpannkraft(Newton value) {
        this.maximaleSpannkraft = value;
    }

    /**
     * Gets the value of the spanngliedart property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getSpanngliedart() {
        return spanngliedart;
    }

    /**
     * Sets the value of the spanngliedart property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setSpanngliedart(KeyValuePropertyType value) {
        this.spanngliedart = value;
    }

}
