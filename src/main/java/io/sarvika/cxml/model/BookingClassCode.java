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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
    propOrder = {
        "description"
    })
@XmlRootElement(name = "BookingClassCode")
public class BookingClassCode {

  @XmlAttribute(name = "domain", required = true)
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String domain;
  @XmlAttribute(name = "code", required = true)
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String code;
  @XmlElement(name = "Description")
  protected Description description;

  /**
   * Gets the value of the domain property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDomain() {
    return domain;
  }

  /**
   * Sets the value of the domain property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDomain(String value) {
    this.domain = value;
  }

  /**
   * Gets the value of the code property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets the value of the code property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCode(String value) {
    this.code = value;
  }

  /**
   * Gets the value of the description property.
   * 
   * @return possible object is {@link Description }
   * 
   */
  public Description getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * 
   * @param value allowed object is {@link Description }
   * 
   */
  public void setDescription(Description value) {
    this.description = value;
  }

}
