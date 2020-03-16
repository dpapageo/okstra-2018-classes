
package net.opengis.fes._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Scalar_CapabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Scalar_CapabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/fes/2.0}LogicalOperators" minOccurs="0"/>
 *         &lt;element name="ComparisonOperators" type="{http://www.opengis.net/fes/2.0}ComparisonOperatorsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scalar_CapabilitiesType", propOrder = {
    "logicalOperators",
    "comparisonOperators"
})
public class ScalarCapabilitiesType {

    @XmlElement(name = "LogicalOperators")
    protected LogicalOperators logicalOperators;
    @XmlElement(name = "ComparisonOperators")
    protected ComparisonOperatorsType comparisonOperators;

    /**
     * Gets the value of the logicalOperators property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperators }
     *     
     */
    public LogicalOperators getLogicalOperators() {
        return logicalOperators;
    }

    /**
     * Sets the value of the logicalOperators property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperators }
     *     
     */
    public void setLogicalOperators(LogicalOperators value) {
        this.logicalOperators = value;
    }

    /**
     * Gets the value of the comparisonOperators property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorsType }
     *     
     */
    public ComparisonOperatorsType getComparisonOperators() {
        return comparisonOperators;
    }

    /**
     * Sets the value of the comparisonOperators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorsType }
     *     
     */
    public void setComparisonOperators(ComparisonOperatorsType value) {
        this.comparisonOperators = value;
    }

}
