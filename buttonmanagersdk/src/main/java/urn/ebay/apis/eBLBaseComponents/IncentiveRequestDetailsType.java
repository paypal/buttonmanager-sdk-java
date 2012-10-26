package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.IncentiveRequestCodeType;
import urn.ebay.apis.eBLBaseComponents.IncentiveRequestDetailLevelCodeType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class IncentiveRequestDetailsType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * 	 
	 */ 
	private String requestId;

	/**
	 * 	 
	 */ 
	private IncentiveRequestCodeType requestType;

	/**
	 * 	 
	 */ 
	private IncentiveRequestDetailLevelCodeType requestDetailLevel;

	

	/**
	 * Default Constructor
	 */
	public IncentiveRequestDetailsType (){
	}	

	/**
	 * Getter for requestId
	 */
	 public String getRequestId() {
	 	return requestId;
	 }
	 
	/**
	 * Setter for requestId
	 */
	 public void setRequestId(String requestId) {
	 	this.requestId = requestId;
	 }
	 
	/**
	 * Getter for requestType
	 */
	 public IncentiveRequestCodeType getRequestType() {
	 	return requestType;
	 }
	 
	/**
	 * Setter for requestType
	 */
	 public void setRequestType(IncentiveRequestCodeType requestType) {
	 	this.requestType = requestType;
	 }
	 
	/**
	 * Getter for requestDetailLevel
	 */
	 public IncentiveRequestDetailLevelCodeType getRequestDetailLevel() {
	 	return requestDetailLevel;
	 }
	 
	/**
	 * Setter for requestDetailLevel
	 */
	 public void setRequestDetailLevel(IncentiveRequestDetailLevelCodeType requestDetailLevel) {
	 	this.requestDetailLevel = requestDetailLevel;
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
		if(requestId != null) {
			sb.append("<").append(preferredPrefix).append(":RequestId>").append(SDKUtil.escapeInvalidXmlCharsRegex(requestId));
			sb.append("</").append(preferredPrefix).append(":RequestId>");
		}
		if(requestType != null) {
			sb.append("<").append(preferredPrefix).append(":RequestType>").append(SDKUtil.escapeInvalidXmlCharsRegex(requestType.getValue()));
			sb.append("</").append(preferredPrefix).append(":RequestType>");
		}
		if(requestDetailLevel != null) {
			sb.append("<").append(preferredPrefix).append(":RequestDetailLevel>").append(SDKUtil.escapeInvalidXmlCharsRegex(requestDetailLevel.getValue()));
			sb.append("</").append(preferredPrefix).append(":RequestDetailLevel>");
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