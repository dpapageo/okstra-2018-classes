//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.09 at 04:49:50 PM EET 
//


package com.eurodyn.okstra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * direction descriptions are specified by a compass point code, a keyword, a textual description or a reference to a description.
 * A gml:compassPoint is specified by a simple enumeration.  	
 * In addition, thre elements to contain text-based descriptions of direction are provided.  
 * If the direction is specified using a term from a list, gml:keyword should be used, and the list indicated using the value of the codeSpace attribute. 
 * if the direction is decribed in prose, gml:direction or gml:reference should be used, allowing the value to be included inline or by reference.
 * 
 * <p>Java class for DirectionDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectionDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="compassPoint" type="{http://www.opengis.net/gml/3.2}CompassPointEnumeration"/&gt;
 *         &lt;element name="keyword" type="{http://www.opengis.net/gml/3.2}CodeType"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reference" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionDescriptionType", namespace = "http://www.opengis.net/gml/3.2", propOrder = {
    "compassPoint",
    "keyword",
    "description",
    "reference"
})
public class DirectionDescriptionType {

    @XmlSchemaType(name = "string")
    protected CompassPointEnumeration compassPoint;
    protected CodeType keyword;
    protected String description;
    protected ReferenceType reference;

    /**
     * Gets the value of the compassPoint property.
     * 
     * @return
     *     possible object is
     *     {@link CompassPointEnumeration }
     *     
     */
    public CompassPointEnumeration getCompassPoint() {
        return compassPoint;
    }

    /**
     * Sets the value of the compassPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompassPointEnumeration }
     *     
     */
    public void setCompassPoint(CompassPointEnumeration value) {
        this.compassPoint = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setKeyword(CodeType value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setReference(ReferenceType value) {
        this.reference = value;
    }

}
