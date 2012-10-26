package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoVoidRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoVoidReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private DoVoidRequestType doVoidRequest;

	

	/**
	 * Default Constructor
	 */
	public DoVoidReq (){
	}	

	/**
	 * Getter for doVoidRequest
	 */
	 public DoVoidRequestType getDoVoidRequest() {
	 	return doVoidRequest;
	 }
	 
	/**
	 * Setter for doVoidRequest
	 */
	 public void setDoVoidRequest(DoVoidRequestType doVoidRequest) {
	 	this.doVoidRequest = doVoidRequest;
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
		if(doVoidRequest != null) {
			sb.append(doVoidRequest.toXMLString(null,"DoVoidRequest"));
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