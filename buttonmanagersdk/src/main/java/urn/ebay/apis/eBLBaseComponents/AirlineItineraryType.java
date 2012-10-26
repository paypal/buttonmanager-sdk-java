package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.FlightDetailsType;
import com.paypal.core.SDKUtil;

/**
 * AID for Airlines 
 */
public class AirlineItineraryType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private String passengerName;

	/**
	 * 	 
	 */ 
	private String issueDate;

	/**
	 * 	 
	 */ 
	private String travelAgencyName;

	/**
	 * 	 
	 */ 
	private String travelAgencyCode;

	/**
	 * 	 
	 */ 
	private String ticketNumber;

	/**
	 * 	 
	 */ 
	private String issuingCarrierCode;

	/**
	 * 	 
	 */ 
	private String customerCode;

	/**
	 * 	 
	 */ 
	private BasicAmountType totalFare;

	/**
	 * 	 
	 */ 
	private BasicAmountType totalTaxes;

	/**
	 * 	 
	 */ 
	private BasicAmountType totalFee;

	/**
	 * 	 
	 */ 
	private String restrictedTicket;

	/**
	 * 	 
	 */ 
	private String clearingSequence;

	/**
	 * 	 
	 */ 
	private String clearingCount;

	/**
	 * 	 
	 */ 
	private List<FlightDetailsType> flightDetails = new ArrayList<FlightDetailsType>();

	

	/**
	 * Default Constructor
	 */
	public AirlineItineraryType (){
	}	

	/**
	 * Getter for passengerName
	 */
	 public String getPassengerName() {
	 	return passengerName;
	 }
	 
	/**
	 * Setter for passengerName
	 */
	 public void setPassengerName(String passengerName) {
	 	this.passengerName = passengerName;
	 }
	 
	/**
	 * Getter for issueDate
	 */
	 public String getIssueDate() {
	 	return issueDate;
	 }
	 
	/**
	 * Setter for issueDate
	 */
	 public void setIssueDate(String issueDate) {
	 	this.issueDate = issueDate;
	 }
	 
	/**
	 * Getter for travelAgencyName
	 */
	 public String getTravelAgencyName() {
	 	return travelAgencyName;
	 }
	 
	/**
	 * Setter for travelAgencyName
	 */
	 public void setTravelAgencyName(String travelAgencyName) {
	 	this.travelAgencyName = travelAgencyName;
	 }
	 
	/**
	 * Getter for travelAgencyCode
	 */
	 public String getTravelAgencyCode() {
	 	return travelAgencyCode;
	 }
	 
	/**
	 * Setter for travelAgencyCode
	 */
	 public void setTravelAgencyCode(String travelAgencyCode) {
	 	this.travelAgencyCode = travelAgencyCode;
	 }
	 
	/**
	 * Getter for ticketNumber
	 */
	 public String getTicketNumber() {
	 	return ticketNumber;
	 }
	 
	/**
	 * Setter for ticketNumber
	 */
	 public void setTicketNumber(String ticketNumber) {
	 	this.ticketNumber = ticketNumber;
	 }
	 
	/**
	 * Getter for issuingCarrierCode
	 */
	 public String getIssuingCarrierCode() {
	 	return issuingCarrierCode;
	 }
	 
	/**
	 * Setter for issuingCarrierCode
	 */
	 public void setIssuingCarrierCode(String issuingCarrierCode) {
	 	this.issuingCarrierCode = issuingCarrierCode;
	 }
	 
	/**
	 * Getter for customerCode
	 */
	 public String getCustomerCode() {
	 	return customerCode;
	 }
	 
	/**
	 * Setter for customerCode
	 */
	 public void setCustomerCode(String customerCode) {
	 	this.customerCode = customerCode;
	 }
	 
	/**
	 * Getter for totalFare
	 */
	 public BasicAmountType getTotalFare() {
	 	return totalFare;
	 }
	 
	/**
	 * Setter for totalFare
	 */
	 public void setTotalFare(BasicAmountType totalFare) {
	 	this.totalFare = totalFare;
	 }
	 
	/**
	 * Getter for totalTaxes
	 */
	 public BasicAmountType getTotalTaxes() {
	 	return totalTaxes;
	 }
	 
	/**
	 * Setter for totalTaxes
	 */
	 public void setTotalTaxes(BasicAmountType totalTaxes) {
	 	this.totalTaxes = totalTaxes;
	 }
	 
	/**
	 * Getter for totalFee
	 */
	 public BasicAmountType getTotalFee() {
	 	return totalFee;
	 }
	 
	/**
	 * Setter for totalFee
	 */
	 public void setTotalFee(BasicAmountType totalFee) {
	 	this.totalFee = totalFee;
	 }
	 
	/**
	 * Getter for restrictedTicket
	 */
	 public String getRestrictedTicket() {
	 	return restrictedTicket;
	 }
	 
	/**
	 * Setter for restrictedTicket
	 */
	 public void setRestrictedTicket(String restrictedTicket) {
	 	this.restrictedTicket = restrictedTicket;
	 }
	 
	/**
	 * Getter for clearingSequence
	 */
	 public String getClearingSequence() {
	 	return clearingSequence;
	 }
	 
	/**
	 * Setter for clearingSequence
	 */
	 public void setClearingSequence(String clearingSequence) {
	 	this.clearingSequence = clearingSequence;
	 }
	 
	/**
	 * Getter for clearingCount
	 */
	 public String getClearingCount() {
	 	return clearingCount;
	 }
	 
	/**
	 * Setter for clearingCount
	 */
	 public void setClearingCount(String clearingCount) {
	 	this.clearingCount = clearingCount;
	 }
	 
	/**
	 * Getter for flightDetails
	 */
	 public List<FlightDetailsType> getFlightDetails() {
	 	return flightDetails;
	 }
	 
	/**
	 * Setter for flightDetails
	 */
	 public void setFlightDetails(List<FlightDetailsType> flightDetails) {
	 	this.flightDetails = flightDetails;
	 }
	 


	public String toXMLString(String prefix,String name) {
		StringBuilder sb = new StringBuilder();
		if(name!=null){
			if(prefix!=null){
				sb.append("<").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("<").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		if(passengerName != null) {
			sb.append("<").append(preferredPrefix).append(":PassengerName>").append(SDKUtil.escapeInvalidXmlCharsRegex(passengerName));
			sb.append("</").append(preferredPrefix).append(":PassengerName>");
		}
		if(issueDate != null) {
			sb.append("<").append(preferredPrefix).append(":IssueDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(issueDate));
			sb.append("</").append(preferredPrefix).append(":IssueDate>");
		}
		if(travelAgencyName != null) {
			sb.append("<").append(preferredPrefix).append(":TravelAgencyName>").append(SDKUtil.escapeInvalidXmlCharsRegex(travelAgencyName));
			sb.append("</").append(preferredPrefix).append(":TravelAgencyName>");
		}
		if(travelAgencyCode != null) {
			sb.append("<").append(preferredPrefix).append(":TravelAgencyCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(travelAgencyCode));
			sb.append("</").append(preferredPrefix).append(":TravelAgencyCode>");
		}
		if(ticketNumber != null) {
			sb.append("<").append(preferredPrefix).append(":TicketNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(ticketNumber));
			sb.append("</").append(preferredPrefix).append(":TicketNumber>");
		}
		if(issuingCarrierCode != null) {
			sb.append("<").append(preferredPrefix).append(":IssuingCarrierCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(issuingCarrierCode));
			sb.append("</").append(preferredPrefix).append(":IssuingCarrierCode>");
		}
		if(customerCode != null) {
			sb.append("<").append(preferredPrefix).append(":CustomerCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(customerCode));
			sb.append("</").append(preferredPrefix).append(":CustomerCode>");
		}
		if(totalFare != null) {
			sb.append(totalFare.toXMLString(preferredPrefix,"TotalFare"));
		}
		if(totalTaxes != null) {
			sb.append(totalTaxes.toXMLString(preferredPrefix,"TotalTaxes"));
		}
		if(totalFee != null) {
			sb.append(totalFee.toXMLString(preferredPrefix,"TotalFee"));
		}
		if(restrictedTicket != null) {
			sb.append("<").append(preferredPrefix).append(":RestrictedTicket>").append(SDKUtil.escapeInvalidXmlCharsRegex(restrictedTicket));
			sb.append("</").append(preferredPrefix).append(":RestrictedTicket>");
		}
		if(clearingSequence != null) {
			sb.append("<").append(preferredPrefix).append(":ClearingSequence>").append(SDKUtil.escapeInvalidXmlCharsRegex(clearingSequence));
			sb.append("</").append(preferredPrefix).append(":ClearingSequence>");
		}
		if(clearingCount != null) {
			sb.append("<").append(preferredPrefix).append(":ClearingCount>").append(SDKUtil.escapeInvalidXmlCharsRegex(clearingCount));
			sb.append("</").append(preferredPrefix).append(":ClearingCount>");
		}
		if(flightDetails != null) {
			for(int i=0; i < flightDetails.size(); i++) {
				sb.append(flightDetails.get(i).toXMLString(preferredPrefix,"FlightDetails"));
			}
		}
		if(name!=null){
			if(prefix!=null){
				sb.append("</").append(prefix).append(":").append(name).append(">");
			}
			else{
				sb.append("</").append(preferredPrefix).append(":").append(name).append(">");
			}
		}
		return sb.toString();
	}


}