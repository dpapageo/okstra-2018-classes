//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.09 at 04:49:50 PM EET 
//


package com.eurodyn.okstra;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DatumsEngineeringDatum
    extends JAXBElement<EngineeringDatumType>
{

    protected final static QName NAME = new QName("http://www.opengis.net/gml/3.2", "EngineeringDatum");

    public DatumsEngineeringDatum(EngineeringDatumType value) {
        super(NAME, ((Class) EngineeringDatumType.class), null, value);
    }

    public DatumsEngineeringDatum() {
        super(NAME, ((Class) EngineeringDatumType.class), null, null);
    }

}
