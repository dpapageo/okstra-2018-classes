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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Time period covered by the content of the dataset
 * 
 * <p>Java class for EX_TemporalExtent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EX_TemporalExtent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extent" type="{http://www.isotc211.org/2005/gts}TM_Primitive_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_TemporalExtent_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "extent"
})
@XmlSeeAlso({
    EXSpatialTemporalExtentType.class
})
public class EXTemporalExtentType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected TMPrimitivePropertyType extent;

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link TMPrimitivePropertyType }
     *     
     */
    public TMPrimitivePropertyType getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMPrimitivePropertyType }
     *     
     */
    public void setExtent(TMPrimitivePropertyType value) {
        this.extent = value;
    }

}
