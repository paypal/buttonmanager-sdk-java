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


	/**
	 * Unique identifier of a transaction. RequiredThe details for
	 * some kinds of transactions cannot be retrieved with
	 * GetTransactionDetailsRequest. You cannot obtain details of
	 * bank transfer withdrawals, for example. Character length and
	 * limitations: 17 single-byte alphanumeric characters	 
	 */ 
	private String TransactionID;

	

	/**
	 * Default Constructor
	 */
	public GetTransactionDetailsRequestType (){
	}	

	/**
	 * Getter for TransactionID
	 */
	 public String getTransactionID() {
	 	return TransactionID;
	 }
	 
	/**
	 * Setter for TransactionID
	 */
	 public void setTransactionID(String TransactionID) {
	 	this.TransactionID = TransactionID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(TransactionID != null) {
			sb.append("<urn:TransactionID>").append(SDKUtil.escapeInvalidXmlCharsRegex(TransactionID));
			sb.append("</urn:TransactionID>");
		}
		return sb.toString();
	}


}