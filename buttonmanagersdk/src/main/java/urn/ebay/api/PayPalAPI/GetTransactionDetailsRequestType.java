package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;
import com.paypal.core.SDKUtil;

/**
 * Unique identifier of a transaction. RequiredThe details for
 * some kinds of transactions cannot be retrieved with
 * GetTransactionDetailsRequest. You cannot obtain details of
 * bank transfer withdrawals, for example. Character length and
 * limitations: 17 single-byte alphanumeric characters
 */
public class GetTransactionDetailsRequestType extends AbstractRequestType {

	private static final String nameSpace="urn:ebay:api:PayPalAPI";
	private static final String preferredPrefix="ns";

	/**
	 * Unique identifier of a transaction. RequiredThe details for
	 * some kinds of transactions cannot be retrieved with
	 * GetTransactionDetailsRequest. You cannot obtain details of
	 * bank transfer withdrawals, for example. Character length and
	 * limitations: 17 single-byte alphanumeric characters	 
	 */ 
	private String transactionID;

	

	/**
	 * Default Constructor
	 */
	public GetTransactionDetailsRequestType (){
	}	

	/**
	 * Getter for transactionID
	 */
	 public String getTransactionID() {
	 	return transactionID;
	 }
	 
	/**
	 * Setter for transactionID
	 */
	 public void setTransactionID(String transactionID) {
	 	this.transactionID = transactionID;
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
		sb.append(super.toXMLString(prefix, null));
		if(transactionID != null) {
			sb.append("<").append(preferredPrefix).append(":TransactionID>").append(SDKUtil.escapeInvalidXmlCharsRegex(transactionID));
			sb.append("</").append(preferredPrefix).append(":TransactionID>");
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