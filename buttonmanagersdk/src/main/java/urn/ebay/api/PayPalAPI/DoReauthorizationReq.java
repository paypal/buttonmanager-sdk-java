package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoReauthorizationRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoReauthorizationReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private DoReauthorizationRequestType doReauthorizationRequest;

	

	/**
	 * Default Constructor
	 */
	public DoReauthorizationReq (){
	}	

	/**
	 * Getter for doReauthorizationRequest
	 */
	 public DoReauthorizationRequestType getDoReauthorizationRequest() {
	 	return doReauthorizationRequest;
	 }
	 
	/**
	 * Setter for doReauthorizationRequest
	 */
	 public void setDoReauthorizationRequest(DoReauthorizationRequestType doReauthorizationRequest) {
	 	this.doReauthorizationRequest = doReauthorizationRequest;
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
		if(doReauthorizationRequest != null) {
			sb.append(doReauthorizationRequest.toXMLString(null,"DoReauthorizationRequest"));
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