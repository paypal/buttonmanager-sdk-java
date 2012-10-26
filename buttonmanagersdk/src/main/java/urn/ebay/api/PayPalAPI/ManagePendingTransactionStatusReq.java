package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.ManagePendingTransactionStatusRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ManagePendingTransactionStatusReq{

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * 	 
	 */ 
	private ManagePendingTransactionStatusRequestType managePendingTransactionStatusRequest;

	

	/**
	 * Default Constructor
	 */
	public ManagePendingTransactionStatusReq (){
	}	

	/**
	 * Getter for managePendingTransactionStatusRequest
	 */
	 public ManagePendingTransactionStatusRequestType getManagePendingTransactionStatusRequest() {
	 	return managePendingTransactionStatusRequest;
	 }
	 
	/**
	 * Setter for managePendingTransactionStatusRequest
	 */
	 public void setManagePendingTransactionStatusRequest(ManagePendingTransactionStatusRequestType managePendingTransactionStatusRequest) {
	 	this.managePendingTransactionStatusRequest = managePendingTransactionStatusRequest;
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
		if(managePendingTransactionStatusRequest != null) {
			sb.append(managePendingTransactionStatusRequest.toXMLString(null,"ManagePendingTransactionStatusRequest"));
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