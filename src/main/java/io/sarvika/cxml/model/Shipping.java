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
        "money",
        "description",
        "modifications"
    })
@XmlRootElement(name = "Shipping")
public class Shipping {

  @XmlAttribute(name = "trackingDomain")
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String trackingDomain;
  @XmlAttribute(name = "trackingId")
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String trackingId;
  @XmlAttribute(name = "tracking")
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String tracking;
  @XmlElement(name = "Money", required = true)
  protected Money money;
  @XmlElement(name = "Description", required = true)
  protected Description description;
  @XmlElement(name = "Modifications")
  protected Modifications modifications;

  /**
   * Gets the value of the trackingDomain property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTrackingDomain() {
    return trackingDomain;
  }

  /**
   * Sets the value of the trackingDomain property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setTrackingDomain(String value) {
    this.trackingDomain = value;
  }

  /**
   * Gets the value of the trackingId property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTrackingId() {
    return trackingId;
  }

  /**
   * Sets the value of the trackingId property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setTrackingId(String value) {
    this.trackingId = value;
  }

  /**
   * Gets the value of the tracking property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTracking() {
    return tracking;
  }

  /**
   * Sets the value of the tracking property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setTracking(String value) {
    this.tracking = value;
  }

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

  /**
   * Gets the value of the modifications property.
   * 
   * @return possible object is {@link Modifications }
   * 
   */
  public Modifications getModifications() {
    return modifications;
  }

  /**
   * Sets the value of the modifications property.
   * 
   * @param value allowed object is {@link Modifications }
   * 
   */
  public void setModifications(Modifications value) {
    this.modifications = value;
  }

}
