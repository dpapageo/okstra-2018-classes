
package net.opengis.fes._2;

import net.opengis.wfs._2.PropertyName;
import net.opengis.wfs._2.QueryType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AbstractAdhocQueryExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAdhocQueryExpressionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/fes/2.0}AbstractQueryExpressionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/fes/2.0}AbstractProjectionClause" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/fes/2.0}AbstractSelectionClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/fes/2.0}AbstractSortingClause" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="typeNames" use="required" type="{http://www.opengis.net/fes/2.0}TypeNamesListType" />
 *       &lt;attribute name="aliases" type="{http://www.opengis.net/fes/2.0}AliasesType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAdhocQueryExpressionType", propOrder = {
    "abstractProjectionClause",
    "abstractSelectionClause",
    "abstractSortingClause"
})
@XmlSeeAlso({
    QueryType.class
})
public abstract class AbstractAdhocQueryExpressionType
    extends AbstractQueryExpressionType
{

    @XmlElementRef(name = "AbstractProjectionClause", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> abstractProjectionClause;
    @XmlElementRef(name = "AbstractSelectionClause", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<?> abstractSelectionClause;
    @XmlElementRef(name = "AbstractSortingClause", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<?> abstractSortingClause;
    @XmlAttribute(name = "typeNames", required = true)
    protected List<String> typeNames;
    @XmlAttribute(name = "aliases")
    protected List<String> aliases;

    /**
     * Gets the value of the abstractProjectionClause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractProjectionClause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractProjectionClause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link PropertyName }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractProjectionClause() {
        if (abstractProjectionClause == null) {
            abstractProjectionClause = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractProjectionClause;
    }

    /**
     * Gets the value of the abstractSelectionClause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     *     
     */
    public JAXBElement<?> getAbstractSelectionClause() {
        return abstractSelectionClause;
    }

    /**
     * Sets the value of the abstractSelectionClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     *     
     */
    public void setAbstractSelectionClause(JAXBElement<?> value) {
        this.abstractSelectionClause = value;
    }

    /**
     * Gets the value of the abstractSortingClause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SortByType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<?> getAbstractSortingClause() {
        return abstractSortingClause;
    }

    /**
     * Sets the value of the abstractSortingClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SortByType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setAbstractSortingClause(JAXBElement<?> value) {
        this.abstractSortingClause = value;
    }

    /**
     * Gets the value of the typeNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeNames() {
        if (typeNames == null) {
            typeNames = new ArrayList<String>();
        }
        return this.typeNames;
    }

    /**
     * Gets the value of the aliases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aliases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAliases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAliases() {
        if (aliases == null) {
            aliases = new ArrayList<String>();
        }
        return this.aliases;
    }

}
