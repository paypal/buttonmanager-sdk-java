package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.AddressVerifyRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class AddressVerifyReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private AddressVerifyRequestType addressVerifyRequest;

	

	/**
	 * Default Constructor
	 */
	public AddressVerifyReq (){
	}	

	/**
	 * Getter for addressVerifyRequest
	 */
	 public AddressVerifyRequestType getAddressVerifyRequest() {
	 	return addressVerifyRequest;
	 }
	 
	/**
	 * Setter for addressVerifyRequest
	 */
	 public void setAddressVerifyRequest(AddressVerifyRequestType addressVerifyRequest) {
	 	this.addressVerifyRequest = addressVerifyRequest;
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
		if(addressVerifyRequest != null) {
			sb.append(addressVerifyRequest.toXMLString(null,"AddressVerifyRequest"));
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