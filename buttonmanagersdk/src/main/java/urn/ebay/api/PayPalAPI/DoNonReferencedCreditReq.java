package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.DoNonReferencedCreditRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class DoNonReferencedCreditReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private DoNonReferencedCreditRequestType doNonReferencedCreditRequest;

	

	/**
	 * Default Constructor
	 */
	public DoNonReferencedCreditReq (){
	}	

	/**
	 * Getter for doNonReferencedCreditRequest
	 */
	 public DoNonReferencedCreditRequestType getDoNonReferencedCreditRequest() {
	 	return doNonReferencedCreditRequest;
	 }
	 
	/**
	 * Setter for doNonReferencedCreditRequest
	 */
	 public void setDoNonReferencedCreditRequest(DoNonReferencedCreditRequestType doNonReferencedCreditRequest) {
	 	this.doNonReferencedCreditRequest = doNonReferencedCreditRequest;
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
		if(doNonReferencedCreditRequest != null) {
			sb.append(doNonReferencedCreditRequest.toXMLString(null,"DoNonReferencedCreditRequest"));
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