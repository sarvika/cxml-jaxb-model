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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
    propOrder = {
        "contact"
    })
@XmlRootElement(name = "Supervisor")
public class Supervisor {

  @XmlElement(name = "Contact", required = true)
  protected Contact contact;

  /**
   * Gets the value of the contact property.
   * 
   * @return possible object is {@link Contact }
   * 
   */
  public Contact getContact() {
    return contact;
  }

  /**
   * Sets the value of the contact property.
   * 
   * @param value allowed object is {@link Contact }
   * 
   */
  public void setContact(Contact value) {
    this.contact = value;
  }

}
