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
        "place"
    })
@XmlRootElement(name = "LegOrigin")
public class LegOrigin {

  @XmlElement(name = "Place", required = true)
  protected Place place;

  /**
   * Gets the value of the place property.
   * 
   * @return possible object is {@link Place }
   * 
   */
  public Place getPlace() {
    return place;
  }

  /**
   * Sets the value of the place property.
   * 
   * @param value allowed object is {@link Place }
   * 
   */
  public void setPlace(Place value) {
    this.place = value;
  }

}
