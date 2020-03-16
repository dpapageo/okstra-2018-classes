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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A property that has a geometric complex as its value domain may either be an appropriate geometry element encapsulated in an element of this type or an XLink reference to a remote geometry element (where remote includes geometry elements located elsewhere in the same document). Either the reference or the contained element shall be given, but neither both nor none.
 * 
 * <p>Java class for GeometricComplexPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeometricComplexPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}GeometricComplex"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}CompositeCurve"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}CompositeSurface"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}CompositeSolid"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometricComplexPropertyType", namespace = "http://www.opengis.net/gml/3.2", propOrder = {
    "geometricComplex",
    "compositeCurve",
    "compositeSurface",
    "compositeSolid"
})
public class GeometricComplexPropertyType {

    @XmlElement(name = "GeometricComplex")
    protected GeometricComplexType geometricComplex;
    @XmlElement(name = "CompositeCurve")
    protected CompositeCurveType compositeCurve;
    @XmlElement(name = "CompositeSurface")
    protected CompositeSurfaceType compositeSurface;
    @XmlElement(name = "CompositeSolid")
    protected CompositeSolidType compositeSolid;
    @XmlAttribute(name = "owns")
    protected Boolean owns;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String attibuteTitle;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Gets the value of the geometricComplex property.
     * 
     * @return
     *     possible object is
     *     {@link GeometricComplexType }
     *     
     */
    public GeometricComplexType getGeometricComplex() {
        return geometricComplex;
    }

    /**
     * Sets the value of the geometricComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometricComplexType }
     *     
     */
    public void setGeometricComplex(GeometricComplexType value) {
        this.geometricComplex = value;
    }

    /**
     * Gets the value of the compositeCurve property.
     * 
     * @return
     *     possible object is
     *     {@link CompositeCurveType }
     *     
     */
    public CompositeCurveType getCompositeCurve() {
        return compositeCurve;
    }

    /**
     * Sets the value of the compositeCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeCurveType }
     *     
     */
    public void setCompositeCurve(CompositeCurveType value) {
        this.compositeCurve = value;
    }

    /**
     * Gets the value of the compositeSurface property.
     * 
     * @return
     *     possible object is
     *     {@link CompositeSurfaceType }
     *     
     */
    public CompositeSurfaceType getCompositeSurface() {
        return compositeSurface;
    }

    /**
     * Sets the value of the compositeSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeSurfaceType }
     *     
     */
    public void setCompositeSurface(CompositeSurfaceType value) {
        this.compositeSurface = value;
    }

    /**
     * Gets the value of the compositeSolid property.
     * 
     * @return
     *     possible object is
     *     {@link CompositeSolidType }
     *     
     */
    public CompositeSolidType getCompositeSolid() {
        return compositeSolid;
    }

    /**
     * Sets the value of the compositeSolid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeSolidType }
     *     
     */
    public void setCompositeSolid(CompositeSolidType value) {
        this.compositeSolid = value;
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(Boolean value) {
        this.owns = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the attibuteTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttibuteTitle() {
        return attibuteTitle;
    }

    /**
     * Sets the value of the attibuteTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttibuteTitle(String value) {
        this.attibuteTitle = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

}