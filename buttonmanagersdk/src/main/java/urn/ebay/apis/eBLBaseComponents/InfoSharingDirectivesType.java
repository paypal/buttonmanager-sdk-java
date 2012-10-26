package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * If Billing Address should be returned in
 * GetExpressCheckoutDetails response, this parameter should be
 * set to yes here 
 */
public class InfoSharingDirectivesType{

	private static final String nameSpace="urn:ebay:apis:eBLBaseComponents";
	private static final String preferredPrefix="ebl";

	/**
	 * If Billing Address should be returned in
	 * GetExpressCheckoutDetails response, this parameter should be
	 * set to yes here	 
	 */ 
	private String reqBillingAddress;

	

	/**
	 * Default Constructor
	 */
	public InfoSharingDirectivesType (){
	}	

	/**
	 * Getter for reqBillingAddress
	 */
	 public String getReqBillingAddress() {
	 	return reqBillingAddress;
	 }
	 
	/**
	 * Setter for reqBillingAddress
	 */
	 public void setReqBillingAddress(String reqBillingAddress) {
	 	this.reqBillingAddress = reqBillingAddress;
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
		if(reqBillingAddress != null) {
			sb.append("<").append(preferredPrefix).append(":ReqBillingAddress>").append(SDKUtil.escapeInvalidXmlCharsRegex(reqBillingAddress));
			sb.append("</").append(preferredPrefix).append(":ReqBillingAddress>");
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