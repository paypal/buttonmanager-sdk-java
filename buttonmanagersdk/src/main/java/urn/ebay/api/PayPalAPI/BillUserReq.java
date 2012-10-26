package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BillUserRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BillUserReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private BillUserRequestType billUserRequest;

	

	/**
	 * Default Constructor
	 */
	public BillUserReq (){
	}	

	/**
	 * Getter for billUserRequest
	 */
	 public BillUserRequestType getBillUserRequest() {
	 	return billUserRequest;
	 }
	 
	/**
	 * Setter for billUserRequest
	 */
	 public void setBillUserRequest(BillUserRequestType billUserRequest) {
	 	this.billUserRequest = billUserRequest;
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
		if(billUserRequest != null) {
			sb.append(billUserRequest.toXMLString(null,"BillUserRequest"));
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