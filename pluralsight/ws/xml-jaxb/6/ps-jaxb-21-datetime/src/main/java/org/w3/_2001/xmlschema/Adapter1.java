//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 06:24:57 PM CEST 
//


package org.w3._2001.xmlschema;

import java.time.OffsetDateTime;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, OffsetDateTime>
{


    public OffsetDateTime unmarshal(String value) {
        return OffsetDateTime.parse(value);
    }

    public String marshal(OffsetDateTime value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
