package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import com.paypal.core.SDKUtil;

/**
 * Details of leg information 
 */
public class FlightDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private String conjuctionTicket;

	/**
	 * 	 
	 */ 
	private String exchangeTicket;

	/**
	 * 	 
	 */ 
	private String couponNumber;

	/**
	 * 	 
	 */ 
	private String serviceClass;

	/**
	 * 	 
	 */ 
	private String travelDate;

	/**
	 * 	 
	 */ 
	private String carrierCode;

	/**
	 * 	 
	 */ 
	private String stopOverPermitted;

	/**
	 * 	 
	 */ 
	private String departureAirport;

	/**
	 * 	 
	 */ 
	private String arrivalAirport;

	/**
	 * 	 
	 */ 
	private String flightNumber;

	/**
	 * 	 
	 */ 
	private String departureTime;

	/**
	 * 	 
	 */ 
	private String arrivalTime;

	/**
	 * 	 
	 */ 
	private String fareBasisCode;

	/**
	 * 	 
	 */ 
	private BasicAmountType fare;

	/**
	 * 	 
	 */ 
	private BasicAmountType taxes;

	/**
	 * 	 
	 */ 
	private BasicAmountType fee;

	/**
	 * 	 
	 */ 
	private String endorsementOrRestrictions;

	

	/**
	 * Default Constructor
	 */
	public FlightDetailsType (){
	}	

	/**
	 * Getter for conjuctionTicket
	 */
	 public String getConjuctionTicket() {
	 	return conjuctionTicket;
	 }
	 
	/**
	 * Setter for conjuctionTicket
	 */
	 public void setConjuctionTicket(String conjuctionTicket) {
	 	this.conjuctionTicket = conjuctionTicket;
	 }
	 
	/**
	 * Getter for exchangeTicket
	 */
	 public String getExchangeTicket() {
	 	return exchangeTicket;
	 }
	 
	/**
	 * Setter for exchangeTicket
	 */
	 public void setExchangeTicket(String exchangeTicket) {
	 	this.exchangeTicket = exchangeTicket;
	 }
	 
	/**
	 * Getter for couponNumber
	 */
	 public String getCouponNumber() {
	 	return couponNumber;
	 }
	 
	/**
	 * Setter for couponNumber
	 */
	 public void setCouponNumber(String couponNumber) {
	 	this.couponNumber = couponNumber;
	 }
	 
	/**
	 * Getter for serviceClass
	 */
	 public String getServiceClass() {
	 	return serviceClass;
	 }
	 
	/**
	 * Setter for serviceClass
	 */
	 public void setServiceClass(String serviceClass) {
	 	this.serviceClass = serviceClass;
	 }
	 
	/**
	 * Getter for travelDate
	 */
	 public String getTravelDate() {
	 	return travelDate;
	 }
	 
	/**
	 * Setter for travelDate
	 */
	 public void setTravelDate(String travelDate) {
	 	this.travelDate = travelDate;
	 }
	 
	/**
	 * Getter for carrierCode
	 */
	 public String getCarrierCode() {
	 	return carrierCode;
	 }
	 
	/**
	 * Setter for carrierCode
	 */
	 public void setCarrierCode(String carrierCode) {
	 	this.carrierCode = carrierCode;
	 }
	 
	/**
	 * Getter for stopOverPermitted
	 */
	 public String getStopOverPermitted() {
	 	return stopOverPermitted;
	 }
	 
	/**
	 * Setter for stopOverPermitted
	 */
	 public void setStopOverPermitted(String stopOverPermitted) {
	 	this.stopOverPermitted = stopOverPermitted;
	 }
	 
	/**
	 * Getter for departureAirport
	 */
	 public String getDepartureAirport() {
	 	return departureAirport;
	 }
	 
	/**
	 * Setter for departureAirport
	 */
	 public void setDepartureAirport(String departureAirport) {
	 	this.departureAirport = departureAirport;
	 }
	 
	/**
	 * Getter for arrivalAirport
	 */
	 public String getArrivalAirport() {
	 	return arrivalAirport;
	 }
	 
	/**
	 * Setter for arrivalAirport
	 */
	 public void setArrivalAirport(String arrivalAirport) {
	 	this.arrivalAirport = arrivalAirport;
	 }
	 
	/**
	 * Getter for flightNumber
	 */
	 public String getFlightNumber() {
	 	return flightNumber;
	 }
	 
	/**
	 * Setter for flightNumber
	 */
	 public void setFlightNumber(String flightNumber) {
	 	this.flightNumber = flightNumber;
	 }
	 
	/**
	 * Getter for departureTime
	 */
	 public String getDepartureTime() {
	 	return departureTime;
	 }
	 
	/**
	 * Setter for departureTime
	 */
	 public void setDepartureTime(String departureTime) {
	 	this.departureTime = departureTime;
	 }
	 
	/**
	 * Getter for arrivalTime
	 */
	 public String getArrivalTime() {
	 	return arrivalTime;
	 }
	 
	/**
	 * Setter for arrivalTime
	 */
	 public void setArrivalTime(String arrivalTime) {
	 	this.arrivalTime = arrivalTime;
	 }
	 
	/**
	 * Getter for fareBasisCode
	 */
	 public String getFareBasisCode() {
	 	return fareBasisCode;
	 }
	 
	/**
	 * Setter for fareBasisCode
	 */
	 public void setFareBasisCode(String fareBasisCode) {
	 	this.fareBasisCode = fareBasisCode;
	 }
	 
	/**
	 * Getter for fare
	 */
	 public BasicAmountType getFare() {
	 	return fare;
	 }
	 
	/**
	 * Setter for fare
	 */
	 public void setFare(BasicAmountType fare) {
	 	this.fare = fare;
	 }
	 
	/**
	 * Getter for taxes
	 */
	 public BasicAmountType getTaxes() {
	 	return taxes;
	 }
	 
	/**
	 * Setter for taxes
	 */
	 public void setTaxes(BasicAmountType taxes) {
	 	this.taxes = taxes;
	 }
	 
	/**
	 * Getter for fee
	 */
	 public BasicAmountType getFee() {
	 	return fee;
	 }
	 
	/**
	 * Setter for fee
	 */
	 public void setFee(BasicAmountType fee) {
	 	this.fee = fee;
	 }
	 
	/**
	 * Getter for endorsementOrRestrictions
	 */
	 public String getEndorsementOrRestrictions() {
	 	return endorsementOrRestrictions;
	 }
	 
	/**
	 * Setter for endorsementOrRestrictions
	 */
	 public void setEndorsementOrRestrictions(String endorsementOrRestrictions) {
	 	this.endorsementOrRestrictions = endorsementOrRestrictions;
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
		if(conjuctionTicket != null) {
			sb.append("<").append(preferredPrefix).append(":ConjuctionTicket>").append(SDKUtil.escapeInvalidXmlCharsRegex(conjuctionTicket));
			sb.append("</").append(preferredPrefix).append(":ConjuctionTicket>");
		}
		if(exchangeTicket != null) {
			sb.append("<").append(preferredPrefix).append(":ExchangeTicket>").append(SDKUtil.escapeInvalidXmlCharsRegex(exchangeTicket));
			sb.append("</").append(preferredPrefix).append(":ExchangeTicket>");
		}
		if(couponNumber != null) {
			sb.append("<").append(preferredPrefix).append(":CouponNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(couponNumber));
			sb.append("</").append(preferredPrefix).append(":CouponNumber>");
		}
		if(serviceClass != null) {
			sb.append("<").append(preferredPrefix).append(":ServiceClass>").append(SDKUtil.escapeInvalidXmlCharsRegex(serviceClass));
			sb.append("</").append(preferredPrefix).append(":ServiceClass>");
		}
		if(travelDate != null) {
			sb.append("<").append(preferredPrefix).append(":TravelDate>").append(SDKUtil.escapeInvalidXmlCharsRegex(travelDate));
			sb.append("</").append(preferredPrefix).append(":TravelDate>");
		}
		if(carrierCode != null) {
			sb.append("<").append(preferredPrefix).append(":CarrierCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(carrierCode));
			sb.append("</").append(preferredPrefix).append(":CarrierCode>");
		}
		if(stopOverPermitted != null) {
			sb.append("<").append(preferredPrefix).append(":StopOverPermitted>").append(SDKUtil.escapeInvalidXmlCharsRegex(stopOverPermitted));
			sb.append("</").append(preferredPrefix).append(":StopOverPermitted>");
		}
		if(departureAirport != null) {
			sb.append("<").append(preferredPrefix).append(":DepartureAirport>").append(SDKUtil.escapeInvalidXmlCharsRegex(departureAirport));
			sb.append("</").append(preferredPrefix).append(":DepartureAirport>");
		}
		if(arrivalAirport != null) {
			sb.append("<").append(preferredPrefix).append(":ArrivalAirport>").append(SDKUtil.escapeInvalidXmlCharsRegex(arrivalAirport));
			sb.append("</").append(preferredPrefix).append(":ArrivalAirport>");
		}
		if(flightNumber != null) {
			sb.append("<").append(preferredPrefix).append(":FlightNumber>").append(SDKUtil.escapeInvalidXmlCharsRegex(flightNumber));
			sb.append("</").append(preferredPrefix).append(":FlightNumber>");
		}
		if(departureTime != null) {
			sb.append("<").append(preferredPrefix).append(":DepartureTime>").append(SDKUtil.escapeInvalidXmlCharsRegex(departureTime));
			sb.append("</").append(preferredPrefix).append(":DepartureTime>");
		}
		if(arrivalTime != null) {
			sb.append("<").append(preferredPrefix).append(":ArrivalTime>").append(SDKUtil.escapeInvalidXmlCharsRegex(arrivalTime));
			sb.append("</").append(preferredPrefix).append(":ArrivalTime>");
		}
		if(fareBasisCode != null) {
			sb.append("<").append(preferredPrefix).append(":FareBasisCode>").append(SDKUtil.escapeInvalidXmlCharsRegex(fareBasisCode));
			sb.append("</").append(preferredPrefix).append(":FareBasisCode>");
		}
		if(fare != null) {
			sb.append(fare.toXMLString(preferredPrefix,"Fare"));
		}
		if(taxes != null) {
			sb.append(taxes.toXMLString(preferredPrefix,"Taxes"));
		}
		if(fee != null) {
			sb.append(fee.toXMLString(preferredPrefix,"Fee"));
		}
		if(endorsementOrRestrictions != null) {
			sb.append("<").append(preferredPrefix).append(":EndorsementOrRestrictions>").append(SDKUtil.escapeInvalidXmlCharsRegex(endorsementOrRestrictions));
			sb.append("</").append(preferredPrefix).append(":EndorsementOrRestrictions>");
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