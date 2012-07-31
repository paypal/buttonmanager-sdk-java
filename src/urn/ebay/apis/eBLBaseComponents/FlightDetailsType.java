package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;

/**
 * Details of leg information 
 */
public class FlightDetailsType{


	/**
	 * 	 
	 */ 
	private String ConjuctionTicket;

	/**
	 * 	 
	 */ 
	private String ExchangeTicket;

	/**
	 * 	 
	 */ 
	private String CouponNumber;

	/**
	 * 	 
	 */ 
	private String ServiceClass;

	/**
	 * 	 
	 */ 
	private String TravelDate;

	/**
	 * 	 
	 */ 
	private String CarrierCode;

	/**
	 * 	 
	 */ 
	private String StopOverPermitted;

	/**
	 * 	 
	 */ 
	private String DepartureAirport;

	/**
	 * 	 
	 */ 
	private String ArrivalAirport;

	/**
	 * 	 
	 */ 
	private String FlightNumber;

	/**
	 * 	 
	 */ 
	private String DepartureTime;

	/**
	 * 	 
	 */ 
	private String ArrivalTime;

	/**
	 * 	 
	 */ 
	private String FareBasisCode;

	/**
	 * 	 
	 */ 
	private BasicAmountType Fare;

	/**
	 * 	 
	 */ 
	private BasicAmountType Taxes;

	/**
	 * 	 
	 */ 
	private BasicAmountType Fee;

	/**
	 * 	 
	 */ 
	private String EndorsementOrRestrictions;

	

	/**
	 * Default Constructor
	 */
	public FlightDetailsType (){
	}	

	/**
	 * Getter for ConjuctionTicket
	 */
	 public String getConjuctionTicket() {
	 	return ConjuctionTicket;
	 }
	 
	/**
	 * Setter for ConjuctionTicket
	 */
	 public void setConjuctionTicket(String ConjuctionTicket) {
	 	this.ConjuctionTicket = ConjuctionTicket;
	 }
	 
	/**
	 * Getter for ExchangeTicket
	 */
	 public String getExchangeTicket() {
	 	return ExchangeTicket;
	 }
	 
	/**
	 * Setter for ExchangeTicket
	 */
	 public void setExchangeTicket(String ExchangeTicket) {
	 	this.ExchangeTicket = ExchangeTicket;
	 }
	 
	/**
	 * Getter for CouponNumber
	 */
	 public String getCouponNumber() {
	 	return CouponNumber;
	 }
	 
	/**
	 * Setter for CouponNumber
	 */
	 public void setCouponNumber(String CouponNumber) {
	 	this.CouponNumber = CouponNumber;
	 }
	 
	/**
	 * Getter for ServiceClass
	 */
	 public String getServiceClass() {
	 	return ServiceClass;
	 }
	 
	/**
	 * Setter for ServiceClass
	 */
	 public void setServiceClass(String ServiceClass) {
	 	this.ServiceClass = ServiceClass;
	 }
	 
	/**
	 * Getter for TravelDate
	 */
	 public String getTravelDate() {
	 	return TravelDate;
	 }
	 
	/**
	 * Setter for TravelDate
	 */
	 public void setTravelDate(String TravelDate) {
	 	this.TravelDate = TravelDate;
	 }
	 
	/**
	 * Getter for CarrierCode
	 */
	 public String getCarrierCode() {
	 	return CarrierCode;
	 }
	 
	/**
	 * Setter for CarrierCode
	 */
	 public void setCarrierCode(String CarrierCode) {
	 	this.CarrierCode = CarrierCode;
	 }
	 
	/**
	 * Getter for StopOverPermitted
	 */
	 public String getStopOverPermitted() {
	 	return StopOverPermitted;
	 }
	 
	/**
	 * Setter for StopOverPermitted
	 */
	 public void setStopOverPermitted(String StopOverPermitted) {
	 	this.StopOverPermitted = StopOverPermitted;
	 }
	 
	/**
	 * Getter for DepartureAirport
	 */
	 public String getDepartureAirport() {
	 	return DepartureAirport;
	 }
	 
	/**
	 * Setter for DepartureAirport
	 */
	 public void setDepartureAirport(String DepartureAirport) {
	 	this.DepartureAirport = DepartureAirport;
	 }
	 
	/**
	 * Getter for ArrivalAirport
	 */
	 public String getArrivalAirport() {
	 	return ArrivalAirport;
	 }
	 
	/**
	 * Setter for ArrivalAirport
	 */
	 public void setArrivalAirport(String ArrivalAirport) {
	 	this.ArrivalAirport = ArrivalAirport;
	 }
	 
	/**
	 * Getter for FlightNumber
	 */
	 public String getFlightNumber() {
	 	return FlightNumber;
	 }
	 
	/**
	 * Setter for FlightNumber
	 */
	 public void setFlightNumber(String FlightNumber) {
	 	this.FlightNumber = FlightNumber;
	 }
	 
	/**
	 * Getter for DepartureTime
	 */
	 public String getDepartureTime() {
	 	return DepartureTime;
	 }
	 
	/**
	 * Setter for DepartureTime
	 */
	 public void setDepartureTime(String DepartureTime) {
	 	this.DepartureTime = DepartureTime;
	 }
	 
	/**
	 * Getter for ArrivalTime
	 */
	 public String getArrivalTime() {
	 	return ArrivalTime;
	 }
	 
	/**
	 * Setter for ArrivalTime
	 */
	 public void setArrivalTime(String ArrivalTime) {
	 	this.ArrivalTime = ArrivalTime;
	 }
	 
	/**
	 * Getter for FareBasisCode
	 */
	 public String getFareBasisCode() {
	 	return FareBasisCode;
	 }
	 
	/**
	 * Setter for FareBasisCode
	 */
	 public void setFareBasisCode(String FareBasisCode) {
	 	this.FareBasisCode = FareBasisCode;
	 }
	 
	/**
	 * Getter for Fare
	 */
	 public BasicAmountType getFare() {
	 	return Fare;
	 }
	 
	/**
	 * Setter for Fare
	 */
	 public void setFare(BasicAmountType Fare) {
	 	this.Fare = Fare;
	 }
	 
	/**
	 * Getter for Taxes
	 */
	 public BasicAmountType getTaxes() {
	 	return Taxes;
	 }
	 
	/**
	 * Setter for Taxes
	 */
	 public void setTaxes(BasicAmountType Taxes) {
	 	this.Taxes = Taxes;
	 }
	 
	/**
	 * Getter for Fee
	 */
	 public BasicAmountType getFee() {
	 	return Fee;
	 }
	 
	/**
	 * Setter for Fee
	 */
	 public void setFee(BasicAmountType Fee) {
	 	this.Fee = Fee;
	 }
	 
	/**
	 * Getter for EndorsementOrRestrictions
	 */
	 public String getEndorsementOrRestrictions() {
	 	return EndorsementOrRestrictions;
	 }
	 
	/**
	 * Setter for EndorsementOrRestrictions
	 */
	 public void setEndorsementOrRestrictions(String EndorsementOrRestrictions) {
	 	this.EndorsementOrRestrictions = EndorsementOrRestrictions;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ConjuctionTicket != null) {
			sb.append("<ebl:ConjuctionTicket>").append(ConjuctionTicket);
			sb.append("</ebl:ConjuctionTicket>");
		}
		if(ExchangeTicket != null) {
			sb.append("<ebl:ExchangeTicket>").append(ExchangeTicket);
			sb.append("</ebl:ExchangeTicket>");
		}
		if(CouponNumber != null) {
			sb.append("<ebl:CouponNumber>").append(CouponNumber);
			sb.append("</ebl:CouponNumber>");
		}
		if(ServiceClass != null) {
			sb.append("<ebl:ServiceClass>").append(ServiceClass);
			sb.append("</ebl:ServiceClass>");
		}
		if(TravelDate != null) {
			sb.append("<ebl:TravelDate>").append(TravelDate);
			sb.append("</ebl:TravelDate>");
		}
		if(CarrierCode != null) {
			sb.append("<ebl:CarrierCode>").append(CarrierCode);
			sb.append("</ebl:CarrierCode>");
		}
		if(StopOverPermitted != null) {
			sb.append("<ebl:StopOverPermitted>").append(StopOverPermitted);
			sb.append("</ebl:StopOverPermitted>");
		}
		if(DepartureAirport != null) {
			sb.append("<ebl:DepartureAirport>").append(DepartureAirport);
			sb.append("</ebl:DepartureAirport>");
		}
		if(ArrivalAirport != null) {
			sb.append("<ebl:ArrivalAirport>").append(ArrivalAirport);
			sb.append("</ebl:ArrivalAirport>");
		}
		if(FlightNumber != null) {
			sb.append("<ebl:FlightNumber>").append(FlightNumber);
			sb.append("</ebl:FlightNumber>");
		}
		if(DepartureTime != null) {
			sb.append("<ebl:DepartureTime>").append(DepartureTime);
			sb.append("</ebl:DepartureTime>");
		}
		if(ArrivalTime != null) {
			sb.append("<ebl:ArrivalTime>").append(ArrivalTime);
			sb.append("</ebl:ArrivalTime>");
		}
		if(FareBasisCode != null) {
			sb.append("<ebl:FareBasisCode>").append(FareBasisCode);
			sb.append("</ebl:FareBasisCode>");
		}
		if(Fare != null) {
			sb.append("<ebl:Fare");
			sb.append(Fare.toXMLString());
			sb.append("</ebl:Fare>");
		}
		if(Taxes != null) {
			sb.append("<ebl:Taxes");
			sb.append(Taxes.toXMLString());
			sb.append("</ebl:Taxes>");
		}
		if(Fee != null) {
			sb.append("<ebl:Fee");
			sb.append(Fee.toXMLString());
			sb.append("</ebl:Fee>");
		}
		if(EndorsementOrRestrictions != null) {
			sb.append("<ebl:EndorsementOrRestrictions>").append(EndorsementOrRestrictions);
			sb.append("</ebl:EndorsementOrRestrictions>");
		}
		return sb.toString();
	}

}