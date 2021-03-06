
package net.opengis.ows._1;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * A range of values of a numeric parameter. This range can be continuous or discrete, defined by a fixed spacing between adjacent valid values. If the MinimumValue or MaximumValue is not included, there is no value limit in that direction. Inclusion of the specified minimum and maximum values in the range shall be defined by the rangeClosure. 
 * 
 * <p>Java class for RangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}MinimumValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}MaximumValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}Spacing" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.opengis.net/ows/1.1}rangeClosure"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeType", propOrder = {
    "minimumValue",
    "maximumValue",
    "spacing"
})
public class RangeType {

    @XmlElement(name = "MinimumValue")
    protected ValueType minimumValue;
    @XmlElement(name = "MaximumValue")
    protected ValueType maximumValue;
    @XmlElement(name = "Spacing")
    protected ValueType spacing;
    @XmlAttribute(name = "rangeClosure", namespace = "http://www.opengis.net/ows/1.1")
    protected List<String> rangeClosure;

    /**
     * Gets the value of the minimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setMinimumValue(ValueType value) {
        this.minimumValue = value;
    }

    /**
     * Gets the value of the maximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setMaximumValue(ValueType value) {
        this.maximumValue = value;
    }

    /**
     * Shall be included when the allowed values are NOT continuous in this range. Shall not be included when the allowed values are continuous in this range. 
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getSpacing() {
        return spacing;
    }

    /**
     * Sets the value of the spacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setSpacing(ValueType value) {
        this.spacing = value;
    }

    /**
     * Shall be included unless the default value applies. Gets the value of the rangeClosure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rangeClosure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangeClosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRangeClosure() {
        if (rangeClosure == null) {
            rangeClosure = new ArrayList<String>();
        }
        return this.rangeClosure;
    }

}
