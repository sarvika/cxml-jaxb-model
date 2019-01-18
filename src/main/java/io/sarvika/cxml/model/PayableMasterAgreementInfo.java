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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
    propOrder = {
        "masterAgreementReferenceOrMasterAgreementIDInfo"
    })
@XmlRootElement(name = "PayableMasterAgreementInfo")
public class PayableMasterAgreementInfo {

  @XmlElements({
      @XmlElement(name = "MasterAgreementReference",
          required = true,
          type = MasterAgreementReference.class),
      @XmlElement(name = "MasterAgreementIDInfo",
          required = true,
          type = MasterAgreementIDInfo.class)
  })
  protected List<Object> masterAgreementReferenceOrMasterAgreementIDInfo;

  /**
   * Gets the value of the masterAgreementReferenceOrMasterAgreementIDInfo
   * property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the masterAgreementReferenceOrMasterAgreementIDInfo property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getMasterAgreementReferenceOrMasterAgreementIDInfo().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link MasterAgreementReference } {@link MasterAgreementIDInfo }
   * 
   * 
   */
  public List<Object> getMasterAgreementReferenceOrMasterAgreementIDInfo() {
    if (masterAgreementReferenceOrMasterAgreementIDInfo == null) {
      masterAgreementReferenceOrMasterAgreementIDInfo = new ArrayList<Object>();
    }
    return this.masterAgreementReferenceOrMasterAgreementIDInfo;
  }

}
