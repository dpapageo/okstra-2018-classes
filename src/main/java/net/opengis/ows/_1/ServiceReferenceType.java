
package net.opengis.ows._1;

import javax.xml.bind.annotation.*;


/**
 * Complete reference to a remote resource that needs to be retrieved from an OWS using an XML-encoded operation request. This element shall be used, within an InputData or Manifest element that is used for input data, when that input data needs to be retrieved from another web service using a XML-encoded OWS operation request. This element shall not be used for local payload input data or for requesting the resource from a web server using HTTP Get. 
 * 
 * <p>Java class for ServiceReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/ows/1.1}ReferenceType">
 *       &lt;choice>
 *         &lt;element name="RequestMessage" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="RequestMessageReference" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceReferenceType", propOrder = {
    "requestMessage",
    "requestMessageReference"
})
public class ServiceReferenceType
    extends ReferenceType
{

    @XmlElement(name = "RequestMessage")
    protected Object requestMessage;
    @XmlElement(name = "RequestMessageReference")
    @XmlSchemaType(name = "anyURI")
    protected String requestMessageReference;

    /**
     * Gets the value of the requestMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRequestMessage() {
        return requestMessage;
    }

    /**
     * Sets the value of the requestMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRequestMessage(Object value) {
        this.requestMessage = value;
    }

    /**
     * Gets the value of the requestMessageReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestMessageReference() {
        return requestMessageReference;
    }

    /**
     * Sets the value of the requestMessageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestMessageReference(String value) {
        this.requestMessageReference = value;
    }

}
