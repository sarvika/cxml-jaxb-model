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
        "money"
    })
@XmlRootElement(name = "GrossAmount")
public class GrossAmount {

  @XmlElement(name = "Money", required = true)
  protected Money money;

  /**
   * Gets the value of the money property.
   * 
   * @return possible object is {@link Money }
   * 
   */
  public Money getMoney() {
    return money;
  }

  /**
   * Sets the value of the money property.
   * 
   * @param value allowed object is {@link Money }
   * 
   */
  public void setMoney(Money value) {
    this.money = value;
  }

}
