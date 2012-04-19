
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.util.ArrayList;
import java.util.List;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.FlightDetailsType;


/**
 * AID for Airlines
 */
public class AirlineItineraryType {

	/**
	 */
	private String PassengerName;
	public String getPassengerName() {
		return PassengerName;
	}
	public void setPassengerName(String value) {
		this.PassengerName = value;
	}

	/**
	 */
	private String IssueDate;
	public String getIssueDate() {
		return IssueDate;
	}
	public void setIssueDate(String value) {
		this.IssueDate = value;
	}

	/**
	 */
	private String TravelAgencyName;
	public String getTravelAgencyName() {
		return TravelAgencyName;
	}
	public void setTravelAgencyName(String value) {
		this.TravelAgencyName = value;
	}

	/**
	 */
	private String TravelAgencyCode;
	public String getTravelAgencyCode() {
		return TravelAgencyCode;
	}
	public void setTravelAgencyCode(String value) {
		this.TravelAgencyCode = value;
	}

	/**
	 */
	private String TicketNumber;
	public String getTicketNumber() {
		return TicketNumber;
	}
	public void setTicketNumber(String value) {
		this.TicketNumber = value;
	}

	/**
	 */
	private String IssuingCarrierCode;
	public String getIssuingCarrierCode() {
		return IssuingCarrierCode;
	}
	public void setIssuingCarrierCode(String value) {
		this.IssuingCarrierCode = value;
	}

	/**
	 */
	private String CustomerCode;
	public String getCustomerCode() {
		return CustomerCode;
	}
	public void setCustomerCode(String value) {
		this.CustomerCode = value;
	}

	/**
	 */
	private BasicAmountType TotalFare;
	public BasicAmountType getTotalFare() {
		return TotalFare;
	}
	public void setTotalFare(BasicAmountType value) {
		this.TotalFare = value;
	}

	/**
	 */
	private BasicAmountType TotalTaxes;
	public BasicAmountType getTotalTaxes() {
		return TotalTaxes;
	}
	public void setTotalTaxes(BasicAmountType value) {
		this.TotalTaxes = value;
	}

	/**
	 */
	private BasicAmountType TotalFee;
	public BasicAmountType getTotalFee() {
		return TotalFee;
	}
	public void setTotalFee(BasicAmountType value) {
		this.TotalFee = value;
	}

	/**
	 */
	private String RestrictedTicket;
	public String getRestrictedTicket() {
		return RestrictedTicket;
	}
	public void setRestrictedTicket(String value) {
		this.RestrictedTicket = value;
	}

	/**
	 */
	private String ClearingSequence;
	public String getClearingSequence() {
		return ClearingSequence;
	}
	public void setClearingSequence(String value) {
		this.ClearingSequence = value;
	}

	/**
	 */
	private String ClearingCount;
	public String getClearingCount() {
		return ClearingCount;
	}
	public void setClearingCount(String value) {
		this.ClearingCount = value;
	}

	/**
	 */
	private List<FlightDetailsType> FlightDetails = new ArrayList<FlightDetailsType>();
	public List<FlightDetailsType> getFlightDetails() {
		return FlightDetails;
	}
	public void setFlightDetails(List<FlightDetailsType> value) {
		this.FlightDetails = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( PassengerName != null ) {
			sb.append("<ebl:PassengerName>").append(PassengerName);
			sb.append("</ebl:PassengerName>");
		}
		if( IssueDate != null ) {
			sb.append("<ebl:IssueDate>").append(IssueDate);
			sb.append("</ebl:IssueDate>");
		}
		if( TravelAgencyName != null ) {
			sb.append("<ebl:TravelAgencyName>").append(TravelAgencyName);
			sb.append("</ebl:TravelAgencyName>");
		}
		if( TravelAgencyCode != null ) {
			sb.append("<ebl:TravelAgencyCode>").append(TravelAgencyCode);
			sb.append("</ebl:TravelAgencyCode>");
		}
		if( TicketNumber != null ) {
			sb.append("<ebl:TicketNumber>").append(TicketNumber);
			sb.append("</ebl:TicketNumber>");
		}
		if( IssuingCarrierCode != null ) {
			sb.append("<ebl:IssuingCarrierCode>").append(IssuingCarrierCode);
			sb.append("</ebl:IssuingCarrierCode>");
		}
		if( CustomerCode != null ) {
			sb.append("<ebl:CustomerCode>").append(CustomerCode);
			sb.append("</ebl:CustomerCode>");
		}
		if( TotalFare != null ) {
			sb.append("<ebl:TotalFare ");
			sb.append(TotalFare.toXMLString());
			sb.append("</ebl:TotalFare>");
		}
		if( TotalTaxes != null ) {
			sb.append("<ebl:TotalTaxes ");
			sb.append(TotalTaxes.toXMLString());
			sb.append("</ebl:TotalTaxes>");
		}
		if( TotalFee != null ) {
			sb.append("<ebl:TotalFee ");
			sb.append(TotalFee.toXMLString());
			sb.append("</ebl:TotalFee>");
		}
		if( RestrictedTicket != null ) {
			sb.append("<ebl:RestrictedTicket>").append(RestrictedTicket);
			sb.append("</ebl:RestrictedTicket>");
		}
		if( ClearingSequence != null ) {
			sb.append("<ebl:ClearingSequence>").append(ClearingSequence);
			sb.append("</ebl:ClearingSequence>");
		}
		if( ClearingCount != null ) {
			sb.append("<ebl:ClearingCount>").append(ClearingCount);
			sb.append("</ebl:ClearingCount>");
		}
		if( FlightDetails != null ) {
			for(int i=0; i<FlightDetails.size(); i++) {
				sb.append("<ebl:FlightDetails>");
				sb.append(FlightDetails.get(i).toXMLString());
				sb.append("</ebl:FlightDetails>");
			}
		}
		return sb.toString();
	}

}
