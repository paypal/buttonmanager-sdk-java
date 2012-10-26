package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.ExternalRememberMeOptOutRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ExternalRememberMeOptOutReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private ExternalRememberMeOptOutRequestType externalRememberMeOptOutRequest;

	

	/**
	 * Default Constructor
	 */
	public ExternalRememberMeOptOutReq (){
	}	

	/**
	 * Getter for externalRememberMeOptOutRequest
	 */
	 public ExternalRememberMeOptOutRequestType getExternalRememberMeOptOutRequest() {
	 	return externalRememberMeOptOutRequest;
	 }
	 
	/**
	 * Setter for externalRememberMeOptOutRequest
	 */
	 public void setExternalRememberMeOptOutRequest(ExternalRememberMeOptOutRequestType externalRememberMeOptOutRequest) {
	 	this.externalRememberMeOptOutRequest = externalRememberMeOptOutRequest;
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
		if(externalRememberMeOptOutRequest != null) {
			sb.append(externalRememberMeOptOutRequest.toXMLString(null,"ExternalRememberMeOptOutRequest"));
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