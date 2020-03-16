
package net.opengis.fes._2;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for TemporalOperatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemporalOperatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TemporalOperands" type="{http://www.opengis.net/fes/2.0}TemporalOperandsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.opengis.net/fes/2.0}TemporalOperatorNameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalOperatorType", propOrder = {
    "temporalOperands"
})
public class TemporalOperatorType {

    @XmlElement(name = "TemporalOperands")
    protected TemporalOperandsType temporalOperands;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the temporalOperands property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalOperandsType }
     *     
     */
    public TemporalOperandsType getTemporalOperands() {
        return temporalOperands;
    }

    /**
     * Sets the value of the temporalOperands property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalOperandsType }
     *     
     */
    public void setTemporalOperands(TemporalOperandsType value) {
        this.temporalOperands = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
