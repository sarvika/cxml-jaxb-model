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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
    propOrder = {
        "buyerCookie",
        "extrinsic",
        "browserFormPost",
        "contact",
        "supplierSetup",
        "shipTo",
        "selectedItem",
        "itemOut"
    })
@XmlRootElement(name = "PunchOutSetupRequest")
public class PunchOutSetupRequest {

  @XmlAttribute(name = "operation", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String operation;
  @XmlElement(name = "BuyerCookie", required = true)
  protected BuyerCookie buyerCookie;
  @XmlElement(name = "Extrinsic")
  protected List<Extrinsic> extrinsic;
  @XmlElement(name = "BrowserFormPost")
  protected BrowserFormPost browserFormPost;
  @XmlElement(name = "Contact")
  protected List<Contact> contact;
  @XmlElement(name = "SupplierSetup")
  protected SupplierSetup supplierSetup;
  @XmlElement(name = "ShipTo")
  protected ShipTo shipTo;
  @XmlElement(name = "SelectedItem")
  protected SelectedItem selectedItem;
  @XmlElement(name = "ItemOut")
  protected List<ItemOut> itemOut;

  /**
   * Gets the value of the operation property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getOperation() {
    return operation;
  }

  /**
   * Sets the value of the operation property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setOperation(String value) {
    this.operation = value;
  }

  /**
   * Gets the value of the buyerCookie property.
   * 
   * @return possible object is {@link BuyerCookie }
   * 
   */
  public BuyerCookie getBuyerCookie() {
    return buyerCookie;
  }

  /**
   * Sets the value of the buyerCookie property.
   * 
   * @param value allowed object is {@link BuyerCookie }
   * 
   */
  public void setBuyerCookie(BuyerCookie value) {
    this.buyerCookie = value;
  }

  /**
   * Gets the value of the extrinsic property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the extrinsic property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getExtrinsic().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Extrinsic }
   * 
   * 
   */
  public List<Extrinsic> getExtrinsic() {
    if (extrinsic == null) {
      extrinsic = new ArrayList<Extrinsic>();
    }
    return this.extrinsic;
  }

  /**
   * Gets the value of the browserFormPost property.
   * 
   * @return possible object is {@link BrowserFormPost }
   * 
   */
  public BrowserFormPost getBrowserFormPost() {
    return browserFormPost;
  }

  /**
   * Sets the value of the browserFormPost property.
   * 
   * @param value allowed object is {@link BrowserFormPost }
   * 
   */
  public void setBrowserFormPost(BrowserFormPost value) {
    this.browserFormPost = value;
  }

  /**
   * Gets the value of the contact property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the contact property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getContact().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Contact }
   * 
   * 
   */
  public List<Contact> getContact() {
    if (contact == null) {
      contact = new ArrayList<Contact>();
    }
    return this.contact;
  }

  /**
   * Gets the value of the supplierSetup property.
   * 
   * @return possible object is {@link SupplierSetup }
   * 
   */
  public SupplierSetup getSupplierSetup() {
    return supplierSetup;
  }

  /**
   * Sets the value of the supplierSetup property.
   * 
   * @param value allowed object is {@link SupplierSetup }
   * 
   */
  public void setSupplierSetup(SupplierSetup value) {
    this.supplierSetup = value;
  }

  /**
   * Gets the value of the shipTo property.
   * 
   * @return possible object is {@link ShipTo }
   * 
   */
  public ShipTo getShipTo() {
    return shipTo;
  }

  /**
   * Sets the value of the shipTo property.
   * 
   * @param value allowed object is {@link ShipTo }
   * 
   */
  public void setShipTo(ShipTo value) {
    this.shipTo = value;
  }

  /**
   * Gets the value of the selectedItem property.
   * 
   * @return possible object is {@link SelectedItem }
   * 
   */
  public SelectedItem getSelectedItem() {
    return selectedItem;
  }

  /**
   * Sets the value of the selectedItem property.
   * 
   * @param value allowed object is {@link SelectedItem }
   * 
   */
  public void setSelectedItem(SelectedItem value) {
    this.selectedItem = value;
  }

  /**
   * Gets the value of the itemOut property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the itemOut property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getItemOut().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link ItemOut }
   * 
   * 
   */
  public List<ItemOut> getItemOut() {
    if (itemOut == null) {
      itemOut = new ArrayList<ItemOut>();
    }
    return this.itemOut;
  }

}
