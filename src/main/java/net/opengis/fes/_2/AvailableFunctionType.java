
package net.opengis.fes._2;

import net.opengis.ows._1.MetadataType;

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;


/**
 * <p>Java class for AvailableFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}Metadata" minOccurs="0"/>
 *         &lt;element name="Returns" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="Arguments" type="{http://www.opengis.net/fes/2.0}ArgumentsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableFunctionType", propOrder = {
    "metadata",
    "returns",
    "arguments"
})
public class AvailableFunctionType {

    @XmlElement(name = "Metadata", namespace = "http://www.opengis.net/ows/1.1")
    protected MetadataType metadata;
    @XmlElement(name = "Returns", required = true)
    protected QName returns;
    @XmlElement(name = "Arguments")
    protected ArgumentsType arguments;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataType }
     *     
     */
    public MetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *     
     */
    public void setMetadata(MetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the returns property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getReturns() {
        return returns;
    }

    /**
     * Sets the value of the returns property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setReturns(QName value) {
        this.returns = value;
    }

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link ArgumentsType }
     *     
     */
    public ArgumentsType getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArgumentsType }
     *     
     */
    public void setArguments(ArgumentsType value) {
        this.arguments = value;
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
