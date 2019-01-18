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
@XmlRootElement(name = "Money")
public class Money {

  @XmlAttribute(name = "currency", required = true)
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String currency;
  @XmlAttribute(name = "alternateAmount")
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String alternateAmount;
  @XmlAttribute(name = "alternateCurrency")
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String alternateCurrency;
  @XmlValue
  protected String value;

  /**
   * Gets the value of the currency property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCurrency() {
    return currency;
  }

  /**
   * Sets the value of the currency property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCurrency(String value) {
    this.currency = value;
  }

  /**
   * Gets the value of the alternateAmount property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getAlternateAmount() {
    return alternateAmount;
  }

  /**
   * Sets the value of the alternateAmount property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setAlternateAmount(String value) {
    this.alternateAmount = value;
  }

  /**
   * Gets the value of the alternateCurrency property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getAlternateCurrency() {
    return alternateCurrency;
  }

  /**
   * Sets the value of the alternateCurrency property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setAlternateCurrency(String value) {
    this.alternateCurrency = value;
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
