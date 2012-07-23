package urn.ebay.apis.eBLBaseComponents;

/**
 * If Billing Address should be returned in
 * GetExpressCheckoutDetails response, this parameter should be
 * set to yes here 
 */
public class InfoSharingDirectivesType{


	/**
	 * If Billing Address should be returned in
	 * GetExpressCheckoutDetails response, this parameter should be
	 * set to yes here	 
	 */ 
	private String ReqBillingAddress;

	

	/**
	 * Default Constructor
	 */
	public InfoSharingDirectivesType (){
	}	

	/**
	 * Getter for ReqBillingAddress
	 */
	 public String getReqBillingAddress() {
	 	return ReqBillingAddress;
	 }
	 
	/**
	 * Setter for ReqBillingAddress
	 */
	 public void setReqBillingAddress(String ReqBillingAddress) {
	 	this.ReqBillingAddress = ReqBillingAddress;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		if(ReqBillingAddress != null) {
			sb.append("<ebl:ReqBillingAddress>").append(ReqBillingAddress);
			sb.append("</ebl:ReqBillingAddress>");
		}
		return sb.toString();
	}

}