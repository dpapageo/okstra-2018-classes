
package net.opengis.wfs._2;

import net.opengis.ows._1.KeywordsType;
import net.opengis.ows._1.WGS84BoundingBoxType;

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FeatureTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element ref="{http://www.opengis.net/wfs/2.0}Title" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wfs/2.0}Abstract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}Keywords" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="DefaultCRS" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *             &lt;element name="OtherCRS" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="NoCRS">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="OutputFormats" type="{http://www.opengis.net/wfs/2.0}OutputFormatListType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/ows/1.1}WGS84BoundingBox" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetadataURL" type="{http://www.opengis.net/wfs/2.0}MetadataURLType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtendedDescription" type="{http://www.opengis.net/wfs/2.0}ExtendedDescriptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureTypeType", propOrder = {
    "name",
    "title",
    "_abstract",
    "keywords",
    "defaultCRS",
    "otherCRS",
    "noCRS",
    "outputFormats",
    "wgs84BoundingBox",
    "metadataURL",
    "extendedDescription"
})
public class FeatureTypeType {

    @XmlElement(name = "Name", required = true)
    protected QName name;
    @XmlElement(name = "Title")
    protected List<Title> title;
    @XmlElement(name = "Abstract")
    protected List<Abstract> _abstract;
    @XmlElement(name = "Keywords", namespace = "http://www.opengis.net/ows/1.1")
    protected List<KeywordsType> keywords;
    @XmlElement(name = "DefaultCRS")
    @XmlSchemaType(name = "anyURI")
    protected String defaultCRS;
    @XmlElement(name = "OtherCRS")
    @XmlSchemaType(name = "anyURI")
    protected List<String> otherCRS;
    @XmlElement(name = "NoCRS")
    protected FeatureTypeType.NoCRS noCRS;
    @XmlElement(name = "OutputFormats")
    protected OutputFormatListType outputFormats;
    @XmlElement(name = "WGS84BoundingBox", namespace = "http://www.opengis.net/ows/1.1")
    protected List<WGS84BoundingBoxType> wgs84BoundingBox;
    @XmlElement(name = "MetadataURL")
    protected List<MetadataURLType> metadataURL;
    @XmlElement(name = "ExtendedDescription")
    protected ExtendedDescriptionType extendedDescription;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link QName }
     *
     */
    public QName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link QName }
     *
     */
    public void setName(QName value) {
        this.name = value;
    }

    /**
     * Gets the value of the title property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Title }
     *
     *
     */
    public List<Title> getTitle() {
        if (title == null) {
            title = new ArrayList<Title>();
        }
        return this.title;
    }

    /**
     * Gets the value of the abstract property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstract property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstract().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Abstract }
     *
     *
     */
    public List<Abstract> getAbstract() {
        if (_abstract == null) {
            _abstract = new ArrayList<Abstract>();
        }
        return this._abstract;
    }

    /**
     * Gets the value of the keywords property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordsType }
     *
     *
     */
    public List<KeywordsType> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<KeywordsType>();
        }
        return this.keywords;
    }

    /**
     * Gets the value of the defaultCRS property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDefaultCRS() {
        return defaultCRS;
    }

    /**
     * Sets the value of the defaultCRS property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDefaultCRS(String value) {
        this.defaultCRS = value;
    }

    /**
     * Gets the value of the otherCRS property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCRS property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCRS().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getOtherCRS() {
        if (otherCRS == null) {
            otherCRS = new ArrayList<String>();
        }
        return this.otherCRS;
    }

    /**
     * Gets the value of the noCRS property.
     *
     * @return
     *     possible object is
     *     {@link FeatureTypeType.NoCRS }
     *
     */
    public FeatureTypeType.NoCRS getNoCRS() {
        return noCRS;
    }

    /**
     * Sets the value of the noCRS property.
     *
     * @param value
     *     allowed object is
     *     {@link FeatureTypeType.NoCRS }
     *
     */
    public void setNoCRS(FeatureTypeType.NoCRS value) {
        this.noCRS = value;
    }

    /**
     * Gets the value of the outputFormats property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormatListType }
     *     
     */
    public OutputFormatListType getOutputFormats() {
        return outputFormats;
    }

    /**
     * Sets the value of the outputFormats property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormatListType }
     *     
     */
    public void setOutputFormats(OutputFormatListType value) {
        this.outputFormats = value;
    }

    /**
     * Gets the value of the wgs84BoundingBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wgs84BoundingBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWGS84BoundingBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WGS84BoundingBoxType }
     * 
     * 
     */
    public List<WGS84BoundingBoxType> getWGS84BoundingBox() {
        if (wgs84BoundingBox == null) {
            wgs84BoundingBox = new ArrayList<WGS84BoundingBoxType>();
        }
        return this.wgs84BoundingBox;
    }

    /**
     * Gets the value of the metadataURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataURLType }
     * 
     * 
     */
    public List<MetadataURLType> getMetadataURL() {
        if (metadataURL == null) {
            metadataURL = new ArrayList<MetadataURLType>();
        }
        return this.metadataURL;
    }

    /**
     * Gets the value of the extendedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedDescriptionType }
     *     
     */
    public ExtendedDescriptionType getExtendedDescription() {
        return extendedDescription;
    }

    /**
     * Sets the value of the extendedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedDescriptionType }
     *     
     */
    public void setExtendedDescription(ExtendedDescriptionType value) {
        this.extendedDescription = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NoCRS {


    }

}
