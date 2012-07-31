package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.AddressVerifyRequestType;

/**
 * 
 */
public class AddressVerifyReq{


	/**
	 * 	 
	 */ 
	private AddressVerifyRequestType AddressVerifyRequest;

	

	/**
	 * Default Constructor
	 */
	public AddressVerifyReq (){
	}	

	/**
	 * Getter for AddressVerifyRequest
	 */
	 public AddressVerifyRequestType getAddressVerifyRequest() {
	 	return AddressVerifyRequest;
	 }
	 
	/**
	 * Setter for AddressVerifyRequest
	 */
	 public void setAddressVerifyRequest(AddressVerifyRequestType AddressVerifyRequest) {
	 	this.AddressVerifyRequest = AddressVerifyRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:AddressVerifyReq>");
		if(AddressVerifyRequest != null) {
			sb.append("<urn:AddressVerifyRequest>");
			sb.append(AddressVerifyRequest.toXMLString());
			sb.append("</urn:AddressVerifyRequest>");
		}
		sb.append("</urn:AddressVerifyReq>");
		return sb.toString();
	}

}