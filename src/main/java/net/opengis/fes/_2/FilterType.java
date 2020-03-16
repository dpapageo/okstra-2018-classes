
package net.opengis.fes._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/fes/2.0}AbstractSelectionClauseType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/fes/2.0}FilterPredicates"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterType", propOrder = {
    "comparisonOps",
    "spatialOps",
    "temporalOps",
    "logicOps",
    "extensionOps",
    "function",
    "id"
})
public class FilterType
    extends AbstractSelectionClauseType
{

    @XmlElementRef(name = "comparisonOps", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ComparisonOpsType> comparisonOps;
    @XmlElementRef(name = "spatialOps", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SpatialOpsType> spatialOps;
    @XmlElementRef(name = "temporalOps", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TemporalOpsType> temporalOps;
    @XmlElementRef(name = "logicOps", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LogicOpsType> logicOps;
    protected ExtensionOpsType extensionOps;
    @XmlElement(name = "Function")
    protected FunctionType function;
    @XmlElementRef(name = "_Id", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends AbstractIdType>> id;

    /**
     * Gets the value of the comparisonOps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsNullType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsLikeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsNilType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComparisonOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsBetweenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     
     */
    public JAXBElement<? extends ComparisonOpsType> getComparisonOps() {
        return comparisonOps;
    }

    /**
     * Sets the value of the comparisonOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsNullType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsLikeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsNilType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComparisonOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsBetweenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     
     */
    public void setComparisonOps(JAXBElement<? extends ComparisonOpsType> value) {
        this.comparisonOps = value;
    }

    /**
     * Gets the value of the spatialOps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BBOXType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpatialOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     
     */
    public JAXBElement<? extends SpatialOpsType> getSpatialOps() {
        return spatialOps;
    }

    /**
     * Sets the value of the spatialOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BBOXType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpatialOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     
     */
    public void setSpatialOps(JAXBElement<? extends SpatialOpsType> value) {
        this.spatialOps = value;
    }

    /**
     * Gets the value of the temporalOps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TemporalOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     
     */
    public JAXBElement<? extends TemporalOpsType> getTemporalOps() {
        return temporalOps;
    }

    /**
     * Sets the value of the temporalOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TemporalOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     
     */
    public void setTemporalOps(JAXBElement<? extends TemporalOpsType> value) {
        this.temporalOps = value;
    }

    /**
     * Gets the value of the logicOps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnaryLogicOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogicOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}
     *     
     */
    public JAXBElement<? extends LogicOpsType> getLogicOps() {
        return logicOps;
    }

    /**
     * Sets the value of the logicOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnaryLogicOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogicOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}
     *     
     */
    public void setLogicOps(JAXBElement<? extends LogicOpsType> value) {
        this.logicOps = value;
    }

    /**
     * Gets the value of the extensionOps property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOpsType }
     *     
     */
    public ExtensionOpsType getExtensionOps() {
        return extensionOps;
    }

    /**
     * Sets the value of the extensionOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOpsType }
     *     
     */
    public void setExtensionOps(ExtensionOpsType value) {
        this.extensionOps = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionType }
     *     
     */
    public FunctionType getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionType }
     *     
     */
    public void setFunction(FunctionType value) {
        this.function = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ResourceIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractIdType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractIdType>> getId() {
        if (id == null) {
            id = new ArrayList<JAXBElement<? extends AbstractIdType>>();
        }
        return this.id;
    }

}
