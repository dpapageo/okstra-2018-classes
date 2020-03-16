
package net.opengis.wfs._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="results"/>
 *     &lt;enumeration value="hits"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultTypeType")
@XmlEnum
public enum ResultTypeType {

    @XmlEnumValue("results")
    RESULTS("results"),
    @XmlEnumValue("hits")
    HITS("hits");
    private final String value;

    ResultTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultTypeType fromValue(String v) {
        for (ResultTypeType c: ResultTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
