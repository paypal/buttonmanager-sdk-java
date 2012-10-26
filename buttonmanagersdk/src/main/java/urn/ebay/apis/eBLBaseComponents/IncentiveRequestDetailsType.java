package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.IncentiveRequestCodeType;
import urn.ebay.apis.eBLBaseComponents.IncentiveRequestDetailLevelCodeType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class IncentiveRequestDetailsType{


	/**
	 * 	 
	 */ 
	private String RequestId;

	/**
	 * 	 
	 */ 
	private IncentiveRequestCodeType RequestType;

	/**
	 * 	 
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
			sb.append("<ebl:RequestId>").append(SDKUtil.escapeInvalidXmlCharsRegex(RequestId));
			sb.append("</ebl:RequestId>");
		}
		if(RequestType != null) {
			sb.append("<ebl:RequestType>").append(SDKUtil.escapeInvalidXmlCharsRegex(RequestType.getValue()));
			sb.append("</ebl:RequestType>");
		}
		if(RequestDetailLevel != null) {
			sb.append("<ebl:RequestDetailLevel>").append(SDKUtil.escapeInvalidXmlCharsRegex(RequestDetailLevel.getValue()));
			sb.append("</ebl:RequestDetailLevel>");
		}
		return sb.toString();
	}


}