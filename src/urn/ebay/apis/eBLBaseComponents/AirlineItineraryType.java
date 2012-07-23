package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.FlightDetailsType;

/**
 * AID for Airlines 
 */
public class AirlineItineraryType{


	/**
	 * No Document Comments	 
	 */ 
	private String PassengerName;

	/**
	 * No Document Comments	 
	 */ 
	private String IssueDate;

	/**
	 * No Document Comments	 
	 */ 
	private String TravelAgencyName;

	/**
	 * No Document Comments	 
	 */ 
	private String TravelAgencyCode;

	/**
	 * No Document Comments	 
	 */ 
	private String TicketNumber;

	/**
	 * No Document Comments	 
	 */ 
	private String IssuingCarrierCode;

	/**
	 * No Document Comments	 
	 */ 
	private String CustomerCode;

	/**
	 * No Document Comments	 
	 */ 
	private BasicAmountType TotalFare;

	/**
	 * No Document Comments	 
	 */ 
	private BasicAmountType TotalTaxes;

	/**
	 * No Document Comments	 
	 */ 
	private BasicAmountType TotalFee;

	/**
	 * No Document Comments	 
	 */ 
	private String RestrictedTicket;

	/**
	 * No Document Comments	 
	 */ 
	private String ClearingSequence;

	/**
	 * No Document Comments	 
	 */ 
	private String ClearingCount;

	/**
	 * No Document Comments	 
	 */ 
	private List<FlightDetailsType> FlightDetails = new ArrayList<FlightDetailsType>();

	

	/**
	 * Default Constructor
	 */
	public AirlineItineraryType (){
	}	

	/**
	 * Getter for PassengerName
	 */
	 public String getPassengerName() {
	 	return PassengerName;
	 }
	 
	/**
	 * Setter for PassengerName
	 */
	 public void setPassengerName(String PassengerName) {
	 	this.PassengerName = PassengerName;
	 }
	 
	/**
	 * Getter for IssueDate
	 */
	 public String getIssueDate() {
	 	return IssueDate;
	 }
	 
	/**
	 * Setter for IssueDate
	 */
	 public void setIssueDate(String IssueDate) {
	 	this.IssueDate = IssueDate;
	 }
	 
	/**
	 * Getter for TravelAgencyName
	 */
	 public String getTravelAgencyName() {
	 	return TravelAgencyName;
	 }
	 
	/**
	 * Setter for TravelAgencyName
	 */
	 public void setTravelAgencyName(String TravelAgencyName) {
	 	this.TravelAgencyName = TravelAgencyName;
	 }
	 
	/**
	 * Getter for TravelAgencyCode
	 */
	 public String getTravelAgencyCode() {
	 	return TravelAgencyCode;
	 }
	 
	/**
	 * Setter for TravelAgencyCode
	 */
	 public void setTravelAgencyCode(String TravelAgencyCode) {
	 	this.TravelAgencyCode = TravelAgencyCode;
	 }
	 
	/**
	 * Getter for TicketNumber
	 */
	 public String getTicketNumber() {
	 	return TicketNumber;
	 }
	 
	/**
	 * Setter for TicketNumber
	 */
	 public void setTicketNumber(String TicketNumber) {
	 	this.TicketNumber = TicketNumber;
	 }
	 
	/**
	 * Getter for IssuingCarrierCode
	 */
	 public String getIssuingCarrierCode() {
	 	return IssuingCarrierCode;
	 }
	 
	/**
	 * Setter for IssuingCarrierCode
	 */
	 public void setIssuingCarrierCode(String IssuingCarrierCode) {
	 	this.IssuingCarrierCode = IssuingCarrierCode;
	 }
	 
	/**
	 * Getter for CustomerCode
	 */
	 public String getCustomerCode() {
	 	return CustomerCode;
	 }
	 
	/**
	 * Setter for CustomerCode
	 */
	 public void setCustomerCode(String CustomerCode) {
	 	this.CustomerCode = CustomerCode;
	 }
	 
	/**
	 * Getter for TotalFare
	 */
	 public BasicAmountType getTotalFare() {
	 	return TotalFare;
	 }
	 
	/**
	 * Setter for TotalFare
	 */
	 public void setTotalFare(BasicAmountType TotalFare) {
	 	this.TotalFare = TotalFare;
	 }
	 
	/**
	 * Getter for TotalTaxes
	 */
	 public BasicAmountType getTotalTaxes() {
	 	return TotalTaxes;
	 }
	 
	/**
	 * Setter for TotalTaxes
	 */
	 public void setTotalTaxes(BasicAmountType TotalTaxes) {
	 	this.TotalTaxes = TotalTaxes;
	 }
	 
	/**
	 * Getter for TotalFee
	 */
	 public BasicAmountType getTotalFee() {
	 	return TotalFee;
	 }
	 
	/**
	 * Setter for TotalFee
	 */
	 public void setTotalFee(BasicAmountType TotalFee) {
	 	this.TotalFee = TotalFee;
	 }
	 
	/**
	 * Getter for RestrictedTicket
	 */
	 public String getRestrictedTicket() {
	 	return RestrictedTicket;
	 }
	 
	/**
	 * Setter for RestrictedTicket
	 */
	 public void setRestrictedTicket(String RestrictedTicket) {
	 	this.RestrictedTicket = RestrictedTicket;
	 }
	 
	/**
	 * Getter for ClearingSequence
	 */
	 public String getClearingSequence() {
	 	return ClearingSequence;
	 }
	 
	/**
	 * Setter for ClearingSequence
	 */
	 public void setClearingSequence(String ClearingSequence) {
	 	this.ClearingSequence = ClearingSequence;
	 }
	 
	/**
	 * Getter for ClearingCount
	 */
	 public String getClearingCount() {
	 	return ClearingCount;
	 }
	 
	/**
	 * Setter for ClearingCount
	 */
	 public void setClearingCount(String ClearingCount) {
	 	this.ClearingCount = ClearingCount;
	 }
	 
	/**
	 * Getter for FlightDetails
	 */
	 public List<FlightDetailsType> getFlightDetails() {
	 	return FlightDetails;
	 }
	 
	/**
	 * Setter for FlightDetails
	 */
	 public void setFlightDetails(List<FlightDetailsType> FlightDetails) {
	 	this.FlightDetails = FlightDetails;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(PassengerName != null) {
			sb.append("<ebl:PassengerName>").append(PassengerName);
			sb.append("</ebl:PassengerName>");
		}
		if(IssueDate != null) {
			sb.append("<ebl:IssueDate>").append(IssueDate);
			sb.append("</ebl:IssueDate>");
		}
		if(TravelAgencyName != null) {
			sb.append("<ebl:TravelAgencyName>").append(TravelAgencyName);
			sb.append("</ebl:TravelAgencyName>");
		}
		if(TravelAgencyCode != null) {
			sb.append("<ebl:TravelAgencyCode>").append(TravelAgencyCode);
			sb.append("</ebl:TravelAgencyCode>");
		}
		if(TicketNumber != null) {
			sb.append("<ebl:TicketNumber>").append(TicketNumber);
			sb.append("</ebl:TicketNumber>");
		}
		if(IssuingCarrierCode != null) {
			sb.append("<ebl:IssuingCarrierCode>").append(IssuingCarrierCode);
			sb.append("</ebl:IssuingCarrierCode>");
		}
		if(CustomerCode != null) {
			sb.append("<ebl:CustomerCode>").append(CustomerCode);
			sb.append("</ebl:CustomerCode>");
		}
		if(TotalFare != null) {
			sb.append("<ebl:TotalFare");
			sb.append(TotalFare.toXMLString());
			sb.append("</ebl:TotalFare>");
		}
		if(TotalTaxes != null) {
			sb.append("<ebl:TotalTaxes");
			sb.append(TotalTaxes.toXMLString());
			sb.append("</ebl:TotalTaxes>");
		}
		if(TotalFee != null) {
			sb.append("<ebl:TotalFee");
			sb.append(TotalFee.toXMLString());
			sb.append("</ebl:TotalFee>");
		}
		if(RestrictedTicket != null) {
			sb.append("<ebl:RestrictedTicket>").append(RestrictedTicket);
			sb.append("</ebl:RestrictedTicket>");
		}
		if(ClearingSequence != null) {
			sb.append("<ebl:ClearingSequence>").append(ClearingSequence);
			sb.append("</ebl:ClearingSequence>");
		}
		if(ClearingCount != null) {
			sb.append("<ebl:ClearingCount>").append(ClearingCount);
			sb.append("</ebl:ClearingCount>");
		}
		if(FlightDetails != null) {
			for(int i=0; i < FlightDetails.size(); i++) {
				sb.append("<ebl:FlightDetails>");
				sb.append(FlightDetails.get(i).toXMLString());
				sb.append("</ebl:FlightDetails>");
			}
		}
		return sb.toString();
	}

}