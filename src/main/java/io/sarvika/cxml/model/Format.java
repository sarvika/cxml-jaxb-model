//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.2.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2013.08.05 at 11:46:51 PM EDT
//


package io.sarvika.cxml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
    propOrder = {
        "value"
    })
@XmlRootElement(name = "Format")
public class Format {

  @XmlAttribute(name = "version", required = true)
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String version;
  @XmlValue
  protected String value;

  /**
   * Gets the value of the version property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getVersion() {
    return version;
  }

  /**
   * Sets the value of the version property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setVersion(String value) {
    this.version = value;
  }

  /**
   * Gets the value of the value property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getvalue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setvalue(String value) {
    this.value = value;
  }

}
