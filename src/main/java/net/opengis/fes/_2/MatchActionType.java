
package net.opengis.fes._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="One"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatchActionType")
@XmlEnum
public enum MatchActionType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("One")
    ONE("One");
    private final String value;

    MatchActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchActionType fromValue(String v) {
        for (MatchActionType c: MatchActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
