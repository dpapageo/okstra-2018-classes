
package net.opengis.wfs._2;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DescribeStoredQueriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeStoredQueriesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wfs/2.0}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="StoredQueryId" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeStoredQueriesType", propOrder = {
    "storedQueryId"
})
public class DescribeStoredQueriesType
    extends BaseRequestType
{

    @XmlElement(name = "StoredQueryId")
    @XmlSchemaType(name = "anyURI")
    protected List<String> storedQueryId;

    /**
     * Gets the value of the storedQueryId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storedQueryId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoredQueryId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStoredQueryId() {
        if (storedQueryId == null) {
            storedQueryId = new ArrayList<String>();
        }
        return this.storedQueryId;
    }

}
