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
 * <p>Java class for KunststoffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KunststoffType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKSTRA_ID" type="{http://www.okstra.de/okstra/2.018.2/okstra-typen}GUID" minOccurs="0"/&gt;
 *         &lt;element name="zu_Beschriftung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremddatenbestand" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenziert_Fremdobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zu_Kommunikationsobjekt" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hat_Objekt_ID" type="{http://www.okstra.de/okstra/2.018.2}Objekt_IDPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Erfassungsdatum" type="{http://www.okstra.de/okstra/2.018.2}ASB_DatumPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Systemdatum" type="{http://www.okstra.de/okstra/2.018.2}ASB_DatumPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Textfeld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Art_der_Erfassung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Art_der_Erfassung_sonst" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Quelle_der_Information" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="Quelle_der_Information_sonst" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="RFID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Migrationshinweise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unscharf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Datenerfassung_abgeschlossen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Bearbeiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Dokument" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Hersteller_Lieferfirma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zulassung" type="{http://www.okstra.de/okstra/2.018.2}ZulassungPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Produktbezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="von_Abstrakte_Bauteilart" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="von_Abstraktes_Bauteil" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}ObjectRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Art_Kunststoff" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType"/&gt;
 *         &lt;element name="transparent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Pigment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Art_Faserverstaerkung" type="{http://www.okstra.de/okstra/2.018.2/okstra-basis}KeyValuePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KunststoffType", propOrder = {
    "rest"
})
public class KunststoffType
    extends AbstractFeatureType
{

    @XmlElementRefs({
        @XmlElementRef(name = "Datenerfassung_abgeschlossen", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "zu_Beschriftung", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Art_Kunststoff", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Dokument", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "referenziert_Fremddatenbestand", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Quelle_der_Information", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Art_Faserverstaerkung", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "von_Abstrakte_Bauteilart", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Art_der_Erfassung", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unscharf", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Hersteller_Lieferfirma", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "von_Abstraktes_Bauteil", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Name", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Produktbezeichnung", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Zulassung", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hat_Objekt_ID", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transparent", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "referenziert_Fremdobjekt", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "zu_Kommunikationsobjekt", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Erfassungsdatum", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RFID", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Quelle_der_Information_sonst", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Art_der_Erfassung_sonst", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Textfeld", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Pigment", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Systemdatum", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Bearbeiter", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OKSTRA_ID", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Migrationshinweise", namespace = "http://www.okstra.de/okstra/2.018.2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Name" is used by two different parts of a schema. See: 
     * line 1810 of file:/C:/repo/SIB-BW2-deliverypatch/SIB-BW2/okstra-2018-classes/src/main/resources/lib/oklabi/schema/2018.2/S_Bauwerke.xsd
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
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link KeyValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link KeyValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link KeyValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link KeyValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ZulassungPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjektIDPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link ASBDatumPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link KeyValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link KeyValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ASBDatumPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
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
