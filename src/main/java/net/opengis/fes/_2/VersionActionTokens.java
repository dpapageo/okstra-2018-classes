
package net.opengis.fes._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionActionTokens.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VersionActionTokens">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIRST"/>
 *     &lt;enumeration value="LAST"/>
 *     &lt;enumeration value="PREVIOUS"/>
 *     &lt;enumeration value="NEXT"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VersionActionTokens")
@XmlEnum
public enum VersionActionTokens {

    FIRST,
    LAST,
    PREVIOUS,
    NEXT,
    ALL;

    public String value() {
        return name();
    }

    public static VersionActionTokens fromValue(String v) {
        return valueOf(v);
    }

}
