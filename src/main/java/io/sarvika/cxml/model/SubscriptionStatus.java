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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
    propOrder = {
        "comments"
    })
@XmlRootElement(name = "SubscriptionStatus")
public class SubscriptionStatus {

  @XmlAttribute(name = "status", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String status;
  @XmlElement(name = "Comments")
  protected Comments comments;

  /**
   * Gets the value of the status property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getStatus() {
    return status;
  }

  /**
   * Sets the value of the status property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setStatus(String value) {
    this.status = value;
  }

  /**
   * Gets the value of the comments property.
   * 
   * @return possible object is {@link Comments }
   * 
   */
  public Comments getComments() {
    return comments;
  }

  /**
   * Sets the value of the comments property.
   * 
   * @param value allowed object is {@link Comments }
   * 
   */
  public void setComments(Comments value) {
    this.comments = value;
  }

}
