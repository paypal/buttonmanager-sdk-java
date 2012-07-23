package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.IncentiveRequestCodeType;
import urn.ebay.apis.eBLBaseComponents.IncentiveRequestDetailLevelCodeType;

/**
 * No Document Comments
 */
public class IncentiveRequestDetailsType{


	/**
	 * No Document Comments	 
	 */ 
	private String RequestId;

	/**
	 * No Document Comments	 
	 */ 
	private IncentiveRequestCodeType RequestType;

	/**
	 * No Document Comments	 
	 */ 
	private IncentiveRequestDetailLevelCodeType RequestDetailLevel;

	

	/**
	 * Default Constructor
	 */
	public IncentiveRequestDetailsType (){
	}	

	/**
	 * Getter for RequestId
	 */
	 public String getRequestId() {
	 	return RequestId;
	 }
	 
	/**
	 * Setter for RequestId
	 */
	 public void setRequestId(String RequestId) {
	 	this.RequestId = RequestId;
	 }
	 
	/**
	 * Getter for RequestType
	 */
	 public IncentiveRequestCodeType getRequestType() {
	 	return RequestType;
	 }
	 
	/**
	 * Setter for RequestType
	 */
	 public void setRequestType(IncentiveRequestCodeType RequestType) {
	 	this.RequestType = RequestType;
	 }
	 
	/**
	 * Getter for RequestDetailLevel
	 */
	 public IncentiveRequestDetailLevelCodeType getRequestDetailLevel() {
	 	return RequestDetailLevel;
	 }
	 
	/**
	 * Setter for RequestDetailLevel
	 */
	 public void setRequestDetailLevel(IncentiveRequestDetailLevelCodeType RequestDetailLevel) {
	 	this.RequestDetailLevel = RequestDetailLevel;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(RequestId != null) {
			sb.append("<ebl:RequestId>").append(RequestId);
			sb.append("</ebl:RequestId>");
		}
		if(RequestType != null) {
			sb.append("<ebl:RequestType>").append(RequestType.getValue());
			sb.append("</ebl:RequestType>");
		}
		if(RequestDetailLevel != null) {
			sb.append("<ebl:RequestDetailLevel>").append(RequestDetailLevel.getValue());
			sb.append("</ebl:RequestDetailLevel>");
		}
		return sb.toString();
	}

}