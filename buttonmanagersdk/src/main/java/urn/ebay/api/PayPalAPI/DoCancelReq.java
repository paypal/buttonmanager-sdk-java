package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoCancelRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoCancelReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private DoCancelRequestType doCancelRequest;

	

	/**
	 * Default Constructor
	 */
	public DoCancelReq (){
	}	

	/**
	 * Getter for doCancelRequest
	 */
	 public DoCancelRequestType getDoCancelRequest() {
	 	return doCancelRequest;
	 }
	 
	/**
	 * Setter for doCancelRequest
	 */
	 public void setDoCancelRequest(DoCancelRequestType doCancelRequest) {
	 	this.doCancelRequest = doCancelRequest;
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
		if(doCancelRequest != null) {
			sb.append(doCancelRequest.toXMLString(null,"DoCancelRequest"));
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