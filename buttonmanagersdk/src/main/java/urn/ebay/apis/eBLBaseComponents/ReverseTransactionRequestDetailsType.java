package urn.ebay.apis.eBLBaseComponents;
import com.paypal.core.SDKUtil;

/**
 * Identifier of the transaction to reverse. Required Character
 * length and limitations: 17 single-byte alphanumeric
 * characters 
 */
public class ReverseTransactionRequestDetailsType{


	/**
	 * Identifier of the transaction to reverse. Required Character
	 * length and limitations: 17 single-byte alphanumeric
	 * characters 	 
	 */ 
	private String TransactionID;

	

	/**
	 * Default Constructor
	 */
	public ReverseTransactionRequestDetailsType (){
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
		if(TransactionID != null) {
			sb.append("<ebl:TransactionID>").append(SDKUtil.escapeInvalidXmlCharsRegex(TransactionID));
			sb.append("</ebl:TransactionID>");
		}
		return sb.toString();
	}


}