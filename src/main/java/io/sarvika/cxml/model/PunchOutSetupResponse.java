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
        "startPage"
    })
@XmlRootElement(name = "PunchOutSetupResponse")
public class PunchOutSetupResponse {

  @XmlElement(name = "StartPage", required = true)
  protected StartPage startPage;

  /**
   * Gets the value of the startPage property.
   * 
   * @return possible object is {@link StartPage }
   * 
   */
  public StartPage getStartPage() {
    return startPage;
  }

  /**
   * Sets the value of the startPage property.
   * 
   * @param value allowed object is {@link StartPage }
   * 
   */
  public void setStartPage(StartPage value) {
    this.startPage = value;
  }

}
