
package net.opengis.ows._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Logical group of one or more references to remote and/or local resources, allowing including metadata about that group. A Group can be used instead of a Manifest that can only contain one group. 
 * 
 * <p>Java class for ReferenceGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/ows/1.1}BasicIdentificationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}AbstractReferenceBase" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceGroupType", propOrder = {
    "abstractReferenceBase"
})
public class ReferenceGroupType
    extends BasicIdentificationType
{

    @XmlElementRef(name = "AbstractReferenceBase", namespace = "http://www.opengis.net/ows/1.1", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractReferenceBaseType>> abstractReferenceBase;

    /**
     * Gets the value of the abstractReferenceBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractReferenceBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractReferenceBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ServiceReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractReferenceBaseType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractReferenceBaseType>> getAbstractReferenceBase() {
        if (abstractReferenceBase == null) {
            abstractReferenceBase = new ArrayList<JAXBElement<? extends AbstractReferenceBaseType>>();
        }
        return this.abstractReferenceBase;
    }

}
