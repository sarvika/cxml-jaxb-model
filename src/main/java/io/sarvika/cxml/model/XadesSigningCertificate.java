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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
    propOrder = {
        "xadesCert"
    })
@XmlRootElement(name = "xades:SigningCertificate")
public class XadesSigningCertificate {

  @XmlElement(name = "xades:Cert", required = true)
  protected List<XadesCert> xadesCert;

  /**
   * Gets the value of the xadesCert property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the xadesCert property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getXadesCert().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link XadesCert }
   * 
   * 
   */
  public List<XadesCert> getXadesCert() {
    if (xadesCert == null) {
      xadesCert = new ArrayList<XadesCert>();
    }
    return this.xadesCert;
  }

}
