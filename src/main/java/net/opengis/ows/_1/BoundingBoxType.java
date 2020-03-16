
package net.opengis.ows._1;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * This type is adapted from the EnvelopeType of GML 3.1, with modified contents and documentation for encoding a MINIMUM size box SURROUNDING all associated data. 
 * 
 * <p>Java class for BoundingBoxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoundingBoxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowerCorner" type="{http://www.opengis.net/ows/1.1}PositionType"/>
 *         &lt;element name="UpperCorner" type="{http://www.opengis.net/ows/1.1}PositionType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="crs" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="dimensions" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingBoxType", propOrder = {
    "lowerCorner",
    "upperCorner"
})
@XmlSeeAlso({
    WGS84BoundingBoxType.class
})
public class BoundingBoxType {

    @XmlList
    @XmlElement(name = "LowerCorner", type = Double.class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<Double> lowerCorner;
    @XmlList
    @XmlElement(name = "UpperCorner", type = Double.class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<Double> upperCorner;
    @XmlAttribute(name = "crs")
    @XmlSchemaType(name = "anyURI")
    protected String crs;
    @XmlAttribute(name = "dimensions")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dimensions;

    /**
     * Gets the value of the lowerCorner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lowerCorner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLowerCorner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getLowerCorner() {
        if (lowerCorner == null) {
            lowerCorner = new ArrayList<Double>();
        }
        return this.lowerCorner;
    }

    /**
     * Gets the value of the upperCorner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upperCorner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpperCorner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getUpperCorner() {
        if (upperCorner == null) {
            upperCorner = new ArrayList<Double>();
        }
        return this.upperCorner;
    }

    /**
     * Gets the value of the crs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrs() {
        return crs;
    }

    /**
     * Sets the value of the crs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrs(String value) {
        this.crs = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDimensions(BigInteger value) {
        this.dimensions = value;
    }

}
