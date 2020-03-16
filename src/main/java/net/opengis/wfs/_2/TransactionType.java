
package net.opengis.wfs._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wfs/2.0}BaseRequestType">
 *       &lt;sequence>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/wfs/2.0}AbstractTransactionAction"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="lockId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="releaseAction" type="{http://www.opengis.net/wfs/2.0}AllSomeType" default="ALL" />
 *       &lt;attribute name="srsName" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionType", propOrder = {
    "abstractTransactionAction"
})
public class TransactionType
    extends BaseRequestType
{

    @XmlElementRef(name = "AbstractTransactionAction", namespace = "http://www.opengis.net/wfs/2.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> abstractTransactionAction;
    @XmlAttribute(name = "lockId")
    protected String lockId;
    @XmlAttribute(name = "releaseAction")
    protected AllSomeType releaseAction;
    @XmlAttribute(name = "srsName")
    @XmlSchemaType(name = "anyURI")
    protected String srsName;

    /**
     * Gets the value of the abstractTransactionAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractTransactionAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractTransactionAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link UpdateType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTransactionActionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReplaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeleteType }{@code >}
     * {@link JAXBElement }{@code <}{@link NativeType }{@code >}
     * {@link JAXBElement }{@code <}{@link InsertType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractTransactionAction() {
        if (abstractTransactionAction == null) {
            abstractTransactionAction = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractTransactionAction;
    }

    /**
     * Gets the value of the lockId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockId() {
        return lockId;
    }

    /**
     * Sets the value of the lockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockId(String value) {
        this.lockId = value;
    }

    /**
     * Gets the value of the releaseAction property.
     * 
     * @return
     *     possible object is
     *     {@link AllSomeType }
     *     
     */
    public AllSomeType getReleaseAction() {
        if (releaseAction == null) {
            return AllSomeType.ALL;
        } else {
            return releaseAction;
        }
    }

    /**
     * Sets the value of the releaseAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllSomeType }
     *     
     */
    public void setReleaseAction(AllSomeType value) {
        this.releaseAction = value;
    }

    /**
     * Gets the value of the srsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Sets the value of the srsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

}
