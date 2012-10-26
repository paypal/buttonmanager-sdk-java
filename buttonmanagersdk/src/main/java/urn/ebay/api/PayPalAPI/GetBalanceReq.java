package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetBalanceRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class GetBalanceReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private GetBalanceRequestType getBalanceRequest;

	

	/**
	 * Default Constructor
	 */
	public GetBalanceReq (){
	}	

	/**
	 * Getter for getBalanceRequest
	 */
	 public GetBalanceRequestType getGetBalanceRequest() {
	 	return getBalanceRequest;
	 }
	 
	/**
	 * Setter for getBalanceRequest
	 */
	 public void setGetBalanceRequest(GetBalanceRequestType getBalanceRequest) {
	 	this.getBalanceRequest = getBalanceRequest;
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
		if(getBalanceRequest != null) {
			sb.append(getBalanceRequest.toXMLString(null,"GetBalanceRequest"));
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