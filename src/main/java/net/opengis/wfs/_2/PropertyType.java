
package net.opengis.wfs._2;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueReference">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="action" type="{http://www.opengis.net/wfs/2.0}UpdateActionType" default="replace" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyType", propOrder = {
    "valueReference",
    "value"
})
public class PropertyType {

    @XmlElement(name = "ValueReference", required = true)
    protected PropertyType.ValueReference valueReference;
    @XmlElement(name = "Value")
    protected Object value;

    /**
     * Gets the value of the valueReference property.
     *
     * @return
     *     possible object is
     *     {@link PropertyType.ValueReference }
     *
     */
    public PropertyType.ValueReference getValueReference() {
        return valueReference;
    }

    /**
     * Sets the value of the valueReference property.
     *
     * @param value
     *     allowed object is
     *     {@link PropertyType.ValueReference }
     *
     */
    public void setValueReference(PropertyType.ValueReference value) {
        this.valueReference = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="action" type="{http://www.opengis.net/wfs/2.0}UpdateActionType" default="replace" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ValueReference {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "action")
        protected UpdateActionType action;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateActionType }
         *     
         */
        public UpdateActionType getAction() {
            if (action == null) {
                return UpdateActionType.REPLACE;
            } else {
                return action;
            }
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateActionType }
         *     
         */
        public void setAction(UpdateActionType value) {
            this.action = value;
        }

    }

}
