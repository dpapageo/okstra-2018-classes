//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.09 at 04:49:50 PM EET 
//


package com.eurodyn.okstra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompassPointEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompassPointEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="NNE"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="ENE"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="ESE"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="SSE"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="SSW"/&gt;
 *     &lt;enumeration value="SW"/&gt;
 *     &lt;enumeration value="WSW"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="WNW"/&gt;
 *     &lt;enumeration value="NW"/&gt;
 *     &lt;enumeration value="NNW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompassPointEnumeration", namespace = "http://www.opengis.net/gml/3.2")
@XmlEnum
public enum CompassPointEnumeration {

    N,
    NNE,
    NE,
    ENE,
    E,
    ESE,
    SE,
    SSE,
    S,
    SSW,
    SW,
    WSW,
    W,
    WNW,
    NW,
    NNW;

    public String value() {
        return name();
    }

    public static CompassPointEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
