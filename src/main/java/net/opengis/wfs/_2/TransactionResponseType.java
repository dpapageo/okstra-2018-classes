
package net.opengis.wfs._2;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for TransactionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionSummary" type="{http://www.opengis.net/wfs/2.0}TransactionSummaryType"/>
 *         &lt;element name="InsertResults" type="{http://www.opengis.net/wfs/2.0}ActionResultsType" minOccurs="0"/>
 *         &lt;element name="UpdateResults" type="{http://www.opengis.net/wfs/2.0}ActionResultsType" minOccurs="0"/>
 *         &lt;element name="ReplaceResults" type="{http://www.opengis.net/wfs/2.0}ActionResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.0.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionResponseType", propOrder = {
    "transactionSummary",
    "insertResults",
    "updateResults",
    "replaceResults"
})
public class TransactionResponseType {

    @XmlElement(name = "TransactionSummary", required = true)
    protected TransactionSummaryType transactionSummary;
    @XmlElement(name = "InsertResults")
    protected ActionResultsType insertResults;
    @XmlElement(name = "UpdateResults")
    protected ActionResultsType updateResults;
    @XmlElement(name = "ReplaceResults")
    protected ActionResultsType replaceResults;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the transactionSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSummaryType }
     *     
     */
    public TransactionSummaryType getTransactionSummary() {
        return transactionSummary;
    }

    /**
     * Sets the value of the transactionSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSummaryType }
     *     
     */
    public void setTransactionSummary(TransactionSummaryType value) {
        this.transactionSummary = value;
    }

    /**
     * Gets the value of the insertResults property.
     * 
     * @return
     *     possible object is
     *     {@link ActionResultsType }
     *     
     */
    public ActionResultsType getInsertResults() {
        return insertResults;
    }

    /**
     * Sets the value of the insertResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionResultsType }
     *     
     */
    public void setInsertResults(ActionResultsType value) {
        this.insertResults = value;
    }

    /**
     * Gets the value of the updateResults property.
     * 
     * @return
     *     possible object is
     *     {@link ActionResultsType }
     *     
     */
    public ActionResultsType getUpdateResults() {
        return updateResults;
    }

    /**
     * Sets the value of the updateResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionResultsType }
     *     
     */
    public void setUpdateResults(ActionResultsType value) {
        this.updateResults = value;
    }

    /**
     * Gets the value of the replaceResults property.
     * 
     * @return
     *     possible object is
     *     {@link ActionResultsType }
     *     
     */
    public ActionResultsType getReplaceResults() {
        return replaceResults;
    }

    /**
     * Sets the value of the replaceResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionResultsType }
     *     
     */
    public void setReplaceResults(ActionResultsType value) {
        this.replaceResults = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
