
package net.opengis.wfs_util._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.wfs_util._2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DescribeFeatureTypeResponse_QNAME = new QName("http://www.opengis.net/wfs-util/2.0", "DescribeFeatureTypeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.wfs_util._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DescribeFeatureTypeResponseType }
     * 
     */
    public DescribeFeatureTypeResponseType createDescribeFeatureTypeResponseType() {
        return new DescribeFeatureTypeResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeFeatureTypeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/wfs-util/2.0", name = "DescribeFeatureTypeResponse")
    public JAXBElement<DescribeFeatureTypeResponseType> createDescribeFeatureTypeResponse(DescribeFeatureTypeResponseType value) {
        return new JAXBElement<DescribeFeatureTypeResponseType>(_DescribeFeatureTypeResponse_QNAME, DescribeFeatureTypeResponseType.class, null, value);
    }

}
