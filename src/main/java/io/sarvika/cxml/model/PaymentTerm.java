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
        "discount"
    })
@XmlRootElement(name = "PaymentTerm")
public class PaymentTerm {

  @XmlAttribute(name = "payInNumberOfDays", required = true)
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String payInNumberOfDays;
  @XmlElement(name = "Discount")
  protected Discount discount;

  /**
   * Gets the value of the payInNumberOfDays property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getPayInNumberOfDays() {
    return payInNumberOfDays;
  }

  /**
   * Sets the value of the payInNumberOfDays property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setPayInNumberOfDays(String value) {
    this.payInNumberOfDays = value;
  }

  /**
   * Gets the value of the discount property.
   * 
   * @return possible object is {@link Discount }
   * 
   */
  public Discount getDiscount() {
    return discount;
  }

  /**
   * Sets the value of the discount property.
   * 
   * @param value allowed object is {@link Discount }
   * 
   */
  public void setDiscount(Discount value) {
    this.discount = value;
  }

}
