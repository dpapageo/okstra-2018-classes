//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.09 at 04:49:50 PM EET 
//


package com.eurodyn.okstra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Stunden_pro_Woche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stunden_pro_Woche"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;http://www.opengis.net/gml/3.2&gt;MeasureType"&gt;
 *       &lt;attribute name="uom" use="required" type="{http://www.opengis.net/gml/3.2}UomSymbol" fixed="h%2FWoche" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stunden_pro_Woche", namespace = "http://www.okstra.de/okstra/2.018.2/okstra-typen")
public class StundenProWoche
    extends MeasureType
{


}
