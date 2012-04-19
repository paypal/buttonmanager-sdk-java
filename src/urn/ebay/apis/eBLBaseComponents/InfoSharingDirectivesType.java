
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * If Billing Address should be returned in GetExpressCheckoutDetails response, this parameter should be set to yes here
 */
public class InfoSharingDirectivesType {

	/**
If Billing Address should be returned in GetExpressCheckoutDetails response, this parameter should be set to yes here	 */
	private String ReqBillingAddress;
	public String getReqBillingAddress() {
		return ReqBillingAddress;
	}
	public void setReqBillingAddress(String value) {
		this.ReqBillingAddress = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( ReqBillingAddress != null ) {
			sb.append("<ebl:ReqBillingAddress>").append(ReqBillingAddress);
			sb.append("</ebl:ReqBillingAddress>");
		}
		return sb.toString();
	}

}
