//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.09 at 04:49:50 PM EET 
//


package com.eurodyn.okstra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompoundCRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompoundCRSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}componentReferenceSystem" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundCRSType", namespace = "http://www.opengis.net/gml/3.2", propOrder = {
    "componentReferenceSystem"
})
public class CompoundCRSType
    extends AbstractCRSType
{

    @XmlElementRef(name = "componentReferenceSystem", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<SingleCRSPropertyType>> componentReferenceSystem;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the componentReferenceSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentReferenceSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentReferenceSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SingleCRSPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link SingleCRSPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<SingleCRSPropertyType>> getComponentReferenceSystem() {
        if (componentReferenceSystem == null) {
            componentReferenceSystem = new ArrayList<JAXBElement<SingleCRSPropertyType>>();
        }
        return this.componentReferenceSystem;
    }

    /**
     * Gets the value of the aggregationType property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Sets the value of the aggregationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

}
