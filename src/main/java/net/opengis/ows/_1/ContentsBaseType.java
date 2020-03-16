
package net.opengis.ows._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Contents of typical Contents section of an OWS service metadata (Capabilities) document. This type shall be extended and/or restricted if needed for specific OWS use to include the specific metadata needed. 
 * 
 * <p>Java class for ContentsBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentsBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}DatasetDescriptionSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}OtherSource" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentsBaseType", propOrder = {
    "datasetDescriptionSummary",
    "otherSource"
})
public class ContentsBaseType {

    @XmlElement(name = "DatasetDescriptionSummary")
    protected List<DatasetDescriptionSummaryBaseType> datasetDescriptionSummary;
    @XmlElement(name = "OtherSource")
    protected List<MetadataType> otherSource;

    /**
     * Unordered set of summary descriptions for the datasets available from this OWS server. This set shall be included unless another source is referenced and all this metadata is available from that source. Gets the value of the datasetDescriptionSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetDescriptionSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetDescriptionSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatasetDescriptionSummaryBaseType }
     * 
     * 
     */
    public List<DatasetDescriptionSummaryBaseType> getDatasetDescriptionSummary() {
        if (datasetDescriptionSummary == null) {
            datasetDescriptionSummary = new ArrayList<DatasetDescriptionSummaryBaseType>();
        }
        return this.datasetDescriptionSummary;
    }

    /**
     * Unordered set of references to other sources of metadata describing the coverage offerings available from this server. Gets the value of the otherSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataType }
     * 
     * 
     */
    public List<MetadataType> getOtherSource() {
        if (otherSource == null) {
            otherSource = new ArrayList<MetadataType>();
        }
        return this.otherSource;
    }

}
