package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.ManagePendingTransactionStatusRequestType;
import com.paypal.core.SDKUtil;

/**
 * 
 */
public class ManagePendingTransactionStatusReq{


	/**
	 * 	 
	 */ 
	private ManagePendingTransactionStatusRequestType ManagePendingTransactionStatusRequest;

	

	/**
	 * Default Constructor
	 */
	public ManagePendingTransactionStatusReq (){
	}	

	/**
	 * Getter for ManagePendingTransactionStatusRequest
	 */
	 public ManagePendingTransactionStatusRequestType getManagePendingTransactionStatusRequest() {
	 	return ManagePendingTransactionStatusRequest;
	 }
	 
	/**
	 * Setter for ManagePendingTransactionStatusRequest
	 */
	 public void setManagePendingTransactionStatusRequest(ManagePendingTransactionStatusRequestType ManagePendingTransactionStatusRequest) {
	 	this.ManagePendingTransactionStatusRequest = ManagePendingTransactionStatusRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:ManagePendingTransactionStatusReq>");
		if(ManagePendingTransactionStatusRequest != null) {
			sb.append("<urn:ManagePendingTransactionStatusRequest>");
			sb.append(ManagePendingTransactionStatusRequest.toXMLString());
			sb.append("</urn:ManagePendingTransactionStatusRequest>");
		}
		sb.append("</urn:ManagePendingTransactionStatusReq>");
		return sb.toString();
	}


}