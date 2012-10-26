package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.BAUpdateRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class BillAgreementUpdateReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private BAUpdateRequestType bAUpdateRequest;

	

	/**
	 * Default Constructor
	 */
	public BillAgreementUpdateReq (){
	}	

	/**
	 * Getter for bAUpdateRequest
	 */
	 public BAUpdateRequestType getBAUpdateRequest() {
	 	return bAUpdateRequest;
	 }
	 
	/**
	 * Setter for bAUpdateRequest
	 */
	 public void setBAUpdateRequest(BAUpdateRequestType bAUpdateRequest) {
	 	this.bAUpdateRequest = bAUpdateRequest;
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
		if(bAUpdateRequest != null) {
			sb.append(bAUpdateRequest.toXMLString(null,"BAUpdateRequest"));
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