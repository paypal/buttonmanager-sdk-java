
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.api.PayPalAPI.AddressVerifyRequestType;


/**
 */
public class AddressVerifyReq {

	/**
	 */
	private AddressVerifyRequestType AddressVerifyRequest;
	public AddressVerifyRequestType getAddressVerifyRequest() {
		return AddressVerifyRequest;
	}
	public void setAddressVerifyRequest(AddressVerifyRequestType value) {
		this.AddressVerifyRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:AddressVerifyReq>");
		if( AddressVerifyRequest != null ) {
			sb.append("<urn:AddressVerifyRequest>");
			sb.append(AddressVerifyRequest.toXMLString());
			sb.append("</urn:AddressVerifyRequest>");
		}
sb.append("</urn:AddressVerifyReq>");
		return sb.toString();
	}

}
