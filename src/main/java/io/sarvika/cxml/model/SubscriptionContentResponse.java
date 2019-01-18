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
        "subscription",
        "subscriptionContent"
    })
@XmlRootElement(name = "SubscriptionContentResponse")
public class SubscriptionContentResponse {

  @XmlElement(name = "Subscription", required = true)
  protected Subscription subscription;
  @XmlElement(name = "SubscriptionContent", required = true)
  protected List<SubscriptionContent> subscriptionContent;

  /**
   * Gets the value of the subscription property.
   * 
   * @return possible object is {@link Subscription }
   * 
   */
  public Subscription getSubscription() {
    return subscription;
  }

  /**
   * Sets the value of the subscription property.
   * 
   * @param value allowed object is {@link Subscription }
   * 
   */
  public void setSubscription(Subscription value) {
    this.subscription = value;
  }

  /**
   * Gets the value of the subscriptionContent property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the subscriptionContent property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getSubscriptionContent().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link SubscriptionContent }
   * 
   * 
   */
  public List<SubscriptionContent> getSubscriptionContent() {
    if (subscriptionContent == null) {
      subscriptionContent = new ArrayList<SubscriptionContent>();
    }
    return this.subscriptionContent;
  }

}
