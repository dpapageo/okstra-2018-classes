//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.09 at 04:49:50 PM EET 
//


package com.eurodyn.okstra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZahlenwertkonstanteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZahlenwertkonstanteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Versionsinfo" type="{http://www.okstra.de/okstra/2.018.2}VersionsinfoPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="zu_Berechnung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="zu_Blatt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *         &lt;element name="Wert" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zu_Tabelle" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZahlenwertkonstanteType", propOrder = {
    "rest"
})
public class ZahlenwertkonstanteType
    extends AbstractFeatureType
{

    @XmlElementRefs({
        @XmlElementRef(name = "zu_Kommunikationsobjekt", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "referenziert_Fremdobjekt", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Versionsinfo", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "zu_Beschriftung", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "zu_Blatt", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "zu_Tabelle", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OKSTRA_ID", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "zu_Berechnung", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "referenziert_Fremddatenbestand", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Beschreibung", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Name", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Wert", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Name" is used by two different parts of a schema. See: 
     * line 188 of file:/C:/repo/SIB-BW2-deliverypatch/SIB-BW2/okstra-2018-classes/src/main/resources/lib/oklabi/schema/2018.2/S_Allgemeine_Mengenberechnung.xsd
     * line 44 of file:/C:/repo/SIB-BW2-deliverypatch/SIB-BW2/okstra-2018-classes/src/main/resources/lib/oklabi/schema/2018.2/gml/3.2.1/gmlBase.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link VersionsinfoPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
