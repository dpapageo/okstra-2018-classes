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
 * <p>Java class for Art_VerkehrsfuehrungType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Art_VerkehrsfuehrungType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kennung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Langtext" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Art_VerkehrsfuehrungType", propOrder = {
    "kennung",
    "langtext"
})
public class ArtVerkehrsfuehrungType
    extends AbstractFeatureType
{

    @XmlElement(name = "Kennung", required = true)
    protected String kennung;
    @XmlElement(name = "Langtext", required = true)
    protected String langtext;

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
     * Gets the value of the langtext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangtext() {
        return langtext;
    }

    /**
     * Sets the value of the langtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangtext(String value) {
        this.langtext = value;
    }

}
