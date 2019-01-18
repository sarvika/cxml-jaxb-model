//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.2.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2013.08.05 at 11:46:51 PM EDT
//


package io.sarvika.cxml.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
        "telephoneNumberOrURLOrEmail"
    })
@XmlRootElement(name = "Fax")
public class Fax {

  @XmlAttribute(name = "name")
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String name;
  @XmlElements({
      @XmlElement(name = "TelephoneNumber", required = true, type = TelephoneNumber.class),
      @XmlElement(name = "URL", required = true, type = URL.class),
      @XmlElement(name = "Email", required = true, type = Email.class)
  })
  protected List<Object> telephoneNumberOrURLOrEmail;

  /**
   * Gets the value of the name property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setName(String value) {
    this.name = value;
  }

  /**
   * Gets the value of the telephoneNumberOrURLOrEmail property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the telephoneNumberOrURLOrEmail property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getTelephoneNumberOrURLOrEmail().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link TelephoneNumber } {@link URL } {@link Email }
   * 
   * 
   */
  public List<Object> getTelephoneNumberOrURLOrEmail() {
    if (telephoneNumberOrURLOrEmail == null) {
      telephoneNumberOrURLOrEmail = new ArrayList<Object>();
    }
    return this.telephoneNumberOrURLOrEmail;
  }

}
