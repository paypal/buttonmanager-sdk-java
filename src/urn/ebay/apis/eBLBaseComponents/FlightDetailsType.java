
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;


/**
 * Details of leg information
 */
public class FlightDetailsType {

	/**
	 */
	private String ConjuctionTicket;
	public String getConjuctionTicket() {
		return ConjuctionTicket;
	}
	public void setConjuctionTicket(String value) {
		this.ConjuctionTicket = value;
	}

	/**
	 */
	private String ExchangeTicket;
	public String getExchangeTicket() {
		return ExchangeTicket;
	}
	public void setExchangeTicket(String value) {
		this.ExchangeTicket = value;
	}

	/**
	 */
	private String CouponNumber;
	public String getCouponNumber() {
		return CouponNumber;
	}
	public void setCouponNumber(String value) {
		this.CouponNumber = value;
	}

	/**
	 */
	private String ServiceClass;
	public String getServiceClass() {
		return ServiceClass;
	}
	public void setServiceClass(String value) {
		this.ServiceClass = value;
	}

	/**
	 */
	private String TravelDate;
	public String getTravelDate() {
		return TravelDate;
	}
	public void setTravelDate(String value) {
		this.TravelDate = value;
	}

	/**
	 */
	private String CarrierCode;
	public String getCarrierCode() {
		return CarrierCode;
	}
	public void setCarrierCode(String value) {
		this.CarrierCode = value;
	}

	/**
	 */
	private String StopOverPermitted;
	public String getStopOverPermitted() {
		return StopOverPermitted;
	}
	public void setStopOverPermitted(String value) {
		this.StopOverPermitted = value;
	}

	/**
	 */
	private String DepartureAirport;
	public String getDepartureAirport() {
		return DepartureAirport;
	}
	public void setDepartureAirport(String value) {
		this.DepartureAirport = value;
	}

	/**
	 */
	private String ArrivalAirport;
	public String getArrivalAirport() {
		return ArrivalAirport;
	}
	public void setArrivalAirport(String value) {
		this.ArrivalAirport = value;
	}

	/**
	 */
	private String FlightNumber;
	public String getFlightNumber() {
		return FlightNumber;
	}
	public void setFlightNumber(String value) {
		this.FlightNumber = value;
	}

	/**
	 */
	private String DepartureTime;
	public String getDepartureTime() {
		return DepartureTime;
	}
	public void setDepartureTime(String value) {
		this.DepartureTime = value;
	}

	/**
	 */
	private String ArrivalTime;
	public String getArrivalTime() {
		return ArrivalTime;
	}
	public void setArrivalTime(String value) {
		this.ArrivalTime = value;
	}

	/**
	 */
	private String FareBasisCode;
	public String getFareBasisCode() {
		return FareBasisCode;
	}
	public void setFareBasisCode(String value) {
		this.FareBasisCode = value;
	}

	/**
	 */
	private BasicAmountType Fare;
	public BasicAmountType getFare() {
		return Fare;
	}
	public void setFare(BasicAmountType value) {
		this.Fare = value;
	}

	/**
	 */
	private BasicAmountType Taxes;
	public BasicAmountType getTaxes() {
		return Taxes;
	}
	public void setTaxes(BasicAmountType value) {
		this.Taxes = value;
	}

	/**
	 */
	private BasicAmountType Fee;
	public BasicAmountType getFee() {
		return Fee;
	}
	public void setFee(BasicAmountType value) {
		this.Fee = value;
	}

	/**
	 */
	private String EndorsementOrRestrictions;
	public String getEndorsementOrRestrictions() {
		return EndorsementOrRestrictions;
	}
	public void setEndorsementOrRestrictions(String value) {
		this.EndorsementOrRestrictions = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ConjuctionTicket != null ) {
			sb.append("<ebl:ConjuctionTicket>").append(ConjuctionTicket);
			sb.append("</ebl:ConjuctionTicket>");
		}
		if( ExchangeTicket != null ) {
			sb.append("<ebl:ExchangeTicket>").append(ExchangeTicket);
			sb.append("</ebl:ExchangeTicket>");
		}
		if( CouponNumber != null ) {
			sb.append("<ebl:CouponNumber>").append(CouponNumber);
			sb.append("</ebl:CouponNumber>");
		}
		if( ServiceClass != null ) {
			sb.append("<ebl:ServiceClass>").append(ServiceClass);
			sb.append("</ebl:ServiceClass>");
		}
		if( TravelDate != null ) {
			sb.append("<ebl:TravelDate>").append(TravelDate);
			sb.append("</ebl:TravelDate>");
		}
		if( CarrierCode != null ) {
			sb.append("<ebl:CarrierCode>").append(CarrierCode);
			sb.append("</ebl:CarrierCode>");
		}
		if( StopOverPermitted != null ) {
			sb.append("<ebl:StopOverPermitted>").append(StopOverPermitted);
			sb.append("</ebl:StopOverPermitted>");
		}
		if( DepartureAirport != null ) {
			sb.append("<ebl:DepartureAirport>").append(DepartureAirport);
			sb.append("</ebl:DepartureAirport>");
		}
		if( ArrivalAirport != null ) {
			sb.append("<ebl:ArrivalAirport>").append(ArrivalAirport);
			sb.append("</ebl:ArrivalAirport>");
		}
		if( FlightNumber != null ) {
			sb.append("<ebl:FlightNumber>").append(FlightNumber);
			sb.append("</ebl:FlightNumber>");
		}
		if( DepartureTime != null ) {
			sb.append("<ebl:DepartureTime>").append(DepartureTime);
			sb.append("</ebl:DepartureTime>");
		}
		if( ArrivalTime != null ) {
			sb.append("<ebl:ArrivalTime>").append(ArrivalTime);
			sb.append("</ebl:ArrivalTime>");
		}
		if( FareBasisCode != null ) {
			sb.append("<ebl:FareBasisCode>").append(FareBasisCode);
			sb.append("</ebl:FareBasisCode>");
		}
		if( Fare != null ) {
			sb.append("<ebl:Fare ");
			sb.append(Fare.toXMLString());
			sb.append("</ebl:Fare>");
		}
		if( Taxes != null ) {
			sb.append("<ebl:Taxes ");
			sb.append(Taxes.toXMLString());
			sb.append("</ebl:Taxes>");
		}
		if( Fee != null ) {
			sb.append("<ebl:Fee ");
			sb.append(Fee.toXMLString());
			sb.append("</ebl:Fee>");
		}
		if( EndorsementOrRestrictions != null ) {
			sb.append("<ebl:EndorsementOrRestrictions>").append(EndorsementOrRestrictions);
			sb.append("</ebl:EndorsementOrRestrictions>");
		}
		return sb.toString();
	}

}
