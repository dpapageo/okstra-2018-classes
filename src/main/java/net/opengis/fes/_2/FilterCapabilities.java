
package net.opengis.fes._2;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Conformance" type="{http://www.opengis.net/fes/2.0}ConformanceType"/>
 *         &lt;element name="Id_Capabilities" type="{http://www.opengis.net/fes/2.0}Id_CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="Scalar_Capabilities" type="{http://www.opengis.net/fes/2.0}Scalar_CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="Spatial_Capabilities" type="{http://www.opengis.net/fes/2.0}Spatial_CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="Temporal_Capabilities" type="{http://www.opengis.net/fes/2.0}Temporal_CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="Functions" type="{http://www.opengis.net/fes/2.0}AvailableFunctionsType" minOccurs="0"/>
 *         &lt;element name="Extended_Capabilities" type="{http://www.opengis.net/fes/2.0}Extended_CapabilitiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conformance",
    "idCapabilities",
    "scalarCapabilities",
    "spatialCapabilities",
    "temporalCapabilities",
    "functions",
    "extendedCapabilities"
})
@XmlRootElement(name = "Filter_Capabilities")
public class FilterCapabilities {

    @XmlElement(name = "Conformance", required = true)
    protected ConformanceType conformance;
    @XmlElement(name = "Id_Capabilities")
    protected IdCapabilitiesType idCapabilities;
    @XmlElement(name = "Scalar_Capabilities")
    protected ScalarCapabilitiesType scalarCapabilities;
    @XmlElement(name = "Spatial_Capabilities")
    protected SpatialCapabilitiesType spatialCapabilities;
    @XmlElement(name = "Temporal_Capabilities")
    protected TemporalCapabilitiesType temporalCapabilities;
    @XmlElement(name = "Functions")
    protected AvailableFunctionsType functions;
    @XmlElement(name = "Extended_Capabilities")
    protected ExtendedCapabilitiesType extendedCapabilities;

    /**
     * Gets the value of the conformance property.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceType }
     *     
     */
    public ConformanceType getConformance() {
        return conformance;
    }

    /**
     * Sets the value of the conformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceType }
     *     
     */
    public void setConformance(ConformanceType value) {
        this.conformance = value;
    }

    /**
     * Gets the value of the idCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link IdCapabilitiesType }
     *     
     */
    public IdCapabilitiesType getIdCapabilities() {
        return idCapabilities;
    }

    /**
     * Sets the value of the idCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdCapabilitiesType }
     *     
     */
    public void setIdCapabilities(IdCapabilitiesType value) {
        this.idCapabilities = value;
    }

    /**
     * Gets the value of the scalarCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ScalarCapabilitiesType }
     *     
     */
    public ScalarCapabilitiesType getScalarCapabilities() {
        return scalarCapabilities;
    }

    /**
     * Sets the value of the scalarCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScalarCapabilitiesType }
     *     
     */
    public void setScalarCapabilities(ScalarCapabilitiesType value) {
        this.scalarCapabilities = value;
    }

    /**
     * Gets the value of the spatialCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialCapabilitiesType }
     *     
     */
    public SpatialCapabilitiesType getSpatialCapabilities() {
        return spatialCapabilities;
    }

    /**
     * Sets the value of the spatialCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialCapabilitiesType }
     *     
     */
    public void setSpatialCapabilities(SpatialCapabilitiesType value) {
        this.spatialCapabilities = value;
    }

    /**
     * Gets the value of the temporalCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalCapabilitiesType }
     *     
     */
    public TemporalCapabilitiesType getTemporalCapabilities() {
        return temporalCapabilities;
    }

    /**
     * Sets the value of the temporalCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalCapabilitiesType }
     *     
     */
    public void setTemporalCapabilities(TemporalCapabilitiesType value) {
        this.temporalCapabilities = value;
    }

    /**
     * Gets the value of the functions property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableFunctionsType }
     *     
     */
    public AvailableFunctionsType getFunctions() {
        return functions;
    }

    /**
     * Sets the value of the functions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableFunctionsType }
     *     
     */
    public void setFunctions(AvailableFunctionsType value) {
        this.functions = value;
    }

    /**
     * Gets the value of the extendedCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCapabilitiesType }
     *     
     */
    public ExtendedCapabilitiesType getExtendedCapabilities() {
        return extendedCapabilities;
    }

    /**
     * Sets the value of the extendedCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCapabilitiesType }
     *     
     */
    public void setExtendedCapabilities(ExtendedCapabilitiesType value) {
        this.extendedCapabilities = value;
    }

}
