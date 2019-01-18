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
        "airDetailOrCarRentalDetailOrHotelDetailOrRailDetail",
        "policyViolation",
        "comments",
        "termsAndConditions"
    })
@XmlRootElement(name = "TravelDetail")
public class TravelDetail {

  @XmlAttribute(name = "confirmationNumber", required = true)
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String confirmationNumber;
  @XmlAttribute(name = "pnrLocator")
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String pnrLocator;
  @XmlAttribute(name = "quoteExpirationTime")
  @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
  protected String quoteExpirationTime;
  @XmlElements({
      @XmlElement(name = "AirDetail", required = true, type = AirDetail.class),
      @XmlElement(name = "CarRentalDetail", required = true, type = CarRentalDetail.class),
      @XmlElement(name = "HotelDetail", required = true, type = HotelDetail.class),
      @XmlElement(name = "RailDetail", required = true, type = RailDetail.class)
  })
  protected List<Object> airDetailOrCarRentalDetailOrHotelDetailOrRailDetail;
  @XmlElement(name = "PolicyViolation")
  protected List<PolicyViolation> policyViolation;
  @XmlElement(name = "Comments")
  protected Comments comments;
  @XmlElement(name = "TermsAndConditions")
  protected TermsAndConditions termsAndConditions;

  /**
   * Gets the value of the confirmationNumber property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getConfirmationNumber() {
    return confirmationNumber;
  }

  /**
   * Sets the value of the confirmationNumber property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setConfirmationNumber(String value) {
    this.confirmationNumber = value;
  }

  /**
   * Gets the value of the pnrLocator property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getPnrLocator() {
    return pnrLocator;
  }

  /**
   * Sets the value of the pnrLocator property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setPnrLocator(String value) {
    this.pnrLocator = value;
  }

  /**
   * Gets the value of the quoteExpirationTime property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getQuoteExpirationTime() {
    return quoteExpirationTime;
  }

  /**
   * Sets the value of the quoteExpirationTime property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setQuoteExpirationTime(String value) {
    this.quoteExpirationTime = value;
  }

  /**
   * Gets the value of the airDetailOrCarRentalDetailOrHotelDetailOrRailDetail
   * property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the airDetailOrCarRentalDetailOrHotelDetailOrRailDetail property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getAirDetailOrCarRentalDetailOrHotelDetailOrRailDetail().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link AirDetail }
   * {@link CarRentalDetail } {@link HotelDetail } {@link RailDetail }
   * 
   * 
   */
  public List<Object> getAirDetailOrCarRentalDetailOrHotelDetailOrRailDetail() {
    if (airDetailOrCarRentalDetailOrHotelDetailOrRailDetail == null) {
      airDetailOrCarRentalDetailOrHotelDetailOrRailDetail = new ArrayList<Object>();
    }
    return this.airDetailOrCarRentalDetailOrHotelDetailOrRailDetail;
  }

  /**
   * Gets the value of the policyViolation property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the policyViolation property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getPolicyViolation().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link PolicyViolation }
   * 
   * 
   */
  public List<PolicyViolation> getPolicyViolation() {
    if (policyViolation == null) {
      policyViolation = new ArrayList<PolicyViolation>();
    }
    return this.policyViolation;
  }

  /**
   * Gets the value of the comments property.
   * 
   * @return possible object is {@link Comments }
   * 
   */
  public Comments getComments() {
    return comments;
  }

  /**
   * Sets the value of the comments property.
   * 
   * @param value allowed object is {@link Comments }
   * 
   */
  public void setComments(Comments value) {
    this.comments = value;
  }

  /**
   * Gets the value of the termsAndConditions property.
   * 
   * @return possible object is {@link TermsAndConditions }
   * 
   */
  public TermsAndConditions getTermsAndConditions() {
    return termsAndConditions;
  }

  /**
   * Sets the value of the termsAndConditions property.
   * 
   * @param value allowed object is {@link TermsAndConditions }
   * 
   */
  public void setTermsAndConditions(TermsAndConditions value) {
    this.termsAndConditions = value;
  }

}
